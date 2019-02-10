package jupiterpi.chatsubstandard.model.repositories;

import java.util.UUID;

public interface MessageRepo {
	public Message findById(UUID id);
}
