package jupiterpi.chatsubstandard.model;

import jupiterpi.chatsubstandard.model.repositories.RepositoryFactory;

public class ChatroomUser 
{
	private String userName;
	private String chatroomName;
	
	public ChatroomUser(String chatroomName, String userName)
	{
		this.chatroomName = chatroomName;
		this.userName = userName;
	}
	
	public String getChatroomName () 
	{
		return chatroomName;
	}
	
	public String getUserName () 
	{
		return userName;
	}
	
	public User getUser()
	{
		return RepositoryFactory.getUserRepo().findByUsername(userName);
	}
	public Chatroom getChatroom() 
	{
		return RepositoryFactory.getChatroomRepo().findByName(chatroomName);
	}
}
