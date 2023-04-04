
package camera2;

import java.io.Serializable;

import java.util.Scanner;
public class Hoadon implements Serializable{
 private String Mahoadon, Ngaynhapxuat, Loaihoadon;
 private float thanhtien;
 private int Macamera, SoLuongNhapXuat;
    public Hoadon() {
    }    

    public Hoadon(String Mahoadon, String Ngaynhapxuat,String Loaihoadon, float thanhtien, int Macamera,int SoLuongNhapXuat) {
        this.Mahoadon = Mahoadon;
        this.Ngaynhapxuat = Ngaynhapxuat;
        this.thanhtien = thanhtien;
        this.Macamera = Macamera;
        this.Loaihoadon = Loaihoadon;
        this.SoLuongNhapXuat = SoLuongNhapXuat;
    }

     public String getMahoadon() {
        return Mahoadon;
    }

    public String getNgaynhapxuat() {
        return Ngaynhapxuat;
    }

    public float getThanhtien() {
        return thanhtien;
    }

    public int getMacamera() {
        return Macamera;
    }

    public String getLoaihoadon() {
        return Loaihoadon;
    }

    public int getSoLuongNhapXuat() {
        return SoLuongNhapXuat;
    }
    

    public void setMahoadon(String Mahoadon) {
        this.Mahoadon = Mahoadon;
    }

    public void setNgaynhapxuat(String Ngaynhapxuat) {
        this.Ngaynhapxuat = Ngaynhapxuat;
    }

    public void setThanhtien(float thanhtien) {
        this.thanhtien = thanhtien;
    }

    public void setMacamera(int Macamera) {
        this.Macamera = Macamera;
    }
    public void setLoaihoadon(String Loaihoadon) {
        this.Loaihoadon = Loaihoadon;
    }

    public void setSoLuongNhapXuat(int SoLuongNhapXuat) {
        this.SoLuongNhapXuat = SoLuongNhapXuat;
    }
 
 public void nhapHoadon() {
 Scanner sc = new Scanner(System.in);
 System.out.print("loai hoa don (nhap) hoac (xuat):");
 Loaihoadon = sc.nextLine();
 System.out.print("ma camera: ");
 Macamera = sc.nextInt(); 
 System.out.print("Thanh tien: ");
 thanhtien = sc.nextFloat();
 System.out.print("ngay nhap hoac xuat: ");
 Ngaynhapxuat = sc.nextLine();
 System.out.print("nhap so luong xuat hoac nhap");
 SoLuongNhapXuat = sc.nextInt();
 }

 public void xuatHoadon()
 {
 System.out.println("Loaihoadon: "+ getLoaihoadon()+ ",Macamera: "+
getMacamera()+ ", thanhtien: "+ getThanhtien()+ "ngaynhapxuat: "+getNgaynhapxuat()+"SoLuongNhapMua:"+getSoLuongNhapXuat());
 }
}