package dev.nahidibrahimov.simplefactory;

import dev.nahidibrahimov.simplefactory.factory.PostFactory;

public class Main {
    public static void main(String[] args) {

        Post post = PostFactory.createPost("event");
        System.out.println(post);

    }
}