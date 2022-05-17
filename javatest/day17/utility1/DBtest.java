package utility1;

import java.sql.Connection;

public class DBtest{

   public static void main(String[] args){
       Connection con = null;
       try{
           con = DBOpen.getCon();
           System.out.println("접속 성공");
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           DBClose.close(con);
       }
   }
}
