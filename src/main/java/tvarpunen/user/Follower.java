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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author hede
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Follower extends AbstractPersistable<Long> {

    @Id
    private Long id;
    /*@ManyToOne
    private User followingUser;
    @ManyToOne
    private User followedUser;
    */
    
}
