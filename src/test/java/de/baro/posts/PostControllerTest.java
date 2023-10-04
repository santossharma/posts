package de.baro.posts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by santoshsharma on 04 Oct, 2023
 */

@WebMvcTest(PostController.class)
@AutoConfigureMockMvc
public class PostControllerTest {

    @Autowired
    MockMvc mockMvc;

    List<Post> posts = new ArrayList<>();

    @BeforeEach
    void setup() {
        posts = List.of(
            new Post(1, 1, "Hello World", "My first post!", null),
            new Post(2, 2, "Another Post", "My second post!", null)
        );
    }

    @Test
    void shouldFindAllPosts() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/posts"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
