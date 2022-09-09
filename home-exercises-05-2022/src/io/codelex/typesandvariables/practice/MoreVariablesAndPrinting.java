package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

        String myName = "Zed A. Shaw";
        int age = 35;
        int height = 74;  // inches
        int weight = 180; // lbs
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";
        double heightInCm = height *2.54;
        double weightInLbs = Math.round(weight * 0.453592 * 100.0) / 100.0;

        System.out.println("Let's talk about " + myName + ".");
        System.out.println("He's " + heightInCm + " cm tall.");
        System.out.println("He's " + weightInLbs + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " +  age + ", " + heightInCm + ", and " + weightInLbs
                + " I get " + ( age + heightInCm + weightInLbs) + ".");
    }
}