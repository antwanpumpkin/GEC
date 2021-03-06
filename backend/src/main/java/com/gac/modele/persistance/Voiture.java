package com.gac.modele.persistance;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "voiture")
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "marque", nullable = false)
    private String marque; 

    @Column(name = "modele", nullable = false)
    private String modele;
    
    @Column(name = "premiereImmat")
    @JsonFormat(pattern = "YYYY-MM-dd")
    private LocalDate premiereImmat;

    @Column(name = "puissanceFiscale")
    private Integer puissanceFiscale;

    
    @Column(name = "prixDachat")
    private Integer prixDachat;

    @Column(name = "prixVenteEstimee")
    private Integer prixVenteEstimee;
    
    @Column(name = "userId")
    private UUID userId;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public LocalDate getPremiereImmat() {
		return premiereImmat;
	}

	public void setPremiereImmat(LocalDate premiereImmat) {
		this.premiereImmat = premiereImmat;
	}

	public Integer getPuissanceFiscale() {
		return puissanceFiscale;
	}

	public void setPuissanceFiscale(Integer puissanceFiscale) {
		this.puissanceFiscale = puissanceFiscale;
	}

	public Integer getPrixDachat() {
		return prixDachat;
	}

	public void setPrixDachat(Integer prixDachat) {
		this.prixDachat = prixDachat;
	}

	public Integer getPrixVenteEstimee() {
		return prixVenteEstimee;
	}

	public void setPrixVenteEstimee(Integer prixVenteEstimee) {
		this.prixVenteEstimee = prixVenteEstimee;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}
}