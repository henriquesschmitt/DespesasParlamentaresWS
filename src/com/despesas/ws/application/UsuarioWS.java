package com.despesas.ws.application;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.despesas.ws.bd.UsuarioBD;

@Path("/usuario")
public class UsuarioWS {

	@GET
	@Path("verify")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response verificarUsuario(@QueryParam("email") String email, @QueryParam("senha") String senha) {
		UsuarioBD usuarioBD = new UsuarioBD();
		return Response.ok(usuarioBD.verificarUsuario(email, senha)).build();
	}
	
	@GET
	@Path("insert")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response retorna(@QueryParam("email") String email, @QueryParam("senha") String senha) {
		UsuarioBD usuarioBD = new UsuarioBD();
		return Response.ok(usuarioBD.inserirUsuario(email, senha)).build();
	}
}
