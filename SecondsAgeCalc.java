/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gchallenge;
import java.util.Date;
import java.time.*;
/**
 *
 * @author lesliewen
 */
public class SecondsAgeCalc {
    LocalDateTime currentTime;
    public SecondsAgeCalc(){
        currentTime=LocalDateTime.now();
    }
    public void now(){
        System.out.println(this.currentTime);
    }
}
