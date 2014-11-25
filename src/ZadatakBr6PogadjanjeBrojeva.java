public class ZadatakBr6PogadjanjeBrojeva {
	public static void main(String[] args) {

		int n = (int) (1 + Math.random() * 101);
		int brojac = 0;
		int broj;

		do {		
			System.out.println("Unesi  broj: ");
			broj = TextIO.getInt();
			
				if (broj==n){
				System.out.printf("Pogodili ste broj %d!", n);
				brojac++;
				System.out.printf("%nImali ste %d pokusaja.", brojac);	
				return;
			    }
				else if (broj > n) {
				System.out.printf("Broj %d je veci od zamisljenog broja .", broj );
				brojac++;
		    	} 
				else if (broj < n) {
				System.out.printf("Broj %d je manji od zamisljenog broja .", broj );
				brojac++;
		    	}
			
			} while (broj!=n);
			
		
		
	}
}


