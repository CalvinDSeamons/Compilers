/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symboltable;

/**
 *
 * @author Tom
 */
public class Variable {
    public String name;
    
    
    
    public Variable(){
    
    }


}
class Integer extends Variable {
    public Integer(int value, String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        String out = "name " + name + " type INT" ;
        return out;
    }
}

class Float extends Variable{
    public Float(float value, String name){
        this.name = name;
    }
    @Override
    public String toString(){
        String out = "name " + name + " type FLOAT" ;
        return out;
    }    
}

class Words extends Variable{
    String value;
    public Words(String value, String name){
        this.value = value;
        this.name = name;
    }
    @Override
    public String toString(){
        String out = "name " + name + " type STRING" + " value \"" + value +"\""  ;
        return out;
    }
} 