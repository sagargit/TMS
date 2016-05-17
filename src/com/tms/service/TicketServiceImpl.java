/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tms.service;

import com.tms.dao.MySQLTicketDAO;
import com.tms.dao.TicketDAO;

/**
 *
 * @author admin
 */
public class TicketServiceImpl implements TicketService{

    private TicketDAO ticketDAO;

    public TicketServiceImpl() {
        ticketDAO = new MySQLTicketDAO();
    }
    
    @Override
    public void saveTicket() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ticketDAO.insert();
    }
    
}
