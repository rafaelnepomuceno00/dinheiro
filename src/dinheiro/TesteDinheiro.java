/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinheiro;
import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author IFNMG
 */
public class TesteDinheiro {
    public static void main(String[] args) {
       BigDecimal d1 = new BigDecimal ("3.0"); 
       BigDecimal d2 = new BigDecimal ("2.2");
       System.out.println(d1.subtract(d2));
        System.out.println(d1.add(d2));
        System.out.println(d1.multiply(d2));
        
       //divisao pra colocar pra arredondar pra cima
        
        System.out.println(d1.divide(d2,2,RoundingMode.UP));
       
    }
}
