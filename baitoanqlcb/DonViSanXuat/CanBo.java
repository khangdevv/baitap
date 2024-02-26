package DonViSanXuat;
import java.util.*;

public class CanBo {
    private String name;
    private String age;
    private String sex;
    private String address;

    public CanBo() {
    }

    public CanBo(String name, String age, String sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public void Nhap(Scanner sc) {
        System.out.println("Nhap ho va ten : ");
        this.name = sc.nextLine();
        System.out.println("Nhap tuoi : ");
        this.age = sc.nextLine();
        System.out.println("Nhap gioi tinh : ");
        this.sex = sc.nextLine();
        System.out.println("Nhap dia chi : ");
        this.address = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ho va ten : " + this.name);
        System.out.println("Tuoi : " + this.age);
        System.out.println("Gioi tinh : " + this.sex);
        System.out.println("Dia chi : " + this.address);
    }

    public String GetName() {
        return this.name;
    }
}



