package quyetnguyen.com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import quyetnguyen.com.entity.KhuyenMaiEntity;

import javax.transaction.Transactional;

@Controller
@RequestMapping("/")
public class KhuyenMaiController {
    @Autowired
    SessionFactory sessionFactory;
    @GetMapping
    @Transactional
    public String getKhuyenMai(){
        Session session = sessionFactory.getCurrentSession().getSession();
       // KhuyenMaiEntity khuyenMaiEntity = new KhuyenMaiEntity("khuyen mai 20%");
       // session.save(khuyenMaiEntity);
      //  KhuyenMaiEntity khuyenMaiEntity = session.get(KhuyenMaiEntity.class,1);
      ////  khuyenMaiEntity.setNoiDungKhuyenMai("khuyen mai 70%");
      //  session.update(khuyenMaiEntity);
       KhuyenMaiEntity khuyenMaiEntity2 = session.get(KhuyenMaiEntity.class,2);
       session.delete(khuyenMaiEntity2);
        return "khuyenmai";
    }
}
