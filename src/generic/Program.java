package generic;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        DemoGenericClass<String> genericClass = new DemoGenericClass<>();

        genericClass.setAttr1("HIHIHI");
        DemoGenericClass<Integer> genericClass1 = new DemoGenericClass<>();
        genericClass1.setAttr1(1);

        // khai bao 1 doi tuong dictionary
        Dictionary<String,String>  dictionary = new Dictionary<>();
        dictionary.setKey("Hello");
        dictionary.setValue("Xin chao");
        System.out.printf("Ngia cua tu %s la %s ",dictionary.getKey(),dictionary.getValue());

        Dictionary<Integer,String>  dictionary1 = new Dictionary<>();
        dictionary1.setKey(1);
        dictionary1.setValue("So mot ");
        System.out.printf("/n Ky tu %d doc la %s",dictionary1.getKey(),dictionary1.getValue());



    }
}
