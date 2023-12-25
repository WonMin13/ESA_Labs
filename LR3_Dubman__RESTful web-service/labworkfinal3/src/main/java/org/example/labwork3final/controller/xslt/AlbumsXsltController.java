package org.example.labwork3final.controller.xslt;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Controller
@RequestMapping("/xslt/albums")
public class AlbumsXsltController {

    @GetMapping
    public ModelAndView get() {
        RestTemplate template = new RestTemplate();
        String url = "http://localhost:8080/labwork3final_war_exploded/api/xml/albums/";
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<String> response = template.exchange(url, HttpMethod.GET, entity, String.class);
        String body = response.getBody();
        Source source = new StreamSource(new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8)));
        ModelAndView modelAndView = new ModelAndView("albums");
        modelAndView.addObject("xmlSource", source);
        return modelAndView;
    }
}
