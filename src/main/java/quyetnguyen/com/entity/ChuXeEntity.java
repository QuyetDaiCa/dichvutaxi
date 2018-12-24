package quyetnguyen.com.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "chuxe")
public class ChuXeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "machuxe")
    private Integer maChuXe;
    @Column(name = "hotenchuxe")
    private String hoTenChuXe;
    @Column(name = "diachi")
    private String diaChi;
    @Column(name = "sodt")
    private String soDT;
    @Column(name = "biensoxe")
    private String bienSoXe;
    @Column(name = "mahtx")
    private Integer maHTX;
    @Column(name = "maloaixe")
    private Integer maloaixe;

    public Integer getMaloaixe() {
        return maloaixe;
    }

    public void setMaloaixe(Integer maloaixe) {
        this.maloaixe = maloaixe;
    }
    //  @ManyToOne
    //@JoinColumn(name = "maloaixe")
  //  private LoaiXeEntity loaiXeEntity;

//    public LoaiXeEntity getLoaiXeEntity() {
//        return loaiXeEntity;
//    }
//
//    public void setLoaiXeEntity(LoaiXeEntity loaiXeEntity) {
//        this.loaiXeEntity = loaiXeEntity;
//    }

    public ChuXeEntity() {
    }

    public ChuXeEntity(String hoTenChuXe, String diaChi, String soDT, String bienSoXe, Integer maHTX) {
        this.hoTenChuXe = hoTenChuXe;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.bienSoXe = bienSoXe;
        this.maHTX = maHTX;
    }

    public Integer getMaChuXe() {
        return maChuXe;
    }

    public void setMaChuXe(Integer maChuXe) {
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

    public Integer getMaHTX() {
        return maHTX;
    }

    public void setMaHTX(Integer maHTX) {
        this.maHTX = maHTX;
    }
}
