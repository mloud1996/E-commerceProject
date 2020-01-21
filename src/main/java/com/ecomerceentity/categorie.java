
package com.ecomerceentity;


import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ecomerceentity.produit;


@Entity
@Table(name="categorie")
public class categorie {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long idcategorie;
@Column(length = 30)
private String nom;
//relation inverse Categorie (one) -> Produit(many) de la relation Produit (many) -> Categorie
//(one)
 // cascade insertion Categorie -> insertion produit
 // cascade maj Categorie -> maj produit
 // cascade suppression Categorie -> suppression produit
 @OneToMany(mappedBy = "categorie", cascade = { CascadeType.ALL })
 private Collection<produit> produit = new HashSet<produit>();
 
 
 
	public void setProduit(Collection<produit> produit) {
	this.produit = produit;
}



	public categorie() {
		// TODO Auto-generated constructor stub
	}



	public Long getIdcategorie() {
		return idcategorie;
	}



	public void setIdcategorie(Long idcategorie) {
		this.idcategorie = idcategorie;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public Set<produit> getProduit() {
		return (Set<com.ecomerceentity.produit>) produit;
	}



	public void setProduit(Set<produit> produit) {
		this.produit = produit;
	}
	public String toString() {
	
		return String.format("Categorie[%d,%d,%s]", idcategorie, nom);
		 }
	// association bidirectionnelle Categorie <--> Article
	public void addProduit(produit produit) {
	// le produit est ajouté dans la collection des produit de la catégorie
	((Set<produit>) produit).add(produit);
	// l'article change de catégorie
	produit.setCategorie(this);
}
}

