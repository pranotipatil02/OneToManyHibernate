package com.example;

import com.example.model.Department;
import com.example.model.Employee;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            Department department = new Department();
            department.setName("HR");

            Employee employee1 = new Employee();
            employee1.setName("John Doe");
            employee1.setDepartment(department);//hr

            Employee employee2 = new Employee();
            employee2.setName("Jane Smith");
            employee2.setDepartment(department);//hr

            department.getEmployees().add(employee1);
            department.getEmployees().add(employee2);

            session.save(department);
            

            session.getTransaction().commit();
        }
        
    }
}
