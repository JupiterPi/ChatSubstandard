package jupiterpi.chatsubstandard.model.dynamodb;

import java.util.List;

import jupiterpi.chatsubstandard.model.Chatroom;
import jupiterpi.chatsubstandard.model.repositories.ChatroomRepo;

public class ChatroomDynamoDB extends DynamoDBBase<Chatroom> implements ChatroomRepo {
			
	@Override
	public Chatroom findByName(String name) {
		return findOne(new Chatroom(name), Chatroom.class);
	}

	@Override
	public List<Chatroom> findAll() {
		return findAll(Chatroom.class);
	}
}
