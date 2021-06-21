/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvarpunen.post;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class Post extends AbstractPersistable<Long> {
    
    @Id
    private final Long id;
    
    private Long userId;
    private LocalDateTime dateAndTime;
    private String content;
    
}
