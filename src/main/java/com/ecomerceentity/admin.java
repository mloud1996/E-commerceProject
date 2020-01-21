package com.ecomerceentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class admin {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int Idadmin ;
private String nom ;
private String prenom;












}
