package br.com.papelaria.projeto.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer idcategoria;
	
	@Column(nullable=false)
	private String nomecatgoria;
	
	@Column(nullable=false)
	private Date datacriacao;
	
}
