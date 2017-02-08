/**
 * 
 */
package hello;

import org.springframework.data.repository.CrudRepository;

/**
 * @author psengar
 *
 */
public interface UserDao extends CrudRepository<User, Long> {

	 public User findByEmail(String email);
}
