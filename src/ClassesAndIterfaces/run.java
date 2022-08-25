package ClassesAndIterfaces;

public class run {

    public static void main(String[] args) {
        Alien alien = new Alien("al23", "James");

        IAlien iAlien = new Alien("al23", "James");

        iAlien.walk();
        iAlien.run();
    }
}
