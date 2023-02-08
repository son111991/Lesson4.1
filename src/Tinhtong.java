import java.util.Scanner;

public class Tinhtong {
  // xây dựng 1 phương thức để nhập vào số :
  public int nhapso(){
    System.out.println(" Mời nhập số ");
    int n = new Scanner(System.in).nextInt();
    return n;
  }
  // Xây dựng hàm tính tổng :
  public  int tinhtong(int a , int b){
    int tong = a+b;
    return tong;
  }
  public  boolean kiemtraSNT(int n){
    if ( n < 0){
      return false;
    }
    int canBacHai = (int)Math.sqrt(n);
    for (int i = 2; i <= canBacHai ; i++) {
      if (n % 1 ==0){
        return false;
      }
    }return true;
}}

