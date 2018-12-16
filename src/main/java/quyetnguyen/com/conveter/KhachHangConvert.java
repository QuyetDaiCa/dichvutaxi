package quyetnguyen.com.conveter;

import org.springframework.stereotype.Component;
import quyetnguyen.com.entity.KhachHangEntity;
import quyetnguyen.com.pojo.KhachHangPojo;

@Component
public class KhachHangConvert {
    public KhachHangPojo convertKhachHang(KhachHangEntity khachHangEntity){
        KhachHangPojo khachHangPojo = new KhachHangPojo();
        khachHangPojo.setMaKhachHang(khachHangEntity.getMaKhachHang());
        khachHangPojo.setHoTenKH(khachHangEntity.getHoTenKH());
        khachHangPojo.setSoDT(khachHangEntity.getSoDT());
        return khachHangPojo;
    }
}
