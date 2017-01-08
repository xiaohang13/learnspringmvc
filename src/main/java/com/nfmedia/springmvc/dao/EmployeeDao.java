package com.nfmedia.springmvc.dao;

import com.nfmedia.springmvc.entries.Department;
import com.nfmedia.springmvc.entries.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/1/2.
 */

@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<>();
        employees.put(1001, new Employee(1001, "E-AAA", "AAA@qq.com", 1, new Department(101, "AAA")));
        employees.put(1002, new Employee(1002, "E-BBB", "BBB@qq.com", 1, new Department(102, "BBB")));
        employees.put(1003, new Employee(1003, "E-CCC", "CCC@qq.com", 1, new Department(103, "CCC")));
        employees.put(1004, new Employee(1004, "E-DDD", "DDD@qq.com", 1, new Department(104, "DDD")));
        employees.put(1005, new Employee(1005, "E-EEE", "EEE@qq.com", 1, new Department(105, "EEE")));
    }

    private static Integer initId = 1006;

    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }

        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }

    public Collection<Employee> getAll() {
        return employees.values();
    }

    public Employee get(Integer id) {
        return employees.get(id);
    }

    public void delete(Integer id) {
        employees.remove(id);
    }
}
