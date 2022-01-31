package www.William.co.uk.World;

import java.awt.Color;
import java.awt.Graphics;

import net.William.co.uk.gfx.Assets;
import net.William.co.uk.gfx.Camera;

public class Background {
	static int xbg3 = 0;
	static int xbg2 = 0;
	static int xbg1 = 0;
	static int count = 0;
	
	public static void render(Graphics g) {
		//xbg3 = xbg3+(int) Camera.getx();
		//xbg2 = xbg2+(int) Camera.getx()*2;
		//xbg1 = xbg1+(int) Camera.getx()*3;
		
		xbg3 = xbg3+(-1);
		xbg2 = xbg2+(-2);
		xbg1 = xbg1+(-3);
		
		if (xbg3 > 1920 || xbg3 < -1920) {
			xbg3 = 0;
		}
		if (xbg2 > 1920 || xbg2 < -1920) {
			xbg2 = 0;
		}
		if (xbg1 > 1920 || xbg1 < -1920) {
			xbg1 = 0;
		}
		
		//count = count + Camera.getx()*12;
		//g.setColor(Color.black);
		//g.drawString("" + count, 100, 20);
		
		g.drawImage(Assets.bg3, xbg3, (int) (-200), 1920, 1080, null);
		//g.drawImage(Assets.bg3, xbg3-1920, (int) (-200), 1920, 1080, null);
		g.drawImage(Assets.bg3, xbg3+1920, (int) (-200), 1920, 1080, null);
		
		g.drawImage(Assets.bg2, xbg2, (int) (-200), 1920, 1080, null);
		//g.drawImage(Assets.bg2, xbg2-1920, (int) (-200), 1920, 1080, null);
		g.drawImage(Assets.bg2, xbg2+1920, (int) (-200), 1920, 1080, null);
		
		g.drawImage(Assets.bg1, xbg1, (int) (-200), 1920, 1080, null);
		//g.drawImage(Assets.bg1, xbg1-1920, (int) (-200), 1920, 1080, null);
		g.drawImage(Assets.bg1, xbg1+1920, (int) (-200), 1920, 1080, null);
		//g.setColor(Color.red);
		//g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()), (int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
}

}
