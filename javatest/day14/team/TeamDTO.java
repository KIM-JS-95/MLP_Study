package team;

public class TeamDTO {

    private int no;
    private String name;
    private String phone;
    private String email;
    private String skills;
    private String address;

    public TeamDTO(String name, String phone, String email, String skills, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.skills = skills;
        this.address = address;
    }

    public TeamDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "TeamDTO{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", skills='" + skills + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
