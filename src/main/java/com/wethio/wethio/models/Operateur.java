package com.wethio.wethio.models;


import javax.persistence.*;

@Entity
@Table(name = "operateur")
public class Operateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idoperateur;
    @Column
    private String nomOperateur;


}
