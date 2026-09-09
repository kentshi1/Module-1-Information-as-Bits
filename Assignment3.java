import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.imageio.ImageIO;


public class Assignment3 {
    public static String convert(Color var0) {
        // 3. Write a program that reads an image and prints its pixel values.
        int var1 = var0.getRed();
        int var2 = var0.getGreen();
        int var3 = var0.getBlue();
        if (var1 == 237 && var2 == 28 && var3 == 36) {
            return "R";
        } else if (var1 == 0 && var2 == 0 && var3 == 0) {
            return "B";
        } else {
            return var1 == 255 && var2 == 242 && var3 == 0 ? "Y" : "(" + var1 + ", " + var2 + ", " + var3 + ")";
        }
    }

    public static void main(String[] var0) throws IOException {
        PrintWriter var1 = new PrintWriter("output.txt");

        BufferedImage var2 = ImageIO.read(new File("./smiley.png"));

        int var3 = var2.getWidth();
        int var4 = var2.getHeight();

        for(int var5 = 0; var5 < var4; ++var5) {
            for(int var6 = 0; var6 < var3; ++var6) {
                Color var7 = new Color(var2.getRGB(var6, var5));
                String var8 = convert(var7);
                var1.print(var8);
                var1.print(" ");
            }

            var1.println();
        }

        var1.close();
    }
}
