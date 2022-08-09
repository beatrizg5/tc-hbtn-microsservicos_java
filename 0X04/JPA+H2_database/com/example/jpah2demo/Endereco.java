package com.example.jpah2demo;

import javax.persistence.*;

@Entity
@Table(name = "Endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String logradouro;
    @Column
    private String endereco;
    @Column
    private int numero;
    @Column
    private String bairro;
    @Column
    private String cidade;
    @Column
    private String estado;
}
