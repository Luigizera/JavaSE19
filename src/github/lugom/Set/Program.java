package github.lugom.Set;

import github.lugom.Set.entities.Users;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class Program
{
    public static void main(String[] args)
    {
        /*func_hashset();
        func_treeset();
        func_linkedhashset();*/

        Scanner sc = new Scanner(System.in);
        String path = "";
        Set<Users> set = new HashSet<>();

        System.out.print("Escreva o caminho do arquivo: ");
        path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String line = br.readLine();

            while(line != null)
            {
                String[] arr = line.split(" ");
                String name = arr[0];
                LocalDateTime date = LocalDateTime.parse(arr[1]);

                set.add(new Users(name, date));

                line = br.readLine();
            }
        }
        catch (IOException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        finally
        {
            for(Users u : set)
            {
                System.out.println(u.toString());
            }
            System.out.println("Total Users:" + set.size());
        }
    }

    public static void func_hashset()
    {
        Set<String> set = new HashSet<>();

        set.add("Teste");
        set.add("Ponteiro");
        set.add("Árvore");

        for(String s : set)
        {
            System.out.println(s);
        }
    }

    public static void func_treeset()
    {
        Set<String> set = new TreeSet<>();

        set.add("Teste");
        set.add("Ponteiro");
        set.add("Árvore");

        for(String s : set)
        {
            System.out.println(s);
        }
    }

    public static void func_linkedhashset()
    {
        Set<String> set = new LinkedHashSet<>();

        set.add("Teste");
        set.add("Ponteiro");
        set.add("Árvore");

        for(String s : set)
        {
            System.out.println(s);
        }
    }
}
