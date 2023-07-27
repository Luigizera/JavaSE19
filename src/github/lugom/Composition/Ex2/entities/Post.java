package github.lugom.Composition.Ex2.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post
{
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime date;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post(){}

    public Post(LocalDateTime date, String title, String content, Integer likes)
    {
        this.date = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComment(Comment comment)
    {
        comments.add(comment);
    }

    public void removeComment(Comment comment)
    {
        comments.remove(comment);
    }


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(title + "\n" + likes + " Likes" + " - " + date.format(dateTimeFormatter) + "\n" + content + "\nComments:\n");
        for(Comment c : comments)
        {
            sb.append(c.toString());
        }
        return sb.toString();
    }

}
