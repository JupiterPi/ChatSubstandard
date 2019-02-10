package jupiterpi.chatsubstandard.model;

import jupiterpi.chatsubstandard.model.User;

public interface UserRepo
{
	public User findByUsername (String username);
}