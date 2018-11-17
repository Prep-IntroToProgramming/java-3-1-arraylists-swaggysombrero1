import java.util.*;
public class TestCatList{
    public static void main(){
        ArrayList<Cat> CatList=new ArrayList<Cat>();
        Cat Steven= new Cat("Steven");
        Cat Ian=new Cat("Ian");
        Cat Brian=new Cat("Brian");
        Cat George=new Cat("George");
        CatList.add(0, Steven);
        CatList.add(1, Ian);
        CatList.add(2, Brian);
        CatList.add(3, George);
        int x=0;
        for (Cat i: CatList){
            double w = (Math.random()*10)+5;
            CatList.get(x).setWeight(w);
            x=x+1;
        }
        x=0;
        for (Cat i:CatList){ 
            System.out.println(CatList.get(x).getName() + " " + CatList.get(x).getWeight());
            System.out.print(CatList.get(x).getName() + " says " );
            CatList.get(x).meow(); 
            x=x+1;
        }
    }
}