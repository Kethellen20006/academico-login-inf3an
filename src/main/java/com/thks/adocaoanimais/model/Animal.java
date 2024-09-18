package com.thks.adocaoanimais.model;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String apelido;
	private String raca;
	private String cor;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	public Animal() {
	}

	public Animal(Long id, String apelido, String raca, String cor, Date dataNascimento) {
		this.id = id;
		this.apelido = apelido;
		this.raca = raca;
		this.cor = cor;
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apelido, cor, dataNascimento, id, raca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(apelido, other.apelido) && Objects.equals(cor, other.cor)
				&& Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(id, other.id)
				&& Objects.equals(raca, other.raca);
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", apelido=" + apelido + ", raca=" + raca + ", cor=" + cor + ", dataNascimento="
				+ dataNascimento + "]";
	}

}
