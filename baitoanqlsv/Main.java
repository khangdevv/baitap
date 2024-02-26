package baitap2lop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySv hs1 = new QuanLySv();
        QuanLySv hs2 = new QuanLySv();
        QuanLySv hs3 = new QuanLySv();
        hs1.setInfor(376744, "bao khang", 8, 6);
        hs2.setInfor(787758, "bao tam", 6, 6);
        hs3.setInfor(75579, "bao han", 5, 7);
        System.out.println("Thong tin hs1 : " + hs1.toString());
        System.out.println("Thong tin hs2 : " + hs2.toString());
        System.out.println("Thong tin hs3 : " + hs3.toString());
        sc.close();
    }
}
