import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        Pessoa pessoa1 = new Pessoa("Gabriel", 26, 1234, Gender.MALE);
//
//        System.out.println(pessoa1);
//
//        pessoa1.setAge(27);
//
//        System.out.println(pessoa1.getName());

        Animal animal1 = new Maritimo();
        animal1.respirar();

        Animal animal2 = new Terrestre();
        animal2.respirar();

    }
}
