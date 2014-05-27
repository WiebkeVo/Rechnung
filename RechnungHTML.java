import java.util.ArrayList;

public class RechnungHTML implements RechnungsDarstellung{

	public void drucken(ArrayList<Artikel> artikelList){
		System.out.println("<table>");
		System.out.println("<tr>");
		System.out.println("<td>Artikel</td>");
		System.out.println("<td>Preis</td>");
		System.out.println("</tr>");
		for(Artikel artikel: artikelList){			
			System.out.println("<tr>");
			System.out.println("<td>"+artikel.getBezeichnung()+"</td>");
			System.out.println("<td>"+artikel.getEinzelpreis()+"</td>");
			System.out.println("<tr>");
		}
		System.out.println("</table>");
	}

}

