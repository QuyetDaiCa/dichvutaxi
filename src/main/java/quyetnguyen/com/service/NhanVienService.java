package quyetnguyen.com.service;

import quyetnguyen.com.dao.NhanVienDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienDao nhanVienDao;

//    @Autowired
 //   private EntitytoPojo entitytoPojo;
//    public NhanVienPojo getNhanVienId(Integer id){
//        NhanVienEntity nhanVienEntity = nhanVienDao.getNhanVien(id);
//        NhanVienPojo nhanVienPojo = entitytoPojo.conveterNhanVien(nhanVienEntity);
//       return nhanVienPojo;
//    }
}
