
import model.Children;
import model.Hobby;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hobby h1 = new Hobby("Reading", "LongTerm");
        Hobby h2 = new Hobby("Painting", "ShortTerm");
        Hobby h3 = new Hobby("Playing", "LongTerm");
        Hobby h4 = new Hobby("Dancing", "LongTerm");
        Hobby h5 = new Hobby("Singing", "ShortTerm");
        Hobby h6 = new Hobby("Sleeping", "ShortTerm");

        ArrayList<Hobby> hobby1 = new ArrayList<>();
        hobby1.add(h1);
        hobby1.add(h2);
        hobby1.add(h3);

        ArrayList<Hobby> hobby2 = new ArrayList<>();
        hobby2.add(h4);
        hobby2.add(h5);
        hobby2.add(h6);

        Children child1 = new Children("Diya", 9, 18, hobby1);
        Children child2 = new Children("random", 10, 17, hobby2);

        System.out.println(child1.getFullName());
        child1.getHobby();


    }
}
