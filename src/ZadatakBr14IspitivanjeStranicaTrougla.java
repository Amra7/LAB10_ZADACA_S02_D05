public class ZadatakBr14IspitivanjeStranicaTrougla {
	public static void main(String[] args) {

		System.out.println("Unesi dvije stranice trougla: ");
		int a = TextIO.getInt();
		int b = TextIO.getInt();
		
		if (a<b){
			int temp = a;
			a = b;
			b = temp;
		}
		
		int c = (a+1)-b;
		if ((a+b>c) && (a+c>b) &&(b+c>a)){
			System.out.printf("Najmanja moguca stranica trougla je  c = %d", c);
		}
	}

}
