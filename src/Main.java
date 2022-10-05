public class Main {
    public static void main(String[] args) {
        WhereWasProduced whereWasProduced=new WhereWasProduced("KG",2001);

        FlyingVehicles object1=new FlyingVehicles("Airplane",Colors.CAMO, "fly",whereWasProduced,50,200);
        System.out.println(object1.getInfo());
        System.out.println(object1.transport());
        System.out.println(object1.transport("Standard"));

        System.out.println("_________________________________");


        Airplane object2=new Airplane("Ak orgo22","fly",whereWasProduced, Colors.MILITARY,25,235, 80);
        System.out.println(object2.getInfo());
        System.out.println(object2.transport());
        System.out.println(object2.transport("Military"));

        System.out.println("_______________________________");


        Airplane object3=new Airplane("Kara orgo","fly",whereWasProduced,Colors.PINK,30,150);
        System.out.println(object3.getInfo());
        System.out.println(object3.transport());
        System.out.println(object3.transport("Standard"));
    }
}