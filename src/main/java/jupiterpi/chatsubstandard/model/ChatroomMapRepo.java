package jupiterpi.chatsubstandard.model;

import java.util.*;

public class ChatroomMapRepo implements ChatroomRepo{
	Map<String,Chatroom> repo = new HashMap<String,Chatroom>();

	@Override
	public Chatroom findByName(String name) {
		return repo.get(name);
	}
}
