package jupiterpi.chatsubstandard.model.repositories;

import java.util.Collection;

import jupiterpi.chatsubstandard.model.ChatroomUser;

public interface ChatroomUserRepo {
	public Collection<ChatroomUser> findByUserName(String userName);
	public Collection<ChatroomUser> findByChatroomName(String chatroomName);
}
