package camera2;
import java.util.Scanner;
public class cameraProsumer extends camera {
 private String Bonhotrong;
 private String dongia;

 public cameraProsumer()
 {  
 }

    public cameraProsumer(String Bonhotrong, String dongia) {
        this.Bonhotrong = Bonhotrong;
        this.dongia = dongia;
    }

    public cameraProsumer(String Bonhotrong, String dongia, String Macamera, String Tencamera, String hangsanxuat, int Soluong) {
        super(Macamera, Tencamera, hangsanxuat, Soluong);
        this.Bonhotrong = Bonhotrong;
        this.dongia = dongia;
    }



    public String getBonhotrong() {
        return Bonhotrong;
    }

    public String getDongia() {
        return dongia;
    }

    public void setBonhotrong(String Bonhotrong) {
        this.Bonhotrong = Bonhotrong;
    }

    public void setDongia(String dongia) {
        this.dongia = dongia;
    }

 
 @Override
 public void nhap()
 {
 super.nhap();
 Scanner sc= new Scanner(System.in);
 System.out.print(" nhap Bo nhơ trong: ");
 Bonhotrong= sc.nextLine();
 System.out.print("nhap don gia: ");
 dongia= sc.nextLine();
 }
 @Override
 public void xuat()
 {
 super.xuat();
 System.out.println("\n{bonhotrong: "+ getBonhotrong()+ ", dongia: "+getDongia()+ "}");
 }

}
