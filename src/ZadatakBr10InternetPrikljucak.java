public class ZadatakBr10InternetPrikljucak {
	public static void main(String[] args) {

		int fiksnaPretplata1 = 1;
		double placanjePoSatu1 = 0.5;
		
		int fiksnaPretplata2 = 0;
		double placanjePoSatu2 = 0.8;
		
		System.out.println("Unesi broj sati: ");
		int sati = TextIO.getInt();
		
		double prvaFrima = (double)(fiksnaPretplata1 + sati*placanjePoSatu1);
		double drugaFrima = (double)(fiksnaPretplata2 + sati*placanjePoSatu2);
		
		if (prvaFrima>drugaFrima){
			System.out.println("Druga firma je povoljnija!");
		}
		if (prvaFrima<drugaFrima){
			System.out.println("Prva firma je povoljnija!");
		}
	}
}
