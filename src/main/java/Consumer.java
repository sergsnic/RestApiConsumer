import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Consumer {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://reqres.in/api/users/2";
        String response = restTemplate.getForObject(url,String.class);
        System.out.println(response);
        Map<String,String> jsonToSend = new HashMap<>();
        jsonToSend.put("name", "Bob");
        jsonToSend.put("job", "test job");
        HttpEntity<Map<String,String>> httpEntity = new HttpEntity<>(jsonToSend);
        url = "https://reqres.in/api/users/";
        response = restTemplate.postForObject(url,httpEntity,String.class);
        System.out.println("Вариант 2");
        System.out.println(response);

    }
}
