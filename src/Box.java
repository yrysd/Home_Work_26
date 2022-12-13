public class Box <T>{

    private String name;

    public Box(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                '}';
    }

    public static <T> void method(){
        Box<String> box = new Box<>("UFS");
        System.out.println(box);

    }
}
