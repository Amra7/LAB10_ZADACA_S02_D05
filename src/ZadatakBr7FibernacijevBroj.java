
public class ZadatakBr7FibernacijevBroj {
public static void main(String[] args) {
	System.out.println("Unesi jedan broj:");
	
	int n = TextIO.getInt();
	int prev=0;
	int current = 1;
	int brojac,temp;
	
	if ((n>0)&&(n<=50)){
	    for (brojac=1;brojac<=n;brojac++){
		    temp=prev+current;
		    prev=current;
		    current=temp;
		    //System.out.printf("%nmedju broj Fibernacijevog niza je %d", current);
		}
	    System.out.printf("%nN-ti broj Fibernacijevog niza je %d", current);
	
	
	} else {
		System.out.println("Doslo je do greske!");
	}
}
}
