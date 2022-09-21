import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mentoring {

    public static void main(String[] args) {
        //List
        //index -> sempre comeca no 0

//        List<Integer> numbers = new ArrayList<>();
//        System.out.println("Minha lista na criacao: " + numbers.size());
//
//        numbers.add(1); //indice 0
//        numbers.add(2); //indice 1
//        numbers.add(3); //indice 2
//        numbers.add(4); //indice 3
//
//        System.out.println("Minha lista:" + numbers);
//        System.out.println("Tamanho da minha lista: " + numbers.size());
//        System.out.println("Meu indice 0 (primeiro valor da lista) é: " + numbers.get(0));

        /**
         * Percorrer pela lista, e se o valor for PAR (divisivel por 2 de resto 0)
         * Eu devo deletar da lista
         */
//
//        for(int i=0; i < numbers.size(); i++) {
//            if(numbers.get(i) % 2 == 0) {
//                numbers.remove(numbers.get(i));
//            }
//        }
//
//        System.out.println("Depois de remover os pares: " + numbers);

        //ForEach -> [1,2,3,4]
//        numbers.forEach(number -> {
//            if(number % 2 == 0) {
//                System.out.println(number);
//            }
//        });

//
//        List<Integer> idades = new ArrayList<>();
//        idades.add(24);
//        idades.add(25);
//        idades.add(10); //indice 2
//        idades.add(30);
//        idades.add(44);
//        idades.add(54);
//        idades.add(30);
//        idades.add(25);
//        idades.add(10); //indice 8
//
//        System.out.println(idades);
//        System.out.println("Size: " + idades.size());
//
//        Set<Integer> idadesSemRepetidos = new HashSet<>(idades);
//
//        System.out.println(idadesSemRepetidos);
//        System.out.println("Size after: " + idadesSemRepetidos.size());
//
//        if(!idadesSemRepetidos.contains(26)) {
//            idadesSemRepetidos.add(26);
//        }
//
//        System.out.println(idadesSemRepetidos);

        Map<Integer, String> mapTexts = new HashMap<>();

        mapTexts.put(1, "frase1");
        mapTexts.put(2, "frase2");
        mapTexts.put(3, "frase3");
        mapTexts.put(4, "frase4");
        mapTexts.put(5, "frase5");

        final String text1 = mapTexts.get(1);
        System.out.println(text1);

        final String textOrDefault = mapTexts.getOrDefault(6, "frase padrao");
        System.out.println(textOrDefault);

        mapTexts.forEach((key, val) -> {
            if("frase1".equals(val)) {
                System.out.println("Frase1 existe!");
            }

            if(key == 3) {
                System.out.println("Minha key eh 3");
                System.out.println(val);
            }

        });

        if(mapTexts.containsKey(4)) {
            System.out.println(mapTexts.get(4));
        }

        if(!mapTexts.containsValue("frase6")) {
            mapTexts.put(6, "frase6");
        }

        System.out.println(mapTexts);

    }



}
