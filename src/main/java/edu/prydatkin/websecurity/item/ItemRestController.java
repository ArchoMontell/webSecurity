package edu.prydatkin.websecurity.item;

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
@RequestMapping("/api/v1/items")
@AllArgsConstructor
public class ItemRestController {

    private final ItemService service;

    @GetMapping
    public List<Item> getItems() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Item getOneItem(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.deleteById(id);
    }

    @PostMapping
    public Item create(@RequestBody Item item) {
        return service.create(item);
    }

    @PutMapping
    public Item update(@RequestBody Item item) {
        return service.update(item);
    }
}
