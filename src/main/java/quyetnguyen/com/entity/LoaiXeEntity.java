package quyetnguyen.com.entity;

import javax.persistence.*;

@Entity
@Table(name = "loaixe")
public class LoaiXeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maloaixe")
    private Long maLoaiXe;
    @Column(name = "motaloaixe")
    private String moTaLoaiXe;

    public LoaiXeEntity() {
    }

    public LoaiXeEntity(String moTaLoaiXe) { 
        this.moTaLoaiXe = moTaLoaiXe;
    }

    public Long getMaLoaiXe() {
        return maLoaiXe;
    }

    public void setMaLoaiXe(Long maLoaiXe) {
        this.maLoaiXe = maLoaiXe;
    }

    public String getMoTaLoaiXe() {
        return moTaLoaiXe;
    }

    public void setMoTaLoaiXe(String moTaLoaiXe) {
        this.moTaLoaiXe = moTaLoaiXe;
    }
}
