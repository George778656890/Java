//Task 1- Static Methods

class Test1 {
    //data fields

    //no-args constructor
    public Test1() {
    }

    public static void printMat(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != 0) {
                    System.out.print(data[i][j]);
                }
            }
            System.out.println();

        }
    }

    public static void flipMatRows(int[][] data) {
        int maxColumn = 0;
        for (int i = 0; i < data.length; i++) {//find the max length of column
            if (maxColumn < data[i].length) {
                maxColumn = data[i].length;
            }
        }
        int[][] tmp = new int[data.length][maxColumn];//new two-dimensional array 
        int rowControl = data.length - 1;
        for (int i = 0; i < data.length; i++, rowControl--) {//deep copy from data[][] to tmp[][]
            for (int j = 0; j < data[i].length; j++) {
                tmp[rowControl][j] = data[i][j];
            }
        }
        printMat(tmp);
    }

    public static void flipMatCols(int[][] data) {
        int tmp;
        for (int i = 0; i < data.length; i++) {
            int rowRightControl = data[i].length - 1;
            for (int j = 0; j < data[i].length / 2; j++, rowRightControl--) {
                tmp = data[i][j];
                data[i][j] = data[i][rowRightControl];
                data[i][rowRightControl] = tmp;
            }
        }
        printMat(data);
    }

    public static int binarySearch(char[] sortedArray, char K_target) {
        int left = 0;
        int right = sortedArray.length - 1;
        int location = -1;
        int m;

        while (left <= right) {
            m = (left + right) / 2;
            if (sortedArray[m] == K_target) {
                location = m;
                break;//exit the loop when matching
            } else if (K_target < sortedArray[m]) {
                right = m - 1;
            } else {
                left = m + 1;
            }
        }

        if (location == -1) {
            return -1;
        } else {
            return location;
        }
    }
}

public class StaticMethods {

    public static void main(String[] args) {
        int[][] d = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6, 7}, {3, 4, 5, 6}, {4, 5, 6, 7}};
        char[] a={'a','b','e','f'};

        // Test1.printMat(d);
        //Test1.flipMatRows(d);
        //Test1.flipMatCols(d);
        
        //int place1 =Test1.binarySearch(a,'f');
        //System.out.println(place1);
        //int place2 =Test1.binarySearch(a,'c');
        //System.out.println(place2);
       
    }
}
