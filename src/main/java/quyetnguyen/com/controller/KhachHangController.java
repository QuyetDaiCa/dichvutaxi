package quyetnguyen.com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import quyetnguyen.com.entity.KhachHangEntity;

import javax.transaction.Transactional;

@Controller
@RequestMapping("/khachhang")
public class KhachHangController {
    @Autowired
    SessionFactory sessionFactory;
    @GetMapping
    @Transactional
    public String getKhachHang(){
        Session session = sessionFactory.getCurrentSession().getSession();
       // KhachHangEntity khachHangEntity = new KhachHangEntity("cuong","0945366");
        //session.save(khachHangEntity);
        KhachHangEntity khachHangEntity = session.get(KhachHangEntity.class,2);
        khachHangEntity.setHoTenKH("Huy");
        session.update(khachHangEntity);
        session.save(khachHangEntity);
        KhachHangEntity khachHangEntity1 = session.get(KhachHangEntity.class,3);
      session.delete(khachHangEntity1);
        return "khachhang";
    }
}
