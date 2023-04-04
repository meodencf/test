package camera2;
import java.io.Serializable;
import java.util.Scanner;
public class camera implements Serializable{
private String Macamera, Tencamera, hangsanxuat;
private int Soluong;
public camera(){
}
    public camera(String Macamera, String Tencamera, String hangsanxuat, int Soluong) {
        this.Macamera = Macamera;
        this.Tencamera = Tencamera;
        this.hangsanxuat = hangsanxuat;
        this.Soluong = Soluong;
    }

    public String getMacamera() {
        return Macamera;
    }

    public String getTencamera() {
        return Tencamera;
    }

    public String getHangsanxuat() {
        return hangsanxuat;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setMacamera(String Macamera) {
        this.Macamera = Macamera;
    }

    public void setTencamera(String Tencamera) {
        this.Tencamera = Tencamera;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }
 
public void nhap()
{
Scanner sc= new Scanner(System.in);
System.out.print("Ma camera: ");
Macamera= sc.nextLine();
System.out.print("ten camera: ");
Tencamera= sc.nextLine();
System.out.print("So luong: ");
Soluong = sc.nextInt();
System.out.println("nhap hang san xuat:");
hangsanxuat = sc.nextLine();
}
public void xuat(){
System.out.print("{Ma camera: "+ getMacamera() + ", Tencamera: "+
getTencamera() +", Soluong: "+ getSoluong()+ ", hangsanxuat: "+getHangsanxuat() + "}");
  }
}