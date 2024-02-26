package Entry;

import java.util.*;
import DonViSanXuat.*;

public class Entry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB ql = new QLCB();
        String luachon = "";
        String choice = "y";
        int i = 0;
        do {
            System.out.println("------MENU------");
            System.out.println("1. Them moi can bo .");
            System.out.println("2. Tim kiem theo ho va ten .");
            System.out.println("3. Hien thi thong tin ve danh sach can bo .");
            System.out.println("4. Thoat khoi chuong trinh .");
            System.out.print("Nhap su lua chon cua ban : ");
            luachon = sc.nextLine();
            switch (luachon) {
                case "1":
                    while (choice.equals("y")) {
                        CanBo cb;
                        System.out.println("Nhap thong tin ");
                        System.out.println("Lan " + (i + 1) + " : ");
                        System.out.println("1 - KySu, 2 - CongNhan, 3 - NhanVien");
                        String choose = sc.nextLine();
                        cb = new CanBo();
                        switch (choose) {
                            case "1":
                                cb = new KySu();
                                break;
                            case "2":
                                cb = new CongNhan();
                                break;
                            case "3":
                                cb = new NhanVien();
                                break;
                            default:
                                System.out.println("Ban nhap sai !");
                                choose = sc.nextLine();
                                break;
                        }
                        i++;
                        cb.Nhap(sc);
                        ql.ThemCanBo(cb);
                        System.out.println("Ban co muon them can bo nua khong : y/n");
                        choice = sc.nextLine();
                    }
                    break;
                case "2":
                    System.out.println("Nhap vao ten ban muon tim kiem : ");
                    String name = sc.nextLine();
                    ql.TimKiem(name);
                    break;
                case "3":
                    System.out.println("------Thong tin cua cac can bo------");
                    System.out.println();
                    ql.XuatThongTin();
                    break;
                case "4":
                    System.out.println("Ban da chon thoat !");
                    System.exit(0);
                    break;
            }
        } while(true);    
    }
}
