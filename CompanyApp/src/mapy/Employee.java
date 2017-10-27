/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapy;

import java.util.Objects;

/**
 *
 * @author Luke
 */
public class Employee
{
    private String imie;
    private String nazwisko;
    private double wyplata;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getWyplata() {
        return wyplata;
    }

    public void setWyplata(double wyplata) {
        this.wyplata = wyplata;
    }
    
    public Employee(String i, String n, double w)
    {
        setImie(i);
        setNazwisko(n);
        setWyplata(w);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.imie);
        hash = 59 * hash + Objects.hashCode(this.nazwisko);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.wyplata) ^ (Double.doubleToLongBits(this.wyplata) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (Double.doubleToLongBits(this.wyplata) != Double.doubleToLongBits(other.wyplata)) {
            return false;
        }
        if (!Objects.equals(this.imie, other.imie)) {
            return false;
        }
        if (!Objects.equals(this.nazwisko, other.nazwisko)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" + "imie=" + getImie() + ", nazwisko=" + getNazwisko() + ", wyplata=" + getWyplata() + '}';
    }
    
    
}
