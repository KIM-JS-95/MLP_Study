package team;

import utility.DBClose;
import utility.DBOpen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeamDAO {

    // 여러건 가져오기
    public List<TeamDTO> list() {
        List<TeamDTO> list = new ArrayList<>();

        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        StringBuffer sql = new StringBuffer();

        sql.append("select no, name, phone, email, skills ");
        sql.append("from team ");
        sql.append(" order by name desc");

        try {

            preparedStatement = con.prepareStatement(sql.toString());
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                TeamDTO dto = new TeamDTO();
                dto.setName(rs.getString("name"));
                dto.setEmail(rs.getString("email"));
                dto.setPhone(rs.getString("phone"));
                dto.setSkills(rs.getString("skills"));

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
    public TeamDTO read(int no) {
        TeamDTO dto = null;

        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        StringBuffer sql = new StringBuffer();
        sql.append("select * from team");
        sql.append(" where no = ? ");

        try {
            preparedStatement = con.prepareStatement(sql.toString());
            preparedStatement.setInt(1, no);

            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                dto = new TeamDTO();
                dto.setEmail(rs.getString("email"));
                dto.setAddress(rs.getString("address"));
                dto.setPhone(rs.getString("phone"));
                dto.setName(rs.getString("name"));
                dto.setSkills(rs.getString("skills"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(rs, preparedStatement, con);
        }

        return dto;
    }

    public boolean create(TeamDTO dto) {
        boolean flag = false;
        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;

        StringBuffer sql = new StringBuffer();
        sql.append("insert into team(name,phone,email,skills,address)");
        sql.append("values(?, ?, ?, ?, ?)");


        try {
            preparedStatement = con.prepareStatement(sql.toString());
            preparedStatement.setString(1, dto.getName());
            preparedStatement.setString(2, dto.getPhone());
            preparedStatement.setString(3, dto.getEmail());
            preparedStatement.setString(4, dto.getSkills());
            preparedStatement.setString(5, dto.getAddress());

            int cnt = preparedStatement.executeUpdate();

            if (cnt > 0) flag = true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(preparedStatement, con);
        }

        return flag;
    }
}
