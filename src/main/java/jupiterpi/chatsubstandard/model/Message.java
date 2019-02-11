package jupiterpi.chatsubstandard.model;

import java.util.Date;
import java.util.UUID;

import jupiterpi.chatsubstandard.model.repositories.RepositoryFactory;

public class Message 
{
	private UUID id;
	private String senderName;
	private String chatroomName;
	private String message;
	private Date time;

//	private User sender;
//	private Chatroom chatroom;

	public Message (String senderName, String message, String chatroomName)
	{
		this.senderName = senderName;
		this.message = message;
		this.chatroomName = chatroomName;

		id = UUID.randomUUID();
		time = new Date();
	}

	public Message (String senderName, String message, String chatroomName, Date time)
	{
		this.senderName = senderName;
		this.message = message;
		this.chatroomName = chatroomName;

		id = UUID.randomUUID();
		this.time = time;
	}

	public UUID getId ()
	{
		return id;
	}
	
	public String getSenderName () 
	{
		return senderName;
	}

	public User getSender ()
	{
		return RepositoryFactory.getUserRepo().findByUsername(senderName);
	}

	public String getMessage ()
	{
		return message;
	}

	public Date getTime ()
	{
		return time;
	}
	
	public String getChatroomName () 
	{
		return chatroomName;
	}

	public Chatroom getChatroom ()
	{
		return RepositoryFactory.getChatroomRepo().findByName(chatroomName);
	}
}
