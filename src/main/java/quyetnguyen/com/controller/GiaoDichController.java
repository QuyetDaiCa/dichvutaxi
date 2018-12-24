package quyetnguyen.com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import quyetnguyen.com.entity.GiaoDichEntity;

import javax.transaction.Transactional;

@Controller
@RequestMapping("/giaodich")
public class GiaoDichController {
    @Autowired
    SessionFactory sessionFactory;
    @GetMapping
    @Transactional
    public String getGiaoDich(){
        Session session = sessionFactory.getCurrentSession().getSession();
        GiaoDichEntity giaoDichEntity = session.get(GiaoDichEntity.class,1);
        return "giaodich";
    }
}
