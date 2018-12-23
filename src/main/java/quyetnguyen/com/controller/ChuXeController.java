package quyetnguyen.com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import quyetnguyen.com.entity.ChuXeEntity;

import javax.transaction.Transactional;

@Controller
@RequestMapping("/")
public class ChuXeController {
    @Autowired
    SessionFactory sessionFactory;
    @GetMapping
    @Transactional
    public String getChuXe(){
        Session session = sessionFactory.getCurrentSession().getSession();
        ChuXeEntity chuXeEntity = session.get(ChuXeEntity.class,1);
        return "trangchu";
    }
}
