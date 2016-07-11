package com.calebematos.estoque.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PesquisaCategoriasBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Integer> categoriasFiltradas;

	public PesquisaCategoriasBean() {
		categoriasFiltradas = new ArrayList<>();
		
		for(int i = 0; i < 10; i++){
			categoriasFiltradas.add(i);
		}
	}
	
	public List<Integer> getCategoriasFiltradas() {
		return categoriasFiltradas;
	}

}
