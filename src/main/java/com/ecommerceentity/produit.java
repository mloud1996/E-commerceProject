package com.ecommerceentity;


package com.esp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Produit")
public class Produit {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long idprod;
private int prix ;
@Column(length = 30)
private String description;
private byte image;
private String marque;
//relation principale Produit (many) -> categorie (one)
// implémentée par une clé étrangère (_id) dans Produit
// 1 Produit a nécessairement 1 Categorie (nullable=false)
 @ManyToOne(fetch=FetchType.LAZY)
 @JoinColumn(name = "categorie_id", nullable = false)
 private categorie categorie;

	
public Produit() {
	
	}

public Long getIdprod() {
	return idprod;
}


public void setIdprod(Long idprod) {
	this.idprod = idprod;
}
public int getPrix() {
	return prix;
}


public void setPrix(int prix) {
	this.prix = prix;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public byte getImage() {
	return image;
}


public void setImage(byte image) {
	this.image = image;
}


public String getMarque() {
	return marque;
}


public void setMarque(String marque) {
	this.marque = marque;
}


public categorie getCategorie() {
	return categorie;
}


public void setCategorie(categorie categorie) {
	this.categorie = categorie;
}
public String toString() {
	 return String.format("Produit[%d,%d,%s,%d]", idprod,prix,description,image,marque, categorie.getIdcategorie());
	  }
	

}
	// TO
