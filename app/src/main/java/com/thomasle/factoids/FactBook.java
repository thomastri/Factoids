package com.thomasle.factoids;

import java.util.Random;

public class FactBook {

    private final String[] mMFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "There are more airplanes in the oceans than submarines in the sky.",
            "Cows have best friends.",
            "A group of butterflies is called a kaleidoscope.",
            "Otters hold hands while they sleep so they don't drift away.",
            "Kangaroos can't jump backwards.",
            "Elephants can move their skin to crush mosquitoes between their rolls.",
            "The dot over the i and j is called a tittle.",
            "Squirrels can purr like cats.",
            "A regulation golf ball has 336 dimples.",
            "Crows have accents depending on the region they come from.",
            "There are more public libraries than McDonald's in the US",
            "Blind people smile even though they have never seen anyone smile.",
            "The ice bucket challenge actually helped fund the discovery of a gene linked to ALS.",
            "Otters have a little pouch that they store food or their favorite rock in.",
            "Australia is wider than the moon.",
            "Russia spans 11 time zones. At one end of Russia it could be 7 in the morning and at the other it's 6 in the evening.",
            "If we all lived at the same population density as the people do in New York City, every single human on the planet would fit in the state of Texas.",
            "Maine is the closest state to Africa",
            "Monsters Inc was released closer to the fall of the Berlin wall than to the present day.",
            "The state of Maine has more Black Bears than black people.",
            "Nintendo existed at the same time as the Ottoman Empire.",
            "Pocahontas and William Shakespeare died less than a year apart less than 150 miles away from each other.",
            "Neutron stars are so dense that if you dropped a gummy bear from one meter away it would hit the surface in a microsecond with the force of 1,000 nuclear bombs."
    };

    // Returns a random fact
    public String getFact() {
        return mMFacts[new Random().nextInt(mMFacts.length - 1)];
    }
}
