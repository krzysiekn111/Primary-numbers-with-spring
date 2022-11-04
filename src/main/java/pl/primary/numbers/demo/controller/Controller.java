package pl.primary.numbers.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import pl.primary.numbers.demo.service.PMService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping()
public class Controller {

    private final PMService service;


    @Autowired
    public Controller(PMService service) {
        this.service = service;
    }

    @GetMapping(value = "primaryNumbers/{n}")
    List<Integer> getPrimaryNumbers(@PathVariable Integer n) {
        return service.primaryNumbers(n);
    }
}
