//Drunkard’s walk

public class Lab9_1 {

    public static void main(String[] args) {

        //reserve some spaces for variables
        int index1 = 0, index2 = 0;//drunkard's location
        int randomDirection = 0;
        int cycle = 10;
        double totalDistance = 0;

        //display the column title to monitor
        System.out.println("Step  Direction   Location");

        for (int i = 1; i <= cycle; i++) {

            randomDirection = (int) ((Math.random()) * 4 + 1);

            //1--->North direction,index2+1
            if (randomDirection == 1) {
                index2++;
                System.out.printf("%2d" + "      NORTH    " + "( " + "%2d" + "," + "%2d" + " )", i, index1, index2);
                System.out.println();
            }

            //2--->East direction,index1+1
            if (randomDirection == 2) {
                index1++;
                System.out.printf("%2d" + "      EAST    " + " ( " + "%2d" + "," + "%2d" + " )", i, index1, index2);
                System.out.println();
            }

            //3--->South direction,index2-1
            if (randomDirection == 3) {
                index2--;
                System.out.printf("%2d" + "      SOUTH    " + "( " + "%2d" + "," + "%2d" + " )", i, index1, index2);
                System.out.println();
            }

            //4--->West direction,index1-1
            if (randomDirection == 4) {
                index1--;
                System.out.printf("%2d" + "      WEST    " + " ( " + "%2d" + "," + "%2d" + " )", i, index1, index2);
                System.out.println();
            }
        }

        System.out.println();

        //compute the distance
        double tmp = (double) (index1 * index1 + index2 * index2);
        totalDistance = Math.sqrt(tmp);

        //display the distance to monitor
        System.out.printf("Distance to lamp post = " + "%5.2f" + " steps", totalDistance);
        System.out.println();

    }
}
