package quyetnguyen.com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import quyetnguyen.com.entity.HopTacXaEntity;

import javax.transaction.Transactional;

@Controller
@RequestMapping("/hoptacxa")
public class HopTacXaController {
    @Autowired
    SessionFactory sessionFactory;
    @GetMapping
    @Transactional
    public String getHopTacXa(){
        Session session = sessionFactory.getCurrentSession().getSession();
       // HopTacXaEntity hopTacXaEntity = new HopTacXaEntity("Trồng rau xanh","Quảng Nam");
        //session.save(hopTacXaEntity);
        HopTacXaEntity hopTacXaEntity1 = session.get(HopTacXaEntity.class,1);
        hopTacXaEntity1.setTenHTX("Trồng hoa quả");
        session.save(hopTacXaEntity1);
        HopTacXaEntity hopTacXaEntity2 = session.get(HopTacXaEntity.class,3);
        session.delete(hopTacXaEntity2);
        return "hoptacxa";
    }
}
