package com.despesas.ws.application;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.despesas.ws.bd.DespesaBD;

@Path("/despesa")
public class DespesaWS {

	@GET
	@Path("byname")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response retorna(@QueryParam("nome") String nome) {
		DespesaBD bD = new DespesaBD();
		
		String[] nomesParseados = nome.split(" ");
		StringBuilder nomeParaConsulta = new StringBuilder();
        for	(int i=0; i<nomesParseados.length;i++){
        	if(i == 0)
        		nomeParaConsulta.append("%").append(nomesParseados[i].toString().trim()).append("%");
        	else
        		nomeParaConsulta.append(nomesParseados[i].toString().trim()).append("%");
        }
		
		return Response.ok(bD.getDespesasByNome(nomeParaConsulta.toString())).build();
	}
}
