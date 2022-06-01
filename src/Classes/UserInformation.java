package Classes;

public class UserInformation {
    private String name;
    private String surname;
    private Home home;

    public UserInformation(String name, String surname, Home home) {
        this.name = name;
        this.surname = surname;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

}
