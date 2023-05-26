import java.util.*;

public class CF3 {
    public static void main(String[] args) {
        Object[] objA = {1,4,3,4,8,9,5,6,8};
        Set set = new HashSet();

        for(int i = 0; i < objA.length; i++) {
            set.add(objA[i]);
        }
        System.out.println(set);

        HashSet info = new HashSet();
        info.add(new Person("지이츄", 25));
        info.add(new Person("지이츄", 25));

        System.out.println(info);
    }
}


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString () { return name + ":" + age; }

    public boolean equals(Object obj) {
        if(!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return name.equals(p.name) && age == p.age;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

//    HashSet의 add메서드는 새로운 요소를 추가하기전에 기존에 저장된 요소와 같은 것인지 판별하기 위해 추가하려는 요소의 equals()와 hashCode()
//    를 목적에 맞게 오버라이딩 해야함
}

