package com.calebematos.estoque.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.calebematos.estoque.service.NegocioException;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public void salvar(){
		throw new NegocioException("qualquer coisa");
	}

}
