package de.baro.posts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by santoshsharma on 04 Oct, 2023
 */

@RestController
@RequestMapping("/api/posts")
class PostController {

    @GetMapping("")
    List<Post> findAllPosts() {
        return null;
    }
}
