public class Transport {
    private Colors color;
    private String name;
    private String type;

    private WhereWasProduced whereWasProduced;


    public Colors getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Transport(Colors color, String name, String type,WhereWasProduced whereWasProduced) {
        this.color = color;
        this.name = name;
        this.type = type;
        this.whereWasProduced=whereWasProduced;
    }

    public String getInfo(){
        return "Name: " + getName()+
                "\nType: " + getType()+
                "\nColor: " + getColor()+
                "\nCountry: " + whereWasProduced.getCountry()+
                "\nYear: " + whereWasProduced.getWhen();
    }

    public String transport(String type){
        return type;
    }
}
