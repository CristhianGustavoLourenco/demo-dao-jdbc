/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.dao;
import java.util.List;
import model.entities.Department;

/**
 *
 * @author crist
 */
public interface DepartmentDao {
    void insert(Department obj);
    void update(Department obj);
    void deleteDyId(Department id);
    Department findById(Integer id);
    List<Department> findAll(); 
}
