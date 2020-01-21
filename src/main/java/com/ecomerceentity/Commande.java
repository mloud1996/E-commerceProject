package com.ecomerceentity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ecommerceentity.LigneCommande;

@Entity
@Table(name="Commande")
public class Commande implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long idCommande;
private Date dateCommande;
@ManyToOne
@JoinColumn(name="idClient")
private Client client;
@OneToMany
@JoinColumn(name="idCommande")
private Collection<LigneCommande> ligneCommandes;

	public Commande() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Collection<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}


}