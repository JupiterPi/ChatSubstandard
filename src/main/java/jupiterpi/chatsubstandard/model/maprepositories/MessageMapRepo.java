package jupiterpi.chatsubstandard.model.maprepositories;

import java.util.*;
import jupiterpi.chatsubstandard.model.*;
import jupiterpi.chatsubstandard.model.repositories.*;
import jupiterpi.chatsubstandard.extensions.*;

public class MessageMapRepo implements MessageRepo 
{
	private Map<String, Message> repo = new HashMap<String, Message> ();
	private FileTool messagesFile = new FileTool ("messages.txt");
	
	@Override
	public Message findById(UUID id)
	{
		return repo.get(id);
	}
	@Override
	public Collection<Message> findAll ()
	{
		return repo.values();
	}
    
	@Override
	public Collection<Message> findByChatroom(String chatroomName) {
		Collection<Message> messages = new ArrayList<Message>();
		for (Message m : repo.values()) {
			if (m.getChatroomName().equals(chatroomName)) {
				messages.add(m);
			}
		}
		return messages;
	}
	public void readFromFile (String filename)
	{
//		for (String line : messagesFile.getFile())
//		{
//			String[] f = line.split(";");
//			repo.put (f[0], new Message (f[1], f[2], f[3], f[4]));
//		}
	}
}
