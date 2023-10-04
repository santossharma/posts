package de.baro.posts;

/**
 * Created by santoshsharma on 04 Oct, 2023
 */

public record Post(Integer id, Integer userId, String title, String body, String version) {
}
