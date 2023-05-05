package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.entity.Cliente;

public class ClienteDaoImpl extends GenericDaoImpl<Cliente,Integer> implements ClienteDao{

	public ClienteDaoImpl(EntityManager entityManager) {
		super(entityManager);
	}

	public List<Cliente> buscarPorNome(String nome) {
		return em.createQuery("from Cliente where nome like :n", Cliente.class)
				.setParameter("n", "%" + nome + "%")
				.getResultList();
	}

	public List<Cliente> procurarEstado(String endereco) {
		return em.createQuery("from Cliente c where c.endereco ", Cliente.class)
				.setParameter(0, endereco)
				.getResultList();
	}

}
