package com.nfmedia.springmvc.dao;

import com.nfmedia.springmvc.entries.Department;
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
public class DepartmentDao {

    private static Map<Integer, Department> departments = null;

    static {
        departments = new HashMap<>();
        departments.put(101, new Department(101, "AAA"));
        departments.put(102, new Department(102, "BBB"));
        departments.put(103, new Department(103, "CCC"));
        departments.put(104, new Department(104, "DDD"));
        departments.put(105, new Department(105, "EEE"));
    }

    /**
     * 获取所有部门信息
     *
     * @return
     */
    public Collection<Department> getDepartments() {
        return departments.values();
    }

    /**
     * 根据ID获取对应部门信息
     *
     * @param id    部门id
     * @return      返回部门对象
     */
    public Department getDepartment(Integer id) {
        return departments.get(id);
    }
}
