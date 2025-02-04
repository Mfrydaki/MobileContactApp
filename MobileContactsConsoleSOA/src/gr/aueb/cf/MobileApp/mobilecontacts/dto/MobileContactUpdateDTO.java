package gr.aueb.cf.MobileApp.mobilecontacts.dto;

public class MobileContactUpdateDTO extends BaseDTO {
    private String firstname;
    private String lastname;
    private String phoneNumber;

    public MobileContactUpdateDTO(){

    }

    public MobileContactUpdateDTO(Long id, String firstname, String lastname, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        setId(id);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
