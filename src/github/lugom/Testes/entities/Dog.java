package github.lugom.Testes.entities;

import java.util.Objects;

public class Dog {
    // EXEMPLO: private static final int CAT_LIVES = 9;
    private static final int MAX_DOG_YEARS = 20;
    private String name;
    private Integer age;

    public Dog(){}

    public Dog(String name, Integer age)
    {
        if (name == null || age == null) {
            throw new IllegalStateException("name or age cannot be null");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        if (name == null) {
            throw new IllegalStateException("name cannot be null");
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age)
    {
        if(age > 1)
        {
            this.age = age;
        }
    }

    public int hashCodeName() {
        return Objects.hash(name);
    }

    public boolean equalsName(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dog other = (Dog) obj;
        return Objects.equals(name, other.name);
    }

    public int hashCodeAge() {
        return Objects.hash(age);
    }

    public boolean equalsAge(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dog other = (Dog) obj;
        return Objects.equals(age, other.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dog other = (Dog) obj;
        return Objects.equals(age, other.age) && Objects.equals(name, other.name);
    }

    @Override
    public Dog clone() {
        return new Dog(name, age);
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }

    //public int compareTo(Dog other) {return name.toUpperCase().compareTo(other.getName().toUpperCase());}
}
