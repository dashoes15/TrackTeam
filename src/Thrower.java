public class Thrower extends Athlete{
    //Attributes
    private double discusPR;
    private double shotPR;

    //Constructor
    public Thrower(String firstName, String lastName,
                   int gradeLevel, int pointsEarned, double shotPR, double discusPR){
        super(firstName, lastName, gradeLevel, pointsEarned);
        addEvent("Shot Put");
        addEvent("Discus");
        setDiscusPR(discusPR);
        setShotPR(shotPR);
    }

    //Mutators
    public void setShotPR(double shotPR){
        if (shotPR >= 0 && shotPR <= 80) {
            this.shotPR = shotPR;
        }else{
            this.shotPR = 0;
        }
    }
    public void setDiscusPR(double discusPR){
        if (shotPR >= 0 && shotPR <= 230) {
            this.discusPR = discusPR;
        }else{
            this.discusPR = 0;
        }
    }
    //Accessors
    public double getDiscusPR(){
        return discusPR;
    }

    public double getShotPR() {
        return shotPR;
    }
    public String toString(){
        return super.toString() + "\nShot put PR: " +
                getShotPR() + "\nDiscus PR: " + getDiscusPR();
    }

}
