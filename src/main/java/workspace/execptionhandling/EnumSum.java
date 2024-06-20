package workspace.execptionhandling;
//Enums
//}
//enum Weekdays{
//    monday. tuesday,web, thrus,fri, sat,sun
//}
enum Directions{
    EAST,
    WEST,
    NORTH,
    SOUTH
}


//An enum is a speacial class that represents a group of constants
public class EnumSum {
//    float PI= 3.14F;
//    public void  displayConstant(){
//        System.out.println(PI++);
//    }
//    public static void main(String[] args) {
//        EnumSum e = new EnumSum();
//        e.displayConstant();
//    }
public static void main(String[] args) {
    Directions dir1= Directions.EAST;
    Directions dor2 = Directions.NORTH;
    System.out.println(dir1);
    System.out.println(dor2);
//    for(Directions dir:Directions.values()){
//        System.out.println(dir);
//    }
    if(dor2== Directions.EAST){
        System.out.println("The direction is east");
    }else if(dor2==Directions.NORTH){
        System.out.println("the direction is  north");
    }else if(dor2==Directions.SOUTH){
        System.out.println("the direction is  north");
    }else{
        System.out.println("the direction is west");
    }
}

}
//enum icecreamsize{
//    small,medium,large
//}

