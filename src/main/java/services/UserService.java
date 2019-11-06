package services;

import java.util.Map;

import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import api.model.Users;

public class UserService extends MethodsService {

	public static Response get(String jsonName, Map<String, String> parameters) {
		return get(jsonName, Users.class, parameters);
	}

	public static Response post(String jsonName, Map<String, String> parameters) {
		return post(jsonName, Users.class, parameters);
	}

	public static Response put(String jsonName, Map<String, String> parameters) {
		return put(jsonName, Users.class, parameters);
	}

	public static Response patch(String jsonName, Map<String, String> parameters) {
		return patch(jsonName, Users.class, parameters);
	}

}
