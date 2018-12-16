package quyetnguyen.com.pojo;

public class ChuXePojo {
    private int maChuXe;
    private String hoTenChuXe;
    private String diaChi;
    private String soDT;
    private String bienSoXe;
    private int maLoaiXe;
    private int maHTX;

    public ChuXePojo() {
    }

    public ChuXePojo(int maChuXe, String hoTenChuXe, String diaChi, String soDT, String bienSoXe, int maLoaiXe, int maHTX) {
        this.maChuXe = maChuXe;
        this.hoTenChuXe = hoTenChuXe;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.bienSoXe = bienSoXe;
        this.maLoaiXe = maLoaiXe;
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

    public int getMaLoaiXe() {
        return maLoaiXe;
    }

    public void setMaLoaiXe(int maLoaiXe) {
        this.maLoaiXe = maLoaiXe;
    }

    public int getMaHTX() {
        return maHTX;
    }

    public void setMaHTX(int maHTX) {
        this.maHTX = maHTX;
    }
}
