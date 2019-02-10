package jupiterpi.chatsubstandard.model.repositories;

import jupiterpi.chatsubstandard.model.User;

public interface UserRepo
{
	public User findByUsername (String username);
}