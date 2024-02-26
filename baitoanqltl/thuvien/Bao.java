package thuvien;

import java.util.Scanner;

public class Bao extends TaiLieu {
    private int ngayPhatHanh;

    public Bao() {

    }

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
     public void nhapThongTinTaiLieu(Scanner sc) {
        super.nhapThongTinTaiLieu(sc);
        System.out.print("Nhap vao ngay phat hanh  : ");
        ngayPhatHanh = sc.nextInt();
    }

    @Override
    public void hienThiThongTinTaiLieu() {
      super.hienThiThongTinTaiLieu();
      System.out.println("Ngay phat hanh : " + ngayPhatHanh);
    }
    
}
