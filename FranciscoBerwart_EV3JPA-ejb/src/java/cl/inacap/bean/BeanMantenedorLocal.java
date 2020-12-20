/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bean;

import javax.ejb.Local;

/**
 *
 * @author francisco.
 */
@Local
public interface BeanMantenedorLocal {
    
    
    void agregar(Object object);
    
}
