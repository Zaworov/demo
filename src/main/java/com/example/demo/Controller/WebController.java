package com.example.demo.Controller;

import com.example.demo.Model.PostRequest;
import com.example.demo.Model.PostResponse;
import com.example.demo.Model.Response;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    @RequestMapping("/sample")
    public Response Sample(@RequestParam(value = "name",
            defaultValue = "Robot") String name) {
        Response response = new Response();
        response.setId(1);
        response.setMessage("Your name is "+name);
        return response;
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public PostResponse Test(@RequestBody PostRequest inputPayload) {
        PostResponse response = new PostResponse();
        response.setId(inputPayload.getId()*100);
        response.setMessage("Hello " + inputPayload.getName());
        response.setExtra("Some text");
        return response;
    }
}