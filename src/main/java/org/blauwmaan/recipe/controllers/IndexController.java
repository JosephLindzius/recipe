package org.blauwmaan.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Resource(name="classpath:templates")
@Controller
public class IndexController {
    @RequestMapping({"", "/", "index", "index.html"})
    public String getIndexPage(){
        return "index";
    }
}
