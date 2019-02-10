package jupiterpi.chatsubstandard.model;
import java.util.*;

public class Chatroom {
	private String name;
	private boolean privateRoom;
	private List<Message> messages = new ArrayList<Message>();
	private List<User> users = new ArrayList<User>();
}
