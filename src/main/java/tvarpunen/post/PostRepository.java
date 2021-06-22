/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvarpunen.post;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import tvarpunen.user.User;

/**
 *
 * @author hede
 */
public interface PostRepository extends JpaRepository<Post, Long> {
    
    List<Post> findByUser(User user);
}
