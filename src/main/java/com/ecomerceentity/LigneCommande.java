package com.ecomerceentity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommande implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
@ManyToOne
@JoinColumn(name="idproduit")
private produit produit;
private int quantite;
private double prix;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public produit getProduit() {
	return produit;
}

public void setProduit(produit produit) {
	this.produit = produit;
}

public int getQuantite() {
	return quantite;
}

public void setQuantite(int quantite) {
	this.quantite = quantite;
}

public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}

public LigneCommande(){
	

}

public int getQua(int i) {
	// TODO Auto-generated method stub
	return 0;
}
}
