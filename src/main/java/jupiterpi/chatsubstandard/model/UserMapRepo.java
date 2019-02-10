package jupiterpi.chatsubstandard.model;

import java.util.Map;
import java.util.HashMap;

class UserMapRepo implements UserRepo {
    Map<String,User> repo = new HashMap<String, User>();
    
    @Override
	public User findByUsername(String username) {
		return repo.get(username);
	}
}