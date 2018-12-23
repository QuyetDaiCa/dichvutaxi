package quyetnguyen.com.pojo;

public class LoaiXePojo {
    private Integer maLoaiXe;
    private String moTaLoaiXe;

    public LoaiXePojo() {
    }

    public LoaiXePojo(Integer maLoaiXe, String moTaLoaiXe) {
        this.maLoaiXe = maLoaiXe;
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
