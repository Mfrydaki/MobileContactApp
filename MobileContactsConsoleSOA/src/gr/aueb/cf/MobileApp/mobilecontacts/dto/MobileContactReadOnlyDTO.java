package gr.aueb.cf.MobileApp.mobilecontacts.dto;

public class MobileContactReadOnlyDTO extends BaseDTO{
    private String firstname;
    private String lastname;
    private String phoneNumber;

    public MobileContactReadOnlyDTO(){

    }

    public MobileContactReadOnlyDTO(Long id,String firstname, String lastname, String phoneNumber, String firstname1) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.firstname = firstname1;
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
