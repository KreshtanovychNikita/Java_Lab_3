
import java.util.regex.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Detal implements Comparable<Detal> {

    private int id;
    private int idProizvoditel;
    String Name;
    Integer Articul;
    float Price;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getidProizvoditel() {
        return idProizvoditel;
    }
    public void setidProizvoditel( int idProizvoditel) {
        this.idProizvoditel = idProizvoditel;
    }

    public String getName() {
        return Name;
    }
    public void setName( String Name) {
        this.Name = Name;
    }

    public int getArticul() {
        return Articul;
    }
    public void setArticul( int Articul) {
        this.Articul = Articul;
    }
    public float getPrice() {
        return Price;
    }
    public void setPrice( float Price) {
        this.Price = Price;
    }



    @Override
    public String toString() {
        return "Detal{" +
                "Id=" + id +
                ", IdProizvoditel=" + idProizvoditel +
                ", Name='" + Name + '\'' +
                ", Articul=" + Articul +
                ", Price=" + Price +
                '}';
    }






    @Override
    public int compareTo(Detal a) {
        return this.getName().compareTo(a.getName());
    }









}
