 enum Day {
    monday,
    tuesday,
    wednesday,
    thrusday,
    friday,
    saturday,
    sunday
}


public class Enum1{
    public static void main(String[] args) {
        // Day today=Day.monday;
        for(Day days: Day.values()){
            System.out.println(days);
        }

    }
}