package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person me = new Person("Dana", "Snellens", 'v', 35);
        Person birgit = new Person("Birgit", "Snellens", 'v', 63);
        Person nige = new Person("Nige", "Harle", 'm', 72);
        me.addParents(birgit, nige);
        System.out.println("The parents of " + me.getName() + " are " + me.getMother().getName() + " and " + me.getFather().getName());

        Pet diesel = new Pet("Diesel", 9, "Cane Corso", me);
/*        me.addPet(diesel);*/
        System.out.println(me.getPets() + " is " + me + "'s pet.");
    }
}