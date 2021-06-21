/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvarpunen.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tvarpunen.post.*;
import tvarpunen.user.*;

/**
 *
 * @author hede
 */
@Service
public class MainService {
    
    @Autowired
    private PostRepository postRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    public List<Post> listPosts() {
        List<Post> posts = this.postRepository.findAll();
        return posts;
        
    }
    
}
