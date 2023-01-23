package single_responsibility.exercise_2.good;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import single_responsibility.exercise_2.bad.Image;
import single_responsibility.exercise_2.bad.Format.ImageFormat;

import static org.junit.jupiter.api.Assertions.*;

class ImageTest {

    private Image image = new Image(30, 35, ImageFormat.JPEG, 300);

    @Test
    public void shouldReturnImageWidth(){

        assertEquals(35, image.getImageWidth());
    }

    @Test
    public void shouldReturnImageHeight(){

        int result = image.getImageHeight();
        int expected = 30;

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnImageFormat(){

        ImageFormat result = image.getImageFormat();
        ImageFormat expected = ImageFormat.JPEG;

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnImageResolution(){

        int result = image.getImageResolution();
        int expected = 300;

        assertEquals(expected, result);
    }

}