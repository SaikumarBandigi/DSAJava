package practisetut;

import java.util.Arrays;

class JhanaviFather {

    void laddu() {
        System.out.println("JhanaviFather won");
    }

}

class Jhanavi extends JhanaviFather {

    @Override
    public void laddu() {
        System.out.println("Jhanavi won");
    }

    public void toy(){

    }
}

public class Example {
    public static void main(String[] args) {


        JhanaviFather obj = new Jhanavi();
        obj.laddu();


    }

}
