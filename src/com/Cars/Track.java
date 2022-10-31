package com.Cars;

public class Track extends AbstractCar {

    public int load;

    public Track(){
        System.out.println("Hello from Track constractor");
    }
    public Track (int releaseDate,
                  int techState,
                  Manufacurer manufacurer,
                  int load) {
        super (releaseDate, techState, manufacurer);
        this.load = load;
    }

    public int getLoad(){
        return load;
    }
    public void setLoad(int load) {
        this.load = load;
    }

    public long evaluatePrice() {
        int carAge = LocalDate.now().getYear() - getReleaseDate();

        long price = carAge * 8 + super.getTechState() * 100;

        return price;
    }


//    грузоподьемность*КоэфГруза - возрастАвтомобиля*КоэфВозраста+техничСостояние*КоэфТехнСостояния

}
