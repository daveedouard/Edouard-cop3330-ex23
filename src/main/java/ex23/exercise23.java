/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex23;

import java.util.Scanner;

public class exercise23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String answer = input.nextLine();

        if(answer.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            String battery = input.nextLine();

            if(battery.equals("y")){
                System.out.print("Clean the terminals and try starting again.");
            }
            else if(battery.equals("n")){
                System.out.print("Replace cables and try again");
            }
        }
        else if(answer.equals("n")){
            System.out.print("Does the car make a slicking noise? ");
            String noise = input.nextLine();

            if(noise.equals("y")){
                System.out.print("Replace the battery.");
            }
            else if(noise.equals("n")){
                System.out.print("Does the car crank up but fail to start? ");
                String crank = input.nextLine();

                if(crank.equals("y")){
                    System.out.print("Check spark plug connections.");
                }
                else if(crank.equals("n")){
                    System.out.print("Does the engine start and then die? ");
                    String engine = input.nextLine();

                    if(engine.equals("y")){
                        System.out.print("Does you car have fuel injection? ");
                        String inject = input.nextLine();

                        if(inject.equals("y")){
                            System.out.print("Get it in for service.");
                        }
                        else if(inject.equals("n")){
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else if(engine.equals("n")){
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }
}
