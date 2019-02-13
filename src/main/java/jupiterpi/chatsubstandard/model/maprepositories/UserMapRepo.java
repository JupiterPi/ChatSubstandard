package jupiterpi.chatsubstandard.model.maprepositories;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

import jupiterpi.chatsubstandard.extensions.FileTool;
import jupiterpi.chatsubstandard.model.*;
import jupiterpi.chatsubstandard.model.repositories.*;

public class UserMapRepo implements UserRepo
{
    private Map<String, User> repo = new HashMap<String, User>();
    private FileTool usersFile = new FileTool ("users.txt");
    
    @Override
	public User findByUsername (String username)
	{
		return repo.get(username);
	}
	@Override
	public Collection<User> findAll ()
	{
		return repo.values();
	}
    
    public void readFromFile(String filename)
    {
        
    }
}