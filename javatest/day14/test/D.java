package test;

import java.sql.*;

public class D {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
        String user = "root";
        String passwd = "Wotjd@487";
        String driver = "com.mysql.cj.jdbc.Driver";

        Connection con = null; //DB 연결 객체

        PreparedStatement pstmt = null; //SQL 전송 객체


        StringBuffer sql = new StringBuffer();
        sql.append(" delete from address  ");
        sql.append(" 	where addressnum = ?  ");


        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, passwd);

            pstmt = con.prepareStatement(sql.toString());

            pstmt.setInt(1, 7);

            int cnt = pstmt.executeUpdate();
            System.out.println("새로운 레코드" + cnt + "개가 삭제되었습니다.");


        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
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

}
