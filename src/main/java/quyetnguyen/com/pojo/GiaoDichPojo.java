package quyetnguyen.com.pojo;

public class GiaoDichPojo {
    private Integer maChuXe;
    private Integer maKhachHang;
    private String thoiGianGiaoDich;
    private String diemDonKhach;
    private String diemTraKhach;
    private Integer maKhuyenMai;
    private String soTienGiaoDichThucTe;

    public GiaoDichPojo() {
    }

    public GiaoDichPojo(Integer maChuXe, Integer maKhachHang, String thoiGianGiaoDich, String diemDonKhach, String diemTraKhach, Integer maKhuyenMai, String soTienGiaoDichThucTe) {
        this.maChuXe = maChuXe;
        this.maKhachHang = maKhachHang;
        this.thoiGianGiaoDich = thoiGianGiaoDich;
        this.diemDonKhach = diemDonKhach;
        this.diemTraKhach = diemTraKhach;
        this.maKhuyenMai = maKhuyenMai;
        this.soTienGiaoDichThucTe = soTienGiaoDichThucTe;
    }

    public Integer getMaChuXe() {
        return maChuXe;
    }

    public void setMaChuXe(Integer maChuXe) {
        this.maChuXe = maChuXe;
    }

    public Integer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Integer maKhachHang) {
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

    public Integer getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(Integer maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getSoTienGiaoDichThucTe() {
        return soTienGiaoDichThucTe;
    }

    public void setSoTienGiaoDichThucTe(String soTienGiaoDichThucTe) {
        this.soTienGiaoDichThucTe = soTienGiaoDichThucTe;
    }
}
