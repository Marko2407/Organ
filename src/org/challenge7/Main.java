package org.challenge7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Marko", 21,
                new Eye("Left eye", "blindness", "Blue",true),
                new Eye("Right eye", "normal", "Blue",true),
                new Heart("heart","Healty",1200),
                new Stomach("stomach","fat",false),
                new Skin("skin","normal",20,"burned"));
        System.out.println("Name: "+ patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);
        boolean shouldFinish = false;

        while ( !shouldFinish){
            System.out.println("Choose an organ:" +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye"+
                    "\n\t3. Heart"+
                    "\n\t4. Stomach"+
                    "\n\t5. Skin"+
                    "\n\t6. Quit");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    patient.getLefEye().getDetails();
                    if (patient.getLefEye().isOpened()){
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt()==1){
                            patient.getLefEye().close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt()==1) {
                            patient.getLefEye().open();
                        }
                        else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened()){
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt()==1){
                            patient.getRightEye().close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt()==1) {
                            patient.getRightEye().open();
                        }
                        else {
                            continue;
                        }
                    }
                    break;

                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if (scanner.nextInt() ==1){
                        System.out.println("Enter the new heart rate");
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate changed to:"+ patient.getHeart().getRate());

                    } else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt()==1){
                        patient.getStomach().digest();

                    }else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;
                    break;
            }
        }
    }
}
