package com.company;

import java.util.*; // imports

public class Main {

    public static void main(String[] args) {
	// write your code here

        String totalTop = ""; // will hold the string of the toppings that the user has
        String topInput; // will hold the input of the user when asked for a topping
        int freeTop; // stores how many free toppings the user has left
        boolean loop = true; // variable used to run a loop
        Scanner input = new Scanner(System.in); // scanner object called input
        String size; // stores the size of the pizza. small/medium/large
        float totalPrice = 0.0f; // holds the total price of the pizza. Pizza size + toppings

        do {

            System.out.println("What size pizza would you like? Small-(£7.99), Medium-(£10.99), Large-(£13.99)");
            size = input.nextLine();
            size = size.toLowerCase(Locale.ROOT);

            if ( size.equals("s") || size.equals("small") || size.equals("£7.99") || size.equals("£799") || size.equals("7.99") || size.equals("799")) {
                totalPrice = totalPrice + (float) 7.99;
                size = "small";
                break;
            }
            if ( size.equals("m") || size.equals("medium") || size.equals("£10.99") || size.equals("£1099") || size.equals("10.99") || size.equals("1099")) {
                totalPrice = totalPrice + (float) 10.99;
                size = "medium";
                break;
            }
            if ( size.equals("l") || size.equals("large") || size.equals("£13.99") || size.equals("£1399") || size.equals("13.99") || size.equals("1399") ) {
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
               (freeTop == 2)
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

        //HashMap<String, Float> toppings = new HashMap<String, Float>();
        //toppings.put("extra cheese", 1.2f);

        // get user input
        // toppings.get(what they put,

        // true = true
        // false = null
        // if (toppings.get("extra cheese") == )

        while (loop) {
            System.out.println("The available toppings are: extra cheese, pepperoni, mushroom, sausage, onion, olives, pepper. (Type 'none' or 'end' to checkout.)");
            System.out.println("Any topping costs £1.25");
            System.out.println("What topping would you like? ");
            topInput = input.nextLine();
            topInput = topInput.toLowerCase(Locale.ROOT);

            if (topInput.equals("none") || topInput.equals("end") || topInput.equals("no") ) {
                System.out.printf("You have ordered a %s pizza with %s: Price: £%.2f\n", size, totalTop, totalPrice);
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
