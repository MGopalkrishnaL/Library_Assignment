package com.example.Library.controoler;

import com.example.Library.model.Library;
import com.example.Library.server.ILibraryServer;
import com.example.Library.server.LibraryServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private ILibraryServer server;
@GetMapping("/getAll")
//    http://localhost:8080/library/getAll
    public Map<String, Library> getall(){
    return server.getAllList();
}
@GetMapping("/getdatabyId/{id}")
//    http://localhost:8080/library/getdatabyId/{id}
public Library getdatabyid(@PathVariable String name){
    return server.getlibByName(name);
}
@PostMapping("/addLibrary")
//    http://localhost:8080/library/addLibrary
    public String addLibrary(@RequestBody Library library){
    return server.addlib(library);
}
@DeleteMapping("/Deletelib")
//    http://localhost:8080/library/Deletelib
    public String deletelib(@RequestParam String name){
    return server.deletelib(name);
}
@PutMapping("/Updatelib/name/{name}")
//    http://localhost:8080/library/Updatelib/name/{name}
    public String UpdateLib(@PathVariable String name ,@RequestBody Library lib){
    return server.updatelib(name,lib);
}

}
//http://localhost:8080/swagger-ui/index.html#/http://localhost:8080/swagger-ui/index.html#/ - swagger link
