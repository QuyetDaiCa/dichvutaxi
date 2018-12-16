package quyetnguyen.com.conveter;

import org.springframework.stereotype.Component;
import quyetnguyen.com.entity.HopTacXaEntity;
import quyetnguyen.com.pojo.HopTacXaPojo;

@Component
public class HopTacXaConvert {
    public HopTacXaPojo convertHopTacXa(HopTacXaEntity hopTacXaEntity){
        HopTacXaPojo hopTacXaPojo = new HopTacXaPojo();
        hopTacXaPojo.setMaHTX(hopTacXaEntity.getMaHTX());
        hopTacXaPojo.setTenHTX(hopTacXaEntity.getTenHTX());
        hopTacXaPojo.setDiaChi(hopTacXaEntity.getDiaChi());
        return hopTacXaPojo;
    }
}
