package br.com.ana.vendas.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.ana.online.domain.Cliente;

@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String> {
	
	Optional<Cliente> findByCpf(Long cpf);

}
