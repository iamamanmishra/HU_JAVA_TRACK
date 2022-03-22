public class Animal {
    private String name;
    private String type;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String  type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Animal a=new Animal();
        a.setName("Pluto");
        a.setType("Dog");
        a.setBreed("Husky");
        System.out.println("Name is: "+a.getName());
        System.out.println("Type is: "+a.getType());
        System.out.println("Breed is: "+a.getBreed());
    }
}