package com.example.algamoney.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Pessoa;
import com.example.algamoney.api.repository.pessoa.PessoasRepositoryQuery;

public interface PessoasRepository extends JpaRepository<Pessoa, Long>, PessoasRepositoryQuery {
	
	public Optional<Pessoa> findByNome(String nome);

}
