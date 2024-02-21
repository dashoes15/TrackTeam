public class Coach extends Person{
    //Attributes
    private String title;
    private boolean headCoach; //Either head or assistant -> so boolean (T/F)

    //Constructors
    public Coach(String firstName, String lastName, String title, boolean headCoach){
        super(firstName, lastName);
        setTitle(title);
        this.headCoach = headCoach;
    }

    //Mutators
    public void setTitle(String title){
        this.title = title;
    }
    public void setHeadCoach(boolean headCoach){
        this.headCoach = headCoach;
    }

    //Accessors
    public String getTitle(){
        return title;
    }
    public boolean getHeadCoach(){
        return headCoach;
    }
    public String toString(){
        String s = "";
        s += super.toString() + "\nTitle: " + getTitle();
        if (getHeadCoach()) {
            s += "\nHead Coach";
        }else{
            s += "\nAssistant Coach";
        }
        return s;
    }
}
