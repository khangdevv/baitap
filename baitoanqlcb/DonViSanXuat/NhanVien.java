package DonViSanXuat;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String job;

    public NhanVien() {
    }
    
    public NhanVien(String name, String age, String sex, String address, String job) {
        super(name, age, sex, address);
        this.job = job;
    }

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.println("Nhap ten cong viec : ");
        this.job = sc.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Ten cong viec : " + this.job);
    }
}
