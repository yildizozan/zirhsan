package com.yildizozan;

public class Main {

    public static void main(String[] args) {
        Armour armour = new Dec();
        armour = new Flamethrower(armour);
        armour = new AutoRifle(armour);
        armour = new AutoRifle(armour);
        armour = new RocketLauncher(armour);
        System.out.printf("%s %.0f TL and %.2f KG", armour.getDescription(), armour.cost(), armour.weight());
    }
}
