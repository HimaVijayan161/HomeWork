package home.practice.java.immutable;

public class SimpleTest {

    static int test;
    boolean final1()
    {
        test++;
        return true;
    }

    public static void main(String[] args)
    {
        test=0; 
        if ((final1() | fina1()) || final1()) 
            test++; 
        System.out.println(test); 
    }
}