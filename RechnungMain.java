import java.util.ArrayList;
import java.util.List;

public class RechnungMain {
	
	private ArrayList<Artikel> artikelList= new ArrayList<Artikel>();
	
	public void addArtikel(Artikel artikel){
		artikelList.add(artikel);
	}

	public void drucken(RechnungsDarstellung rechnung){
		rechnung.drucken(artikelList);
	}

	public static void main(String[] args) {	
		RechnungMain rechnung=new RechnungMain();
		rechnung.addArtikel(new Artikel("Festplatte",89.99));
		rechnung.addArtikel(new Artikel("USB-Stick",19.99));
		rechnung.addArtikel(new Artikel("Mauspad",3.33));
		
		rechnung.drucken(new RechnungHTML());
		rechnung.drucken(new RechnungText());
	}

}

