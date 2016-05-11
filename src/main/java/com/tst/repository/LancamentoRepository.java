package com.tst.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.tst.model.Lancamento;

public class LancamentoRepository implements Serializable {
	private static final long serialVersionUID = 1L;
	private EntityManager manager;

	public LancamentoRepository(EntityManager manager) {
		this.manager = manager;
	}

	public List<Lancamento> todos() {
		TypedQuery<Lancamento> query = manager.createQuery("from Lancamento",
				Lancamento.class);
		return query.getResultList();
	}

}
