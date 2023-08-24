package br.com.dominio.rdeweb3api.repository;

import br.com.dominio.rdeweb3api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
