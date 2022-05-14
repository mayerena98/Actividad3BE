package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.CategoriaRepository;
import com.example.demo.models.CategoriaModel;

@Service
public class CategoriaService {
@Autowired
CategoriaRepository categoriaRepository;

public ArrayList<CategoriaModel>obtenerCategoria(){
	return(ArrayList<CategoriaModel>) categoriaRepository.findAll();
}

public CategoriaModel guardarCategoria(CategoriaModel categoria) {
	return categoriaRepository.save(categoria);
}

public Optional<CategoriaModel> ObtenerId(Long cat_id){
	return categoriaRepository.findById(cat_id);
}

public boolean eliminarCategoria(Long cat_id) {
	try {
		categoriaRepository.deleteById(cat_id);
		return true;
	}catch(Exception err) {
		return false;
	}
	
}
	
	
}
