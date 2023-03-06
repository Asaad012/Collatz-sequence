package CollatzSequence;/*
Asaad Al-Badi
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //getting the input from the user and save it in an arraylist
        ArrayList <Integer> input = new ArrayList<>();
        System.out.println("enter your input");
        int n = sc.nextInt();
        while(n!=0){
            input.add(n);
            n = sc.nextInt();
        }
        //printing the output
        for (int i = 0; i < input.size(); i++) {
            System.out.print(input.get(i)+" ");
            LongestColSeq(input.get(i));
            System.out.println();
        }

    }
    /*
    Par: the n number that will be as input
    set counter to 1 to save the length of the Collatz Sequence
    while n!=1 then two conditions one is for even and one for odd ns
    returns the length
     */
    public static int GenerateColSeq(int n){
        //System.out.print("The Collatz sequence for n = "+n+" is "+n);
        int count =1;
        while(n!=1){
            if (n%2 ==0){
                n = n/2;
                count++;
            }
            else if(n%2!=0){
                n = n*3+1;
                count++;
            }
        }
        return count;
    }
    /*
    Par nth value starting num
    int check is the longest number by default in order to compare it with
    GenColSeq which we created to save time instead of checking inside the method multiple times
    in only one per of looping.
    while n!=0 than decrement n and compare if curr starting number is bigger than prev
    if so then store it in the check and store the n value to the current n to print it
     */
    public static void LongestColSeq (int n){
        long startTime, endTime, executionTime;
        startTime = System.currentTimeMillis();
        int GenColSeq = GenerateColSeq(n); //to make it only one time and store the value to compare it this will save time
        int check = GenColSeq;
        int startingNum=n;
        while (n!=1){
            n--;
            GenColSeq = GenerateColSeq(n);
            if (GenColSeq > check){
                check = GenColSeq;
                startingNum = n;
            }
        }
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.print(startingNum+ " "+check +" " +executionTime);
    }
}
