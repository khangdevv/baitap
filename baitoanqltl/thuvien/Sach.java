package thuvien;

import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach() {

    }   
    
    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGiac, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGiac;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void nhapThongTinTaiLieu(Scanner sc) {
        super.nhapThongTinTaiLieu(sc);
        System.out.print("Nhap vao ten tac gia  : ");
        tenTacGia = sc.nextLine();
        System.out.print("Nhap vao so trang  : ");
        soTrang = sc.nextInt();
    }

    @Override
    public void hienThiThongTinTaiLieu() {
      super.hienThiThongTinTaiLieu();
      System.out.println("Ten tac gia : " + tenTacGia);
      System.out.println("So trang : " + soTrang);
    }
    
}
