package Task1;

import java.util.Scanner;

public class Train extends Transport{
    enum PurpInd{
        Passenger,
        Non_passenger
    }
    public PurpInd ParamB;
    public int numberOFWagons;
    public int cruiseSpeedInKmPearHour;
    public double waysLength;

    public void Show(){
            super.Show();
            System.out.println("Wagons: " +numberOFWagons +"   "+ "Pass/non_Pass: " + ParamB +"   "+ "Cruise speed: " + cruiseSpeedInKmPearHour + "   " + "Ways far: " + waysLength);

    }
    public Train (){
        transportPurpose = "cargo transportation";
        ParamB = PurpInd.Non_passenger;
        numberOFWagons = 12;
        cruiseSpeedInKmPearHour = 150;
        waysLength = 27.3;
    }

}
