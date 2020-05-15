/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

/**
 *
 * @author WK
 */
public class Git {

    public void parimpar(int num){
        if(num%2 == 0){
            System.out.println(num + " es par");
        } else{
            System.out.println(num + " es impar");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Git prueba = new Git();
        prueba.parimpar(2);
        prueba.parimpar(8);
        prueba.parimpar(7);
    }
    
}
