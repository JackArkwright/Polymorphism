public class FarmAnimal {
    private String name;
    private int serialNum;

    public FarmAnimal (String name){
        this.name = name;
        serialNum = -1;
    }
    public FarmAnimal (int serialNum){
        this.serialNum = serialNum;
        name = "Unassigned";
    }

    public void display(){
        if (!name.equals("Unassigned")) {
            System.out.println(name);
        } else {
            System.out.println(serialNum);
        }
    }

    public String getName(){
        if (!name.equals("Unassigned")) {
            return name;
        } else {
            return Integer.toString(serialNum);
        }
    }

    public String noise() {
        return "a vague snuffling noise";
    }

}
