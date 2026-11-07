package mv1;
import java.io.FileReader;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
public class readjson {

	public static void main(String[] args) throws Exception {
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader(".\\JSON\\student.json");
		JSONObject obj = (JSONObject) parser.parse(reader);
		System.out.println("Firstname: " + obj.get("Fname"));
		System.out.println("Lastname: " + obj.get("Lname"));
	}

}
