import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Student {


//    Attributes or Fields
    private String firstName;
    private String lastName;
    private String course;
    private ArrayList<String> languages;
    private final String country = "Germany";
    private boolean isHandRaised = false;
    static ArrayList<String> possibleCourses = new ArrayList<>(Arrays.asList("Java", "Web Dev", "Data"));


    //    constructor
//    is what we use to create the object
//    always the same name as the class
    public Student(String firstName, String lastName, String course, ArrayList<String> languages){
        System.out.println("Constructor method");
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.languages = languages;
    }

//    overloading the constructor method
    public Student(String firstName, String lastName, ArrayList<String> languages){
        this.firstName = firstName;
        this.lastName = lastName;
        this.languages = languages;
        this.course = "Pending";
    }



//    behavior: Methods

    public void changeHandRaise(){
        isHandRaised = !isHandRaised;
    }

//    Setters and Getters
//    are always public

//    getter
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getCourse(){
        return course;
    }

    public ArrayList<String> getLanguages(){
        return languages;
    }

    public String getCountry(){
        return country;
    }

    public boolean getIsHandRaised(){
        return isHandRaised;
    }

//    setters

    public void setFirstName(String firstName){
        if(!firstName.isEmpty()){
            this.firstName = firstName;
        }
        System.out.println("Please enter a valid first name");
    }

    public void setCourse(String course){

        if(possibleCourses.contains(course)){
            this.course = course;
        }
        System.out.println("Please enter either Java, Web Dev, or Data");
    }

    public static void addNewCourse(String course){
        if(!possibleCourses.contains(course)){
            possibleCourses.add(course);
        }
        System.out.println("Course already offered");
    }


    /*
       Exercise 1:
                  1. Create a setter for the course field
                  2. This setter should only allow the course to be updated if the value is of the following: {"Java", "Web Dev", "Data"}
                  3. If the user provides any other value than sout "Please enter either Java, Web Dev, or Data"

    */



}
