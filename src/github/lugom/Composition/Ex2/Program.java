package github.lugom.Composition.Ex2;

import github.lugom.Composition.Ex2.entities.Comment;
import github.lugom.Composition.Ex2.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program
{
    public static void main(String[] args)
    {
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Post post1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", dateTimeFormatter), "Traveling to New Zeland", "I'm going to visit this wonderful contry", 20);
        post1.addComment(new Comment("Have a nice trip!"));
        post1.addComment(new Comment("Wow that's awesome!"));

        Post post2 = new Post(LocalDateTime.parse("28/07/2018 13:05:44", dateTimeFormatter), "Good night guys!", "I'm going to bed", 5);
        post2.addComment(new Comment("May the force be with you"));

        System.out.println(post1.toString());

        System.out.println("\n" + post2.toString());

    }
}