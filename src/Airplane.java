

final public class Airplane extends FlyingVehicles{
    private int capacity;

    public Airplane(String name,String type, WhereWasProduced whereWasProduced,
                    Colors color,int length,int speed,int capacity) {
        super(name,color , type, whereWasProduced, length, speed);
        this.capacity = capacity;
    }
    public Airplane(String name,String type, WhereWasProduced whereWasProduced,
                    Colors color,int length,int speed) {
        super(name,color , type, whereWasProduced, length, speed);

    }

    public int getCapacity() {
        return capacity;
    }

    public String getInfo(){
        if (capacity!= 0) {
            return super.getInfo() +
                    "\nCapacity: " + capacity;
        }else {
            return super.getInfo();
        }
    }

}
