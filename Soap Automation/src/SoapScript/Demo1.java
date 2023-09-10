package SoapScript;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

public class Demo1 
{
public static void main(String[] args)
{
	CountryInfoService c=new CountryInfoService();
	CountryInfoServiceSoapType d=c.getCountryInfoServiceSoap();
	String iscode[]= {"IN","US","CN","CA"};
	for(String code:iscode)
	{
		String value = d.capitalCity(code);
		System.out.println(value);
	}
}
}
