package jupiterpi.chatsubstandard.model.maprepositories;

import java.util.*;
import jupiterpi.chatsubstandard.model.*;
import jupiterpi.chatsubstandard.model.repositories.*;

public class MessageMapRepo implements MessageRepo 
{
	Map<String,Message> repo = new HashMap<String,Message>();
	
	@Override
	public Message findById(UUID id) {
		return repo.get(id);
	}
    
    public void readFromFile(String filename) {
    	
    }
}
