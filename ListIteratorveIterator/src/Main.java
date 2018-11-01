
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Main {

    /*
    ListIterator
    
    Sadece List Interface'i implemente eden classlarda kullanılır.
    next() ve previous() metodu vardır. 
    Ekstradan add() metodu bulunur.
    
    Iterator: 
    
    Set , Queue ve List Interface'i implement'e eden classlarda kullanılabilir.
    previous() metodu yoktur.
    
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {

            String value = iterator.next();

            if (value.equals("Go")) {

                iterator.remove();
            }
        }
        for (String s : list) {

            System.out.println(s);
        }

    }
}
