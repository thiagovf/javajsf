package com.tst.mb;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import com.tst.model.Lancamento;
import com.tst.repository.LancamentoRepository;
import com.tst.util.JpaUtil;

@ManagedBean
@ViewScoped
public class ConsultaLancamentosBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Lancamento> lancamentos;

	public void consultar() {
		EntityManager manager = JpaUtil.getEntityManager();
		LancamentoRepository lancamentoRepository = new LancamentoRepository(manager);
		this.lancamentos = lancamentoRepository.todos();
		manager.close();
	}

	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}

}
