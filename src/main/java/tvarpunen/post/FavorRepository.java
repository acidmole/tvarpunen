/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvarpunen.post;

/**
 *
 * @author hede
 */

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hede
 */
public interface FavorRepository extends JpaRepository<Favor, Long> {
    
    
}
