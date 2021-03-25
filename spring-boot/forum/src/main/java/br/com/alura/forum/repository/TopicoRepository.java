package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{//passando a entidade e o tipo da chave primária dessa entidade;

	List<Topico> findByCursoNome(String CursoNome); //sintaxe do método vem da JPA data --> declarando assinatura do método que é implementado no controller
	
}
