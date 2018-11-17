public class Cat {
    private String name;
    private double weight;
    void setName (String nName){
        name = nName;
    }
    void setWeight (double nName){
        weight = nName;
    }
    String getName (){
        return name;
    }
    double getWeight(){
        return weight;
    }
    public Cat(){
    }
    public Cat(String nName){
        name = nName;
    }
    void meow(){
        System.out.println("Meow!");
    }
}
