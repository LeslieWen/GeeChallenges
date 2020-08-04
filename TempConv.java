/*
    G Challenge 02 Temperature Converter
 */
package gchallenge;

/**
 *
 * @author lesliewen
 */
public class TempConv {
    private char inputType;
    private char outputType;
    private double inputNum;
    private double outputNum;
    
    
    //Constructor
    public TempConv(char a,char b,double c){
        inputType=a;
        outputType=b;
        inputNum=c;
    }
    public double CtoF(){
        return (1.8*this.inputNum)+32;
    }
    
    
    /*
    public void chooseFormula(){
        if this.outputType=
                
                
                
                
    }
    
    */
    
}
