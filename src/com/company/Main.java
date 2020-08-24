package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(400);
        boss.setDamage(50);
        boss.setSuperPower("Magic");
        boss.setWeaponName(" Magic sward");
        boss.setWeaponType("Steel arms");
        System.out.println("Boss is health" + " = " + boss.getHealth());
        System.out.println("Boss is damage  " +" = "+ boss.getDamage());
        System.out.println("Boss is super power " + " =  " + boss.getSuperPower());
        System.out.println("Boss is weapon " + " = " + boss.getWeaponName());
        System.out.println("Weapon type" + "  " + " = " + boss.getWeaponType());

        Hero Kinetic= new Hero();
        Kinetic.setHealth(300);
        Kinetic.setDamage(100);
        Kinetic.setSuperPower("Kinetic");
        Kinetic.setWeaponName(" ");
        Kinetic.getWeaponType();
        System.out.println(" Kinetic is health" + " = " + Kinetic.getHealth());
        System.out.println(" Kinetic  is damage  " +" = "+Kinetic.getDamage());
        System.out.println(" Kinetic is super power " + " =  " + Kinetic.getSuperPower());
        System.out.println(" Kinetic is weapon " + " = " + Kinetic.getWeaponName());
        System.out.println(" Weapon type" + "  " + " = " + Kinetic.getWeaponType());


    }




}

