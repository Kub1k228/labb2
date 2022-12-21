package com.example.labb2;

public class HumanTest {
    public static void main(String[] args) {
        Human jc =new Human(25,100,true);
        Human.Head jcHead =new Human.Head(100);
        Human.Hand jcHand =new Human.Hand(100);
        Human.Leg jcLeg =new Human.Leg(100);
        System.out.println(jc);
        jcHead.headshot(100);
        jc.checkHP(jcHead,jcLeg,jcHand);
        System.out.println(jc);
    }
}
