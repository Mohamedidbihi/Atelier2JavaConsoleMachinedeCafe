import java.util.Scanner;

public class Machine {


public static int choixBoisson()
{
	int boissonChoisie;
	Scanner scan = new Scanner(System.in);
	System.out.println("***Bonjour***\n Choisissez votre commande \n 1:Nespresso \n 2:Lait \n 3:Cappuccino \n 4:Thé" );
	boissonChoisie=scan.nextInt();
	while(boissonChoisie<1 || boissonChoisie>4) {
		System.out.println("***N'existe pas ***\n Choisissez votre commande \n 1:Nespresso \n 2:Lait \n 3:Cappuccino \n 4:Thé" );
		boissonChoisie=scan.nextInt();
	}
	return boissonChoisie;
}
public static int Coins()
{
	int coins=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("***S'ils vous plait ajouté argent" );
	coins=scan.nextInt();
	while(coins<1 || coins>30) {
		System.out.println("***Attention !!! S'ils vous plait ajouté argent" );
		coins=scan.nextInt();
	}
	return coins;
}
public static void caisse(int ai ,int price ) {
	int rendu=ai-price;
	int c=0;
	if(rendu==0) {
		System.out.println("Take Your order & welcome to the Java class");
	}
	else if(rendu>0) {
		System.out.println("Take Your order & welcome to the Java class");
		while (rendu >= 10)
    	{
    		rendu=rendu-10;
    		c=c+1;
    	}
		
		if(c!=0) {   
    	System.out.println(c +":piecé(s) de 10 DH");
    	System.out.println("le reste " + rendu);
		}
    	c=0;
    	while (rendu >= 5 )
     	{
		rendu=rendu-5;
		c=c+1;
	    }
       if(c!=0) {    	   
    	   System.out.println(c +":piecé(s) de 5 DH");
    	   System.out.println("le reste" + rendu);
       }
		c=0;
		while (rendu >= 2 )
     	{
		rendu=rendu-2;
		c=c+1;
	    }
		if(c!=0) {   
		System.out.println(c +":piecé(s) de 2 DH");
		System.out.println("le reste" + rendu);
		}
		c=0;
		while (rendu>=1 )
     	{
		rendu=rendu-1;
		c=c+1;
	    }
	
		
		System.out.println(c +":piecé(s) de 1 DH");
		System.out.println("le reste" + rendu);
	}
	else {
		System.out.println("Error !! try again");
	}
	
}
 

public static void main(String[] args) {
	Boisson nespresso = new Boisson(1,"nespresso",19,5);
	Boisson lait = new Boisson(2,"lait",15,3);
	Boisson cappuccino = new Boisson(3,"cappuccino",12,7);
	Boisson thé = new Boisson(4,"thé",0,4);
	
	Scanner scan = new Scanner(System.in);	
	int boisson = choixBoisson();
	int coins ;
	switch (boisson) {
	  case 1:
	   if(nespresso.checkQtite()) {
		  coins=Coins();
		  if(nespresso.checkPrix(coins)) {
			  nespresso.setQuantite();  
			  caisse(coins,nespresso.prix);
		  }
		  else {
			  System.out.println("nespresso coute 5 ");
		  } 
	   }
	   else {
		   System.out.println("Désole nespresso sera disponible prochainement");
	   }
	    break;
	  case 2:
		  if(lait.checkQtite()) {
			  coins=Coins();
			  if(lait.checkPrix(coins)) {
				  lait.setQuantite();  
				  caisse(coins,lait.prix);
			  }
			  else {
				  System.out.println("le Lait coute 3dh ");
			  } 
		   }
		   else {
			   System.out.println("Désole lait sera disponible prochainement");
		   }
		    break;
	  case 3:
		  if(cappuccino.checkQtite()) {
			  coins=Coins();
			  if(cappuccino.checkPrix(coins)) {
				  cappuccino.setQuantite();  
				  caisse(coins,cappuccino.prix);
			  }
			  else {
				  System.out.println("le cappuccino coute 3dh ");
			  } 
		   }
		   else {
			   System.out.println("Désole cappuccino sera disponible prochainement");
		   }
		    break;
	  case 4: 
		  if(thé.checkQtite()) {
			  coins=Coins();
			  if(thé.checkPrix(coins)) {
				  thé.setQuantite();  
				  caisse(coins,thé.prix);
			  }
			  else {
				  System.out.println("le thé coute 4dh ");
			  } 
	
	   }
	   else {
		   System.out.println("Désole le thé sera disponible prochainemnt");
	   }
	    break;
		
	   default: System.out.println("l'operation entrer est invalid");   
	  	  break ;
	}
}
}
