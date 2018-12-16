package quyetnguyen.com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import quyetnguyen.com.entity.LoaiXeEntity;
import quyetnguyen.com.pojo.LoaiXePojo;

import javax.transaction.Transactional;


@Controller
@RequestMapping("/")
public class LoaiXeController {
    @Autowired
    SessionFactory sessionFactory;
    @GetMapping
    @Transactional
    public String getloaiXe(){
        Session session = sessionFactory.getCurrentSession().getSession();
      // LoaiXeEntity loaiXeEntity = new LoaiXeEntity(1,"xe màu đỏ");
       // session.save(loaiXeEntity);
       LoaiXeEntity loaiXeEntity1 = session.get(LoaiXeEntity.class,9);
//        loaiXeEntity1.setMoTaLoaiXe("Quyet");
//        session.update(loaiXeEntity1);
//        session.save(loaiXeEntity1);
        session.delete(loaiXeEntity1);
        session.save(loaiXeEntity1);
        return "trangchu";
    }
}
