package quyetnguyen.com.pojo;

public class HopTacXaPojo {
    private int maHTX;
    private String tenHTX;
    private String diaChi;

    public HopTacXaPojo() {
    }

    public HopTacXaPojo(int maHTX, String tenHTX, String diaChi) {
        this.maHTX = maHTX;
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
