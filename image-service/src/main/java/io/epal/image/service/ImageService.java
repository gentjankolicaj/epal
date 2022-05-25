package io.epal.image.service;

import io.epal.image.domain.Image;

import java.util.List;

public interface ImageService {

    List<Image> findAllImages();

    List<Image> findImagesByBusId(Long busId);

}
