package com.ecommerceentity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.ecomerceentity.produit;

public class Panier implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Map<Long, LigneCommande>
items=new HashMap<Long, LigneCommande>();
public void addItem(produit p, int quantite){
LigneCommande lc=items.get(p.getIdprod());
if(lc==null){
LigneCommande art=new LigneCommande();
art.setProduit(produit p);
art.setQuantite(quantite);
art.setPrix(p.getPrix());
items.put(p.getIdprod(), art);
}
else{
lc.setQuantite(lc.getQua(produit(produitntite()+quantite);
}

	public Map<Long, LigneCommande> getItems() {
	return items;
}

public void setItems(Map<Long, LigneCommande> items) {
	this.items = items;
}
public Collection<LigneCommande> getItems(){
return items.values();
}
public int getSize(){
return items.size();
}
public double getTotal(){
double total=0;
for(LigneCommande lc:items.values()){
total+=lc.getPrix()*lc.getQuantite();
}
return total;
}
public void deleteItem(Long idproduit){
items.remove(idproduit);
}
	public panier() {
		// TODO Auto-generated constructor stub
	}

}
