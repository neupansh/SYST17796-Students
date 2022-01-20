/**
 * This class ++++Insert description here +++
 * @author Shushil
 */
public class StudentsArray {
    

    public static void main(String[] args) 
    {
       Students[] students = new Students[5];
       students[0] = new Students("Gabe");
       students[1] = new Students("Pranav");
       students[2] = new Students("Muhammad");
       students[3] = new Students("Lucas");
       students[4] = new Students("Chris");
       //Student s1 = new Student("Liz");
       //students[0] = s1;
       for(Students s: students)
       {
           System.out.println(s.getName());
       }
    }

}
