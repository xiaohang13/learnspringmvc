package com.nfmedia.springmvc.test;

import com.nfmedia.springmvc.dao.EmployeeDao;
import com.nfmedia.springmvc.entries.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/1/8.
 */

@Controller
public class SpringMVCTest {

    public SpringMVCTest() {
        System.out.println("SpringMVCTest.......");
    }

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/emp/tj")
    public String testJson() {
        return "json/testjson";
    }

    @ResponseBody
    @RequestMapping(value = "/emp/testJson")
    public Collection<Employee> getEmployees() {
        return employeeDao.getAll();
    }

}
