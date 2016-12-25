package com.cssh.common.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cssh.common.manager.UserManager;
import com.cssh.common.pojo.User; 

@Controller
public class UserController
{
    @Resource(name = "userManager") // 获取spring配置文件中bean的id为userManager的，并注入
    private UserManager userManager;

    @RequestMapping("/toAddUser")
    public String toAddUser()
    {
        return "/addUser";
    }

    @RequestMapping("/getAllUser")
    public void getAllUser(HttpServletResponse response)
    {
        System.out.println("getAllUser IN");
        List<User> user = userManager.getUsers();

        PrintWriter out = null;
        response.setContentType("application/json");

        try
        {
            out = response.getWriter();
            for (int i = 0; i < user.size(); i++)
            {
                out.write(user.get(i).getUserName());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
