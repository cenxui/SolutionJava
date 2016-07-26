package gson;

import com.google.gson.Gson;

public class SolutionGson {

	public static void main(String[] args) {
		String json = "{}";
		Gson gson = new Gson();
		gson.fromJson(json, Object.class);

	}

}
