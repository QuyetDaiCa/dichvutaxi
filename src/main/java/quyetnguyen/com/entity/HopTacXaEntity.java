package quyetnguyen.com.entity;

import javax.persistence.*;

@Entity
@Table
public class HopTacXaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mahtx")
    private int maHTX;
    @Column(name = "tenhtx")
    private String tenHTX;
    @Column(name = "diachi")
    private String diaChi;

    public HopTacXaEntity() {
    }

    public HopTacXaEntity(String tenHTX, String diaChi) {
        this.tenHTX = tenHTX;
        this.diaChi = diaChi;
    }

    public int getMaHTX() {
        return maHTX;
    }

    public void setMaHTX(int maHTX) {
        this.maHTX = maHTX;
    }

    public String getTenHTX() {
        return tenHTX;
    }

    public void setTenHTX(String tenHTX) {
        this.tenHTX = tenHTX;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
