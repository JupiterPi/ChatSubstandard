package jupiterpi.chatsubstandard.model.maprepositories;

import java.util.*;
import jupiterpi.chatsubstandard.model.*;

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
