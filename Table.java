/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symboltable;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Tom
 */
public class Table {
    public String scope;
    Map<String, Variable> table = new Hashtable<>();
    
    public Table(String scope){
        this.scope = scope;
    }
    public void addVariable(String name, int value){
        Variable temp = new Integer(value, name);
        table.put(name, temp);    
    }
    public void addVariable(String name, float value){
        Variable temp = new Float(value, name);
        table.put(name, temp);
    }
    public void addVariable(String name, String value){
        Variable temp = new Words(value, name);
        table.put(name, temp);
    }
    
    
    public void printTable(){
        table.forEach((k, variable) -> { 
            System.out.println(variable.toString());
        }); 
    }
    
}


