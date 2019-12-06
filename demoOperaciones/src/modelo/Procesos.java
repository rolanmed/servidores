/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Rolando
 */
public class Procesos {
    private double resultado;

    public Procesos() {
        resultado = 0.0;
    }
    
    public double suma(Datos d){
        resultado = d.getNumA() + d.getNumB();
        return resultado;
    }

    public double division(Datos d){
        resultado = d.getNumA() / d.getNumB();
        return resultado;
    }
    
 public double resta(Datos d){
        resultado = d.getNumA() - d.getNumB();
        return resultado;
    }
}
