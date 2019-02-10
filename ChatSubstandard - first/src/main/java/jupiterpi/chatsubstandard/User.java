package jupiterpi.chatsubstandard;

public class User
{
    private String name;
    private String username;
    private String password;
    private boolean isAdmin;

    public User (String name, String username, String password, boolean isAdmin)
    {
        this.name = name;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getName()
    {
        return name;
    }

    public String getUsername()
    {
        return username;
    }

    public boolean proofPassword (String password)
    {
        return (password == this.password);
    }
}