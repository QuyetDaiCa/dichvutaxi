package quyetnguyen.com.pojo;

public class GiaoDichPojo {
    private int maChuXe;
    private int maKhachHang;
    private String thoiGianGiaoDich;
    private String diemDonKhach;
    private String diemTraKhach;
    private int maKhuyenMai;
    private String soTienGiaoDichThucTe;

    public GiaoDichPojo() {
    }

    public GiaoDichPojo(int maChuXe, int maKhachHang, String thoiGianGiaoDich, String diemDonKhach, String diemTraKhach, int maKhuyenMai, String soTienGiaoDichThucTe) {
        this.maChuXe = maChuXe;
        this.maKhachHang = maKhachHang;
        this.thoiGianGiaoDich = thoiGianGiaoDich;
        this.diemDonKhach = diemDonKhach;
        this.diemTraKhach = diemTraKhach;
        this.maKhuyenMai = maKhuyenMai;
        this.soTienGiaoDichThucTe = soTienGiaoDichThucTe;
    }

    public int getMaChuXe() {
        return maChuXe;
    }

    public void setMaChuXe(int maChuXe) {
        this.maChuXe = maChuXe;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getThoiGianGiaoDich() {
        return thoiGianGiaoDich;
    }

    public void setThoiGianGiaoDich(String thoiGianGiaoDich) {
        this.thoiGianGiaoDich = thoiGianGiaoDich;
    }

    public String getDiemDonKhach() {
        return diemDonKhach;
    }

    public void setDiemDonKhach(String diemDonKhach) {
        this.diemDonKhach = diemDonKhach;
    }

    public String getDiemTraKhach() {
        return diemTraKhach;
    }

    public void setDiemTraKhach(String diemTraKhach) {
        this.diemTraKhach = diemTraKhach;
    }

    public int getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(int maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getSoTienGiaoDichThucTe() {
        return soTienGiaoDichThucTe;
    }

    public void setSoTienGiaoDichThucTe(String soTienGiaoDichThucTe) {
        this.soTienGiaoDichThucTe = soTienGiaoDichThucTe;
    }
}
