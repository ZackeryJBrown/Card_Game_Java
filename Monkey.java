public class Monkey extends Player {

    @Override
    public void attack(){             //I can initialize this attack method with any character to be able to set their attack strength
        int attack = 50;
        System.out.println(attack);       //The print statements are only their to make sure that the method works in main

    }

    @Override
    public void defense() {            //I can initialize this defense method with any character to be able to set their defensive strength
        int defense = 100;
        System.out.println(defense);
    }
}