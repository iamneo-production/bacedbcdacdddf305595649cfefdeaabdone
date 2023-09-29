public class Student {
    private int stdentId;
    private String firstName;
    private String lastName;
    public Student(){}
    
    
    
    
    public Student(int stdentId, String firstName, String lastName)
    {
        this.stdentId=stdentId;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public int getStudentId(){
        return stdentId;
    }
    public void setStudentId(int stdentId){
        this.stdentId=stdentId;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastname;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }


}
