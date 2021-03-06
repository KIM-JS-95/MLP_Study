class IfTest1 {                           
  public static void main(String[] args) {
    int i = 120;
 
    // 참일 경우만 처리, 거짓은 무시
    if (i % 2 == 0) {                    
      int count = 1;
      System.out.println(i + "은(는) 짝수");
    }
 
    // System.out.println("count: " + count);
    
    // else를 통한 참, 거짓 구분 처리
    if (i % 2 == 0) {
      System.out.println("짝수 " + i); // 참
    } else {
      System.out.println("홀수 " + i); // 거짓
    }
 
    // 조건에 걸릴때까지 계속적인 검사, 다중 IF
    if (i % 3 == 0) {
      System.out.println("3의 배수");
    } else if (i % 4 == 0) {
      System.out.println("4의 배수");
    } else if (i % 7 == 0) {
      System.out.println("7의 배수");
    } else {
 
      System.out.println("3, 4, 7의 배수가 아닙니다.");
    }
    
    if ( 1 == 1) System.out.println("동일");  // X
    
    if ( 2 == 2)
    System.out.println("동일");               // X
    
    if ( 3 == 3){
      
      System.out.println("동일");          
      
    }
  }
}