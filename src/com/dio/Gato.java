package com.dio;

import java.util.Objects;

import com.dio.mode1.livros.Livros;
import com.dio.model1.Gato.*;
public class Gato {
   private String nome;
   private String cor;
   private Integer idade;

   
   public Gato() {
	   
   }

public Gato(String nome, String cor, Integer idade) {
	Gato gato = new Gato();
	Livros livros = new Livros();
	System.out.println(gato);
	System.out.println(livros);
	
	
	this.nome = nome;
	this.cor = cor;
	this.idade = idade;
}
}
