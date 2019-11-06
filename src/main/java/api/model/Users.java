package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Users {

	@JsonProperty("users")
	List<User> data;

	@JsonProperty("count")
	private int count;

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
