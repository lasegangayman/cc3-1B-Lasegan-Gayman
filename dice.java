/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPG;

/**
 *
 * @author m304user
 */
import java.util.Random;
import java.util.Scanner;

public class dice
{
    public static void main(String []args)
    {
        Random dice = new Random();
        Scanner input = new Scanner(System.in);
        int faces;
        int result;

        System.out.println("Dice Roller\n");
        System.out.println("How many faces does the dice have?");
        faces = input.nextInt();
        result = dice.nextInt(faces) + 1;
        System.out.println("\nThe dice rolled a " + result + ".");
    }
}