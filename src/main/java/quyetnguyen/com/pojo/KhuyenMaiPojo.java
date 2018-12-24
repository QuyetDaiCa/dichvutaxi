package quyetnguyen.com.pojo;

public class KhuyenMaiPojo {
    private Integer maKhuyenMai;
    private String noiDungKhuyenMai;

    public KhuyenMaiPojo() {
    }

    public KhuyenMaiPojo(Integer maKhuyenMai, String noiDungKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
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
