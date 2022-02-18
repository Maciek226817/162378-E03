import java.util.Iterator;
import java.util.LinkedHashSet;

public class Z2 {
    public static void main(String[] args) {
        int i = 0;
        int licznik = -1;
        LinkedHashSet<String>lista = new LinkedHashSet<>();
        lista.add("jeden");
        lista.add("dwa");
        lista.add("trzy");
        lista.add("cztery");


        Iterator <String> it = lista.iterator();
        for (String ignored : lista) {
            licznik++;

        }

        while(it.hasNext()){
            i++;
            it.next();
            if(i == licznik)
                it.remove();
        }
        System.out.println("po usunięciu:");

        for (String s : lista) {
            System.out.println(s);
        }

    }
}
