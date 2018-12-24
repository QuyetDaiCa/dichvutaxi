package quyetnguyen.com.entity;

import javax.persistence.*;

@Entity
@Table(name = "khuyenmai")
public class KhuyenMaiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "makhuyenmai")
    private Integer maKhuyenMai;
    @Column(name = "noidungkhuyenmai")
    private String noiDungKhuyenMai;

    public KhuyenMaiEntity() {
    }

    public KhuyenMaiEntity(String noiDungKhuyenMai) {
        this.noiDungKhuyenMai = noiDungKhuyenMai;
    }

    public Integer getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(Integer maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getNoiDungKhuyenMai() {
        return noiDungKhuyenMai;
    }

    public void setNoiDungKhuyenMai(String noiDungKhuyenMai) {
        this.noiDungKhuyenMai = noiDungKhuyenMai;
    }
}
