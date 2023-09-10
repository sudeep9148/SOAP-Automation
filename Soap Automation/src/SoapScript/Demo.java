package SoapScript;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

public class Demo 
{
	public static void main(String[] args)
	{
		CountryInfoService c = new CountryInfoService();
		CountryInfoServiceSoapType d = c.getCountryInfoServiceSoap();
		 String capital = d.capitalCity("IN");
		 System.out.println(capital);
	}
}
