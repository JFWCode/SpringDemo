package com.wk.spring.web.mvc_web.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestfulController {

    @RequestMapping(value = "/testRestful/{id}", method = RequestMethod.GET)
    public String getTestRestful(@PathVariable("id") String id) {
        return "Get" + id;
    }

    @RequestMapping(value = "/testRestful", method = RequestMethod.POST)
    public String postTestRestful(@RequestParam(required = true, name="id") String id) {
        return "Post:" + id;
    }

    @RequestMapping(value = "/testRestful/{id}", method = RequestMethod.PUT)
    public String putTestRestful(@PathVariable("id") String id) {
        return "Put:" + id;
    }

    @RequestMapping(value = "/testRestful/{id}", method = RequestMethod.DELETE)
    public String delTestRestful(@PathVariable("id") String id) {
        return "Delete:" + id;
    }
}
