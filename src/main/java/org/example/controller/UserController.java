package org.example.controller;

import org.example.model.User;
import org.example.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Map;


@Controller

public class UserController {

    private User user;

    private final UserServiceImp userServiceImp;

    @Autowired
    public UserController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<User> allUsersList = userServiceImp.findAll();
        modelAndView.addObject("allUsers", allUsersList);
        return modelAndView;
    }

    @GetMapping("/new_user")
    public String createUser(Map<String, Object> map) {
        User user = new User();
        map.put("user", user);
        return "new_user";
    }

    @PostMapping("/save")
    public String saveUser(User user) {
        String name = user.getName();
        String lastname = user.getLastName();
        int age  = user.getAge();
        String email = user.getEmail();
        userServiceImp.save(user);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteUser(User user) {
        userServiceImp.delete(user);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public ModelAndView editPage(@RequestParam Long id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        User user = userServiceImp.findById(id);
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    public String editUser(@RequestParam("id") Long id, @ModelAttribute("user") User user) {
        user.setId(id);
        userServiceImp.updateUser(user);
        return "redirect:/";
    }
}
