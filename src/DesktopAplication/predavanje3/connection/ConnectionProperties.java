package DesktopAplication.predavanje3.connection;

public enum ConnectionProperties {


    URL("jdbc:mysql://localhost:3306/sakila?useSSL=false"),
    USERNAME("root"),
    PASSWORD("Password");

    private final String value;

    ConnectionProperties(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
