public class Cow extends FarmAnimal{
    public Cow(String name) {
        super(name);
    }
    public Cow(int serialNum) {
        super(serialNum);
    }

    public String noise(){
        return "moo";
    }
}
