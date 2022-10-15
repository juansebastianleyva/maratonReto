package usa.mintic.retos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import usa.mintic.retos.entity.Category;
import usa.mintic.retos.entity.Library;
import usa.mintic.retos.services.LibraryService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Lib")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/all")
    public List<Library> getAll(){
        return libraryService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Library> getById(@PathVariable("id") int id){
        return libraryService.getById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Library save(@RequestBody Library c){
        return libraryService.save(c);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Library update(@RequestBody Library c){
        return libraryService.update(c);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return libraryService.delete(id);
    }




}
