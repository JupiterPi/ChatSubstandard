package jupiterpi.chatsubstandard;
import java.util.Date;

public class Message
{
    private User sender;
    private String message;
    private Date time;

    public Message (User sender, String message)
    {
        this.sender = sender;
        this.message = message;
        time = new Date();
    }

    public Message (User sender, String message, Date time)
    {
        this.sender = sender;
        this.message = message;
        this.time = time;
    }
}