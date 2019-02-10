package jupiterpi.chatsubstandard.model;

import jupiterpi.chatsubstandard.model.*;
import java.util.Map;
import java.util.HashMap;

class UserMapRepo implements UserRepo {
    Map<String,User> repo = new HashMap<String, User>();
	public User findByUsername(String username) {
		repo.get(username);
	}
}