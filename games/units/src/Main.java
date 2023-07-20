import units.*;
import java.util.ArrayList;
import java.util.Random;


public class Main {
    View view = new View;
    public static void main(String[] args) {
        Archer archer = new Archer ("Vasya");
        ArrayList<units> list = new ArrayList();
        ArrayList<units.mnan> list2 = new ArrayList<units.mnan>();
//        ArrayList <String> names = new ArrayList<>();
        list.add(new Archer("Ivan")); //1
        list.add (new Monk("Masha")); //2
        list.add (new rouge("Fedya"));//3
        list.add (new rouge("Tolik"));//4
        list.add (new Monk("Sanya"));//5
        list.add (new Archer("Archi"));//6
        list.add (new Monk("Diego"));//7
        list.add (new rouge("Vovan"));//8
        list.add (new Archer("Migel"));//9
        list.add (new Archer("Gan"));//10

        for (int i=0; i< list.size(); i++){
            int val = new Random().nextInt(3);
            switch (val){
                case 0 -> team.add(new Monk());
                case 1 -> team.add(new Archer());
                case 2 -> team.add (new rouge());

            }
        }
        list2.add(mnan.values()[new Random().nextInt(mnan.values().length)]);

        if (list.get(0) instanceof Archer) ((Archer)list.get(0).fire);
        if (list.get(0) instanceof Monk) ((Monk)list.get(0).castMana);
    }
    private String getName(){
        String s = Name.values() [new Random().nextInt((Names.values().lenght))];
        retur s;
    }
}