package camera2;

import java.util.ArrayList;
import java.util.Scanner;

public class Camerapolaroid extends camera {

    private String kichthuocbanin;
    public float dongia;
    private ArrayList<Hoadon> HD;
    Hoadon hoadon1;
   


    public Camerapolaroid(String kichthuocbanin, float dongia, ArrayList<Hoadon> HD, Hoadon hoadon1) {
        this.kichthuocbanin = kichthuocbanin;
        this.dongia = dongia;
        this.HD = HD;
        this.hoadon1 = hoadon1;
    }

    public Camerapolaroid(String kichthuocbanin, float dongia, ArrayList<Hoadon> HD, Hoadon hoadon1, String Macamera, String Tencamera, String hangsanxuat, int Soluong) {
        super(Macamera, Tencamera, hangsanxuat, Soluong);
        this.kichthuocbanin = kichthuocbanin;
        this.dongia = dongia;
        this.HD = HD;
        this.hoadon1 = hoadon1;
    }

    Camerapolaroid() {
       
    }

    public String getKichthuocbanin() {
        return kichthuocbanin;
    }

    public float getDongia() {
        return dongia;
    }

    public ArrayList<Hoadon> getHD() {
        return HD;
    }

    public Hoadon getHoadon1() {
        return hoadon1;
    }

    public void setKichthuocbanin(String kichthuocbanin) {
        this.kichthuocbanin = kichthuocbanin;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public void setHD(ArrayList<Hoadon> HD) {
        this.HD = HD;
    }

    public void setHoadon1(Hoadon hoadon1) {
        this.hoadon1 = hoadon1;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("nhap kich thuoc ban in: ");
        kichthuocbanin = sc.nextLine();
        System.out.print("nhap don gia: ");
        dongia = sc.nextFloat();
        NhapDSHoadon();
    }

    public void NhapDSHoadon() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hoa don de them: ");
        int n = sc.nextInt();
        HD = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            hoadon1 = new Hoadon();
            hoadon1.nhapHoadon();
            HD.add(hoadon1);
        }
    }

    public void xuatDSHoadon() {
        for (Hoadon cx : HD) {
            cx.xuatHoadon();
        }
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("{Kichthuocbanin: " + getKichthuocbanin() + ", dongia: "
                + getDongia());
        xuatDSHoadon();
    }

    public void hienThongtinTS() {
        super.xuat();
        System.out.println("{kichthuocbanin: " + getKichthuocbanin() + ", dongia: " + getDongia());
    }

}
