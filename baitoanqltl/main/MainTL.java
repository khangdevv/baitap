package main;

import java.util.Scanner;

import thuvien.*;

public class MainTL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLTL ql = new QLTL();
        String luachon = "";
        int i = 0;
        do {
            System.out.println("----------------------MENU-------------------------------");
            System.out.println("| 1. Them moi tai lieu : sach, tap chi, bao .           |");
            System.out.println("| 2. Xoa tai lieu theo ma tai lieu .                    |");
            System.out.println("| 3. Hien thi thong tin ve tai lieu .                   |");
            System.out.println("| 4. Tim kiem theo loai tai lieu : sach, tap chi, bao . |");
            System.out.println("| 5. Thoat khoi chuong trinh .                          |");
            System.out.println("---------------------------------------------------------");
            System.out.print(" ======> Nhap su lua chon cua ban : ");
            luachon = sc.nextLine();
            switch (luachon) {
                case "1":

                    TaiLieu tl;
                    System.out.println("Nhap thong tin ");
                    System.out.println("Lan " + (i + 1) + " : ");
                    System.out.println("1 - Sach, 2 - Tap chi, 3 - Bao");
                    String choose = sc.nextLine();
                    tl = new TaiLieu();
                    switch (choose) {
                        case "1":
                            tl = new Sach();
                            break;
                        case "2":
                            tl = new TapChi();
                            break;
                        case "3":
                            tl = new Bao();
                            break;
                        default:
                            while (choose != "3" || choose != "2" || choose != "1") {
                                System.out.println("Hay nhap lai : ");
                                choose = sc.nextLine();
                                if (choose.equals("1") || choose.equals("2") || choose.equals("3")) {
                                    break;
                                }
                            }
                            break;
                    }
                    i++;
                    tl.nhapThongTinTaiLieu(sc);
                    ql.themTaiLieu(tl);
                    break;
                case "2":
                    System.out.println("Nhap ma sach ban muon xoa : ");
                    String ma = sc.nextLine();
                    while (ql.xoaTaiLieu(ma) == 0) {
                        System.out.println("Khong tim thay tai lieu ban muon xoa !");
                        System.out.println("Vui long nhap lai :");
                        ma = sc.nextLine();
                    }
                    ql.xoaTaiLieu(ma);
                    break;
                case "3":
                    System.out.println("------Thong tin cua cac tai lieu------");
                    System.out.println();
                    ql.XuatThongTin();
                    break;
                case "4" :
                    System.out.println("Nhap vao loai tai lieu muon tim kiem : ");
                    String loai = sc.nextLine();
                    while (ql.timKiemTheoLoai(loai) == 0) {
                        System.out.println("Khong tim thay !");
                        System.out.println("Nhap lai loai tai lieu : ");
                        loai = sc.nextLine();
                    }
                    ql.timKiemTheoLoai(loai);
                    break;
                case "5":
                    sc.close();
                    System.out.println("Ban da chon thoat !");
                    System.exit(0);
                    break;
            }
            sc.nextLine();
        } while (true);
    }
}
