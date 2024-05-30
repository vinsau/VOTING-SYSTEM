package Model;

import java.time.LocalDate;

public class VoterModel {

    private String fullName;
    private String email;
    private LocalDate DOB;
    private String gender;
    private String citizenship;
    private String civilStatus;
    private String address;
    private String security_question;
    private String security_answer;
    

    public VoterModel(String email, String fullName, String gender, String citizenship, String civilStatus, LocalDate DOB, String address, String security_question, String security_answer) {
        this.email = email;
        this.fullName = fullName;
        this.gender = gender;
        this.citizenship = citizenship;
        this.civilStatus = civilStatus;
        this.DOB = DOB;
        this.address = address;
        this.security_question = security_question;
        this.security_answer = security_answer;
       
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public String getGender() {
        return gender;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public String getAddress() {
        return address;
    }

    public String getSecurity_Question() {
        return security_question;
    }

    public String getSecurity_Answer() {
        return security_answer;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public void setDateOfBirth(LocalDate DOB) {
        this.DOB = DOB;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSecurityQuestion(String security_question) {
        this.security_question = security_question;
    }

    public void setSecurityAnswer(String security_answer) {
        this.security_answer = security_answer;
    }
}
