public class ZadatakBr4Skupovi {
	public static void main(String[] args) {

		// prvi skup = S1

		System.out.println("Unesi prvi broj prvog niza: ");
		double a = TextIO.getDouble();
		System.out.println("Unesi drugi broj prvog niza: ");
		double b = TextIO.getDouble();

		if (a > b) {
			double temp = b;
			a = b;
			b = temp;
		}
		System.out.printf("S1 [ %g , %g ]", a,b);

		// drugi skup =S2

		System.out.println("Unesi prvi broj drugog niza: ");
		double c = TextIO.getDouble();
		System.out.println("Unesi drugi broj drugi niza: ");
		double d = TextIO.getDouble();

		if (c > d) {
			double temp = c;
			c = d;
			d = temp;
		}
		System.out.printf("S2 [ %g , %g ]", c,d);

		if ((a > c) && (b < d)) {
			System.out.println("S1 je podskup S2.");
			
		}

		if ((c > a) && (d < b)) {
			System.out.println("S2 je podskup S1");
			
		}
		
		if (( (c>a) && (c>b) ) || ( (c<a) && (d<a) ) ) {
			System.out.println("Skupovi nemaju zajednickih tacaka.");
			
		}
		
		
		if ((a<c)&&(d>b)){
			System.out.printf("%nSkupovi S1 i S2 se preklaju [ %g,%g] ", c,b);
		}
		
		if ((c<a)&&(d<b)){
			System.out.printf("%nSkupovi S1 i S2 se preklaju [ %g,%g] ", a,d);
		}
	

	}
}
