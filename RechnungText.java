import java.util.ArrayList;

public class RechnungText implements RechnungsDarstellung{

	public void drucken(ArrayList<Artikel> artikelList){
		for(Artikel artikel: artikelList){
			  System.out.println(artikel.getBezeichnung()+": "+artikel.getEinzelpreis());
			}
	}

}
