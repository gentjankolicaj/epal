package org.epal.image_service.service;

import org.epal.image_service.domain.Image;

import java.util.List;

public interface ImageService {

    List<Image> findAllImages();

    List<Image> findImagesByBusId(Long busId);

}
