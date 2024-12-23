//abstract class Instrument

abstract class Instrument {

    protected Instrument() {
    }

    abstract public String play();
}

class Piano extends Instrument {

    String sound = "Piano is playing tan tan tan tan ";

    public Piano() {
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String play() {
        return sound;
    }

}

class Flute extends Instrument {

    String sound = "Flute is playing toot toot toot toot";

    public Flute() {
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String play() {
        return sound;
    }
}

class Guitar extends Instrument {

    String sound = "Guitar is playing tin tin tin ";

    public Guitar() {
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String play() {
        return sound;
    }
}

public class Lab8_3 {

    public static void main(String[] args) {
        Instrument[] array = new Instrument[10];

        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) ((Math.random() * 3) + 1);

            switch (randomNumber) {
                case 1:
                    array[i] = new Piano();
                    break;
                case 2:
                    array[i] = new Flute();
                    break;
                case 3:
                    array[i] = new Guitar();
                    break;
                default:
                    System.out.println("Wrong generated random number !");
            }
            System.out.println(array[i].play());
        }
        
        System.out.println();
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Piano) {
                System.out.println("This piano object is stored at : " + i);
            } else if (array[i] instanceof Flute) {
                System.out.println("This Flute object is stored at : " + i);
            } else {
                System.out.println("This Guitar object is stored at : " + i);
            }
        }
    }
}
