package com.nfmedia.springmvc.handler;

import com.nfmedia.springmvc.entries.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/1/1.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/resetpwd")
    public String resetPwd(User user) {
        System.out.println("修改: " + user);
        return "resetpwd";
    }

    @ModelAttribute
    public void getUser(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map) {
        System.out.println("modelatrribute method...");
        if (id != null) {
            User user = new User(1, "tom", "123456", "123@qq.com", 12);
            System.out.println("从数据库中获取一个对象：" + user);

            map.put("user", user);
        }
    }

    @RequestMapping("/resloveview")
    public String resloveView() {
        return "book";
    }

    @RequestMapping("/beanview")
    public String beanNameView() {
        return "helloView";
    }

    @RequestMapping("/forward")
    public String forwardview() {
        System.out.println("forward...");
        return "forward:/user/beanview";
    }

    @RequestMapping("/redirect")
    public String redirectview() {
        System.out.println("redirect...");
        return "redirect:/user/beanview";
    }
}
