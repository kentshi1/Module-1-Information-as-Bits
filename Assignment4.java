import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import javax.imageio.ImageIO;

public class Assignment4 {
    public static Color convert(String var0) {
        if (var0.equals("R")) {
            return new Color(237, 28, 36);
        } else if (var0.equals("B")) {
            return new Color(0, 0, 0);
        } else {
            return var0.equals("Y") ? new Color(255, 242, 0) : Color.WHITE;
        }
    }

    public static void main(String[] var0) throws Exception {
        List var1 = Files.readAllLines(Path.of("input.txt"));
        int var2 = ((String)var1.get(0)).split("\\s+").length;
        int var3 = var1.size();
        BufferedImage var4 = new BufferedImage(var2, var3, 1);

        for(int var5 = 0; var5 < var3; ++var5) {
            System.out.println((String)var1.get(var5));
            String[] var6 = ((String)var1.get(var5)).trim().split("\\s+");

            for(String var10 : var6) {
                System.out.println(var10);
            }

            for(int var11 = 0; var11 < var2; ++var11) {
                Color var12 = convert(var6[var11]);
                var4.setRGB(var11, var5, var12.getRGB());
            }
        }

        ImageIO.write(var4, "png", new File("output.png"));

        // 5. Test boundary cases, including zero, the largest supported unsigned value,
        // and at least one negative two's-complement value.
    }
}