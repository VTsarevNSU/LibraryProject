package ru.nsu.ccfit.databases.g20202.tsarev.libraryproject.entities.bookplaces;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Bookplace {

    @jakarta.persistence.Id //field is an ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
    private Long id;

    @Enumerated
    private BookplaceType type;

    private String name;

}