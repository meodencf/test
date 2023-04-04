package camera2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        QuanLy a = new QuanLy();
        camera b;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            a.menuChinh();
            System.out.print("lua chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1: {
                    b = new Camerapolaroid();
                    a.themDSCamera(b);
                    break;

                }
                case 2: {
                    b = new cameraProsumer();
                    a.themDSCamera(b);
                    break;

                }
                case 3: {
                    a.xuatDSCameraProsumer();
                    break;

                }
                case 4: {
                    a.xuatDSCamerapolaroid();
                    break;
                }
                case 5: {
                    a.SuaDoi();
                    break;
                }
                case 6: {
                    String tenfile;
                    System.out.print("nhap ten file muon luu: ");
                    sc.nextLine();
                    tenfile = sc.nextLine();
                    a.ghiFile(tenfile);
                    break;
                }
                case 7: {

                    String tenfile;
                    System.out.print("nhap ten file muon doc: ");
                    sc.nextLine();
                    tenfile = sc.nextLine();
                    a.docFile(tenfile);
                    break;
                }
                case 8:{
                    System.out.println("-------------------------------");
                    a.SapXepTheoSoLuong();
                    break;
                }
                default:
                    break;
            }
        } while (n != 0);
    }
}
