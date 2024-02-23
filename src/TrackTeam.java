import java.sql.Array;
import java.util.ArrayList;

public class TrackTeam {
    public static void main(String[] args) {
        ArrayList<Coach> coaches = new ArrayList<Coach>();
        ArrayList<Thrower> throwers = new ArrayList<Thrower>();

        //Create objects
        Coach c1 = new Coach("Emory", "George", "Throws", false);
        Coach c2 = new Coach("John", "Jarvis", "Distance", true);

        Thrower t1 = new Thrower("Jason", "Ocampo", 12, 1000000, 31, 97);
        Thrower t2 = new Thrower("Dalton", "Sali", 12, 0, 27, 86);

        //Add objects to coaches ArrayList
        coaches.add(c1);
        coaches.add(c2);

        throwers.add(t1);
        throwers.add(t2);

        //Display
        System.out.println("Track Coaches:");
        for(Coach c: coaches){
            System.out.println(c);
            System.out.println("\n--------------------------");
        }
        System.out.println("Throwers: ");
        for(Thrower t: throwers){
            System.out.println(t);
            System.out.println("\n----------------------");
        }

        //Outputs
        System.out.println(c1); // Automatically finds to-string
        System.out.println();
        System.out.println(c2);

        //Returns first name, extends person class for method
        System.out.println(c1.getFirstName());

        //Create player object
        Athlete p1 = new Athlete("Jason", "Ocampo",
                12, 10000);
        p1.addEvent("Shot Put");
        p1.addEvent("Discus");
        System.out.println(p1);
    }
}
