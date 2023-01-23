package single_responsibility.exercise_2.bad;

import single_responsibility.exercise_2.bad.Format.ImageFormat;

public class Image {

    private int imageHeight;
    private int imageWidth;
    private ImageFormat imageFormat;
    private int imageResolution;

    public Image(int imageHeight, int imageWidth, ImageFormat imageFormat, int imageResolution) {
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
        this.imageFormat = imageFormat;
        this.imageResolution = imageResolution;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public ImageFormat getImageFormat() {
        return imageFormat;
    }

    public int getImageResolution() {
        return imageResolution;
    }
}
