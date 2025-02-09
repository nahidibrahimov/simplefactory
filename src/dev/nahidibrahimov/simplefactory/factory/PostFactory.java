package dev.nahidibrahimov.simplefactory.factory;

import dev.nahidibrahimov.simplefactory.BlogPost;
import dev.nahidibrahimov.simplefactory.EventPost;
import dev.nahidibrahimov.simplefactory.NewsPost;
import dev.nahidibrahimov.simplefactory.Post;

public class PostFactory {

    public static Post createPost(String type) {

        return switch (type) {
            case "news" -> new NewsPost();
            case "event" -> new EventPost();
            case "blog" -> new BlogPost();
            default -> throw new IllegalArgumentException("Invalid post type");
        };
    }

}
