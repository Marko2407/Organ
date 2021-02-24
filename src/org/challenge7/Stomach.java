package org.challenge7;

public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }
public void digest(){
    System.out.println("Digesting Begin");
}
    @Override
    public void getDetails() {
        super.getDetails();

         if (this.isEmpty()){
        System.out.println("Need to be fed");
         } else {
        System.out.println("stomach is full");
        }

    }

    public boolean isEmpty() {
        return isEmpty;
    }


}
