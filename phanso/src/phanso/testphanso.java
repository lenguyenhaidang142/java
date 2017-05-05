
package phanso;

public class testPhanso {  
    public static void main(String[] args)
    {
        Phanso ps1=new Phanso(2,3);
        Phanso ps2=new Phanso(3,2); 
        System.out.println("Phân số 1 : " +ps1.toString());
        System.out.println("Phân số 2 : " +ps2.toString());
        Phanso psTong= ps1.congvoi(ps2);
        System.out.println("Tổng là : " +psTong.toString());
        int kq =ps1.sovoi(ps2);
        if(kq==0)
            System.out.println("Hai phân số bằng nhau ");
        if(kq==1)
            System.out.println("Hai phân số 1 lớn hơn ");
        if(kq==-1)
            System.out.println("Hai phân số 1 nhỏ hơn ");
    }

}
