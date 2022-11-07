package com.lesson10hw;

public interface AutoSalon {
    long bayCar(AbstractCar car);

    long sellCar(int parkingPlace);

    /**
     *  метод выводящий на єкран отчет
     *  о состоянии автосалона список автомобилей и на каких они меслах, баланс.
     */
    void report();
}