package jupiterpi.chatsubstandard.model;

interface UserRepo {
	public User findByUsername(String username);
}