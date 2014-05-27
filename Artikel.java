public class Artikel {

	private String bezeichnung;
	private double einzelpreis;
	private RechnungsDarstellung rechnungsDarstellung;
	public Artikel (String bezeichnung, double einzelpreis){
		this.bezeichnung = bezeichnung;
		this.einzelpreis = einzelpreis;
	}
	
	public String getBezeichnung(){
		return bezeichnung;
	}
	
	public double getEinzelpreis(){
		return einzelpreis;
	}
}

