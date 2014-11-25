
public class ZadatakBr11StringSaRazmacima {
	public static void main(String[] args) {
		System.out.println("Unesi neku recenicu: ");
		String recenica = TextIO.getlnString();
		
		System.out.println("Unesi  slovo znak koji zelis izbaciti iz recenice: ");
		String znak = TextIO.getlnString();
	
		
		if(znak.equalsIgnoreCase(znak)){
			recenica.contains(znak);
			recenica=recenica.replace(znak, " ");	
			String znak1 = znak.toUpperCase();			
			recenica=recenica.replace(znak1, " ");		
		} else {
			recenica.contains(znak);
			recenica=recenica.replace(znak, " ");
			String znak1 = znak.toLowerCase();
			recenica=recenica.replace(znak1, " ");
		}
	
			 
		
	
		System.out.println(recenica);
			
	}
}
