package Lab5;

public class BMPImageLoader implements ImageLoader {

        @Override
        public ImageContent load(String img) {
            System.out.println("Creating BMP image");
            return new ImageContent(img);
        }
}
