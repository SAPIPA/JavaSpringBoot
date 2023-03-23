package SpringBootRestAPI.PhohtoTech.services;

import SpringBootRestAPI.PhohtoTech.models.Image;

import java.util.Optional;

public interface IImageService {

    Iterable<Image> getAllImages();
    Optional<Image> getImageByID(long id);
    Image createImage(Image image);
    Image updateImage(Image image);
    void deleteImage(long id);
}
