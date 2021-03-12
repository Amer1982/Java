package JavaAdvanced.three.collection.Person;

 public enum gender {

    MALE("M"), Female("F");
    private String name;

    private gender(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
