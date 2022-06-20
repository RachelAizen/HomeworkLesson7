public class CarFactory {

    public Drivable getDrivable(String carType){
        if (carType == null){
            return null;}
        if(carType.equalsIgnoreCase("Fiat")){
            return new Fiat();}
        if(carType.equalsIgnoreCase("BMW")){
            return new BMW();}
        if (carType.equalsIgnoreCase("Porsche")){
            return new Porsche();}
        return null;
    }
}
