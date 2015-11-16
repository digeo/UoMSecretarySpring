/**
 * 
 */
package gr.uom.UoMSecretarySpring.dao;

import java.util.List;

import gr.uom.UoMSecretarySpring.domain.UserDetails;

/**
 * @author Georgios Digkas <mai153@uom.edu.gr>
 *
 */
public interface UserDetailsDao {
	void insert(UserDetails userDetails);
	void update(UserDetails userDetails);
	void delete(UserDetails userDetails);
	List<UserDetails> findAll();
	List<UserDetails> findByRole(String role);
	UserDetails findByUsername(String username);

}
