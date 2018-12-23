package quyetnguyen.com.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "loaixe")
public class LoaiXeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maloaixe")
    private Integer maLoaiXe;
    @Column(name = "motaloaixe")
    private String moTaLoaiXe;
    @OneToMany(mappedBy = "ChuXeEntity",cascade = CascadeType.ALL)
    private Set<ChuXeEntity>  chuXeEntities = new HashSet<>();

    public Set<ChuXeEntity> getChuXeEntities() {
        return chuXeEntities;
    }

    public void setChuXeEntities(Set<ChuXeEntity> chuXeEntities) {
        this.chuXeEntities = chuXeEntities;
    }

    public LoaiXeEntity() {
    }

    public LoaiXeEntity(String moTaLoaiXe) { 
        this.moTaLoaiXe = moTaLoaiXe;
    }

    public Integer getMaLoaiXe() {
        return maLoaiXe;
    }

    public void setMaLoaiXe(Integer maLoaiXe) {
        this.maLoaiXe = maLoaiXe;
    }

    public String getMoTaLoaiXe() {
        return moTaLoaiXe;
    }

    public void setMoTaLoaiXe(String moTaLoaiXe) {
        this.moTaLoaiXe = moTaLoaiXe;
    }
}
