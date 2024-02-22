public class TrackTeam {
    public static void main(String[] args) {
        //Create coach objects
        Coach c1 = new Coach("Emory", "George", "Throws", false);
        Coach c2 = new Coach("John", "Jarvis", "Distance", true);

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
