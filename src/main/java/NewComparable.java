
import java.util.Comparator;

public class NewComparable implements Comparator<Detal> {

    @Override
    public int compare(Detal a1, Detal a2) {
        String name1 = a1.getName();
        String name2 = a2.getName();
        return name1.compareTo(name2);
    }

}