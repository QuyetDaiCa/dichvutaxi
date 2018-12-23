package quyetnguyen.com.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class GiaoDichEntity {
    @EmbeddedId
    private Pk pk;
    @Column(name = "điemonkhach")
    private String diemDonKhach;
    @Column(name = "diemtrakhach")
    private String diemTraKhach;
    @Column(name = "makhuyenmai")
    private int maKhuyenMai;
    @Column(name = "sotiengiaodichthucte")
    private String soTienGiaoDichThucTe;
    public GiaoDichEntity() {
    }

    public GiaoDichEntity(Pk pk, String diemDonKhach, String diemTraKhach, int maKhuyenMai, String soTienGiaoDichThucTe) {
        this.pk = pk;
        this.diemDonKhach = diemDonKhach;
        this.diemTraKhach = diemTraKhach;
        this.maKhuyenMai = maKhuyenMai;
        this.soTienGiaoDichThucTe = soTienGiaoDichThucTe;
    }

    public Pk getPk() {
        return pk;
    }

    public void setPk(Pk pk) {
        this.pk = pk;
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

    @Embeddable
    public static class Pk implements Serializable{
        @Column(name = "machuxe")
        private int maChuXe;
        @Column(name = "makhachhang")
        private int maKhachHang;
        @Column(name = "thoigiangiaodich")
        private String thoiGianGiaoDich;

        public Pk(int maChuXe, int maKhachHang, String thoiGianGiaoDich) {
            this.maChuXe = maChuXe;
            this.maKhachHang = maKhachHang;
            this.thoiGianGiaoDich = thoiGianGiaoDich;
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
    }
}
