package Testing;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;



public class Solution {
    public static void main(String[] args) {


        List<String> urls = new ArrayList<>();

        Collections.addAll(
                urls, "https://google.com",
                             "https://linkedin.com",
                            "https://yandex.com"
        );

        //     Stream<URI> stream = urls.stream().map(URI::new);
    }
}
