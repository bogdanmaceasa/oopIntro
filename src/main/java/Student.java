public class Student extends Person{

    private String studentID;
    private boolean integralist;

    public Student(){
        // super();
        // age = 18
        // name = "not set"
        super(18,"not set");
        studentID = "no studentID assigned.";
        integralist = true;
    }
//
    public Student(String studentID){
//        super();
        this();
        this.studentID = studentID;
    }

    @Override
    public void getJobStatus() {
        System.out.println(super.getName() + " is a student. His/her main job is studying...");
    }

    @Override public void isEligibleForDriversLicense() {
        System.out.println(super.getName() + " is eligible for his/her full drivers license ");
    }

    @Override public void ticketPricing() {
        System.out.println(super.getName() + " is a student, ticket is free...");
    }

    // setters
    public void setStudentID(String id){
        // if method argument is name differently than the class attribute
        // "this" can be omitted
        studentID = id;
    }

    public void setIntegralist(boolean integralist){
        this.integralist = integralist;
    }

    //getters
    public String getStudentID(){
        return studentID;
    }

    public boolean isIntegralist(){
        return integralist;
    }

    @Override public String toString() {
        return "Student{" + "studentID='" + studentID + '\'' + ", integralist=" + integralist
            + " " + super.toString() + '}';
    }
}
