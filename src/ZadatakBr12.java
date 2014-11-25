public class ZadatakBr12 {
	public static void main(String[] args) {
		System.out.println("Unesi jedan broj: ");
		int broj = TextIO.getInt();
		int ostatak;				
		int suma = 0;
		
		do {			
			ostatak = broj % 10;
			suma = suma + ostatak;
			broj = broj/10 ;
			
			
		    } while (broj >=1 );
		System.out.println("Zbor cifara broja je: " + suma);
	 
		
	}
}
