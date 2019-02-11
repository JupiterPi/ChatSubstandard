package jupiterpi.chatsubstandard.model.repositories;

import java.util.*;
import java.util.UUID;
import jupiterpi.chatsubstandard.model.*;

public interface MessageRepo
{
	public Message findById(UUID id);
	public Collection<Message> findAll();
	
	public Collection<Message> findByChatroom(String chatroomName);
}
