package jupiterpi.chatsubstandard.model;

import jupiterpi.chatsubstandard.extensions.FileTool;
import java.util.Collection;

public class DataReader
{
    private FileTool chatroomsFile;
    private FileTool messagesFile;
    private FileTool usersFile;

    public DataReader (String chatroomsFileName, String messagesFileName, String usersFileName)
    {
        this.chatroomsFile = new FileTool(chatroomsFileName);
        this.messagesFile = new FileTool(messagesFileName);
        this.usersFile = new FileTool(usersFileName);
    }

    public Collection<Chatroom> readChatrooms ()
    {
        Collection<Chatroom> chatrooms = new Collection<Chatroom>();
        for (String line : chatroomsFile.getFile())
        {
            String[] f = line.split(";");
            Chatroom chatroom = new Chatroom (f[0], Boolean.valueOf(f[1]));
            for (int i = 2; i < f.length - 2; i++)
            {
                String[] u = f[i].split(",");
                chatroom.addUser (new User (u[0], u[1], u[2], Boolean.valueOf(u[3])));
            }
            chatrooms.add (chatroom);
        }
        return chatrooms;
    }
}