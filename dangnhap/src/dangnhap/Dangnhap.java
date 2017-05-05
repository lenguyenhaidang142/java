
package dangnhap;

import java.util.Scanner;


public class Dangnhap {

    public static void main(String[] args) {
        String tenDn="",mk="";
        Scanner ban_phim = new Scanner(System.in);
        do{
            System.out.print("tên ĐN: ");
            tenDn = ban_phim.nextLine();
            System.out.print("mật khẩu: ");
            mk= ban_phim.nextLine();
        }
        while ( (mk.compareTo("123")!=0) || (tenDn.compareTo("DHCN1C")!=0));
                System.out.println("Welcom to DHCN1C");
        
    }
    
}
