
package chanle;

import java.util.Scanner;

public class Chanle {

   
    public static void main(String[] args) {
      byte n = 0;
      Scanner ban_phim = new Scanner(System.in);
      System.out.println("mời nhập một sô nguyên dương");
      n = ban_phim.nextByte();
      String kq = "" ;
      if( n % 2 == 0)
          kq = " số chẵn ";
      else
          kq = " số lẽ ";
        System.out.println(" số bạn vừa nhập: " + n + " là " +kq );
    }
    
}
