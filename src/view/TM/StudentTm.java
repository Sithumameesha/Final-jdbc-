package view.TM;

public class StudentTm {
    private String student_id;
    private String name;
    private String email;
    private String contact;
    private String address;
    private String nic;

    public StudentTm() {
    }

    public StudentTm(String student_id, String name, String email, String contact, String address, String nic) {
        this.student_id = student_id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.nic = nic;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "StudentTm{" +
                "student_id='" + student_id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", nic='" + nic + '\'' +
                '}';
    }
}
