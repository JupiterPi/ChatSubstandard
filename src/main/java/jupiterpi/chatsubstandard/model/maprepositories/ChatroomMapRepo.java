package jupiterpi.chatsubstandard.model.maprepositories;

import java.util.*;
import jupiterpi.chatsubstandard.model.*;
import jupiterpi.chatsubstandard.model.repositories.*;

public class ChatroomMapRepo implements ChatroomRepo
{
	Map<String, Chatroom> repo = new HashMap<String, Chatroom>();

	@Override
	public Chatroom findByName (String name)
	{
		return repo.get(name);
	}
    
	public void readFromFile(String filename)
	{
		
	}
}
