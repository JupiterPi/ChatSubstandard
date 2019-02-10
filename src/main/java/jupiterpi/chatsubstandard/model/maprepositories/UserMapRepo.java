package jupiterpi.chatsubstandard.model.maprepositories;

import java.util.Map;
import java.util.HashMap;
import jupiterpi.chatsubstandard.model.*;

public class UserMapRepo implements UserRepo
{
    private Map<String, User> repo = new HashMap<String, User>();
    
    @Override
	public User findByUsername (String username)
	{
		return repo.get(username);
	}
    
    public void readFromFile(String filename) {
    	
    }
}