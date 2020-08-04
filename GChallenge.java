/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gchallenge;

/**
 *
 * @author lesliewen
 */
public class GChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TempConv a = new TempConv('c','k',363.0);
        System.out.println(a.convert());
        
    }
    
}
