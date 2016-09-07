package com.despesas.ws.bd;

import java.util.List;

import com.despesas.ws.dominio.Despesa;
import com.despesas.ws.util.EntityManagerProducer;

public class DespesaBD {
    
    EntityManagerProducer emp = new EntityManagerProducer();
    
    @SuppressWarnings("unchecked")
	public List<Despesa> getDespesas(){
        return emp.create().createQuery("from Despesa").getResultList();
    }
    
    public Despesa buscarPeloDocumento(int codigo) {
		return emp.create().find(Despesa.class, codigo);
	}
    
}
