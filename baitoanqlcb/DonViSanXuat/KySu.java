package DonViSanXuat;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganh;

    public KySu () {
    }
    
    public KySu(String name, String age, String sex, String address, String nganh) {
        super(name, age, sex, address);
        this.nganh = nganh;
    }

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.println("Nhap nganh dao tao : ");
        this.nganh = sc.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Ten nganh dao tao : " + this.nganh);
    }
}
