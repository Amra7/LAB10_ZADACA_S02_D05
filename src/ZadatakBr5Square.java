
public class ZadatakBr5Square {
public static void main(String[] args) {
    
	
	System.out.println("Unesi dva broja:");
    int a = TextIO.getInt();
    int b = TextIO.getInt();
	
	for (int i= 0; i<a; i++){
	
	
		for (int j=0; j<b; j++) {
			
			if(( i==0)&&( j==0)||( i==0)&&(j==b-1)||( j==0)&&(i==a-1)||(j==b-1)&&(i==a-1)){
				System.out.print("+");	
			}
			
			if (( j==0)&& (i>0)&&(i<a-1)||(j==b-1)&& (i>0)&&(i<a-1)){
		
			
			}
			if (i!=0 && i!=(a-1)){
				if(j==0 || (j==(b-1))){
				System.out.print("|");	
				}
				else{
					System.out.print(" ");	
				}
			}
			
			if (( i==0)&&(j>0)&&(j<b-1)||(i==a-1)&&(j>0)&&(j<b-1)){
				System.out.print("-");
		
	
			}
			
		}
		System.out.println(" ");
		
	}
		
}
}
