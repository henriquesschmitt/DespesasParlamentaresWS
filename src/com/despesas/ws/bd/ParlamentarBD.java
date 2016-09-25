package com.despesas.ws.bd;

import java.util.List;

import com.despesas.ws.dominio.Parlamentar;
import com.despesas.ws.util.EntityManagerProducer;

public class ParlamentarBD {

	EntityManagerProducer emp = new EntityManagerProducer();

	public List<Parlamentar> getParlamentarByNome(String nome) {
		return emp.create().createQuery("SELECT p FROM Parlamentar p WHERE UPPER(p.nome) like :paramNome")
				.setParameter("paramNome", nome).getResultList();
	}

}
