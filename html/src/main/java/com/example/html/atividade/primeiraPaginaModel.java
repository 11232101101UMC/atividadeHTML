package com.example.html.atividade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity(name = "dados")
@AllArgsConstructor
@NoArgsConstructor
public class primeiraPaginaModel {

    private String Nome;
    private String Email;
    private String Usuario;

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID ID;
}
