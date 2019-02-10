package jupiterpi.chatsubstandard;

import jupiterpi.chatsubstandard.model.User;

interface UserRepo {
	public User findByUsername(String username);
}