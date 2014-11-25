public class BrojeviOd50do200 {
	public static void main(String[] args) {
		System.out.println("Unesi tri broja broj:");
		int broj1 = TextIO.getInt();
		int broj2 = TextIO.getInt();
		int broj3 = TextIO.getInt();

		if ((broj1 < 50) || (broj1 > 200) && (broj2 < 50) || (broj2 > 200)
				&& (broj3 < 50) || (broj3 > 200)) {
			System.out.println("Zavrsi sa radom!");
			return;
		}

		if (broj1 > broj2) {
			int temp = broj1;
			broj1 = broj2;
			broj2 = temp;
		}
		if (broj2 > broj3) {
			int temp = broj1;
			broj1 = broj2;
			broj2 = temp;
		}
		if (broj1 > broj2) {
			int temp = broj1;
			broj1 = broj2;
			broj2 = temp;
		}
		System.out.println(broj1);
		System.out.println(broj2);
		System.out.println(broj3);

		if ((broj1 == broj2) && (broj2 == broj3)) {
			System.out.println("Svi brojevi su isti!");
		} else if ((broj1 == broj2) || (broj2 == broj3)) {
			System.out.println("Dva broja su ista!");
		} else {
			System.out.println("Svi brojevi su razliciti");
		}
	}
}
