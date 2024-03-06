/*
Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        HashSet<String> fruits = createHashSet();
        String apple = "Apple";
        String banana = "Banana";
        String orange = "Orange";
        String pineapple = "Pineapple";
        checkAndDeleteHashSet(fruits, apple);
        checkAndDeleteHashSet(fruits, banana);
        checkAndDeleteHashSet(fruits, orange);
        checkAndDeleteHashSet(fruits, pineapple);
        System.out.println(fruits);

    }

    public static HashSet<String> createHashSet () {
        HashSet<String> example = new HashSet<>();
        example.add("Apple");
        example.add("Banana");
        example.add("Orange");
        example.add("Pineapple");
        return example;
    }

    public static HashSet<String> checkAndDeleteHashSet (HashSet<String> hashSet, String string) {
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (Objects.equals(element, string)) {
                iterator.remove();
            }
        }
        return hashSet;
    }
}