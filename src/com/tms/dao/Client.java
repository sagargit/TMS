/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tms.dao;

/**
 *
 * @author admin
 */
public class Client {

    public Client() {
        AbstractDBFactory db = AbstractDBFactory.getFactorty(1);
        
        TicketDAO dao = db.getTicketDAO();
        dao.insert();
        
    }
    
}
