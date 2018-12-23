package quyetnguyen.com.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class ChuXeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "machuxe")
    private int maChuXe;
    @Column(name = "hotenchuxe")
    private String hoTenChuXe;
    @Column(name = "diachi")
    private String diaChi;
    @Column(name = "sodt")
    private String soDT;
    @Column(name = "biensoxe")
    private String bienSoXe;
    @Column(name = "mahtx")
    private int maHTX;
    @ManyToOne
    @JoinColumn(name = "maloaixe")
    private LoaiXeEntity loaiXeEntity;

    public LoaiXeEntity getLoaiXeEntity() {
        return loaiXeEntity;
    }

    public void setLoaiXeEntity(LoaiXeEntity loaiXeEntity) {
        this.loaiXeEntity = loaiXeEntity;
    }

    public ChuXeEntity() {
    }

    public ChuXeEntity(String hoTenChuXe, String diaChi, String soDT, String bienSoXe, int maHTX) {
        this.hoTenChuXe = hoTenChuXe;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.bienSoXe = bienSoXe;
        this.maHTX = maHTX;
    }

    public int getMaChuXe() {
        return maChuXe;
    }

    public void setMaChuXe(int maChuXe) {
        this.maChuXe = maChuXe;
    }

    public String getHoTenChuXe() {
        return hoTenChuXe;
    }

    public void setHoTenChuXe(String hoTenChuXe) {
        this.hoTenChuXe = hoTenChuXe;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public int getMaHTX() {
        return maHTX;
    }

    public void setMaHTX(int maHTX) {
        this.maHTX = maHTX;
    }
}
