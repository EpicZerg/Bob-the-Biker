package engine;

import static org.lwjgl.opengl.GL11.*;

import java.io.IOException;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.*;
import org.newdawn.slick.util.ResourceLoader;

public class Engine {
	int w,h;
	Texture player;
	public Engine(int[] dimensions){
		w=dimensions[0];
		h=dimensions[1];
	}
	public void start() throws IOException {
		try {
			Display.setDisplayMode(new DisplayMode(w,h));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
			initGL();
		while (!Display.isCloseRequested()) {
			glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); 

			update();
			render();
			
			Display.update();
		}
		
		Display.destroy();
	}
	private void update() {
		// TODO Auto-generated method stub
		
	}
	private void render() {
		// TODO Auto-generated method stub
		
	}
	public void initGL(){
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, w, 0, h, 1, -1);
		glMatrixMode(GL_MODELVIEW);
	}
	
	public static void main(String[] args) throws IOException {
		Engine displayExample = new Engine(new int[]{800,600});
		displayExample.start();
	}
}