package com.telemedecineBE.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEDICAL_HISTORY")

public class MedicalHistory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	//name
	private String nom;
	//doctor that prescribed
	private String medecinTraitant;
	//date prescribed
	private String dateSurvenance;
	private Integer state = 1;

	public MedicalHistory() {
		super();
	}

	public MedicalHistory(String nom, String medecinTraitant,
						  String dateSurvenance) {
		super();
		this.nom = nom;
		this.medecinTraitant = medecinTraitant;
		this.dateSurvenance = dateSurvenance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nomAntecedant) {
		this.nom = nomAntecedant;
	}

	public String getMedecinTraitant() {
		return medecinTraitant;
	}

	public void setMedecinTraitant(String medecinTraitant) {
		this.medecinTraitant = medecinTraitant;
	}

	public String getDateSurvenance() {
		return dateSurvenance;
	}

	public void setDateSurvenance(String dateSurvenance) {
		this.dateSurvenance = dateSurvenance;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	@Override
	public String toString() {
		return "MedicalHistory [id=" + id + ", nomAntecedant=" + nom + ", medecinTraitant="
				+ medecinTraitant + ", dateSurvenance=" + dateSurvenance + ", state=" + state + "]";
	}

}