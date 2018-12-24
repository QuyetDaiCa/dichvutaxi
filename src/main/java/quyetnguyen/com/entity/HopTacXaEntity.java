package quyetnguyen.com.entity;

import javax.persistence.*;

@Entity
@Table(name = "hoptacxa")
public class HopTacXaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mahtx")
    private Integer maHTX;
    @Column(name = "tenhtx")
    private String tenHTX;
    @Column(name = "diachia")
    private String diaChia;

    public HopTacXaEntity() {
    }

    public HopTacXaEntity(String tenHTX, String diaChi) {
        this.tenHTX = tenHTX;
        this.diaChia = diaChi;
    }

    public Integer getMaHTX() {
        return maHTX;
    }

    public void setMaHTX(Integer maHTX) {
        this.maHTX = maHTX;
    }

    public String getTenHTX() {
        return tenHTX;
    }

    public void setTenHTX(String tenHTX) {
        this.tenHTX = tenHTX;
    }

    public String getDiaChi() {
        return diaChia;
    }

    public void setDiaChi(String diaChi) {
        this.diaChia = diaChi;
    }
}
