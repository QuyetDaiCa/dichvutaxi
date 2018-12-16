package quyetnguyen.com.pojo;

public class KhuyenMaiPojo {
    private int maKhuyenMai;
    private String noiDungKhuyenMai;

    public KhuyenMaiPojo() {
    }

    public KhuyenMaiPojo(int maKhuyenMai, String noiDungKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
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
