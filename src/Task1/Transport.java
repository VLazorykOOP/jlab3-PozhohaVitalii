package Task1;

public class Transport {
    enum typeOfSpace{
        Air,
        Water,
        Ground,
        underGround
    };
    public int numbOfHorsePower;
    public typeOfSpace paramA;
    public String transportPurpose;
    public void Show(){
        System.out.println("HorsePower: " + numbOfHorsePower +"   "+ "Space: " + paramA + "   " + "Purpose: " + transportPurpose);
    }
    public Transport(){
        transportPurpose  = "passenger transportation";
        paramA = typeOfSpace.Ground;
        numbOfHorsePower = 250;
    }

}
