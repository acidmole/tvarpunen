/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvarpunen.user;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class User extends AbstractPersistable<Long> {
    
    @Id
    private final Long id;
    
    private String loginId;
    private String password;
    private String username;
    private List<User> followers;
    private List<User> following;
    private List<Picture> pictures;
    private List<User> blocks;
    
}