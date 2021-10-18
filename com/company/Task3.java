package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Task3{

   static class User {
        private String Name;
        private String Surname;
        private int Age;

       public int getAge() {
           return Age;
       }
       public void setAge(int Age) {
           this.Age = Age;
       }
       public String getName() {
           return Name;
       }
       public void setName(String Name) {
           this.Name = Name;
       }
       public String getSurname() {
           return Surname;
       }
       public void setSurname(String Surname) {
           this.Surname = Surname;
       }

        User(String Name, String Surname, int Age) {
            this.Age = Age;
            this.Name = Name;
            this.Surname = Surname;
        }
       @Override
       public String toString() {
           return Name+ " "+Surname;
       }
       @Override
       public int hashCode() { //хэш-код
           return Age;
       }
    }

    public static ArrayList<User> createUsers() {
        ArrayList<User> Users = new ArrayList<>();
        Users.add(new User ("Иван", "Иванов", 23));
        Users.add(new User ("Пётр", "Петров", 23));
        Users.add(new User ("Пётр", "Крылов", 34));
        Users.add(new User ("Пётр", "Соколов", 31));
        Users.add(new User ("Александр", "Пушкин", 31));
        Users.add(new User ("Василий", "Журавлёв", 18));
        Users.add(new User ("Иван", "Алексеев", 90));
        Users.add(new User ("Роман", "Кузнецов", 45));
        Users.add(new User ("Глеб", "Рыбкин", 12));
        Users.add(new User ("Василий", "Попов", 31));
        return Users;
    }

    public static HashMap<Integer, User> processUsers() {
        ArrayList<User> Users = createUsers();
        HashMap<Integer, User> map = new HashMap<Integer, User>();
        for (int i=0;i<10;i++){
            map.put(i,Users.get(i));
        }
        return map;
    }

        public static String printUserMap(int age) {
            HashMap<Integer, User> map=processUsers();
            for(HashMap.Entry entry: map.entrySet()) {
                if(age==entry.getValue().hashCode()) {
                    System.out.println(age+" "+entry.getValue().toString());
                }
            }
            return "";
    }

        public static void main (String[]args) {
            System.out.println(printUserMap(12)); // 12 Глеб Рыбкин
            System.out.println(printUserMap(31)); // 31 Пётр Соколов   31 Александр Пушкин    31 Василий Попов
            System.out.println(printUserMap(23)); // 23 Иван Иванов    23 Пётр Петров
        }
}
