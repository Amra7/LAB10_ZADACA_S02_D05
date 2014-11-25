public class ZadatakBr8SumaDjelioca {
	public static void main(String[] args) {
	System.out.println("Unesi prirodan broj( broj veci od 1): ");
	int broj = TextIO.getInt();
	int sum = 0;
	
	if (broj <1){
		System.out.println("Unijeli ste pogresan broj pokusajte ponovo:");
		return;
	}
	
	for (int i =1; i<=broj; i++){
		if(broj%i ==0){
			sum = sum + i;
			System.out.println(i);
		}
	}
	System.out.printf("Sume djelioca broj %d je %d", broj, sum);
}
}
