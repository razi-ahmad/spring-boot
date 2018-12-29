package com.vend.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class MathController {
    private static final Logger LOGGER = Logger.getLogger("MathController");

    @GetMapping("/add")
    public @ResponseBody
    Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        LOGGER.log(Level.INFO, "ADD >> value of A is{0} and value of B is {1}", new Object[]{a, b});
        if (a > b) {
            LOGGER.log(Level.SEVERE, "Error >> Value of B is less than A >> CODE:1000");
            throw new RuntimeException("Value of B is less than A");
        }
        return a + b;
    }
}
