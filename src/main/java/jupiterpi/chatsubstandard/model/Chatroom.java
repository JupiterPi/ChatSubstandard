package jupiterpi.chatsubstandard.model;
import java.util.*;

import jupiterpi.chatsubstandard.model.repositories.RepositoryFactory;

public class Chatroom {
	
	private String name;
	private boolean privateRoom;	
	
	/*
	private List<Message> messages = new ArrayList<Message>();
	private List<User> users = new ArrayList<User>();
	*/
	
	public Chatroom() {}
	
	public Chatroom (String name, boolean privateRoom)
	{
		this.name = name;
		this.privateRoom = privateRoom;
	}

	public Chatroom (String name)
	{
		this.name = name;
	}

	public String getName ()
	{
		return name;
	}

	public boolean isPrivateRoom ()
	{
		return privateRoom;
	}

	/*
	public void addMessage (Message message)
	{
		messages.add (message);
	}

	public List<Message> getMessages ()
	{
		return messages;
	}

	public void addUser (User user)
	{
		users.add (user);
	}

	public void removeUser (User user)
	{
		users.remove (user);
	}

	public List<User> getUsers ()
	{
		return users;
	}
	*/
	
	public Collection<Message> getMessages() 
	{
		return RepositoryFactory.getMessageRepo().findByChatroom(name);
	}
	
	public Collection<User> getUser() 
	{
		Collection<ChatroomUser> chatroomUsers =  RepositoryFactory.getChatroomUserRepo().findByChatroomName(name);
		
		Collection<User> users = new ArrayList<User>();
		for (ChatroomUser chatroomUser : chatroomUsers) {
			users.add(RepositoryFactory.getUserRepo().findByUsername(chatroomUser.getUserName()));
		}
		return users;
	}
}
