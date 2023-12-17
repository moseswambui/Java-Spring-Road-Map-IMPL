package OOP.BookOOPExample;

public class Artist extends User{
    private String fullName;
    private String region;
    private String dateOfBirth;

    // Constructor
    public Artist(String username, String password, String email, String phone,
                  String fullName, String region, String dateOfBirth) {
        super(username, password, email, phone);
        this.fullName = fullName;
        this.region = region;
        this.dateOfBirth = dateOfBirth;
    }

    //POLYMORPHISM
    @Override
    public void displayUserType() {
        System.out.println("Artist");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
