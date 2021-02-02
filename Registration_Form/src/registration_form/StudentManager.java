/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package registration_form;

/**
 *
 * @author Ramol
 */
public class StudentManager {
    
    Student[] list = new Student[200];
    
    void addStudent(Student s){
        for(int i=0; i<list.length;i++){
            if(list[i]==null){
                list[i]=s;
                System.out.println("New student added.");
                return;
            }
        }
        System.out.println("No empty position found.");
    }
    
    String getDetailsOfStudents(){
        String details ="";
        for(Student s:list){
            if(s!=null){
                String line="Student id: " + s.getId()+ "\n Name: "+s.getName()+"\n Phone: "+ s.getPhone()+"\n Email: "+s.getEmail()+
                        "\n Department: "+s.getDept()+"\n Father's name: "+s.getFname()+"\n Address: "+s.getAddress()+"\n \n \n";
                details=details+line;
            }
        }
        return details;
    }
    
//    int getDetailsById( String studentId){
//        for(Student s:list){
//            if(s!=null && s.getId().equals(studentId))
//                return getDetailsOfStudents();
//        }
//        return -1;
//    }
   
    
}
