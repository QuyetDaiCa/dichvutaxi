package quyetnguyen.com.pojo;

public class LoaiXePojo {
    private Long maLoaiXe;
    private String moTaLoaiXe;

    public LoaiXePojo() {
    }

    public LoaiXePojo(Long maLoaiXe, String moTaLoaiXe) {
        this.maLoaiXe = maLoaiXe;
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
