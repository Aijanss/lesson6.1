package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(400);
        boss.setDamage(50);
        boss.setSuperPower("Magic");
        System.out.println("Boss is health" + " = " + boss.getHealth());
        System.out.println("Boss is damage  " + " = " + boss.getDamage());
        System.out.println("Boss is super power " + " =  " + boss.getSuperPower());
        Weapon weapon = new Weapon("Magic Sword", "Ultra sword");
        boss.setWeapon(weapon);
        System.out.println(" Boss is weapon" + " " + boss.getWeapon().getWeaponName() + " " + "Boss is weapon type " + "" +
                "" + boss.getWeapon().getWeaponType());


        Hero Warrior = new Hero();
        Warrior.setHealth(300);
        Warrior.setDamage(100);
        Warrior.setSuperPower("Super strong");
        System.out.println(" Warrior  is health" + " = " + Warrior.getHealth());
        System.out.println(" Warrior  is damage  " + " = " + Warrior.getDamage());
        System.out.println(" Warrior  is super power " + " =  " + Warrior.getSuperPower());
        Weapon weapon2 = new Weapon("Gan", "Gun ");
        Warrior.setWeapon(weapon2);
        System.out.println(" Warrior is weapon" + "  " + Warrior.getWeapon().getWeaponName() + "  " + " Warrior weapon is name" + " " +
                Warrior.getWeapon().getWeaponType());


    }


}

