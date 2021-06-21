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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;
import tvarpunen.picture.Picture;
import tvarpunen.post.*;

/**
 *
 * @author hede
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class User extends AbstractPersistable<Long> {

    
    @Id
    private Long id;
    
    private String loginId;
    private String password;
    private String fullName;
    private String username;

    @ManyToMany(mappedBy = "followingUsers")
    private List<Follow> followers;

    @ManyToMany(mappedBy = "followedUsers")
    private List<Follow> following;
    
    @OneToMany(mappedBy = "favoringUser")
    private List<Favor> favors;

    @OneToMany(mappedBy = "user")
    private List<Picture> pictures;
    
    @OneToMany(mappedBy = "commentingUser")
    private List<Comment> comments;
    
    @OneToMany(mappedBy = "owner")
    private List<Post> posts;
    
}