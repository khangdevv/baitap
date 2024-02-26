package thuvien;
import java.util.ArrayList;

public class QLTL {
    private ArrayList<TaiLieu> ds;

    public QLTL () {
        ds = new ArrayList<TaiLieu>();
    }

    public int xoaTaiLieu(String maTaiLieu) {
        for (TaiLieu tl : ds) {
            if (maTaiLieu.equals(tl.getMaTaiLieu())) {
                ds.remove(tl);
                System.out.println("Sau khi da xoa : ");
                XuatThongTin();
                return ds.indexOf(tl);
            }
        }
        return 0;
    }

    public void themTaiLieu(TaiLieu tl) {
        if (checkTrungMa(tl.getMaTaiLieu())) {
            System.out.println("Trung ma tai lieu ");
        }
        else {
            ds.add(tl);
        } 
    }

    public boolean checkTrungMa(String maTaiLieu) {
            for (TaiLieu tl : ds) {
                if (tl.getMaTaiLieu().equals(maTaiLieu)) {
                    return true;
                }
            }
        return false;
    }

    public int timKiemTheoLoai(String loai) {
        for (TaiLieu tl : ds) {
            if (loai.equals("Sach") && (tl instanceof Sach)) {
                tl.hienThiThongTinTaiLieu();
                System.out.println();
            }
            else if (loai.equals("Bao") && (tl instanceof Bao)) {
                tl.hienThiThongTinTaiLieu();
            }
            else if (loai.equals("Tap Chi") && (tl instanceof TapChi)) {
                tl.hienThiThongTinTaiLieu();
            }
        }
        return 0;
    }

    public void XuatThongTin() {
        for (TaiLieu tl : ds) {
            tl.hienThiThongTinTaiLieu();
            System.out.println();
        }
    }
}
