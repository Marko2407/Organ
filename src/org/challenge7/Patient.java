package org.challenge7;

public class Patient {
    private String name;
    private  int age;
    private  Eye lefEye;
    private  Eye rightEye;
    private  Heart heart;
    private Stomach stomach;
    private  Skin skin;

    public Patient(String name, int age, Eye lefEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.lefEye = lefEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }


    public Eye getLefEye() {
        return lefEye;
    }


    public Eye getRightEye() {
        return rightEye;
    }



    public Heart getHeart() {
        return heart;
    }



    public Stomach getStomach() {
        return stomach;
    }



    public Skin getSkin() {
        return skin;
    }

}
