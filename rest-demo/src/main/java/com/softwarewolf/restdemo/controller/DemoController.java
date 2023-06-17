package com.softwarewolf.restdemo.controller;

import com.softwarewolf.restdemo.model.MutableDemo;
import com.softwarewolf.restdemo.repository.DemoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private final DemoRepository repository;

    public DemoController(DemoRepository repository) {
        this.repository = repository;
    }

    // GET http://localhost:8080/demo
    @GetMapping
    public List<MutableDemo> findAll() {
        System.out.println("In controller findAll");
        return repository.findAll();
    }

    // GET http://localhost:8080/demo/<id>
    @GetMapping("/{id}")
    public MutableDemo findById(@PathVariable String id) {
        return repository.findById(id);
    }

    // GET http://localhost:8080/demo/ids
    @GetMapping("/ids")
    public List<String> findIds() {
        return repository.findIds();
    }

    // GET http://localhost:8080/size
    @GetMapping("/size")
    public int getSize() {
        return repository.getSize();
    }

    // POST http://localhost:8080
    @PostMapping("/update")
    public MutableDemo updateDemo(@RequestBody MutableDemo demo) {
        repository.update(demo);
        return demo;
    }

    @PostMapping("/add")
    public MutableDemo insertDemo(@RequestBody MutableDemo demo) {
        repository.insert(demo);
        return demo;
    }

    @DeleteMapping
    public String deleteDemo(@RequestBody String id) {
        repository.delete(id);
        return (id + " deleted");
    }
}
