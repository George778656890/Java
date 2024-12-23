//Bean falling simulator
import java.util.Scanner;
public class GaltonBox {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        //reserve some spaces for variables
        int num_Ball;
        int num_Slot;
        
        
       System.out.print("Enter the number of balls to drop            : ");
       num_Ball=input.nextInt();
       
       System.out.print("Enter the number of slots in the bean machine: ");
       num_Slot=input.nextInt();
       System.out.println();
       
       //create an array to store falling information
       char[][] slot=new char[num_Slot][num_Ball];
       
       //generate random number to fill the array
       for(int i=0;i<slot[0].length;i++){//Column control
            for(int j=0;j<slot.length-1;j++){//Row control
                double tmp=Math.random();
                if(tmp<=0.5){     //Translate 50% into: 0.0~0.5--->L,otherwise--->R
                    slot[j][i]='L';
                }
                else{
                    slot[j][i]='R';
                }
            }
       }
       //print the pattern of array
       for(int i=0;i<slot[0].length;i++){//Column control
            for(int j=0;j<slot.length-1;j++){//Row  control
                System.out.print(slot[j][i]);
            }
            System.out.println();
       }
       
       //Count the amount of R and find the biggest of R
       int maxR=0;
       int tmp2;
       int[] tmp=new int[num_Ball];
       
      
       for(int i=0;i<slot[0].length;i++){//Column control
           tmp2=0;
            for(int j=0;j<slot.length-1;j++){//Row control
                if(slot[j][i]=='R'){
                    tmp2++;
                }
                
            }
            tmp[i]=tmp2;//store the amount of R in this array temporarily
           if(tmp2>maxR){
               maxR=tmp2;
           }
       }
       
       //set up another array to sum the amount
       int[] tmp_sum=new int[maxR+1];
       for(int i=0;i<tmp.length;i++){
           tmp_sum[tmp[i]]++;
       }
       //find the biggest amount of columu appearance
       int max=0;
       for(int i=0;i<tmp_sum.length;i++){
           if(tmp_sum[i]>max){
               max=tmp_sum[i];
           }
       }
       
       
       //Use maxR as Row number to construct a two-dimensional array
       char[][] histogram=new char[max][tmp_sum.length];
       
             
        //assign values based on the information of array tmp
        for(int i=0;i<tmp_sum.length;i++){//Column control
            if(tmp_sum[i]>0){
                for(int j=max-1;j>max-1-tmp_sum[i];j--){//Row control
                    histogram[j][i]='*';
                }
            }
       }
       
       for(int i=0;i<histogram.length;i++){
            for(int j=0;j<histogram[i].length;j++){
                if(histogram[i][j]=='*'){
                    System.out.print(0);
                }
                else{
                  System.out.print(" ");
                }
              //  System.out.print("|");
            }
            System.out.println();
       }
}      
}