
package Model;

import java.time.LocalDate;



public class Voter {
    private int voterID;
    private String fullName;
    private String email;
    private String password;
    private LocalDate DOB;
    private String gender;
    private String citizenship;
    private String civilStatus;
    private String address;
    private String security_question;
    private String security_answer;
    
       
    public Voter(int voterID, String fullname, String email, String password, LocalDate DOB, String gender,
            String citizenship, String civilStatus, String address, String security_question, String security_answer){
        this.voterID = voterID;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.DOB = DOB;
        this.gender = gender;
        this.citizenship = citizenship;
        this.civilStatus = civilStatus;
        this.address = address;
        this.security_question = security_question;
        this.security_answer = security_answer;
    }
    
    public int getVoterID(){
       return voterID;
    }
    
    public void setVoterID(int voterID){
        this.voterID = voterID;
    }
    
    public String getFullName(){
        return fullName;
    }
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public LocalDate getDOB(){
        return DOB;
    }
    
    public void setDOB(LocalDate DOB){
        this.DOB = DOB;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public String getCitizenship(){
        return citizenship;
    }
    
    public void setCitizenship(String citizenship){
        this.citizenship = citizenship;
    }
    
    public String getCivilStatus(){
        return civilStatus;
    }
    
    public void setCivilStatus(String civilStatus){
        this.civilStatus = civilStatus;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getSecurity_Question(){
        return security_question;
    }
    
    public void setSecurity_Question(String security_question){
        this.security_question = security_question;
    }
    
    public String getSecurity_Answer(){
        return security_answer;
    }
    
    public void setSecurity_Answer(String security_answer){
        this.security_answer = security_answer;
    }
}
