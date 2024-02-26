package baitap2lop;

public class QuanLySv {

    private int mssv;
    private String name;
    private float LT, TH;

    public QuanLySv() {
    }

    public QuanLySv(int mssv, String name, float LT, float TH) {
        this.mssv = mssv;
        this.name = name;
        this.LT = LT;
        this.TH = TH;
    }

    public int getMssv(int mssv) {
        return mssv;
    }

    public String getName(String name) {
        return name;
    }

    public float getLT(float LT) {
        return LT;
    }

    public float getTH(float TH) {
        return TH;
    }

    public void setInfor(int mssv, String name, float LT, float TH) {
        this.mssv = mssv;
        this.name = name;
        this.LT = LT;
        this.TH = TH;
    }

    public float TinhDiemTb(float LT, float TH) {
        return (LT + TH) / 2;
    }

    public String toString() {
        return "Ho va ten : " + name + " , " + " MSSV : " + mssv + " , " + " Diem LT : " + LT + " , " + " Diem TH : " + TH + " , " + " Diem tb : " + TinhDiemTb(LT,TH);
    }
    
}
