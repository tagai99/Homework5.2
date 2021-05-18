package com.company;

public class Main {

    public static Hero[] createHeroes(){
        Hero Hulk = new Hero(1000,900);
        Hero IronMan = new Hero(700,900);
        Hero Thor = new Hero(1000,1000,"Thunder!!!");

        Hero[] heroes =  {Thor, Hulk, IronMan};
        return heroes;
    }

    public static void main(String[] args) {
        Boss Loki = new Boss(700, 500, "Tricky.");
        System.out.println(Loki.getHealth() + " " + Loki.getDamage() + " " + Loki.getDefence());

        Hero[] listOfHeroes = createHeroes();
        for (int i = 0; i < listOfHeroes.length; i++) {
            if (listOfHeroes[i].getPower() == null){
                System.out.println(listOfHeroes[i].getHealth() + " " + listOfHeroes[i].getDamage());
            }else {
                System.out.println(listOfHeroes[i].getHealth() + " " + listOfHeroes[i].getDamage() + " " + listOfHeroes[i].getPower());
            }
        }
    }

}
