public class FlyingVehicles extends Transport{
    private int length;
    private int speed;

    public FlyingVehicles(String name, Colors color, String type,WhereWasProduced whereWasProduced, int length, int speed) {
        super(color, name, type, whereWasProduced);
        this.length = length;
        this.speed = speed;
    }


    public String transport(String type){
        return type;
    }
    final public String transport(){
       return "Flying transport";
    }


    public int getSpeed() {
        return speed;
    }

    public int getLength() {
        return length;
    }
    public String getInfo() {
        return super.getInfo() +
                "\nLenght: " + length + "m" +
                "\nSpeed: " + speed + "km/h";
    }

}
