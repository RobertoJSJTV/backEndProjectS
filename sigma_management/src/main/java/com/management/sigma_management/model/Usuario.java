package com.management.sigma_management.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Builder
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;
}
