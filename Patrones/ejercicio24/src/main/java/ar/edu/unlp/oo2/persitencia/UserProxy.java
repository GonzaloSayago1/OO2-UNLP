package ar.edu.unlp.oo2.persitencia;

import java.util.List;

public class UserProxy implements PersistableUser{
	private User user;
	private PostRepository repository;

	public UserProxy(User user, PostRepository userRepository) {
		this.user = user;
		this.repository = userRepository;
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public String getEmail() {
		return user.getEmail();
	}

	@Override
	public List<Post> getPosts() {
		if(user.cantidadDePost() == 0)//Si el usuario no tiene post, los busco y los cargo
		{
			user.addPosts(this.repository.findPostsByUsername(getUsername()));
		}
		return user.getPosts();
	}

}
