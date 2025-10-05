package edu.prydatkin.websecurity.student;

/*
    @author lilbl
    @project webSecurity
    @class ItemService
    @version 1.0.0
    @since 10/2/2025 - 23.44
*/

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    private List<Student> students;

    @PostConstruct
    void init() {
        students.add(new Student("1", "Vasya", "Male"));
        students.add(new Student("2", "Olena", "Female"));
        students.add(new Student("3", "Maksym", "Male"));
        repository.saveAll(students);
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public Student getById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public Student create(Student student) {
        return repository.save(student);
    }

    public Student update(Student student) {
        return repository.save(student);
    }
}
