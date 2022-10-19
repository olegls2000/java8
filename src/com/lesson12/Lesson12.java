package com.lesson12;

import com.lesson10hw.*;

public class Lesson12 {
    public static void main(String[] args) {
        final AutoSalon amserv = new AmservAutoSalon(500000l);
        amserv.report();
        final Track track1 = new Track(2005, 6, Manufacturer.BMW, 1_000);
        final Track track2 = new Track(2005, 6, Manufacturer.BMW, 2_000);

        try {
            amserv.bayCar(track1);
            amserv.bayCar(track2);
            amserv.sellCar(1);
            amserv.sellCar(0);
        } catch (BalanceException exception) {

            sendWarningEmailToAccountant(exception.getBalance());

        } catch (ParkingException exception) {

            sendWarningEmailToParking(exception.getSlotsCount());

        } catch (Exception commonEx) {
            System.out.println("Handling for more common Exceptions!!!");
        } finally {
            amserv.report();
        }

        testMethod();

        // String!!!!!
        String strA = new String("Hello");
        String strB = new String("Hello");
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(strA == strB);      //false

        System.out.println(strA.equals(strB)); //true

        System.out.println(str1 == str2);      //true

        String summary = str1 + " my " + "friend. I'll come at: " + (8 + 1 > 9 - 1) + " p.m.";
        System.out.println(summary);

        String toMutate = "Want";
        String resultString = toMutate.concat(" to see ..");
        System.out.println(resultString);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Want");
        stringBuffer.append(" ");
        stringBuffer.append("to see");
        stringBuffer.append(" ..");
        stringBuffer.append(" ");
        System.out.println(stringBuffer.toString());


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Want");
        stringBuilder.append(" ");
        stringBuilder.append("to see");
        stringBuilder.append(" ..");
        stringBuilder.append(" ");
        System.out.println("from StringBuilder: " + stringBuffer.toString());

        System.out.println(track1);
        System.out.println(track2);

        String testString = "Hello my friend. Where are you?";
        testString = testString.replace(".", " ");
        testString = testString.replace("?", " ");
        String[] splittedString = testString.split(" ");
        System.out.println(splittedString.length);




    }

    private static void sendWarningEmailToParking(int places) {
        System.out.println("We occupied " + places + "places");
    }

    private static void sendWarningEmailToAccountant(long restBalance) {
        System.out.println("We have only" + restBalance + " EUR");
    }

    private static int testMethod() {
        try {
            System.out.println("Hello");
            return 0;
        } catch (Exception e) {

        } finally {
            System.out.println("Hello from finally");
        }
        return 0;
    }
}
