package jupiterpi.chatsubstandard.model.maprepositories;

import java.util.Map;
import java.util.HashMap;
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
    
    public void readFromFile(String filename)
    {
        
    }
}