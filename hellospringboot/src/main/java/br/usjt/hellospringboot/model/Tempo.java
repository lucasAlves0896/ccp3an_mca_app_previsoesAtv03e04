/*Nome do dia na semana, temperatura
mínima, temperatura máxima, humidade relativa do ar e um campo textual para uma
descrição sucinta.*/

package br.usjt.hellospringboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.usjt.hellospringboot.model.Tempo;
import br.usjt.hellospringboot.model.Dia;
@Entity
public class Tempo implements Serializable{
	private static final long serialVersionUID = 1L;	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Long id;

	@OneToOne
	@JoinColumn (name = "diasemana")
	private Dia diaSemana;
	private String descricao;
	private Double tempmini;
	private Double tempmaxi;
	private Double humidade;
	private String data_hora;
	private String latitude;
	private String longitude;
	
	public Dia getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(Dia diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getData_hora() {
		return data_hora;
	}


	public void setData_hora(String data_hora) {
		this.data_hora = data_hora;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Double getTempmini() {
		return tempmini;
	}


	public void setTempmini(Double tempmini) {
		this.tempmini = tempmini;
	}


	public Double getTempmaxi() {
		return tempmaxi;
	}


	public void setTempmaxi(Double tempmaxi) {
		this.tempmaxi = tempmaxi;
	}


	public Double getHumidade() {
		return humidade;
	}


	public void setHumidade(Double humidade) {
		this.humidade = humidade;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Tempo other = (Tempo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	//getters/setters
	
	
}
