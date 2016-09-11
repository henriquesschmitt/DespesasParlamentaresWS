package com.despesas.ws.bd;

import java.util.List;

import com.despesas.ws.dominio.Despesa;
import com.despesas.ws.util.EntityManagerProducer;

public class DespesaBD {

	EntityManagerProducer emp = new EntityManagerProducer();

	@SuppressWarnings("unchecked")
	public List<Despesa> getDespesas() {
		return emp.create().createQuery("from Despesa").getResultList();
	}

	public List<Despesa> getDespesasByNome(String nome) {
		return emp.create().createQuery("SELECT d FROM Despesa d WHERE UPPER(d.nome) like :paramNome")
				.setParameter("paramNome", nome).getResultList();
	}

}
