package DonViSanXuat;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String levels;

    public CongNhan() {
    }

    public CongNhan (String name, String age, String sex, String address, String levels) {
        super(name, age, sex, address);
        this.levels = levels;
    }

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.println("Nhap cap bac : ");
        this.levels = sc.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Cap bac : " + this.levels);
    }
}
