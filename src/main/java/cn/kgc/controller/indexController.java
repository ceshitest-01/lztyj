package cn.kgc.controller;

import cn.kgc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class indexController {
    @RequestMapping("getMessage")
    public String getMessage(Model model){
        model.addAttribute("message","hello");
        User user1 = new User(1,"张三","123456",new Date());
        User user2 = new User(2,"李四","123456",new Date());
        User user3 = new User(3,"王五","123456",new Date());
        User user4 = new User(4,"黑豆","123456",new Date());
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        model.addAttribute("userList",userList);
        User user = new User(5,"黄豆","123456",new Date());
        model.addAttribute("user",user);
        return "main";
    }
    @RequestMapping(value = {"/","/index.html"})
    public String index(){
        return "index";
    }
}
