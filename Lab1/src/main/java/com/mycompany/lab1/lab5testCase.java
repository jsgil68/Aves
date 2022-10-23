/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import junit.framework.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author USUARIO
 */
public class lab5testCase {
    
    public static final Logger logger = LoggerFactory.getLogger(lab5testCase.class);
  
    public void canarioTestCase(){
        
    
    Canario canario = new Canario();
    Assert.assertNotNull(canario);
    
    logger.debug("canario realizaVuelo");
    System.out.println("canario realizaVuelo");
    canario.realizarVuelo();
    logger.debug("canario realizaSonido");
    System.out.println("canario realizaSonido");
    canario.realizarSonido();
    System.out.println("canario cambiando sonido ave");
    canario.setTipoSonido(new Grasnido());
    System.out.println("canario realizaSonido");
    canario.realizarSonido();
    } 
}
