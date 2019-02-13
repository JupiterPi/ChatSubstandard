package jupiterpi.chatsubstandard.model.repositories;

import jupiterpi.chatsubstandard.model.*;

public interface UserRepo
{
	public User findByUsername (String username);
}