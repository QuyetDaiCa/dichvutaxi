package quyetnguyen.com.entity;

import javax.persistence.*;

@Entity
@Table
public class KhuyenMaiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "makhuyenmai")
    private int maKhuyenMai;
    @Column(name = "noidungkhuyenmai")
    private String noiDungKhuyenMai;

    public KhuyenMaiEntity() {
    }

    public KhuyenMaiEntity(String noiDungKhuyenMai) {
        this.noiDungKhuyenMai = noiDungKhuyenMai;
    }

    public int getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(int maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getNoiDungKhuyenMai() {
        return noiDungKhuyenMai;
    }

    public void setNoiDungKhuyenMai(String noiDungKhuyenMai) {
        this.noiDungKhuyenMai = noiDungKhuyenMai;
    }
}
