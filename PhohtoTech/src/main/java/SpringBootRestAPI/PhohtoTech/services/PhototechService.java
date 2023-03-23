package SpringBootRestAPI.PhohtoTech.services;
import SpringBootRestAPI.PhohtoTech.Repo.IPhototechRepository;
import SpringBootRestAPI.PhohtoTech.models.Phototech;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PhototechService implements IPhototechService {


    @Qualifier("IPhototechRepository")
    @Autowired
    private final IPhototechRepository iPhototechRepository;

    public PhototechService(@Qualifier("IPhototechRepository") IPhototechRepository iPhototechRepository) {
        this.iPhototechRepository = iPhototechRepository;
    }

    @Override
    public List<Phototech> getAllPhototechs() {
        return (List<Phototech>) iPhototechRepository.findAll();
    }

    @Override
    public Optional<Phototech> getPhototechByID(long id) {
        return iPhototechRepository.findById(id);
    }

    @Override
    public Phototech createPhototech(Phototech phototech) {
        return iPhototechRepository.save(phototech);
    }

    @Override
    public Phototech updatePhototech(Phototech phototech) {
        return iPhototechRepository.save(phototech);
    }

    @Override
    public void deletePhototech(long id) {

    }

    /**
     *
     private final IImagesRepository imagesRepository;

     public ImagesService(IImagesRepository imagesRepository) {
     this.imagesRepository = imagesRepository;
     }

     @Async
     public List<Images> getAllImages() {
     return (List<Images>) imagesRepository.findAll();
     }
     @Async
     public Images getImageById(long id) {
     return imagesRepository.findById(id);
     }
     @Async
     public Images createImage(Images images) {
     return imagesRepository.save(images);
     }
     @Async
     public Images updateImage(Images image) {
     Images optionalImage = imagesRepository.findById(image.getId()); // Здесь null
     image.setTitle("title");
     return imagesRepository.save(image);
     }
     @Async
     public void deleteImage(long id) {
     Images optionalImage = imagesRepository.findById(id);
     imagesRepository.delete(id);
     }
     */
}
