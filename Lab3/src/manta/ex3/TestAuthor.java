package manta.ex3;

import manta.ex3.Author;

public class TestAuthor {
    public static void main(String[] args) {

        Author a1 = new Author("Manta Oana", "mantaoana667@gmail.com", 'f');
        System.out.println(a1);  // toString()


        a1.setEmail("mantaoana@yahoo.com");
        System.out.println(a1);

        System.out.println("name is: " + a1.getName());

        System.out.println("gender is: " + a1.getGender());

        System.out.println("email is: " + a1.getEmail());

    }
}