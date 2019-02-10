package jupiterpi.chatsubstandard.model;

import jupiterpi.chatsubstandard.model.User;

interface UserRepo {
	public User findByUsername(String username);
}