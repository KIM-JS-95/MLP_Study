package test;

import utility.DBClose;
import utility.DBOpen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemoDAO {

    // 여러건 가져오기
    public List<MemoDTO> list() {
        List<MemoDTO> list = new ArrayList<>();

        //TODO: 드라이버 로딩 → Connection 형성 → Statement 생성 → ResultSet 생성 → Close 의 단계를 거친다.

        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        StringBuffer sql = new StringBuffer();

        sql.append("select memono, wname, title, content, paawd, viewcnt ");
        sql.append("from memo ");
        sql.append(" order by memono desc");

        try {

            preparedStatement = con.prepareStatement(sql.toString());
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                MemoDTO dto = new MemoDTO();
                dto.setMemono(rs.getInt("memono"));
                dto.setWname(rs.getString("wname"));
                dto.setTitle(rs.getString("title"));
                dto.setContent(rs.getString("content"));
                dto.setPaawd(rs.getString("paawd"));
                dto.setViewcnt(rs.getInt("viewcnt"));

                list.add(dto);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(rs, preparedStatement, con);
        }

        return list;
    }

    // 하나의 레코드 읽어오기
    public MemoDTO read(int no) {
        MemoDTO dto = null;

        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        StringBuffer sql = new StringBuffer();
        sql.append("select * from memo");
        sql.append(" where memono = ? ");

        try {
            preparedStatement = con.prepareStatement(sql.toString());
            preparedStatement.setInt(1, no);

            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                dto = new MemoDTO();
                dto.setMemono(rs.getInt("memono"));
                dto.setWname(rs.getString("wname"));
                dto.setTitle(rs.getString("title"));
                dto.setContent(rs.getString("content"));
                dto.setPaawd(rs.getString("paawd"));
                dto.setViewcnt(rs.getInt("viewcnt"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(rs, preparedStatement, con);
        }

        return dto;
    }

    public boolean create(MemoDTO dto) {
        boolean flag = false;
        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;

        StringBuffer sql = new StringBuffer();
        sql.append("insert into memo(wname, title, content, paawd, viewcnt)");
        sql.append("values(?, ?, ?, ?, ?)");


        try {
            preparedStatement = con.prepareStatement(sql.toString());
            preparedStatement.setString(1, dto.getWname());
            preparedStatement.setString(2, dto.getTitle());
            preparedStatement.setString(3, dto.getContent());
            preparedStatement.setString(4, dto.getPaawd());
            preparedStatement.setInt(5, dto.getViewcnt());

            int cnt = preparedStatement.executeUpdate();

            if (cnt > 0) flag = true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(preparedStatement, con);
        }

        return flag;
    }

    public boolean update(MemoDTO dto) {
        boolean flag = false;
        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;

        StringBuffer sql = new StringBuffer();
        sql.append("update memo ");
        sql.append("set wname = ?, ");
        sql.append(" content = ? ");
        sql.append(" where memono= ? ");


        try {
            preparedStatement = con.prepareStatement(sql.toString());
            preparedStatement.setString(1, dto.getWname());
            preparedStatement.setString(2, dto.getContent());
            preparedStatement.setInt(3, dto.getMemono());

            int cnt = preparedStatement.executeUpdate();

            if (cnt > 0) flag = true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(preparedStatement, con);
        }

        return flag;
    }

    public boolean delete(int cnt) {
        boolean flag = false;
        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;

        StringBuffer sql = new StringBuffer();
        sql.append("delete from memo ");
        sql.append("where no = ? ");


        try {
            preparedStatement = con.prepareStatement(sql.toString());
            preparedStatement.setInt(1, cnt);

            int result = preparedStatement.executeUpdate();

            if (result > 0) flag = true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(preparedStatement, con);
        }


        return flag;
    }
}
