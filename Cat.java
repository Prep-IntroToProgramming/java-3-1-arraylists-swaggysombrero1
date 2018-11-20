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

    public Cat(){ //overloaded Cat constructor
    }

    public Cat(String nName){
        name = nName;
    }

    void meow(){
        double x = Math.random(); //created for the Bonus
        if (weight>=10){ //created for last Bonus: larger cats have larger letters
            if (x>=.25){
                System.out.println("MEOW!"); 
            } else {
                System.out.println("Ruff?"); 
            }
        } else { 
            if (x>=.25){
                System.out.println("meow.");
            } else {
                System.out.println("ruff?");
            }
        } //.25 chance that the cat says some type of "ruff"
    }
}
