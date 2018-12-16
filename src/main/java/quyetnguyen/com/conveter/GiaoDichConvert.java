package quyetnguyen.com.conveter;

import org.springframework.stereotype.Component;
import quyetnguyen.com.entity.GiaoDichEntity;
import quyetnguyen.com.pojo.GiaoDichPojo;

@Component
public class GiaoDichConvert {
    public GiaoDichPojo convertGiaoDich(GiaoDichEntity giaoDichEntity){
        GiaoDichPojo giaoDichPojo = new GiaoDichPojo();
        giaoDichPojo.setMaChuXe(giaoDichEntity.getPk().getMaChuXe());
        giaoDichPojo.setMaKhachHang(giaoDichEntity.getPk().getMaKhachHang());
        giaoDichPojo.setThoiGianGiaoDich(giaoDichEntity.getPk().getThoiGianGiaoDich());
        giaoDichPojo.setDiemDonKhach(giaoDichEntity.getDiemDonKhach());
        giaoDichPojo.setDiemTraKhach(giaoDichEntity.getDiemTraKhach());
        giaoDichPojo.setMaKhuyenMai(giaoDichEntity.getMaKhuyenMai());
        giaoDichPojo.setSoTienGiaoDichThucTe(giaoDichEntity.getSoTienGiaoDichThucTe());
        return giaoDichPojo;
    }
}
