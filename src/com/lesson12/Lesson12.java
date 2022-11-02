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
        }

        catch (BalanceException exception) {

            sendWarningEmailToAccountant(exception.getBalance());

        }
        catch (ParkingException exception) {

            sendWarningEmailToParking(exception.getSlotsCount());

        }
        catch (Exception commonEx) {
            System.out.println("Handling for more common Exceptions!!!");
        }
        finally {
            amserv.report();
        }

        testMethod();
    }

    private static void sendWarningEmailToParking(int places) {
        System.out.println("We occupied " + places + "places");
    }

    private static void sendWarningEmailToAccountant(long restBalance) {
        System.out.println("We have only" + restBalance + " EUR");
    }

    private static int testMethod(){
        try {
            System.out.println("Hello");
            return 0;
        } catch (Exception e){

        } finally {
            System.out.println("Hello from finally");
        }
        return 0;
    }
}
