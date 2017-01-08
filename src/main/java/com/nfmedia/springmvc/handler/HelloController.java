package com.nfmedia.springmvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2016/12/30.
 */

@RequestMapping("/hello")
@Controller
public class HelloController {

    @RequestMapping("/delete/{id}")
    public String pathvariable(@PathVariable("id") Integer id) {
        System.out.println("获取的ID是：" + id);
        return "book";
    }

}
