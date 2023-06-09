package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDao extends GenericDao<Cliente,Integer>{

	List<Cliente> buscarPorNome(String nome);
	
	List<Cliente> procurarEstado(String endereco);
}
