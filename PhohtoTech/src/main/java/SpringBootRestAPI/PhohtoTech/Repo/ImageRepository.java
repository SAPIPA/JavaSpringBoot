package SpringBootRestAPI.PhohtoTech.Repo;

import org.springframework.stereotype.Repository;

@Repository
public class ImageRepository {
    /** ObjectToXML
     * Image image = new Image();
     * image.set...
     *
     * File file = new File("src//main//resources//ImageContext.xml");
     * JAXBContext context = JAXBContext.newInstance(Image.class);
     * Marshaller marshaller = context.createMarshaller();
     *
     * marshaller.marshal(image, file);
     * marshaller.marshal(image, System.out);
     */

    /**XMLToObject
     * File file = new File("src//main//resources//ImageContext.xml");
     * JAXBContext context = JAXBContext.newInstance(Image.class);
     *
     * Unmarshaller unmarshaller = context.createUnmarshaller();
     * Image image = (Image) unmarshaller.unmarshal(file);
     */

}
