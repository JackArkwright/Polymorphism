public class Pig extends FarmAnimal{
    public Pig(String name) {
        super(name);
    }
    public Pig(int serialNum) {
        super(serialNum);
    }

    public String noise(){
        return "oink";
    }
}
