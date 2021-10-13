package se.systementor;

public class Question1 {

    public int smallestNumber(int tal1, int tal2, int tal3){
        if(tal1 > tal2 && tal1 > tal3)
            return tal1;
        if(tal2 > tal1 && tal2 > tal3)
            return tal2;
        return tal3;
    }

    public void run(){
        System.out.println("Input the first number:");
        int tal1 = Integer.parseInt(System.console().readLine());
        System.out.println("Input the Second number:");
        int tal2 = Integer.parseInt(System.console().readLine());
        System.out.println("mata in tal 3");
        int tal3 = Integer.parseInt(System.console().readLine());
        int tal = smallestNumber(tal1,tal2,tal3);
        System.out.println("Smallest is " + tal);
    }
}
