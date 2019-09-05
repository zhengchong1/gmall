package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("allusers")
    public List<UserInfo> getAllUsers(){
      return   userService.getUserInfoListAll();
    }

     @PostMapping("addUser")
    public  String addUser(UserInfo userInfo){
        userService.addUser(userInfo);
        return  "success";
     }
     @PostMapping("updateUser")
    public String updateUser(UserInfo userInfo){
        userService.updateUser(userInfo);
        return "success";
     }
     @PostMapping("updateByName")
    public String updateByName(UserInfo userInfo){
        userService.updateUserByName(userInfo.getName(),userInfo);
         return "success";
    }
     @PostMapping("delUser")
    public  String delUser(UserInfo userInfo){
        userService.delUser(userInfo);
        return "success";
     }
     @GetMapping("getUser")
    public  UserInfo getUser(String id){
       return userService.getUserInfoById(id);

     }
}
