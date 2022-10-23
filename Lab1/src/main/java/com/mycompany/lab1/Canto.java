/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author USUARIO
 */
public class Canto implements TipoSonido {
    
    public static final  Logger logger = LoggerFactory.getLogger(Canto.class);
    
    public void makeSound(){
        logger.debug("Estoy cantando");
        System.out.println("Estoy cantando");
    }
}
