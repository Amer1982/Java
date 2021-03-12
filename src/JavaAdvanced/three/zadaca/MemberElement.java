package JavaAdvanced.three.zadaca;

public class MemberElement {

    private String name;
    private String number;
    private String birthDate;

    public MemberElement(String name, String number, String birthDate) {
        this.name = name;
        this.number = number;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public String getBirth() {
        return this.birthDate;
    }

    public String toString() {
        return getName() + " " + getNumber() + " " + getBirth();
    }
}
