package com.example.labb2;

public class Human {
    int age;
    int hp;
    boolean live;

    public Human(int age, int hp, boolean live) {
        this.age = age;
        this.hp = hp;
        this.live = live;
    }

    @Override
    public String toString() {
        if(live) {
            return "My age " + age + "My hp" + hp;
        }
        else{
            return "I am dead";
        }
    }
    void checkHP(Head a,Leg b,Hand c){
        if(a.hp*b.hp*c.hp>0){
            if(this.hp>0){
                age++;
            }
        }
        else live=!live;
    }

    static class Head{
        int hp;

        public Head(int hp) {
            this.hp = hp;
        }
        void headshot(int damage){
            hp-=damage;

        }
    }

    static class Hand{
        int hp;
        public Hand(int hp) {
            this.hp = hp;
        }
        void handshot(int damage){
            hp-=damage;
        }
    }
    static class Leg{
        int hp;
        public Leg(int hp) {
            this.hp = hp;
        }
        void legshot(int damage){
            hp-=damage;
        }
    }



}

