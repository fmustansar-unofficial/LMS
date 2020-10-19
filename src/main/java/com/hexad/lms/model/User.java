package com.hexad.lms.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    private String id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
    private Set<Book> books;
}