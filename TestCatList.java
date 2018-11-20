import java.util.*;
public class TestCatList{
    public static void main(){
        ArrayList<Cat> CatList=new ArrayList<Cat>();
        Cat Steven= new Cat("Steven"); //instead of using the set method, I
        Cat Ian=new Cat("Ian"); //used the constructor setter. Is that ok?
        Cat Brian=new Cat("Brian");
        Cat George=new Cat("George");
        CatList.add(0, Steven); //Have to create the Cat objects first, 
        CatList.add(1, Ian); //couldn't use a for loop because of the different
        CatList.add(2, Brian); //string names for the Cat constructors
        CatList.add(3, George);
        int x=0; 
        for (Cat i: CatList){
            double w = (Math.random()*10)+5;
            CatList.get(x).setWeight(w); //get(x) must refer to an int
            x=x+1;
        }
        x=0; //have to make x=0 again between methods to start from the top
        for (Cat i:CatList){ 
            System.out.println(CatList.get(x).getName() + " " + CatList.get(x).getWeight());
            System.out.print(CatList.get(x).getName() + " says " );
            CatList.get(x).meow(); //don't want to say a void method
            x=x+1;
        }
    }
}