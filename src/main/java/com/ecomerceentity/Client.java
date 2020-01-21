package com.ecomerceentity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.ecommerceentity.Commande;




	public class Client implements Serializable {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long idClient;
		private String nomClient;
		private String adresse;
		private String email;
		private String tel;
		@OneToMany(mappedBy="client")
		private Collection<Commande> commandes;
		// Getters et Setters
		// Cosntructeur sans paramètre
		// Cosntructeur avec paramètres

			public Client() {
				// TODO Auto-generated constructor stub
			}

			public Long getIdClient() {
				return idClient;
			}

			public void setIdClient(Long idClient) {
				this.idClient = idClient;
			}

			public String getNomClient() {
				return nomClient;
			}

			public void setNomClient(String nomClient) {
				this.nomClient = nomClient;
			}

			public String getAdresse() {
				return adresse;
			}

			public void setAdresse(String adresse) {
				this.adresse = adresse;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;

}
	}
