import java.io.File;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

public class ImageToText {

	public static String imageToText(){
		ITesseract instance = new Tesseract();
		instance.setDatapath(LoadLibs.extractTessResources("tessdata").getAbsolutePath());
		String result = null;
		try {
			result = instance.doOCR(new File("./screenshots//", "S34.png"));
			System.out.println(result);
		} catch (TesseractException e) {
			e.printStackTrace();
		}
		return result;
	}
}
