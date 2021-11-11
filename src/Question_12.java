package JavaCoreHW.Q12PrintEven;

public class PrintEvenArray {

    public static void main(String[] args) {

        int arraySize = 100;
        int[] myArray = new int[arraySize];

        for(int i=0; i < myArray.length;i++){
            myArray[i]=i+1;  //add one because we want to just store the 1 -> 100
        }

        for (int even : myArray) {
            //if the value is divisible by two then its even
            if(even % 2 == 0)
            {
                System.out.println("Even: " +even);
            }
        }

    }
    //print the array sequence
    static void printArray(int myArray[])
    {
        //get array length
        int n = myArray.length;
        for (int i=0; i<n; ++i) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }




}