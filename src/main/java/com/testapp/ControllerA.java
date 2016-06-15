package com.testapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kelnerF on 15/06/2016.
 */

@RestController
public class ControllerA {
    @RequestMapping("/")
    public String greeting( ) {

        return "greeting";
    }
}
