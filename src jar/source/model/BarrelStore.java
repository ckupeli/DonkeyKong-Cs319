package source.model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class BarrelStore extends Nonmovable{
	BufferedImage bufferedImage;
	private Image image;
	
	private final boolean PASS_THROUGH = false;
	
	public BarrelStore(int x, int y){
		super(x, y);
		
		try {
			bufferedImage = ImageIO.read(getClass().getResource("/image/18.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		image =  new ImageIcon(bufferedImage).getImage();
	}

	@Override
	public boolean getPassThrough(){
		return PASS_THROUGH;
	}

	public Image getImage() {
		return image;
	}
}