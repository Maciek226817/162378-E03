import java.time.LocalDate;
import java.util.LinkedList;

public class Z1 {
    public static void main(String[] args) {
        LinkedList<Integer> i = new LinkedList<>();
        i.add(1);
        i.add(2);
        i.add(4);
        i.add(5);
        i.add(6);
        redukuj(i,4);

        LinkedList<LocalDate>ld = new LinkedList<>();
        ld.add(LocalDate.of(2020,11,25));
        ld.add(LocalDate.of(2010,12,22));
        ld.add(LocalDate.of(2021,10,1));
        ld.add(LocalDate.of(2022,12,5));
        redukuj(ld,2);




    }
    public static<T extends LinkedList<?>> void redukuj(T linkedList, int n){
        for(int i = 0; i<=linkedList.size()-1; i+=n-1){
            linkedList.remove(i);
        }

    }
}
