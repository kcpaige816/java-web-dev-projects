package org.launchcode

import java.util.HashMap;
import java.util.Map;

public class CharacterCount
        {
            //
            public static void main(String[] args)
                string quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                        "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of " +
                        "the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there."

                        char[] charArray = quote.toCharrArray();

            HashMap<Character, Integer> Counts = new HashMap<>();

            for (char letter : charrArray)
            {
                if(Counts.containsKey(letter))
                {
                    Counts.put(letter, Counts.get(letter) + 1)
                } else {
                    counts.put(letter, 1)
                }
            }

            for(Map.entry<character, Integer> count :Counts.entrySet())
            {
                system.out.print(count.getKey() + " : " + count.getValue());
            }

        }