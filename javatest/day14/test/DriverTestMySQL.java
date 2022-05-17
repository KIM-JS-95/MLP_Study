package test;

import utility1.DBClose;
import utility1.DBOpen;

import java.sql.Connection;

public class DriverTestMySQL {
    public static void main(String args[]){ 
        Connection con = null;
        try{
            con = DBOpen.getCon();
            System.out.println("데이터 베이스 접속이 성공했습니다."); 
        } 

        catch(Exception ex){ 
            System.out.println("Exception:"+ex); 
        }finally{
            DBClose.close(con);
        } 
     } 
} 