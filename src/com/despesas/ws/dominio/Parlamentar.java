package com.despesas.ws.dominio;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parlamentar")
public class Parlamentar {

    private String codigo;
    private String nome;
    private String sexo;
    private String cargo;
    private String urlFoto;
    private String partido;
    private BigDecimal gastoTotal;
    private BigDecimal gastoDia;
    private String mandato;

    public Parlamentar(String codigo, String nome, String sexo, String cargo, String urlFoto, String partido, 
    		BigDecimal gastoTotal, BigDecimal gastoDia, String mandato) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.cargo = cargo;
        this.urlFoto = urlFoto;
        this.partido = partido;
        this.gastoTotal = gastoTotal;
        this.gastoDia = gastoDia;
        this.mandato = mandato;
    }
    
    public Parlamentar(){}

    @Id
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public BigDecimal getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(BigDecimal gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    public BigDecimal getGastoDia() {
        return gastoDia;
    }

    public void setGastoDia(BigDecimal gastoDia) {
        this.gastoDia = gastoDia;
    }

    public String getMandato() {
		return mandato;
	}

    public void setMandato(String mandato) {
		this.mandato = mandato;
	}
}
