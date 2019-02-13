package jupiterpi.chatsubstandard.model.repositories;

import java.util.*;

import jupiterpi.chatsubstandard.model.*;

public interface ChatroomRepo
{
	public Chatroom findByName(String name);
	public Collection<Chatroom> findAll();
}
