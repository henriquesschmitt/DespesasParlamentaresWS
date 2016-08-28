package com.despesas.ws.application;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.despesas.ws.bd.DespesaBD;

@Path("/email")
public class EmailSender {

	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response retorna() {
		DespesaBD bD = new DespesaBD();
		return Response.ok(bD.getDespesas()).build();
	}
}
