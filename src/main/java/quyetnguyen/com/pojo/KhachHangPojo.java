package quyetnguyen.com.pojo;

public class KhachHangPojo {
    private int maKhachHang;
    private String hoTenKH;
    private String soDT;

    public KhachHangPojo() {
    }

    public KhachHangPojo(int maKhachHang, String hoTenKH, String soDT) {
        this.maKhachHang = maKhachHang;
        this.hoTenKH = hoTenKH;
        this.soDT = soDT;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTenKH() {
        return hoTenKH;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
}
