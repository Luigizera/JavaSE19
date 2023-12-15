package github.lugom.Set.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class Users
{
    private String name = "";
    private LocalDateTime dateTime = LocalDateTime.now();

    public Users(){}
    public Users(String name, LocalDateTime dateTime)
    {
        this.name = name;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(name, users.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
