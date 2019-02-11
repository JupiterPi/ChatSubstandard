package jupiterpi.chatsubstandard.model;

import java.util.*;

import jupiterpi.chatsubstandard.model.repositories.RepositoryFactory;

public class User
{
    private String name;
    private String username;
    private String password;
	private boolean isAdmin;
	
	public User (String name, String username, String password, boolean isAdmin)
	{
		this.name = name;
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public String getName ()
	{
		return name;
	}

	public String getUsername ()
	{
		return username;
	}

	public boolean proofPassword (String password)
	{
		return password == this.password;
	}

	public boolean isAdmin ()
	{
		return isAdmin;
	}
	
	public Collection<Chatroom> getChatrooms() {
		
		Collection<ChatroomUser> chatroomUsers = RepositoryFactory.getChatroomUserRepo().findByUserName(name);
		
		Collection<Chatroom> chatrooms = new ArrayList<Chatroom>();
		for (ChatroomUser chatroomUser : chatroomUsers) {
			chatrooms.add(RepositoryFactory.getChatroomRepo().findByName(chatroomUser.getChatroomName()));
		}
		return chatrooms;
	}
}