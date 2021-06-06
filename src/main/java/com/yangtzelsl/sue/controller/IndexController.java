package com.yangtzelsl.sue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName IndexController
 * @Author
 * @Version V1.0
 **/
@Controller
public class IndexController {
    /**
     * 跳转到首页
     *
     * @return
     */
    @RequestMapping({"/","/index.html"})
    public String login(){
        return "index";
    }



}
