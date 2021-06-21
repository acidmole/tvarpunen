/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvarpunen.post;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;
import tvarpunen.user.User;

/**
 *
 * @author hede
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Comment extends AbstractPersistable<Long> {

    @Id
    private Long id;
    @ManyToOne
    private User commentingUser;
    private String content;
    @ManyToOne
    private Post post;
    
    
}
