package SpringBootRestAPI.PhohtoTech.services;

import SpringBootRestAPI.PhohtoTech.models.Image;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageService implements IImageService{
    @Override
    public Iterable<Image> getAllImages() {
        return null;
    }

    @Override
    public Optional<Image> getImageByID(long id) {
        return Optional.empty();
    }

    @Override
    public Image createImage(Image image) {
        return null;
    }

    @Override
    public Image updateImage(Image image) {
        return null;
    }

    @Override
    public void deleteImage(long id) {

    }
}
