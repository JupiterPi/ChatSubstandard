package jupiterpi.chatsubstandard.model;

import java.util.Date;
import java.util.UUID;

public class Message 
{
	private UUID id;
	private User sender;
	private String message;
	private Date time;
	private Chatroom chatroom;

	public Message (User sender, String message, Chatroom chatroom)
	{
		this.sender = sender;
		this.message = message;
		this.chatroom = chatroom;

		id = UUID.randomUUID();
		time = new Date();
	}

	public Message (User sender, String message, Chatroom chatroom, Date time)
	{
		this.id = UUID.randomUUID();
		this.sender = sender;
		this.message = message;
		this.time = time;
		this.chatroom = chatroom;
	}

	public UUID getId ()
	{
		return id;
	}

	public User getSender ()
	{
		return sender;
	}

	public String getMessage ()
	{
		return message;
	}

	public Date getTime ()
	{
		return time;
	}

	public Chatroom getChatroom ()
	{
		return chatroom;
	}
}
