/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvarpunen.domain;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tvarpunen.post.Post;
import tvarpunen.post.PostRepository;
import tvarpunen.user.UserRepository;

/**
 *
 * @author hede
 */
@Controller
public class MainController {
    
    @Autowired
    private MainService mainService;
    
    
    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("posts", this.mainService.listPosts());
        return "index";
    }
            
    

    
}
