import java.math.BigDecimal;
import java.util.*;
import java.util.stream.*;

public class ProizvoditelStreamAPI {

    private int numProizvoditel;
    private String nameProizvoditel;
    private List<Detal> list = new ArrayList<Detal>();

    public int getNumProizvoditel() {
        return numProizvoditel;
    }

    public void setNumProizvoditel(int numDetal) {
        this.numProizvoditel = numDetal;
    }

    public String getNameProizvoditel() {
        return nameProizvoditel;
    }
    public void setNameProizvoditel(String nameDetal) {
        this.nameProizvoditel = nameDetal;
    }
    public void setList(List<Detal> list) {
        this.list = list;
    }
    public List<Detal> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Proizvoditel{" +
                "numProivoditel=" + numProizvoditel +
                ", nameProizvoditel='" + nameProizvoditel + '\'' +
                ", list='" + list +
                '}';
    }

    //вивід списку працівників
    public void printfList(List<Detal> list){

        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String args[]) {
        List<Detal> copy = new ArrayList<Detal>();

        Detal w1 = new Detal();

        w1.setId(1);
        w1.setName("Kardan");
        w1.setArticul(1);
        w1.setidProizvoditel(15);
        w1.setPrice(1250);

        Detal w2 = new Detal();

        w2.setId(1);
        w2.setName("KorobkaPeredach");
        w2.setArticul(2);
        w2.setidProizvoditel(15);
        w2.setPrice(4500);

        Detal w3 = new Detal();

        w3.setId(1);
        w3.setName("Fara");
        w3.setArticul(3);
        w3.setidProizvoditel(15);
        w3.setPrice(2100);

        Detal w4 = new Detal();

        w4.setId(1);
        w4.setName("TormozWater");
        w4.setArticul(4);
        w4.setidProizvoditel(15);
        w4.setPrice(8400);

        Detal w5 = new Detal();

        w5.setId(1);
        w5.setName("Porshenx12");
        w5.setArticul(331);
        w5.setidProizvoditel(15);
        w5.setPrice(25890);

        Detal w6 = new Detal();

        w6.setId(1);
        w6.setName("Dvigyn");
        w6.setArticul(6);
        w6.setidProizvoditel(15);
        w6.setPrice(11260);



        ProizvoditelStreamAPI proizvoditelStreamAPI = new ProizvoditelStreamAPI();
        proizvoditelStreamAPI.setNumProizvoditel(15);
        proizvoditelStreamAPI.setNameProizvoditel("AVTO-MOTO");
        List<Detal> l = proizvoditelStreamAPI.getList();

        l.add(w1);
        l.add(w2);
        l.add(w3);
        l.add(w4);
        l.add(w5);
        l.add(w6);
    }
}