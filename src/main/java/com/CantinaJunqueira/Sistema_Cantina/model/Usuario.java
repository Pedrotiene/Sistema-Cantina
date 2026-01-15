package com.CantinaJunqueira.Sistema_Cantina.model;

import com.CantinaJunqueira.Sistema_Cantina.enums.Perfil;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String senha;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Perfil perfil;

    private Boolean ativo = true;
}