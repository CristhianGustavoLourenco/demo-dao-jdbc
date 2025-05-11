/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demo.dao.jdbc;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

/**
 *
 * @author crist
 */
public class DemoDaoJdbc {

    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.createSellerDao();
        
        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
    }
}
