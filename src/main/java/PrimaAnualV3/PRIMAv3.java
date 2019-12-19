/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimaAnualV3;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class PRIMAv3 {
    
    /**
     * Calcula la prima, utilizando la formula dada en la tarea y dada la edad y los puntos.
     * @param edad Edad del conductor
     * @param puntos Puntos de licencia
     * @return float que representa valor a pagar
     */
	public static float primaV3(final int edad, final int puntos) {
        float num =calculoFactorEdad(edad);
        return 500*num-calculoReduccion(num,puntos);    
    }
    
    /**
     * Calcula el factor de la edad dada la edad del conductor.
     * @param edad Edad del conductor
     * @return Factor Edad
     */
    public static float calculoFactorEdad(int edad){
        if (edad >= 18 && edad < 25 ){
            return (float) 2.8;
        }
        else if(edad>=25 && edad <35){
            return (float) 1.8;
        }
        else if(edad>=35 && edad <45){
            return (float) 1.0;
        }
        else if(edad>=45 && edad <65){
            return (float) 0.8;
        }
        else if(edad>=65 && edad <91){
            return (float) 1.5;
        }
        else{
            return 0;
        }     
    }
    
    /**
     * Calcula el descuento que se hace a los conductores, dado el factor de edad y los puntos de
     * licencia.
     * @param factorEdad Factor de edad de acuerdo a los puntos
     * @param puntos Puntos de licencia
     * @return Cantidad de dinero que se descuenta
     */
    public static int calculoReduccion(float factorEdad, int puntos){
        if (Float.compare(factorEdad, (float) 2.8)==0 && puntos>=29){
            return 50;
        }
        else if (Float.compare(factorEdad, (float) 1.8)==0 && puntos>=27){
            return 50;
        }
        else if (Float.compare(factorEdad, (float) 1.0)==0 && puntos>=25){
            return 100;
        }
        else if (Float.compare(factorEdad, (float) 0.8)==0 && puntos>=23){
            return 150;
        }
        else if (Float.compare(factorEdad, (float) 1.5)==0 && puntos>=25){
            return 200;
        }
        else{
            return 0;
        }
        
    }
    
    /**
     * Valida que los integeres de edad y puntos estén dentro de los rangos permitidos.
     * @param param Texto que pasa el usuario
     * @param limitInf límite inferior del integer
     * @param limitSup límite superior del integer
     * @return Integer validado
     */
    public static int validationInteger(String param, int limitInf, int limitSup) {
        Scanner scanner = new Scanner(System.in,"utf-8");
        System.out.println("Ingrese "+param+" :");
        String input=scanner.nextLine();
        
        while(!parse(input,limitInf, limitSup)){
            if(param.equals("edad")){
                System.out.println("Error, por favor ingresar un nÃºmero entero entre "+Integer.toString(limitInf)+ " y "+ Integer.toString(limitSup)+ " para la "+param+":");   
            }
            else{
                System.out.println("Error, por favor ingresar un nÃºmero entero entre "+Integer.toString(limitInf)+ " y "+ Integer.toString(limitSup)+ " para los "+param+":");
            }
            input=scanner.nextLine();
        }
        
        
       
        return Integer.parseInt(input);  
    }
    
    /**
     * Método usado dentro de validationInteger para detectar si el string que ingresa el usuario es un número o no.
     * @param text Texto que pasa el usuario
     * @param limitInf límite inferior del integer
     * @param limitSup límite superior del integer
     * @return Bool que indica si el texto es númerico o no
     */
    public static boolean parse(String text, int limitInf, int limitSup) {
        try {
          int num=Integer.parseInt(text);
          return ( num >= limitInf && num <= limitSup);
        } catch (NumberFormatException e) {
            return false;
        } 
    }
    
    /**
     * Main
     * @param args Argumentos
     */
    public static void main(String[] args) {
        int edad=validationInteger("edad",18,90);
        int puntos=validationInteger("puntos de licencia",1,30);//Se cambiÃ³ el 0 por 1
        System.out.println("El valor a pagar por prima es de $"+primaV3(edad,puntos)+".");

        
    }
    
}
