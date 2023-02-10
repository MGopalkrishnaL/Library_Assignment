package com.example.Library.server;


import com.example.Library.model.Library;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LibraryServer implements ILibraryServer{
    private static Map<String, Library> data = new HashMap<>();
    private static int id=0;
    static {
        Library l1 =new Library(++id,"Gopal","Kurnool",95050449,"Super");
        data.put(l1.getName(), l1);
    }
@Override
    public Map<String,Library> getAllList(){
        return data;
    }
    @Override
    public Library getlibByName(String name){
        for(String i :data.keySet()){
           Library val = data.get(i);
            if(val.getName().equals(name)){
                return val;
            }
        }
        return null;
    }


    @Override
    public String addlib(Library library) {
        if(data.containsKey(library.getName())==true){
            return "Already Exit in the Library data";
        }
        data.put(library.getName(),library);
        return "Library Added to Database.";
    }
    @Override
    public String deletelib(int id){
        for(String Id : data.keySet()){
        if(data.containsKey(Id)){
            data.remove(id);
        return "Successfully Deleted";
        }
        }
        return "UnSuccessfully Deleted";
    }
    @Override
    public String updatelib(String name, Library lib) {
        Library l2 = getlibByName(name);
        if(l2!=null){

            l2.setId(lib.getId());
            l2.setName(lib.getName());
            l2.setNumber(lib.getNumber());
            l2.setFacilities(lib.getFacilities());
            l2.setAddress(lib.getAddress());

            return "Data Updated";
        }
        return "Data Not Found.";
    }
}
