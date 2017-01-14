package com.nfmedia.springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/1/14.
 */
@ControllerAdvice
public class CommonExceptionController {

    @ExceptionHandler
    public ModelAndView ArithmeticExctpiton(Exception ex) {
        ModelAndView modelAndView = new ModelAndView("result/error");
        modelAndView.addObject("exception", ex);
        System.out.println("出异常了。");
        System.out.println(ex);
        return modelAndView;
    }
}
