package utils;

import java.io.FileWriter;
import java.util.List;

public class HotelOutputUtils {
	
	public static void saveHotelsToFile(List<String> hotels) throws Exception {

        FileWriter writer = new FileWriter("output/hotels_mumbai.txt");

        for (String hotel : hotels) {
            writer.write(hotel + "\n");
        }

        writer.close();
    }

}
