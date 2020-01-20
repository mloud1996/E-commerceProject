package com.ecommerceentity;


import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


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
 private Collection<Produit> produit = new HashSet<Produit>();
 
 
 
	public void setProduit(Collection<Produit> produit) {
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



	public Set<Produit> getProduit() {
		return produit;
	}



	public void setProduit(Set<Produit> produit) {
		this.produit = produit;
	}
	public String toString() {
	
		return String.format("Categorie[%d,%d,%s]", idcategorie, nom);
		 }
	// association bidirectionnelle Categorie <--> Article
	public void addProduit(Produit produit) {
	// le produit est ajouté dans la collection des produit de la catégorie
	((Set<Produit>) produit).add(produit);
	// l'article change de catégorie
	produit.setCategorie(this);
}
}

