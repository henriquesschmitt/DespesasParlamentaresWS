package com.despesas.ws.bd;

import java.util.List;

import javax.persistence.EntityManager;

import com.despesas.ws.dominio.Usuario;
import com.despesas.ws.util.EntityManagerProducer;

public class UsuarioBD {
    
    EntityManagerProducer emp = new EntityManagerProducer();
    
    public List<Usuario> verificarUsuario(String email, String senha) {
    	return emp.create().createQuery(
    			    "SELECT u FROM Usuario u WHERE u.email = :paramEmail and u.senha = :paramSenha")
    			    .setParameter("paramEmail", email)
    			    .setParameter("paramSenha", senha)
    			    .setMaxResults(1)
    			    .getResultList();
	}
    
    public Usuario inserirUsuario(String email, String senha) {
    	Usuario usuario = new Usuario();
    	usuario.setEmail(email);
    	usuario.setSenha(senha);
    	
    	EntityManager entityManager = emp.create();
    	entityManager.getTransaction().begin();
    	Usuario a = entityManager.merge(usuario);
    	entityManager.getTransaction().commit();
    	
    	return a;
	}    
}