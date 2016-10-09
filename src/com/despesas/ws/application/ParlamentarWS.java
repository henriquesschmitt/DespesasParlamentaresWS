package com.despesas.ws.application;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.despesas.ws.bd.ParlamentarBD;
import com.despesas.ws.bd.UsuarioBD;

@Path("/parlamentar")
public class ParlamentarWS {

	@GET
	@Path("byname")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response retorna(@QueryParam("nome") String nome) {
		ParlamentarBD parlamentarBD = new ParlamentarBD();
		
		String[] nomesParseados = nome.split(" ");
		StringBuilder nomeParaConsulta = new StringBuilder();
        for	(int i=0; i<nomesParseados.length;i++){
        	if(i == 0)
        		nomeParaConsulta.append("%").append(nomesParseados[i].toString().trim()).append("%");
        	else
        		nomeParaConsulta.append(nomesParseados[i].toString().trim()).append("%");
        }
		
		return Response.ok(parlamentarBD.getParlamentarByNome(nomeParaConsulta.toString())).build();
	}
	
	@GET
	@Path("all")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response getAll() {
		ParlamentarBD parlamentarBD = new ParlamentarBD();
		return Response.ok(parlamentarBD.getParlamentares()).build();
	}
}
