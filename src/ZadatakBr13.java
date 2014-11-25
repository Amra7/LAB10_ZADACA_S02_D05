public class ZadatakBr13 {
	public static void main(String[] args) {
	System.out.println("Unesi jedan broj koji u sebi ima 0:");
	int broj = TextIO.getInt();
	int cifra;
	String nizCifara = "";
	
	
    do {
        cifra = broj%10;
        broj = broj/10;
       
           if (cifra !=0){
        	   nizCifara = nizCifara + cifra;
        	 
           }
    } while ( broj >=1);
   
    int duzina =nizCifara.length();
    
    System.out.printf("Broj bez nula je:");
	for ( int brojCifara = (duzina-1); brojCifara>=0; brojCifara--){
		
		System.out.print( nizCifara.charAt(brojCifara));
	}
		

}
}
