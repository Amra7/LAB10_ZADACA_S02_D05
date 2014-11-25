
public class Horoskop {
public static void main(String[] args) {
	
	int dan, mjesec;
	
	System.out.println("Unesi dan rodjenja: ");
    dan = TextIO.getlnInt();
	System.out.println("Unesi mjesec rodjenja: ");
	mjesec = TextIO.getlnInt();
	
	int januar=1,februar=2,mart=3,april=4,maj=5,juni=6,juli=7,august=8,septembar=9,oktobar=10,novembar=11,decembar=12;

	
	if ((mjesec==mart) && (dan>=21) || (mjesec==april) && (dan<=19)) {
		System.out.println("Tvoj znak je Ovan!");
	}

	else if ((mjesec==april) && (dan>20) || (mjesec==maj) && (dan<20)) {
		System.out.println("Tvoj znak je Bik!");
	}
	else if ((mjesec==maj) && (dan>=21) || (mjesec==juni) && (dan<=20)) {
		System.out.println("Tvoj znak je Blizanac!");
	}
	else if ((mjesec==juni) && (dan>=21) || (mjesec==juli) && (dan<=22)) {
		System.out.println("Tvoj znak je Rak!");
	}
	else if ((mjesec==juli) && (dan>=23) || (mjesec==august) && (dan<=22)) {
		System.out.println("Tvoj znak je Lav!");
	}
	else if ((mjesec==august) && (dan>=23) || (mjesec==septembar) && (dan<=22)) {
		System.out.println("Tvoj znak je Djevica!");		
	}
	else if ((mjesec==septembar) && (dan>=23) || (mjesec==oktobar) && (dan<=22)) {
		System.out.println("Tvoj znak je Skorpija!");
	}
	else if ((mjesec==novembar) && (dan>=23) || (mjesec==decembar) && (dan<=21)) {
		System.out.println("Tvoj znak je Strijelac!");
		
	}
	else if ((mjesec==decembar) && (dan>=22) || (mjesec==januar) && (dan<=19)) {
		System.out.println("Tvoj znak je Jarac!");
	}
	else if ((mjesec==januar) && (dan>=20) || (mjesec==februar) && (dan<=18)) {
		System.out.println("Tvoj znak je Vodolija!");
	}
	else  {
		System.out.println("Tvoj znak je Riba!");
	}
}
}
