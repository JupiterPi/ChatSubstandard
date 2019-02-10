package jupiterpi.chatsubstandard.model;

import java.util.UUID;

public interface MessageRepo {
	public Message findById(UUID id);
}
