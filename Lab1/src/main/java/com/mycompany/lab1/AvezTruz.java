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
public class AvezTruz extends Ave {
     
    public static final  Logger logger = LoggerFactory.getLogger(AvezTruz.class);
    
    public AvezTruz(){
        logger.debug("instanciando aveztruz");
        this.setTipoSonido(new SinCanto());
        this.setTipoVuelo(new SinVuelo());
    }
    // La aveztruz no vuela por ello no se implementa la interfaz de vuelo
}
