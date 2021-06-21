/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvarpunen.user;

/**
 *
 * @author hede
 */
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;
import tvarpunen.picture.Picture;

/**
 *
 * @author hede
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Follow extends AbstractPersistable<Long> {

    @Id
    private Long id;
    @ManyToMany
    private List<User> followingUsers;
    @ManyToMany
    private List<User> followedUsers;
    
    
}
