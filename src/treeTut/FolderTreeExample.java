package treeTut;

import java.util.ArrayList;
import java.util.List;

class Folder {
    String name;
    List<Folder> children;

    Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    void add(Folder folder) {
        children.add(folder);
    }
}

public class FolderTreeExample {

    // Recursive function to print folder structure
    public static void printStructure(Folder root, String indent) {
        System.out.println(indent + root.name);

        for (Folder child : root.children) {
            printStructure(child, indent + "   ");
        }
    }

    public static void main(String[] args) {

        Folder root = new Folder("Root");

        Folder movies = new Folder("Movies");
        Folder music = new Folder("Music");

        Folder movie1 = new Folder("Race Gurram");
        Folder movie2 = new Folder("Pushpa");

        Folder song1 = new Folder("Sweety.mp3");
        Folder song2 = new Folder("down down duppa.mp3");


        root.add(movies);
        root.add(music);

        movies.add(movie1);
        movies.add(movie2);

        music.add(song1);
        music.add(song2);

        printStructure(root, "");
    }
}