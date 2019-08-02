package com.br.barber.shop.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Dia implements Serializable{
	private static final long serilVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "campo Numero é obrigatorio ")
	private int numero;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private Mes mes;
	
	
	@OneToMany(mappedBy = "dia")
	private List<HorariosCabelo> cabelos;
	
	
	@OneToMany(mappedBy = "dia")
	private List<HorarioBarba> barba;
	
	
	@OneToMany(mappedBy = "dia")
	private List<HorarioPezinho> pezinho;
	
	
	@OneToMany(mappedBy = "dia")
	private List<HorarioSobrancelha> sobrancelha;
	
	

}
