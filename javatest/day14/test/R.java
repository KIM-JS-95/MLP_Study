package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class R {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
        String user = "root";
        String passwd = "Wotjd@487";
        String driver = "com.mysql.cj.jdbc.Driver";

        Connection con = null; //DB 연결 객체

        PreparedStatement pstmt = null; //SQL 전송 객체

        ResultSet rs = null;

        StringBuffer sql = new StringBuffer();
        sql.append(" select * ");
        sql.append(" from address ");

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, passwd);

            pstmt = con.prepareStatement(sql.toString());

            rs = pstmt.executeQuery();

            while(rs.next()) {
                System.out.println("번호: " + rs.getInt("addressnum"));
                System.out.println("성명: " + rs.getString("name"));
                System.out.println("전화번호: " + rs.getString("handphone"));
                System.out.println("주소: " + rs.getString("address"));
                System.out.println("------------------");
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if(rs != null) rs.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
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
}
