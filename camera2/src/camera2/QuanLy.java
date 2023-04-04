package camera2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLy {

    ArrayList<camera> listcamera;
    ArrayList<Camerapolaroid> listCamerapolaroid; 
    ArrayList<Hoadon> listHoadon;

    public QuanLy() {
        listcamera = new ArrayList<>();
    }

    public void themDSCamera(camera a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng cần thêm: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Lần nhập thứ " + (i + 1) + ": ");
            if (a instanceof Camerapolaroid) {
                a = new Camerapolaroid();
                a.nhap();
            } else if (a instanceof cameraProsumer) {
                a = new cameraProsumer();
                a.nhap();
            }
            listcamera.add(a);
        }
    }

    public void menuSuaDoi() {
        System.out.println("-----------------------------------------");
        System.out.println("1. Sua thong tin Camerapolaroid");
        System.out.println("2. Xoa Camerapolaroid");
        System.out.println("3. Sua thong tin cameraProsumer");
        System.out.println("4. Xoa cameraProsumer");
        System.out.println("5. Sua Hoa don");
        System.out.println("6. Them hoa don");
        System.out.println("7. Xoa cameraProsumer");
        System.out.println("----------- Chọn số 0 để thoát ----------");
    }

    public void SuaDoi() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            menuSuaDoi();
            System.out.print("Chọn: ");
            n = sc.nextInt();
            switch (n) {
                case 1: {
                    String Macamera;
                    System.out.print("Nhap Macamera cua Camerapolaroid can sua: ");
                    sc.nextLine();
                    Macamera = sc.nextLine();
                    Suacamerapolaroid(Macamera);
                    break;
                }
                case 2: {
                    String Macamera;
                    System.out.print("nhap Macamera cua Camerapolaroid can xoa: ");
                    sc.nextLine();
                    Macamera = sc.nextLine();
                    xoacamerapolaroid(Macamera);
                    break;
                }
                case 3: {
                    String Macamera;
                    System.out.print("nhap Macamera cua cameraProsumer can sua: ");
                    sc.nextLine();
                    Macamera = sc.nextLine();
                    SuacameraProsumer(Macamera);
                    break;
                }
                case 4: {
                    String Macamera;
                    System.out.print("nhap Macamera cua cameraProsumer can xoa: ");
                    sc.nextLine();
                    Macamera = sc.nextLine();
                    xoacameraProsumer(Macamera);
                    break;
                }
                case 5: {
                    System.out.println("nhap Macamera cua Camerapolaroid: ");
                    sc.nextLine();
                    String Macamera = sc.nextLine();
                    System.out.println("Nhap MaHoadon");
                    String MaHoadon = sc.nextLine();
                    suaHoadon(MaHoadon, Macamera);
                    break;
                }
                case 6: {
                    System.out.println("Nhap Macamera cua Camerapolaroid: ");
                    sc.nextLine();
                    String Macamera = sc.nextLine();
                    themHoadon(Macamera);
                    break;
                }
                case 7: {
                    System.out.println("Nhap Macamera cua Camerapolaroid: ");
                    sc.nextLine();
                    String Macamera = sc.nextLine();
                    System.out.println("Nhap MaHoadon");
                    String MaHoadon = sc.nextLine();
                    xoaHoadon(MaHoadon, Macamera);
                    break;
                }
                             
                default:
                    break;
            }
        } while (n != 0);
    }

    public void suaHoadon(String Macamera, String Mahoadon) {
        for (camera cx : listcamera) {
            if (((Camerapolaroid) cx).getMacamera().compareTo(Macamera) == 0) {
                for (int i = 0; i < ((Camerapolaroid) cx).getHD().size(); i++) {
                    if (((Camerapolaroid) cx).getHD().get(i).getMahoadon() == Mahoadon) {
                        ((Camerapolaroid) cx).getHD().get(i).nhapHoadon();
                    }
                }
            }
        }
    }

    public void xoaHoadon(String Mahoadon, String Macamera) {
        for (camera cx : listcamera) {
            if (((Camerapolaroid) cx).getMacamera().compareTo(Macamera) == 0) {
                for (int i = 0; i < ((Camerapolaroid) cx).getHD().size(); i++) {
                    if (((Camerapolaroid) cx).getHD().get(i).getMahoadon() == Mahoadon) {
                        ((Camerapolaroid) cx).getHD().remove(i);
                    }
                }
            }
        }
    }

    public void themHoadon(String Macamera) {
        for (camera cx : listcamera) {
            if (cx instanceof Camerapolaroid) {
                ((Camerapolaroid) cx).NhapDSHoadon();
            }
        }
    }

    public void Suacamerapolaroid(String Macamera) {
        for (camera cx : listcamera) {
            if (cx instanceof Camerapolaroid) {
                if (((Camerapolaroid) cx).getMacamera().compareTo(Macamera) == 0) {
                    cx.nhap();
                }
            }
        }
    }

    public void xoacamerapolaroid(String Macamera) {
        for (camera cx : listcamera) {
            if (cx instanceof Camerapolaroid) {
                if (((Camerapolaroid) cx).getMacamera().compareTo(Macamera) == 0) {

                    listcamera.remove(cx);
                }
            }
        }
    }

    public void SuacameraProsumer(String Macamera) {
        for (camera cx : listcamera) {
            if (cx instanceof cameraProsumer) {
                if (((cameraProsumer) cx).getMacamera().compareTo(Macamera) == 0) {
                    cx.nhap();
                }
            }
        }
    }

    public void xoacameraProsumer(String Macamera) {
        for (camera cx : listcamera) {
            if (cx instanceof cameraProsumer) {
                if (((cameraProsumer) cx).getMacamera().compareTo(Macamera) == 0) {
                    listcamera.remove(cx);
                }
            }
        }
    }

    public void xuatDSCameraProsumer(camera a) {
        System.out.println("----------------------------------------------");
        for (camera cx : listcamera) {
            if (cx instanceof cameraProsumer) {
                cx.xuat();
            }
        }
    }
    public void xuatDSCameraProsumer() {
        System.out.println("----------------------------------------------");
        for (camera cx : listcamera) {
            if (cx instanceof cameraProsumer) {
                cx.xuat();
            }
        }
    }
    
    public void xuatDSCamerapolaroid() {
        System.out.println("----------------------------------------------");
        for (camera cx : listcamera) {
            if (cx instanceof Camerapolaroid) {
                cx.xuat();
            }
        }
    }

    public void xuatDS() {
        System.out.println("----------------------------------------------");
        for (camera cx : listcamera) {
            cx.xuat();
        }
    }

    public void xuatDS(camera a) {
        System.out.println("----------------------------------------------");
        for (camera cx : listcamera) {
            cx.xuat();
        }

    }

    public void xuatDSCamerapolaroid(camera a) {
        System.out.println("----------------------------------------------");
        for (camera cx : listcamera) {
            if (cx instanceof Camerapolaroid) {
                cx.xuat();
            }
        }
    }
    
    public void xuatDScameraPolaroid() {
        for (Hoadon cx : listHoadon) {
            cx.xuatHoadon();
        }
    }

    public void ghiFile(String fileName){
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.flush();
            objOut.writeObject(listcamera);
            objOut.close();
            fileOut.close();
            System.out.println("Luu file thanh cong, ten file: " + fileName);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void docFile(String fileName) {
        try {
            listcamera = new ArrayList<>();
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream fout = new ObjectInputStream(fin);
            listcamera = (ArrayList) fout.readObject();
            xuatDS();
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.print("\nKhong thay file.\n");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void timKiemCamera(String ten) {
    System.out.print("--------------------------- ");  
    for (camera cx : listcamera) {
        if (cx.getTencamera().equals(ten)) {
            cx.xuat();
            System.out.println("Da tim thay thong tin camera " + ten);
            return;
        }
    }
        System.out.println("Khong tim thay camera " + ten);
    }


    public void SapXepTheoSoLuong() {
        Collections.sort(listHoadon, new SapXepTheoSoLuong());
        System.out.println("Danh sach camera polaroid sau khi sap xep");
        xuatDScameraPolaroid();
    }

    public void menuChinh() {
        System.out.println("------CHƯƠNG TRÌNH QUẢN LÝ KHO------");
        System.out.println("1. Nhập danh sách Camerapolaroid và Hoadon ");
        System.out.println("2. Nhập danh sách cameraProsumer ");
        System.out.println("3. hien thi danh sach camerapolaroid");
        System.out.println("4. hien thi danh sach cameraProsumer");
        System.out.println("5. Chinh sua thong tin (Camerapolaroid, Hoadon,cameraProsumer)");
        System.out.println("6. Luu file da nhap");
        System.out.println("7. doc file da luu ");
        System.out.println("8. Sap xep so luong camera tang dan ( Sau khi chay chuc nang 8");
        System.out.println("9. tim camera");
        System.out.println("-----nhap 0 de thoat chuong trinh!-----");
    }

}
