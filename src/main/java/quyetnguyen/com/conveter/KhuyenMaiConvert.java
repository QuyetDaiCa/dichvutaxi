package quyetnguyen.com.conveter;

import org.springframework.stereotype.Component;
import quyetnguyen.com.entity.KhuyenMaiEntity;
import quyetnguyen.com.pojo.KhachHangPojo;
import quyetnguyen.com.pojo.KhuyenMaiPojo;

@Component
public class KhuyenMaiConvert {
    public KhuyenMaiPojo convertKhuyenMai(KhuyenMaiEntity khuyenMaiEntity){
        KhuyenMaiPojo khuyenMaiPojo = new KhuyenMaiPojo();
        khuyenMaiPojo.setMaKhuyenMai(khuyenMaiEntity.getMaKhuyenMai());
        khuyenMaiPojo.setNoiDungKhuyenMai(khuyenMaiEntity.getNoiDungKhuyenMai());
        return khuyenMaiPojo;
    }
}
