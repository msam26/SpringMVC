/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Conexion;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author msammarc
 */
@Controller
public class Controlador {
    
    Conexion con = new Conexion();
    JdbcTemplate jdbc = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    
    @RequestMapping("index.htm")
    public ModelAndView Listar(){
        String sql = "SELECT * FROM ALUMNO";
        List datos = this.jdbc.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("index"); //BUENOS DIAS
        return mav;
    }
}
