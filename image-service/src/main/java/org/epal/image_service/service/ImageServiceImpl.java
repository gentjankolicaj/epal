package org.epal.image_service.service;

import org.epal.image_service.domain.Image;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public List<Image> findAllImages() {
        List<Image> images = Arrays.asList(
                new Image(1L, "London bus", "https://www.autocar.co.uk/car-news/new-cars/new-bus-london-driven"),
                new Image(2L, "Tirana bus", "https://www.flickr.com/photos/erwinalexander/albums/72157675830511352"));
        return images;
    }

    @Override
    public List<Image> findImagesByBusId(Long busId) {
        List<Image> images = Arrays.asList(
                new Image(2L, "Tirana bus", "https://www.flickr.com/photos/erwinalexander/albums/72157675830511352"),
                new Image(2L, "Tirana bus", "https://www.flickr.com/photos/erwinalexander/albums/72157675830511352"),
                new Image(2L, "Tirana bus", "https://www.flickr.com/photos/erwinalexander/albums/72157675830511352"));
        return images;
    }
}
