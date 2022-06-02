package ChainOfResponsability.Context;

public class Output {
    private String email;
    private String digit;
    private String date;

    public Output(String email, String digit, String date) {
        this.email = email;
        this.digit = digit;
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public String getDigit() {
        return digit;
    }

    public String getDate() {
        return date;
    }


}
