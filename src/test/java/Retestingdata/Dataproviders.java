package Retestingdata;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders {
	@DataProvider
	public Object[][] data(){
		Object[][] obj=new Object[3][3];
		obj[0][0]="Hyd"; 
		obj[0][1]="chennai"; 
	    obj[0][2]="7th-au1"; 
								
		obj[1][0]="Hyd"; 
		obj[1][1]="Banglore"; 
		obj[1][2]="8th-Aug";
		
		obj[2][0]="Hyd" ;
        obj[2][1]="chennai";
		obj[2][2]="9th-Aug";
		
		return obj;
	}
	@Test(dataProvider = "data")
	public void bookTicket(String src,String dest,String data) {
		System.out.println("From: "+src+"\tTo: "+dest+"\tDate: "+data);
	}
}
				