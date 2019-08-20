package com.example.springboot.java.todo.controller.web;


import com.example.springboot.java.todo.entity.User;
import com.example.springboot.java.todo.repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "用户管理",tags = "用户管理")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @ApiOperation(value = "查看所有用户", notes = "查看所有用户")
    @GetMapping("/userlist")
    public ModelAndView userList(Model model) {
        model.addAttribute("userList", userRepository.findAll());
        model.addAttribute("title", "用户管理");
        return new ModelAndView("user/list", "userModel", model);
    }

    @ApiOperation(value = "根据id 查询用户", notes = "根据id 查询用户")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
    @GetMapping("{id}")
    public ModelAndView view(@PathVariable("id") Long id, Model model) {
        Optional<User> user = userRepository.findById(id);
        model.addAttribute("user", user.orElse(null));
        model.addAttribute("title", "查看用户");
        return new ModelAndView("user/view", "userModel", model);
    }

    @ApiOperation(value = "获取创建表单页面", notes = "获取创建表单页面")
    @GetMapping("/form")
    public ModelAndView createForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("title", "创建用户");
        return new ModelAndView("user/form", "userModel", model);
    }

    @ApiOperation(value = "保存用户", notes = "保存用户")
    @PostMapping
    public ModelAndView saveOrUpdateUser(User user) {
        user = userRepository.save(user);
        return new ModelAndView("redirect:/user/userlist");
    }

    @ApiOperation(value = "根据id删除用户", notes = "根据id删除用户")
    @GetMapping(value = "/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id) {
        userRepository.deleteById(id);
        return new ModelAndView("redirect:/user/userlist");
    }

    @ApiOperation(value = "修改用户界面", notes = "修改用户界面")
    @GetMapping(value = "/edit/{id}")
    public ModelAndView editForm(@PathVariable("id") Long id, Model model) {
        Optional<User> user = userRepository.findById(id);
        model.addAttribute("user", user.orElse(null));
        model.addAttribute("title", "编辑用户");
        return new ModelAndView("user/form", "userModel", model);
    }

}
