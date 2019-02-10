package jupiterpi.chatsubstandard.model;
import java.util.*;

public class Chatroom {
	private String name;
	private boolean privateRoom;
	private List<Message> messages = new ArrayList<Message>();
	private List<User> users = new ArrayList<User>();

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

	public List<Message> getMessages ()
	{
		return messages;
	}

	public void addUser (User user)
	{
		users.add (user);
	}

	public void removeUser

	public List<User> getUsers ()
	{
		return users;
	}
	
	/*
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPrivateRoom() {
		return privateRoom;
	}
	public void setPrivateRoom(boolean privateRoom) {
		this.privateRoom = privateRoom;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	*/
}
