package edu.fourfinance.javacourse.oop.objects;

/*

Design a class Animal, having a constructor with a String argument denoting what sound can that animal make.// DONE
Further, equip the class with a sound() method, which prints a sound of that animal to the console.        // DONE
Then create an array of at least five Animal objects and fill it with different instances (and different sounds).
Loop over the array and call the sound() method on each element.

 */

class Animal {

    private String sound;

    Animal(String animal) {
        switch (animal) {
            case ("dog"):
                this.sound = "Woof";
                break;
            case "cat":
                this.sound = "Meow";
                break;
            case "cow":
                this.sound = "Moo";
                break;
            case "pig":
                this.sound = "Oink";
                break;
            case "sheep":
                this.sound = "Baa";
                break;
            default:
                sound = "*awkward silence*";
                break;
        }
    }

    void sound() {
        System.out.println(sound);
    }

}
