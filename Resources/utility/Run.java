package utility;

import java.util.Date;

public class Run {

	public static void main(String[] args)
	{
		Date d1=new Date();
		String str=d1.toString();
		System.out.println(str.substring(0,str.toString().indexOf("IST")-9).replaceAll(" ","_")+str.substring(str.toString().indexOf("IST")+4,str.length()));
				

	}

}
