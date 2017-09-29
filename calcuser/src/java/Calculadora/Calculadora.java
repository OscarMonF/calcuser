/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;
/**

 *

 * @author Alumno

 */
public class Calculadora {
    float num1=0,num2=0,res=0;
    public Calculadora(float Num1,float Num2) {
        num1=Num1;
        num2=Num2;
    }
    public void Calcular(String op){
        if(op.equals("Suma")){
            res=num1+num2;
        }else if(op.equals("Resta")){
            res=num1-num2;
        }else if(op.equals("Multiplicación")){
            res=num1*num2;
        }else if(op.equals("División")){
            res=num1/num2;
        }
    }
    public float getRes() {
        return res;
    }
}