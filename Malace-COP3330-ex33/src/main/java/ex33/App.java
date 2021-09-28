package ex33;
import java.util.*;
import java.util.Random;
/*
 *  UCF COP3330 Fall 2021 Assignment 33 Solution
 *  Copyright 2021 Jose Malave
 */
public class App 
{
    public static void main( String[] args )
    {
        Random rand = new Random();

        Scanner in  = new Scanner(System.in);
        String[] strArray = {"Yes", "No", "Maybe", "Ask again later"};
        System.out.println( "What's your question? \n >"  );
        String ans = in.nextLine();
        int int_random = rand.nextInt(3);
        System.out.println(strArray[int_random]);




    }
}
