package com.develhope.Exercise0102;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class HelloWeatherController {
    @RequestMapping(method = RequestMethod.GET, path = "/ciao")
    public Person ciao(
            @RequestParam String name,
            @RequestParam String provincia) {
        return new Person(name,provincia);
    }
}
