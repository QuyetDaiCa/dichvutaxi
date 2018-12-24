package quyetnguyen.com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import quyetnguyen.com.entity.LoaiXeEntity;

import javax.transaction.Transactional;

@Controller
@RequestMapping("/loaixe")
public class LoaiXeController {
    @Autowired
    SessionFactory sessionFactory;
    @GetMapping
    @Transactional
    public String getLoaiHang(){
        Session session = sessionFactory.getCurrentSession().getSession();
      //  LoaiXeEntity loaiXeEntity = new LoaiXeEntity("xe mau xanh");
      //  session.save(loaiXeEntity);
        LoaiXeEntity loaiXeEntity1 = session.get(LoaiXeEntity.class,10);
        loaiXeEntity1.setMoTaLoaiXe("xe mau hong ");
        session.update(loaiXeEntity1);
        session.save(loaiXeEntity1);
        LoaiXeEntity loaiXeEntity2 = session.get(LoaiXeEntity.class,11);
        session.delete(loaiXeEntity2);
        return "loaixe";
    }
}
