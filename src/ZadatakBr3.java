
public class ZadatakBr3 {
public static void main(String[] args) {
	
	System.out.println("Unesi tri broja:");	
	double a=TextIO.getDouble();
	double b=TextIO.getDouble();
	double c=TextIO.getDouble();
	
	double funkcija;
	
	System.out.println("Unesi x:");	
	int x=TextIO.getInt();
	
	if ((a>=-10) &&( a<=10) &&(b>=-10) &&( b<=10 )&&(c>=-10) &&( c<=10 )) {
		funkcija = (a*x*x + b*x + c);
		  
		 System.out.printf("f(%d)= %g",x, funkcija);
	} else {
			System.out.println("Koeficijenti a,b,c, nisu u zadanom intervalu!");	    
	}
}
}
