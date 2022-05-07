package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class Constant {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String  URL = "jdbc:mysql://127.0.0.1:3306/book?useUnicode=true&characterEncoding=utf8";
    public static final String USER = "root";
    public static final String PASSWD = "Wotjd@487";
}

class DBOpen {

    private static Connection con;

    public static Connection getCon() {
        try {
            Class.forName(Constant.DRIVER);
            con = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return con;
    }
}

class DBClose {

    public static void close(Connection con){
        try {
            if(con != null) con.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void close(PreparedStatement pstmt, Connection con){
        try {
            if(pstmt != null) pstmt.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            if(con != null) con.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void close(ResultSet rs, PreparedStatement pstmt, Connection con){
        try {
            if(rs != null) rs.close();
        } catch (Exception e) {
            // TODO A uto-generated catch block
            e.printStackTrace();
        }

        try {
            if(pstmt != null) pstmt.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            if(con != null) con.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

public class BookDAO {


    public List<BookDTO> list() {
        List<BookDTO> list = new ArrayList<>();

        //TODO: 드라이버 로딩 → Connection 형성 → Statement 생성 → ResultSet 생성 → Close 의 단계를 거친다.

        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        StringBuffer sql = new StringBuffer();

        sql.append("select *");
        sql.append("from book ");
        sql.append(" order by isbn");

        try {

            preparedStatement = con.prepareStatement(sql.toString());
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                BookDTO dto = new BookDTO();
                dto.setIsbn(rs.getInt("isbn"));
                dto.setTitle(rs.getString("title"));
                dto.setAuthor(rs.getString("author"));
                dto.setPublisher(rs.getString("publisher"));
                dto.setPrice(rs.getInt("price"));
                dto.setDesc(rs.getString("desc"));
                dto.setPublish_date(rs.getDate("publish_date"));

                list.add(dto);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(rs, preparedStatement, con);
        }


        return list;
    }

    public BookDTO read(int no) {
        BookDTO dto = null;

        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        StringBuffer sql = new StringBuffer();
        sql.append("select * from book");
        sql.append(" where isbn = ? ");

        try {
            preparedStatement = con.prepareStatement(sql.toString());
            preparedStatement.setInt(1, no);

            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                dto = new BookDTO();
                dto.setIsbn(rs.getInt("isbn"));
                dto.setTitle(rs.getString("title"));
                dto.setAuthor(rs.getString("author"));
                dto.setPublisher(rs.getString("publisher"));
                dto.setPrice(rs.getInt("price"));
                dto.setDesc(rs.getString("desc"));
                dto.setPublish_date(rs.getDate("publish_date"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(rs, preparedStatement, con);
        }

        return dto;
    }

    public boolean delete(int isbn) {
        boolean flag = false;
        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;

        StringBuffer sql = new StringBuffer();
        sql.append("delete from book ");
        sql.append(" where isbn = ? ");

        try {
            preparedStatement = con.prepareStatement(sql.toString());
            preparedStatement.setInt(1, isbn);

            int result = preparedStatement.executeUpdate();

            if (result > 0) flag = true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(preparedStatement, con);
        }


        return flag;

    }

    public boolean update(BookDTO dto) {
        boolean flag = false;
        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;

        StringBuffer sql = new StringBuffer();
        sql.append("update book ");
        sql.append("set price = ? ");
        sql.append(" where isbn = ? ");


        try {
            preparedStatement = con.prepareStatement(sql.toString());
            preparedStatement.setInt(1, dto.getPrice());
            preparedStatement.setInt(2, dto.getIsbn());

            int cnt = preparedStatement.executeUpdate();

            if (cnt > 0) flag = true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBClose.close(preparedStatement, con);
        }

        return flag;
    }

    public boolean create(BookDTO dto) {
        boolean flag = false;
        Connection con = DBOpen.getCon();
        PreparedStatement preparedStatement = null;

        StringBuffer sql = new StringBuffer();
        sql.append("insert into book");
        sql.append(" values(?,?,?,?,?,?, now() )");

        try {
            preparedStatement = con.prepareStatement(sql.toString());
            preparedStatement.setInt(1, dto.getIsbn());
            preparedStatement.setString(2, dto.getTitle());
            preparedStatement.setString(3, dto.getAuthor());
            preparedStatement.setString(4, dto.getPublisher());
            preparedStatement.setInt(5, dto.getPrice());
            preparedStatement.setString(6, dto.getDesc());

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
