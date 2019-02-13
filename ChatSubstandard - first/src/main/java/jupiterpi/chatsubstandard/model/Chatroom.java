package jupiterpi.chatsubstandard.model;
import java.util.*;

public class Chatroom {
	private String name;
	private boolean privateRoom;
	private List<Message> messages = new ArrayList<Message>();
	private List<User> users = new ArrayList<User>();

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
}
