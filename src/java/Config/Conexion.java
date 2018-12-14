/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author msammarc
 */
public class Conexion {
    public DriverManagerDataSource Conectar(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("oracle.jdbc.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        ds.setUsername("MIGUEL");
        ds.setPassword("123456"); //Holaaaaa
        
        return ds;
    }
}
