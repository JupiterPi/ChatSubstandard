package jupiterpi.chatsubstandard.model.maprepositories;

import java.util.*;
import jupiterpi.chatsubstandard.model.*;
import jupiterpi.chatsubstandard.model.repositories.*;
import jupiterpi.chatsubstandard.extensions.*;

public class ChatroomUserMapRepo implements ChatroomUserRepo
{
	private List<ChatroomUser> repo = new ArrayList<ChatroomUser>();
	private FileTool chatroomUsersFile = new FileTool ("chatrooms.txt");

	@Override
	public Collection<ChatroomUser> findByUserName (String userName)
	{
		Collection<ChatroomUser> entries = new ArrayList<ChatroomUser>();
		for (ChatroomUser user : repo) 
		{
			if (user.getUserName().equals(userName)) {
				entries.add(user);
			}
		}
		return entries;
	}
	@Override
	public Collection<ChatroomUser> findByChatroomName(String chatroomName) {
		Collection<ChatroomUser> entries = new ArrayList<ChatroomUser>();
		for (ChatroomUser user : repo) 
		{
			if (user.getChatroomName().equals(chatroomName)) {
				entries.add(user);
			}
		}
		return entries;
	}
    
	public void readFromFile(String filename)
	{
	}

}
