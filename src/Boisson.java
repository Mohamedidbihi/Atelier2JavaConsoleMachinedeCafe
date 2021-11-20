
public class Boisson {
protected int code;
protected String nom;
protected int Quantite;
protected int prix;


public Boisson(int code,String nom, int Quantite,int prix) {
	this.code = code;
	this.nom = nom;
	this.Quantite = Quantite;
	this.prix = prix;
}

public boolean checkPrix(int c) {
	if(c<this.prix) {
		return false;
	}
	else return true;
	
}


public boolean checkQtite(){
if(this.Quantite-1>0) {
	return true;
}
else {
	return false;
}
}


public void setQuantite()
{
this.Quantite -= 1;
}

}
