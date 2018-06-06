package com.lc.spring.controller;

import com.lc.spring.dao.CustomerDAO;
import com.lc.spring.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RestController
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Have a good day!!!";
    }
}
