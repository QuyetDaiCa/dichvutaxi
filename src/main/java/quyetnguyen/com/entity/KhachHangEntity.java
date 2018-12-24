package quyetnguyen.com.entity;

import javax.persistence.*;

@Entity
@Table(name = "khachhang")
public class KhachHangEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "makhachhang")
    private Integer maKhachHang;
    @Column(name = "hotenkh")
    private String hoTenKH;
    @Column(name = "sodt")
    private String soDT;

    public KhachHangEntity() {
    }

    public KhachHangEntity(String hoTenKH, String soDT) {
        this.hoTenKH = hoTenKH;
        this.soDT = soDT;
    }

    public Integer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Integer maKhachHang) {
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
