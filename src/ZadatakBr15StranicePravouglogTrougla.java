
public class ZadatakBr15StranicePravouglogTrougla {
public static void main(String[] args) {
	System.out.println("Unesi dvije stranice trougla:");
	int a = TextIO.getInt();
	int b = TextIO.getInt();
	
	if (a<b){
		int temp = b;
		b=a;
		a=temp;
	}
	
	double c = (double)Math.sqrt((a*a) - (b*b));
	System.out.printf("Treca tranica pravouglog trougla je c = %g", c);
}
}
