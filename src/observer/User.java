package observer;

public class User {
    private String name;
    private String email;
    private String urlPhoto;
    private String phone;

    public User(String name, String email, String urlPhoto, String phone) {
        this.name = name;
        this.email = email;
        this.urlPhoto = urlPhoto;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public String getPhone() {
        return phone;
    }
}
