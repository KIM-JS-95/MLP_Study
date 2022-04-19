package test;

import java.io.BufferedReader;
import java.io.FileReader; 


public class DevReader { 

  public static void main(String[] args) { 
    String fileName = "D:/opensource/java/dev_output.txt"; 
     
    try { 
      FileReader fr = new FileReader(fileName);  // 파일 읽기 실행 
      BufferedReader br = new BufferedReader(fr);// 메모리에 파일 내용 저장 

      String str = ""; 
      String line = ""; 

      while (true) {  
        line = br.readLine();    // 한 라인씩 읽음 
         
        if (line == null){       // 파일을 마지막까지 읽은 경우 
          break;                 // while문 종료   
        } 
        System.out.println(line); // 문자열 추가, \n: 라인 변경 
      } 

      br.close();                // 메모리 해제 
      fr.close(); 
    } catch (Exception e) { 
      System.out.println(e); 
    } 

  } 

} 