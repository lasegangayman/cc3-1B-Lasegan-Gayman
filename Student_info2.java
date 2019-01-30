package kobe;
public class Student_info2 {
                                                                                                 
    public static void main(String[] args) {    
       Student_info Student1 = new Student_info ( "CITCS", "2nd Term", "SY 2018-2019");       
       
        //<object name>.<field/method name>;
       
       Student1.setIdNumber("18-5578-555");
       Student1.setFirstName("Jeptha");
       Student1.setLastName("Lasegan");
       Student1.setMajor("Computer Science");
       Student1.setAcademicProgram("BSCS ");
       
       Student1.print();
       
       
       
       Student_info Student2 = new Student_info( "CITCS", "2nd Term", "SY 2018-2019");       
       //<object name>.<field/method name>;
       
       
       Student2.setIdNumber("18-4354-705");
       Student2.setFirstName("Harlan");
       Student2.setLastName("Gayman");
       Student2.setMajor(" Network Security");
       Student2.college = ("CITCS ");
       Student2.setAcademicProgram("BSIT");
       Student2.term = ("2nd term");
       Student2.year = ("2018-2019");       
      
       Student2.print();
     
       
    }


}
