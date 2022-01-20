/**This class models student Objects. Students have a name and a student ID
 *
 * @author Shushil
 */
public class Students {

    private String name;
    private String studentID;

    public Students(String givenName) 
    {
        name = givenName;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String givenName) 
    {
        name = givenName;
    }

    public String getStudentID() 
    {
        return studentID;
    }

    public void setStudentID(String studentID) 
    {
        this.studentID = studentID;
    }
}
