package quyetnguyen.com.conveter;

import org.springframework.stereotype.Component;
import quyetnguyen.com.entity.LoaiXeEntity;
import quyetnguyen.com.pojo.LoaiXePojo;

@Component
public class LoaiHangConvert {
    public LoaiXePojo convertLoaiHang(LoaiXeEntity loaiXeEntity){
        LoaiXePojo loaiXePojo = new LoaiXePojo();
        loaiXeEntity.setMaLoaiXe(loaiXeEntity.getMaLoaiXe());
        loaiXePojo.setMoTaLoaiXe(loaiXeEntity.getMoTaLoaiXe());
        return loaiXePojo;
    }
}
