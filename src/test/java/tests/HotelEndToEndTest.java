package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.HotelApiTest;
import base.BaseTest;

public class HotelEndToEndTest extends BaseTest{
	
	

	@Test
	public void verifyHotelUsingApiAndUI()
	{
        // Step 1: Get data from API
		HotelApiTest api = new HotelApiTest();
		String hotelFromApi = api.getSampleHotelName();
		
        // Step 2: Perform UI search
		hp.searchHotelsInMumbai();
		
        // Step 3: Validate UI contains API data
        boolean isPresent = hotelsPage.verifyHotelPresent(hotelFromApi);
        
        System.out.println("Validation Result: " + isPresent);

        Assert.assertTrue(isPresent, "Hotel from API not found in UI");
        
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        
        //I integrated API and UI automation by fetching data from API using Rest Assured and validating it in UI using Selenium. 
        //Since production APIs are secured, 
        //I demonstrated the integration using a public API


	}
}
