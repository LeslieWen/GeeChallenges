/*
    G Challenge 02 Temperature Converter
    Input parameters: input unit, desired output unit, input magnitude
    C for Celsius, K for Kelvin, F for Farenheit. 
 */
package gchallenge;

/**
 *
 * @author lesliewen
 */
public class TempConv {
    private final char inputType;
    private final char outputType;
    private final double inputNum;
    private double outputNum;
    
    //Constructor
    public TempConv(char a,char b,double c){
        inputType=a;
        outputType=b;
        inputNum=c;
    }
    
    public double convert(){
        this.chooseFormula();
        return outputNum;
    }
    
    public void CtoF(){
        outputNum=(1.8*this.inputNum)+32;
    }
     public void FtoC(){
        outputNum=(this.inputNum-32)*5/9;
    }
    public void CtoK(){
        outputNum=this.inputNum+273.15;
    }
    public void FtoK(){
        outputNum=(this.inputNum-32)*5/9+273.15;
    } 
    public void KtoC(){
        outputNum=this.inputNum-273.15;
    }
    public void KtoF(){
        outputNum=(this.inputNum-273.15)*9/5+32;
    }

    public void chooseFormula(){
        if(Character.toUpperCase(this.inputType)=='C'&&Character.toUpperCase(this.outputType)=='F'){
            this.CtoF();
        }
        if(Character.toUpperCase(this.inputType)=='C'&&Character.toUpperCase(this.outputType)=='K'){
            this.CtoK();
        }        
        if(Character.toUpperCase(this.inputType)=='F'&&Character.toUpperCase(this.outputType)=='C'){
            this.FtoC();
        }
        if(Character.toUpperCase(this.inputType)=='F'&&Character.toUpperCase(this.outputType)=='K'){
            this.FtoK();
        }           
        if(Character.toUpperCase(this.inputType)=='K'&&Character.toUpperCase(this.outputType)=='C'){
            this.KtoC();
        }
        if(Character.toUpperCase(this.inputType)=='K'&&Character.toUpperCase(this.outputType)=='F'){
            this.KtoF();
        }                   
    }
}
