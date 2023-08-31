package github.lugom.File.Ex2;
import github.lugom.File.Ex2.entities.Item;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //BufferedFile();
        //CreateFile();
        //Folders(sc);
        //FilePath(sc);
        ExProposto();


        sc.close();
    }

    private static void ExProposto()
    {
        List<Item> itemList = new ArrayList<>();
        File path = new File("D:\\Docs\\Forge\\TestesSE19\\src\\github\\lugom\\File");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path + "\\items.csv")))
        {
            String line = bufferedReader.readLine();

            while (line != null)
            {
                String[] l = line.split(",");
                Item item = new Item(l[0], Double.valueOf(l[1]), Integer.valueOf(l[2]));
                itemList.add(item);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        boolean success = new File(path + "\\itemDirectory").mkdir();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\itemDirectory\\items.csv")))
        {
             for(Item p : itemList)
             {
                 bw.write(p.toString(true));
                 bw.newLine();
             }
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Directory created: " + success);
    }

    private static void FilePath(Scanner sc)
    {
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: "+ path.getName());
        System.out.println("getParent: "+ path.getParent());
        System.out.println("getPath: "+ path.getPath());
    }

    private static void Folders(Scanner sc)
    {
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        if(folders != null) {
            for (File folder : folders) {
                System.out.println(folder);
            }
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        if(files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        }

        boolean success = new File(strPath + "\\subDirectory").mkdir();
        System.out.println("Directory created successfully: " + success);
    }

    private static void CreateFile()
    {
        String[] lines = new String[] {"Teste 1", "Teste 2", "Teste 3"};

        String path = "D:\\Docs\\Forge\\TestesSE19\\src\\github\\lugom\\File\\teste2.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))
        {
            for (String line : lines)
            {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void BufferedFile()
    {
        File file = new File("D:\\Docs\\Forge\\TestesSE19\\src\\github\\lugom\\File\\teste.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file)))
        {
            String line = bufferedReader.readLine();

            while (line != null)
            {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
