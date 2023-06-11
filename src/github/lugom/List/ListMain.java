package github.lugom.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListMain
{
    public static void main(String[] args)
    {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for(int i = 0; i < 6; i++)
        {
            arrayList.add("arrayTeste" + i);
        }

        for(String x : arrayList)
        {
            System.out.println(x);
        }

        List<String> result = arrayList.stream().filter(x -> x.contains("4")).collect(Collectors.toList());

        for(String x : result)
        {
            System.out.println("\n" + x + "\n");
        }

        for(int i = 0; i < 6; i++)
        {
            linkedList.add("linkedTeste" + i);
        }

        for(String x : linkedList)
        {
            System.out.println(x);
        }

        result = linkedList.stream().filter(x -> x.contains("2")).collect(Collectors.toList());

        for(String x : result)
        {
            System.out.println("\n" + x + "\n");
        }
    }
}
