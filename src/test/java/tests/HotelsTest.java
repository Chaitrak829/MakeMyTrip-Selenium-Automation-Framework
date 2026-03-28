package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

import org.testng.annotations.Test;

import base.BaseTest;

@Listeners(listeners.TestListener.class)
public class HotelsTest extends BaseTest{
	
	@Test
	public void verifyHotelsInMumbai() throws Exception {

	    hp.searchHotelsInMumbai();

	    List<String> hotels = hotelsPage.getAllHotels();

	    System.out.println("=================================");
	    System.out.println("Total Hotels Found: " + hotels.size());
	    System.out.println("=================================");

	    for (String hotel : hotels) {
	        System.out.println(hotel);
	    }
	}
}
