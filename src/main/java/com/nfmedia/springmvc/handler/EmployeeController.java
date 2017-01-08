package com.nfmedia.springmvc.handler;

import com.nfmedia.springmvc.dao.DepartmentDao;
import com.nfmedia.springmvc.dao.EmployeeDao;
import com.nfmedia.springmvc.entries.Department;
import com.nfmedia.springmvc.entries.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Map;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/1/2.
 */

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;

    @RequestMapping("/empls")
    public String list(Map<String, Object> map) {
        map.put("employees", employeeDao.getAll());
        return "listall";
    }

    /**
     * 删除指定ID数据
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/empls";
    }

    /**
     * 新增数据
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/emp/add", method = RequestMethod.GET)
    public String add(Map<String, Object> map) {
        Collection<Department> departments = departmentDao.getDepartments();
        map.put("departments", departments);
        return "add";
    }

    /**
     * 保存数据
     *
     * @param employee
     * @return
     */
    @RequestMapping(value = "/emp/save", method = RequestMethod.POST)
    public String save(@Valid Employee employee, BindingResult bindingResult, Map<String,Object> map) {
        System.out.println(employee);

        if (bindingResult.getErrorCount() > 0) {
            System.out.println("出错了。。");

            for (FieldError error : bindingResult.getFieldErrors()) {
                System.out.println(error.getField() + ":" + error.getDefaultMessage());
            }

            // 出错后，转向特定页面
            map.put("departments", departmentDao.getDepartments());
            return "redirect:/emp/add";
        }
        employeeDao.save(employee);
        return "redirect:/empls";
    }

}
