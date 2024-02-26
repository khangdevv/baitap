package thuvien;
import java.util.*;

public class TaiLieu {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;
    
    public TaiLieu() {

    }
    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void nhapThongTinTaiLieu(Scanner sc) {
        System.out.print("Nhap vao ma tai lieu : ");
        maTaiLieu = sc.nextLine();
        System.out.print("Nhap vao ten nha xuat ban : ");
        tenNhaXuatBan = sc.nextLine();
        System.out.print("Nhap vao so ban phat hanh : ");
        soBanPhatHanh = sc.nextInt();
        sc.nextLine();
    }

    public void hienThiThongTinTaiLieu() {
        System.out.println("Ma tai lieu : " + maTaiLieu);
        System.out.println("Ten nha xuat ban : " + tenNhaXuatBan);
        System.out.println("So ban phat hanh : " + soBanPhatHanh);
    }

}