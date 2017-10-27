/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luke
 */
public  class Company {
    Map<String, Employee> comp = new HashMap<>();
    
    public Company()
    {
        
    }
    
    public void add(Employee e)
    {
        String k = (e.getImie() + " " + e.getNazwisko());
        comp.put(k, e);
    }
    public Employee read(String imie, String nazwisko)
    {
        String k = imie + " " + nazwisko;
        return comp.get(k);
    }
}
