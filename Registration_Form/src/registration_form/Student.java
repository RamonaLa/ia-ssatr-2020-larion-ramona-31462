/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package registration_form;

/**
 *
 * @author Ramol
 */
public class Student {
    private String id;
    private String name;
    private String phone;
    private String email;
    private String dept;
    private String fname;
    private String address;
    
    public Student(String id, String name, String phone, String email, String dept, String fname, String address){
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.dept=dept;
        this.fname=fname;
        this.address=address;
    }
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String Email){
        this.email=email;
    }
    public String getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public String getFname(){
        return fname;
    }
    public void setFname(String fname){
        this.fname=fname;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    
}
