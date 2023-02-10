package com.example.Library.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Library {
    private int id;
    private String Name;
    private String Address;
    private long number;
    private String facilities;
}

