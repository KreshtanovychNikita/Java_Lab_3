import java.util.*;

public class Proizvoditel {



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

/**
Функціїї


   */
//Сортування деталей за ціною
public void sortByPrice(List<Detal> list){

    Collections.sort(list, new NewComparable());

}

//Пошук максимальної ціни за дтеаль
    public Detal MaxDetalPrice(List<Detal> list){
        Detal res = null;
        float temp = list.get(0).getPrice();
        for(int i=1;i<list.size();i++){
            if(list.get(i).getPrice() > temp){
                res = list.get(i);
        }
    }

        return res;
}

// вивід списку деталей заданої фірми виробника
public List<Detal> viewProizvoditel(List<Detal> list, int idProizvoditel){
    List<Detal> result = new ArrayList<Detal>();

    for(int i = 0; i < list.size();i++){
        if(list.get(i).getIdProivoditel() == idProizvoditel){
            result.add(list.get(i));
        }
    }

    return result;
}

//вивід списку працівників
    public void printfList(List<Detal> list){

        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
    }
}




    public static void main(String args[]) {
        Detal w1 = new Detal();

        w1.setId(1);
        w1.setName("Kardan");
        w1.setArticul(1);
        w1.setidProizvoditel(15);
        w1.setPrice(1250);

        Detal w2 = new Detal();

        w2.setId(2);
        w2.setName("KorobkaPeredach");
        w2.setArticul(2);
        w2.setidProizvoditel(15);
        w2.setPrice(4500);

        Detal w3 = new Detal();

        w3.setId(3);
        w3.setName("Fara");
        w3.setArticul(3);
        w3.setidProizvoditel(15);
        w3.setPrice(2100);

        Detal w4 = new Detal();

        w4.setId(4);
        w4.setName("TormozWater");
        w4.setArticul(4);
        w4.setidProizvoditel(15);
        w4.setPrice(8400);

        Detal w5 = new Detal();

        w5.setId(5);
        w5.setName("Porshenx12");
        w5.setArticul(331);
        w5.setidProizvoditel(15);
        w5.setPrice(25890);

        Detal w6 = new Detal();

        w6.setId(6);
        w6.setName("Dvigyn");
        w6.setArticul(6);
        w6.setidProizvoditel(15);
        w6.setPrice(11260);


        Proizvoditel proizvoditel = new Proizvoditel();
        proizvoditel.setNumProizvoditel(15);
        proizvoditel.setNameProizvoditel("AVTO-MOTO");
        List<Detal> l = proizvoditel.getList();

        l.add(w1);
        l.add(w2);
        l.add(w3);
        l.add(w4);
        l.add(w5);
        l.add(w6);



        proizvoditel.sortByPrice(l);
        proizvoditel.MaxDetalPrice(l);
        System.out.println("\n\n");
        proizvoditel.printfList(l);
    }

}


