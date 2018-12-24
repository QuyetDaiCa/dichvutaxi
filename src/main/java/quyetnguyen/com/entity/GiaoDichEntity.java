package quyetnguyen.com.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "giaodich")
public class GiaoDichEntity {
    @EmbeddedId
    private Pk pk;
    @Column(name = "điemonkhach")
    private String diemDonKhach;
    @Column(name = "diemtrakhach")
    private String diemTraKhach;
    @Column(name = "makhuyenmai")
    private Integer maKhuyenMai;
    @Column(name = "sotiengiaodichthucte")
    private String soTienGiaoDichThucTe;
    public GiaoDichEntity() {
    }

    public GiaoDichEntity(Pk pk, String diemDonKhach, String diemTraKhach, Integer maKhuyenMai, String soTienGiaoDichThucTe) {
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

    @Embeddable
    public static class Pk implements Serializable{
        @Column(name = "machuxe")
        private Integer maChuXe;
        @Column(name = "makhachhang")
        private Integer maKhachHang;
        @Column(name = "thoigiangiaodich")
        private String thoiGianGiaoDich;

        public Pk(Integer maChuXe, Integer maKhachHang, String thoiGianGiaoDich) {
            this.maChuXe = maChuXe;
            this.maKhachHang = maKhachHang;
            this.thoiGianGiaoDich = thoiGianGiaoDich;
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
    }
}
