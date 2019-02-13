package jupiterpi.chatsubstandard.model.repositories;

import jupiterpi.chatsubstandard.model.*;

public interface ChatroomRepo
{
	public Chatroom findByName(String name);
}
