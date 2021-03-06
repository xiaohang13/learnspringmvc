package com.nfmedia.springmvc.test;

import com.nfmedia.springmvc.dao.EmployeeDao;
import com.nfmedia.springmvc.entries.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/1/8.
 */

@Controller
public class SpringMVCTest {

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

    @RequestMapping("/testExceptionHandlerExceptionResolver")
    public String testExceptionHandlerExceptionResolver(@RequestParam("i") Integer id) {
        System.out.println("result: " + (10 / id));
        return "result/success";
    }

    //@ExceptionHandler(value = {ArithmeticException.class})
    //public ModelAndView ArithmeticExctpiton(Exception ex) {
    //    ModelAndView modelAndView = new ModelAndView("result/error");
    //    modelAndView.addObject("exception", ex);
    //    System.out.println("出异常了。");
    //    System.out.println(ex);
    //    return modelAndView;
    //}

}
