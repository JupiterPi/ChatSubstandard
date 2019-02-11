package jupiterpi.chatsubstandard.model.repositories;

import jupiterpi.chatsubstandard.model.maprepositories.*;

public class RepositoryFactory {
	static UserRepo userRepo;
	static MessageRepo messageRepo;
	static ChatroomRepo chatroomRepo;
	static ChatroomUserRepo chatroomUserRepo;
	
	public static UserRepo getUserRepo() 
	{
		return userRepo; 
	}
	public static ChatroomRepo getChatroomRepo() 
	{
		return chatroomRepo;
	}
	public static MessageRepo getMessageRepo ()
	{
		return messageRepo;
	}
	public static ChatroomUserRepo getChatroomUserRepo () 
	{
		return chatroomUserRepo;
	}
	
	public static void initializeMapRepos() {
		userRepo = new UserMapRepo();
		messageRepo = new MessageMapRepo();
		chatroomRepo = new ChatroomMapRepo();
		chatroomUserRepo = new ChatroomUserMapRepo();
	}
}
