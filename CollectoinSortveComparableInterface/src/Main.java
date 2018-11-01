
import java.util.*;

class Player implements Comparable<Player> {

    private String isim;

    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "|||| ID: " + id + " İsim :" + isim + " |||";

    }

    @Override
    public int compareTo(Player player) {

        if (this.id < player.id) {

            return -1;

        } else if (this.id > player.id) {
            return 1;

        }
        return 0;

    }

}

public class Main {

    public static void main(String[] args) {

        List<Player> list_player = new ArrayList<Player>();

        list_player.add(new Player("Ali", 5));
        list_player.add(new Player("Emre", 1));
        list_player.add(new Player("Oguz", 10));
        list_player.add(new Player("Yusuf", 4));

        Player p1 = new Player("Ali", 5);
        Player p2 = new Player("Yusuf", 4);

        Set<Player> treeSet = new TreeSet<Player>();

        treeSet.add(new Player("Ali", 5));
        treeSet.add(new Player("Emre", 1));
        treeSet.add(new Player("Oguz", 10));
        treeSet.add(new Player("Yusuf", 4));

        for (Player p : treeSet) {

            System.out.println(p);
        }
    }

}
