package DonViSanXuat;
import java.util.ArrayList;

public class QLCB {
    private ArrayList<CanBo> ds;

    public QLCB () {
        ds = new ArrayList<CanBo>();
    }

    public void ThemCanBo(CanBo cb) {
        ds.add(cb);
    }

    public void TimKiem(String name) {
        for (CanBo cb : ds) {
            if (name.equals(cb.GetName())) {
                cb.Xuat();
            }
        }
    }

    public void XuatThongTin() {
        for (CanBo cb : ds) {
            cb.Xuat();
            System.out.println();
        }
    }
}
