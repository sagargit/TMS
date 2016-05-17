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
public abstract class AbstractDBFactory {
    
    
    
    public static AbstractDBFactory getFactorty(int selector){
        
        return new MySQLDBFactorty();
    }
    
    public abstract Connection getConnection();
    
    
    public abstract TicketDAO getTicketDAO();
    
}
