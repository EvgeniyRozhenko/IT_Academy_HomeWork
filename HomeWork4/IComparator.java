package HomeWork4;

import java.util.Comparator;

public class IComparator<T extends Comparable> implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {
        Comparable obj1 = o1;
        Comparable obj2 = o2;

        if (obj1 == null){
            return 1;
        } else if(obj2 == null){
            return -1;
        } else if((obj1 == null) && (obj2 == null)){
            return 0;
        }else
         return obj1.compareTo(obj2);
    }

}
