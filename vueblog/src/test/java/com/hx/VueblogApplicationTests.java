package com.hx;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class VueblogApplicationTests {

    @Autowired
   private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
       redisTemplate.opsForValue().set("n1","v1");
        System.out.println(redisTemplate.opsForValue().get("n1"));

    }

    @Test
    public String longestPalindrome(String s) {
        String S="babad";
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            System.out.println(len);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    @Test
    public int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;

    }

   /* @BeforeEach
    void con(){
        String  s = "dfs";
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        String[] array = new String[200];
        Arrays.sort(array, String::compareTo);

        Stream<String> stream = Stream.of("A", "B", "C", "D");
        stream.forEach(System.out::println);


    }*/


}
