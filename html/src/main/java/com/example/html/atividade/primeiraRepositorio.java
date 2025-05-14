package com.example.html.atividade;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface primeiraRepositorio extends JpaRepository<primeiraPaginaModel, UUID >{
}
