package jupiterpi.chatsubstandard;
import java.util.List;
import java.util.ArrayList;

public class Chatroom
{
    private List<User> users = new ArrayList<User>();
    private String name;
    private List<Message> chat = new ArrayList<Message>();

    public Chatroom (String name)
    {
        this.name = name;
    }

    public Chatroom (String name, User firstUser)
    {
        this.name = name;
        chat.add (new Message (firstUser, "Welcome to Chatroom " + name + "! Good Luck!"));
    }
}