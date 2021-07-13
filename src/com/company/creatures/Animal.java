package com.company.creatures;

import com.company.Human;

public abstract class Animal implements Feedable {

    final public String species;
    private Double weight;
    String name;
    public Animal(String species) {
        this.species = species;
    }

 /* public void sell(Human seller, Human buyer, Double price)
    {
        if (seller.pet != null)
        {
            if (buyer.cash >= price)
            {
                seller.cash += price;
                buyer.cash -= price;

                buyer.pet = seller.pet;
                seller.pet = null;

                System.out.println("Zwierzę zostało sprzedane za: " + price + "pieniędzy");
            }
        }
    }
*/
    public String toString(){
        return "species: "+species+"weight: "+weight+"name: "+name;
    }


    public Animal(Double weight, String species){
        this.species = species;

        switch(this.species){
            case "dog":
                this.weight = 10.2;
                break;
            case "cat":
                this.weight = 2.0;
                break;
            case "mouse":
                this.weight = 0.01;
                break;
            default:
                this.weight = 1.0;
        }
    }




    public void feed () {
        if (this.weight > 0) {

            this.weight *= 1.1;
            System.out.println("thx for food, my weight:" + this.weight);
        } else {
            //  System.out.println("teraz za pozno");
        }
    }




    void takeForWalk(){
        if(this.weight > 0){
            this.weight -= 1.0;
            System.out.println("thx, nice walk, my weight:" + this.weight);
        }else{
            System.out.println("nie mozna lazic z martwym zwierzakiem");
        }
    }


}