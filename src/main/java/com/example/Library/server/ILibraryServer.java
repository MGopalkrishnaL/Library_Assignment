package com.example.Library.server;

import com.example.Library.model.Library;

import java.util.Map;

public interface ILibraryServer {
    public Map<String, Library> getAllList();
    public Library getlibByName(String name);
    public String addlib(Library library);
    public String deletelib(String id);

    public String updatelib(String name, Library lib);

}
