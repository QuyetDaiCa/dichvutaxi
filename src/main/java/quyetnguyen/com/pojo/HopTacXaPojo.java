package quyetnguyen.com.pojo;

public class HopTacXaPojo {
    private Integer maHTX;
    private String tenHTX;
    private String diaChi;

    public HopTacXaPojo() {
    }

    public HopTacXaPojo(Integer maHTX, String tenHTX, String diaChi) {
        this.maHTX = maHTX;
        this.tenHTX = tenHTX;
        this.diaChi = diaChi;
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
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
