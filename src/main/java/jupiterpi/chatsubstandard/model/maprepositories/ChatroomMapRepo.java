package jupiterpi.chatsubstandard.model.maprepositories;

import java.util.*;
import jupiterpi.chatsubstandard.model.*;
import jupiterpi.chatsubstandard.model.repositories.*;
import jupiterpi.chatsubstandard.extensions.*;

public class ChatroomMapRepo implements ChatroomRepo
{
	private Map<String, Chatroom> repo = new HashMap<String, Chatroom>();
	private FileTool chatroomsFile = new FileTool ("chatrooms.txt");

	@Override
	public Chatroom findByName (String name)
	{
		return repo.get(name);
	}
    
	public void readFromFile(String filename)
	{
		for (String line : chatroomsFile.getFile().toArray())
		{
			String[] f = line.split(";");
			repo.put (f[0], new Chatroom (f[1], Boolean.valueOf(f[2])));
		}
	}
}
