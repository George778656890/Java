//Array Processing
public class Lab10_1 {

    public static void main(String args[]) {

        //reserve some spaces for variables
        int min;
        int[] sampleArray = {1, 3, 8, 10, 12, 11,16,19,21};
        int[] gapArray = new int[sampleArray.length - 1];

        System.out.println("Array Processing");
        System.out.println();

        //print sampleArray values
        System.out.print("List is :");
        for (int value : sampleArray) {
            System.out.printf("%4d", value);
        }
        System.out.println("\n");

        //calculate gaps and store them in gapArray
        int gapIndex = 0;
        for (int i = 1; i <= sampleArray.length - 1; i++) {
            gapArray[gapIndex++] = sampleArray[i] - sampleArray[i - 1];
        }

        //print values of gapArray and find minimum
        min = gapArray[0];
        for (int j = 1; j < gapArray.length; j++) {

            if (gapArray[j] < min) {
                min = gapArray[j];
            }

            System.out.printf("Gap " + (j + 1) + " :" + "%4d", gapArray[j]);
            System.out.println("\n");
        }

        //judge whether array is sorted
        if (min < 0) {
            System.out.println("This array is NOT sorted");
        } else {
            System.out.println("This array is sorted");
        }
    }
}
