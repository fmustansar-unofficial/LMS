package com.hexad.lms.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "library")
public class Library {

    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private Set<Book> books;
//    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
//    private Set<User> users;
}