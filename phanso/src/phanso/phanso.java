
package phanso;

public class phanso {
    private int tuso;
    private int mauso;
    public phanso()
    {
        tuso=0;
        mauso=1;
    }
    public phanso(int ts,int ms){
        tuso=ts;
        mauso=ms;
    }
    public  String toString()
    {
        String tam = "";
        tam = String.valueOf(tuso)+ "/" +String.valueOf(mauso);
        return tam;
    }
    public phanso toigian()
    {
        phanso p = new phanso();
        int ucln = UCNL(tuso, mauso);
        p.tuso = tuso/ucln;
        p.mauso = mauso/ucln;
        return p;
    }
    int UCNL(int a, int b)
    {
        int kq = 1;
        int m = Math.min(a,b);
        for (int i=m ; i>0 ; i--)
        if(b % i == 0)
        {
            kq = i;
            break;
        }
        return kq;
    }
    public phanso congvoi(phanso ps)
    {
        phanso p = new phanso();
        p.tuso = ps.tuso * this.mauso + ps.mauso*this.tuso;
        p.mauso = ps.mauso * this.mauso;
        return p;
    }
    public int sovoi(phanso ps)
    {
        int kq=0;
        double so1 =(double)this.tuso/this.mauso;
        double so2 =(double)ps.tuso/ps.mauso;
        if(so1 == so2)
            kq = 0;
        if(so1 > so2)
            kq = 1;
        if(so1 < so2)
            kq = -1;
        return kq;
    }}
