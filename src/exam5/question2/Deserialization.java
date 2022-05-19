package exam5.question2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class Deserialization {
	
	private static final String PATH = "myFiles/file.json";
	
	public static void deserializeHouseList()
	{
		File file = new File(PATH);
		try (FileReader fileReader = new FileReader(file)) {
			
			Gson gson = new Gson();
			JsonReader jsonReader = new JsonReader(fileReader);
			Type houseListType = new TypeToken<ArrayList<House>>(){}.getType();
			List<House> houseList = gson.fromJson(jsonReader,houseListType);
			System.out.println("Json File Content:");
			houseList.forEach(System.out::println);
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
