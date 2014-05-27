public class RechnungMain {

	public static void main(String[] args) {
	
		Artikel artikel = new Artikel("Festplatte", 89.99);
		Artikel artikel = new Artikel("USB-Stick", 19.99);
		Artikel artikel = new Artikel("Mauspad", 3.33);
		RechnungHTML rechnungHTML = new RechnungHTML();
		RechnungText rechnungText = new RechnungText();

		kunde.setWerbungStrategie(neukundeWerbung);
		kunde.begruessen();

		kunde.setWerbungStrategie(stammkundeWerbung);
		kunde.begruessen();

	}

}