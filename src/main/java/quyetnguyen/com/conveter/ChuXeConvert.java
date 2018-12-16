package quyetnguyen.com.conveter;

import org.springframework.stereotype.Component;
import quyetnguyen.com.entity.ChuXeEntity;
import quyetnguyen.com.pojo.ChuXePojo;

@Component
public class ChuXeConvert {
    public ChuXePojo convertChuXe(ChuXeEntity chuXeEntity){
        ChuXePojo chuXePojo = new ChuXePojo();
        chuXePojo.setMaChuXe(chuXeEntity.getMaChuXe());
        chuXePojo.setHoTenChuXe(chuXeEntity.getHoTenChuXe());
        chuXePojo.setDiaChi(chuXeEntity.getDiaChi());
        chuXePojo.setSoDT(chuXeEntity.getSoDT());
        chuXePojo.setBienSoXe(chuXeEntity.getBienSoXe());
        chuXePojo.setMaLoaiXe(chuXeEntity.getMaLoaiXe());
        chuXePojo.setMaHTX(chuXeEntity.getMaHTX());
        return chuXePojo;
    }
}
