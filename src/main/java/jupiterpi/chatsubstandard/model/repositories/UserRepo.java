package jupiterpi.chatsubstandard.model.repositories;

import java.util.*;

import jupiterpi.chatsubstandard.model.*;

public interface UserRepo
{
	public User findByUsername (String username);
	public Collection<User> findAll();
}