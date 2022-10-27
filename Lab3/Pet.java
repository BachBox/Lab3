package Lab3;

public class Pet {
    private int id;
    private String name;
    private int age;
    private String species;
    private String sex;
    private Type type;
    private String description;
    private String image;

    public Pet(int id, String name, int age, String species, String sex, Type type, String description, String image) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.species = species;
        this.sex = sex;
        this.type = type;
        this.description = description;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Pet [id=" + id + ", name=" + name + ", age=" + age + ", species=" + species + ", sex=" + sex + ", type="
                + type + ", description=" + description + ", image=" + image + "]";
    }
    

    
}
