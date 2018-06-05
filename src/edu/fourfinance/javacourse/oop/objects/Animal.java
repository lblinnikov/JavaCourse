package edu.fourfinance.javacourse.oop.objects;

/*

Design a class Animal, having a constructor with a String argument denoting what sound can that animal make.// DONE
Further, equip the class with a sound() method, which prints a sound of that animal to the console.        // DONE
Then create an array of at least five Animal objects and fill it with different instances (and different sounds).
Loop over the array and call the sound() method on each element.

 */

class Animal {

    private String sound;
    private String animal;

    Animal(String animal, String sound) {
        this.sound = sound;
        this.animal = animal;
    }

    void sound() {
        System.out.println(animal + " says: \"" + sound + "\"!");
    }

}
