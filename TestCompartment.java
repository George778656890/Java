//Rail Coach Compartment

abstract class Compartment {

    protected Compartment() {
    }

    abstract public String notice();
}

class FirstClass extends Compartment {

    private String typeOfCompartment = "First Class";

    public FirstClass() {
    }

    public String getTypeOfCompartment() {
        return typeOfCompartment;
    }

    public void setTypeOfCompartment(String typeOfCompartment) {
        this.typeOfCompartment = typeOfCompartment;
    }

    @Override
    public String notice() {
        return typeOfCompartment;
    }
}

class Ladies extends Compartment {

    private String typeOfCompartment = "Ladies Class";

    public Ladies() {
    }

    public String getTypeOfCompartment() {
        return typeOfCompartment;
    }

    public void setTypeOfCompartment(String typeOfCompartment) {
        this.typeOfCompartment = typeOfCompartment;
    }

    @Override
    public String notice() {
        return typeOfCompartment;
    }
}

class General extends Compartment {

    private String typeOfCompartment = "General Class";

    public General() {
    }

    public String getTypeOfCompartment() {
        return typeOfCompartment;
    }

    public void setTypeOfCompartment(String typeOfCompartment) {
        this.typeOfCompartment = typeOfCompartment;
    }

    @Override
    public String notice() {
        return typeOfCompartment;
    }
}

class Luggage extends Compartment {

    private String typeOfCompartment = "Luggage Class";

    public Luggage() {
    }

    public String getTypeOfCompartment() {
        return typeOfCompartment;
    }

    public void setTypeOfCompartment(String typeOfCompartment) {
        this.typeOfCompartment = typeOfCompartment;
    }

    @Override
    public String notice() {
        return typeOfCompartment;
    }
}

public class TestCompartment {

    public static void main(String[] args) {

        Compartment[] array = new Compartment[10];

        for (int i = 0; i < array.length; i++) {

            int randomNumber = (int) ((Math.random() * 4) + 1);

            switch (randomNumber) {
                case 1:
                    array[i] = new FirstClass();
                    break;
                case 2:
                    array[i] = new Ladies();
                    break;
                case 3:
                    array[i] = new General();
                    break;
                case 4:
                    array[i] = new Luggage();
                    break;
                default:
                    System.out.println("Wrong generated random number ! ");
            }

            System.out.println(array[i].notice());
        }
    }
}
