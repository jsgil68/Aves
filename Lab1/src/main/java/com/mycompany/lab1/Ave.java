/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author USUARIO
 */
public abstract class Ave {
    
        private TipoSonido tipoSonido;
        private TipoVuelo tipoVuelo;
        
        //metodos de un ave
        
        public void setTipoSonido(TipoSonido tipoSonido){
            this.tipoSonido=tipoSonido;
        }
        
        public void setTipoVuelo(TipoVuelo tipoVuelo){
            this.tipoVuelo=tipoVuelo;
        }
        
        public void realizarVuelo(){
            tipoVuelo.vuelo();
        }
        
        public void realizarSonido(){
            tipoSonido.makeSound();
        }
        
}
