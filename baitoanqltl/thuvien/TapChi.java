package thuvien;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private String thangPhatHanh;

    public TapChi() {

    }

    public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, String thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThanhPhatHanh() {
        return thangPhatHanh;
    }

    public void setThanhPhatHanh(String thanhPhatHanh) {
        this.thangPhatHanh = thanhPhatHanh;
    }

    @Override
     public void nhapThongTinTaiLieu(Scanner sc) {
        super.nhapThongTinTaiLieu(sc);
        System.out.print("Nhap vao so phat hanh  : ");
        soPhatHanh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vao so thang phat hanh  : ");
        thangPhatHanh = sc.nextLine();
    }

    @Override
    public void hienThiThongTinTaiLieu() {
      super.hienThiThongTinTaiLieu();
      System.out.println("So phat hanh : " + soPhatHanh);
      System.out.println("So thang phat hanh : " + thangPhatHanh);
    }
    
}
