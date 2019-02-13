package jupiterpi.chatsubstandard;

import jupiterpi.chatsubstandard.model.*;
import jupiterpi.chatsubstandard.model.maprepositories.*;

public class ChatSubstandard
{
	static UserMapRepo userRepo = new UserMapRepo(); 
	static ChatroomMapRepo chatroomRepo = new ChatroomMapRepo();
	static MessageMapRepo messageRepo = new MessageMapRepo();
	
	
    public static void main (String[] args)
    {
        System.out.println ("ALAAAAARMMMMM !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! Das ist nur ein Probealarm!!!");
        
        System.out.println("Einlesen der Files:");
        
        userRepo.readFromFile("user.txt");
        chatroomRepo.readFromFile("chatroom.txt");
        messageRepo.readFromFile("message.txt");

        System.out.println ("ICH BIN EIN KLEINER FROSCH!!!");
    }
}