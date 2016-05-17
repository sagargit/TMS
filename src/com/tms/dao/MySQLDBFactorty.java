/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tms.dao;

import java.sql.Connection;

/**
 *
 * @author admin
 */
public class MySQLDBFactorty extends AbstractDBFactory{

    @Override
    public TicketDAO getTicketDAO() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new MySQLTicketDAO();
    }

    @Override
    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
