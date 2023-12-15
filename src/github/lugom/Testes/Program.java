package github.lugom.Testes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import github.lugom.Testes.entities.Dog;

public class Program {

    public static void main(String[] args)
    {
        /*List<Dog> list = new LinkedList<>();

        list.add(new Dog("Alan", 23));
        list.add(new Dog("Londre", 12));
        list.add(new Dog("Ace", 5));

        list.forEach(System.out::println);
        list.sort((d, d2) -> d.getName().toUpperCase().compareTo(d2.getName().toUpperCase()));
        list.forEach(d -> d.setAge(d.getAge() * 2));
        list.forEach(System.out::println);

        List<String> namesUpperCase = list.stream().map(d -> d.getName().toUpperCase()).collect(Collectors.toList());

        namesUpperCase.forEach(System.out::println);*/

        List<Integer> listInt = new ArrayList<Integer>();
        List<Object> listObj = new ArrayList<Object>();
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        copyCondition(listInt, listObj, p -> p.doubleValue() % 2 == 0);
        System.out.println(listObj.toString());
        System.out.println(listInt.hashCode());
        System.out.println(listObj.hashCode());
        System.out.println(listInt.equals(listObj)); // Em questão de conteúdo
        //Dog dog2 = dog.clone();
        //dog.equals(dog2);
        //System.out.println(dog2);



    }


    public static void copy(List<? extends Number> x, List<? super Number> y)
    {
        if (!x.isEmpty())
        {
            for (Number a : x)
            {
                y.add(a);
            }
        }
    }

    public static void copyCondition(List<? extends Number> x, List<? super Number> y, Predicate<Number> condition)
    {
        if (!x.isEmpty())
        {
            for (Number a : x)
            {
                if(condition.test(a))
                {
                    y.add(a);
                }
            }
        }
    }


}
