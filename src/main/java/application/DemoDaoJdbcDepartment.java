/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

/**
 *
 8748* @author crist'   
 */
public class DemoDaoJdbcDepartment {
    
    public static void main(String[] args){
        
        Scanner sca = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        
        System.out.println("=== TEST 1: Department FindById ===");
        Department department = departmentDao.findById(1);
        System.out.println(department);
        
        System.out.println("\n=== TEST 2: Department FindAll ===");  
        List<Department> listDepartments = departmentDao.findAll();
        for(Department obj : listDepartments){
            System.out.println(obj);
        }
        
        System.out.println("\n=== TEST 3: Department Insert ===");
        Department newDepartment = new Department(null, "Teste Para Excluir");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id is: " + newDepartment.getId());
        
        System.out.println("\n==== TEST 4: Department Update ====");
        department = departmentDao.findById(7);
        department.setName("Security Designer");
        departmentDao.update(department);
        System.out.println("Update Complete!");
        
        System.out.println("\n === TEST 5: Department Delete");
        int id = 8;
        departmentDao.deleteById(id);
        System.out.println("Department of Id: " + id + " Deleted Complete");
        
    }
}
