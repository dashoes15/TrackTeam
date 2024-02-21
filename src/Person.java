public class Person {
    //Attributes
    private String firstName;
    private String lastName;

    //Constructors
    public Person(String firstName, String lastName){
        //Two different ways to do it
        setFirstName(firstName);
        this.lastName = lastName;

    }

    //Mutators (Setters) - Methods that change things (void)
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //Accessors (Getters) - public (datatype)
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return "Name: " + getFirstName() + " " + getLastName(); //can replace with attributes
    }
}
