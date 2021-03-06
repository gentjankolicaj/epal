package io.epal.image.controller;

import io.epal.image.domain.Image;
import io.epal.image.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/image")
public class HomeController {

    private final ImageService imageService;

    @Autowired
    public HomeController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping
    @RequestMapping("/bus")
    public List<Image> getBusImages() {
        return imageService.findAllImages();
    }

    @GetMapping
    @RequestMapping("/bus/{busId}")
    public List<Image> getBusImage(@PathVariable("busId") Long busId) {
        return imageService.findImagesByBusId(busId);
    }


}
