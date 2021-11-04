package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String totalTop = "";
        String topInput;
        int freeTop;
        boolean loop = true;
        Scanner input = new Scanner(System.in);
        String size;
        float totalPrice = (float) 0;

        do {

            System.out.println("What size pizza would you like? Small-(£7.99), Medium-(£10.99), Large-(£13.99)");
            size = input.nextLine();
            size = size.toLowerCase(Locale.ROOT);

            if ( size.equals("s") || size.equals("small") ) {
                totalPrice = totalPrice + (float) 7.99;
                size = "small";
                break;
            }
            if ( size.equals("m") || size.equals("medium") ) {
                totalPrice = totalPrice + (float) 10.99;
                size = "medium";
                break;
            }
            if ( size.equals("l") || size.equals("large") ) {
                totalPrice = totalPrice + (float) 13.99;
                size = "large";
                break;
            }
            if ( size.equals("end") || size.equals("none") || size.equals("no") ) {
                System.out.println("You have not chosen a pizza size.");
            } else {
                System.out.println("Please enter an available size.");
            }

        } while (loop);

        System.out.println("Current pizza price: £" + totalPrice);

        for (freeTop = 2; freeTop > 0; freeTop--) {

            System.out.println("The available toppings are: extra cheese, pepperoni, mushroom, sausage, onion, olives, pepper. (Type 'none' or 'end' to checkout.)");
            System.out.println("You have " + freeTop + " free topping(s) left.");
            System.out.println("What topping would you like? ");
            topInput = input.nextLine();
            topInput = topInput.toLowerCase(Locale.ROOT);

            if (
               ( topInput.equals("none") || topInput.equals("end") || topInput.equals("no") )
               &&
               (freeTop == (int) 2)
               )
            {
                System.out.println("You have ordered a " + size + " margherita pizza. Price: £" + totalPrice);
                break;
            } else if (topInput.equals("none") || topInput.equals("end") || topInput.equals("no") ) {
                System.out.println("You have ordered a " + size + " pizza with" + totalTop + ". Price: £" + totalPrice);
                break;
            } else if (topInput.equals("extra cheese")
                    || topInput.equals("cheese")
                    || topInput.equals("pepperoni")
                    || topInput.equals("mushroom")
                    || topInput.equals("mushrooms")
                    || topInput.equals("sausage")
                    || topInput.equals("sausages")
                    || topInput.equals("onion")
                    || topInput.equals("onions")
                    || topInput.equals("olive")
                    || topInput.equals("olives")
                    || topInput.equals("pepper")
                    || topInput.equals("peppers")
            )
            {
                totalTop = totalTop + " " + topInput;
                System.out.println("Current toppings:" + totalTop);
            } else {
                System.out.println("This topping is not available, please enter an available topping.");
                freeTop++;
            }
        }

        while (loop) {
            System.out.println("The available toppings are: extra cheese, pepperoni, mushroom, sausage, onion, olives, pepper. (Type 'none' or 'end' to checkout.)");
            System.out.println("Any topping costs £1.25");
            System.out.println("What topping would you like? ");
            topInput = input.nextLine();
            topInput = topInput.toLowerCase(Locale.ROOT);

            if (topInput.equals("none") || topInput.equals("end") || topInput.equals("no") ) {
                System.out.println("You have ordered a " + size + " pizza with" + totalTop + ". Price: £" + totalPrice);
                break;
            } else if (  topInput.equals("extra cheese")
                || topInput.equals("cheese")
                || topInput.equals("pepperoni")
                || topInput.equals("mushroom")
                || topInput.equals("mushrooms")
                || topInput.equals("sausage")
                || topInput.equals("sausages")
                || topInput.equals("onion")
                || topInput.equals("onions")
                || topInput.equals("olive")
                || topInput.equals("olives")
                || topInput.equals("pepper")
                || topInput.equals("peppers")
                ) {
                    totalPrice = totalPrice + (float) 1.25;
                    totalTop = totalTop + " " + topInput;
                    System.out.println("Current toppings:" + totalTop);
                } else {
                    System.out.println("This topping is not available, please enter an available topping.");
            }
        }
    }
}
