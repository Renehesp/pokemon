package bro.games.pokemon.domain.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Component;

/**
 * @author rsanchez
 * @version : $<br/>
 * : $
 * @since 15/05/19 00:08
 */
@Component
public class ImageDownloader {

    public void download (int i) {
        BufferedImage image = null;
        try {

            URL url = new URL("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" + i + ".png");
            // read the url
            image = ImageIO.read(url);

            ImageIO.write(image, "png", new File("src/main/resources/static/images/pokemon/" + i + ".png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}