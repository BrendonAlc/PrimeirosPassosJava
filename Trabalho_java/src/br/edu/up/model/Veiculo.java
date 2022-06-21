package br.edu.up.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@SuppressWarnings("serial")
@Entity
@Table(name = "veiculo")
public class Veiculo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String veiculo;
	private String categoria;
	private double valor;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getveiculo() {
		return veiculo;
	}
	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", veiculo=" + veiculo + ", categoria=" + categoria + ", valor=" + valor + "]";
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
