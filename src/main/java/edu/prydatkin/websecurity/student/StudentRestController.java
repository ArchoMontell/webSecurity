package edu.prydatkin.websecurity.student;

/*
    @author lilbl
    @project webSecurity
    @class ItemRestController
    @version 1.0.0
    @since 10/2/2025 - 23.46
*/

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentRestController {

    private final StudentService service;

    @GetMapping
    public List<Student> getItems() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Student getOneItem(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.deleteById(id);
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.create(student);
    }

    @PutMapping
    public Student update(@RequestBody Student student) {
        return service.update(student);
    }

}

