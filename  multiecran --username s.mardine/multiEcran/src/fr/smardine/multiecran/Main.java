package fr.smardine.multiecran;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class Main extends Activity {
    /** Called when the activity is first created. */
	
	Context ctx = Main.this;
	int mGestureThreshold;
	int DENSITY_HIGH=240,DENSITY_MEDIUM=160,DENSITY_LOW=120;
	boolean portrait=false,paysage=false;
	// The gesture threshold expressed in dip
	private static final float GESTURE_THRESHOLD_DIP = 16.0f;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowManager manager = (WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        Display display = manager.getDefaultDisplay();
        int hauteur= display.getHeight();// Hauteur de l'ecran environ 420
      	int largeur=  display.getWidth();// Largeur de l'ecran environ 300
     
      	int rotation = display.getOrientation();
      	//on determine si on est sur un ecran "landscape" (paysage)
      	if (hauteur<largeur){
      		portrait = false;
      		paysage=true;
      	}
      	if (hauteur>largeur){
      		portrait=true;
      		paysage=false;
      	}
      	
      	
        int density = ctx.getResources().getDisplayMetrics().densityDpi;
        if (density==DENSITY_HIGH){
        	if (hauteur==480&&largeur==800){//WVGA, mediumDensity(240dpi),normal screen landscape
          		
          	}
			if (hauteur==480&&largeur==854){//WVGA, mediumDensity(240dpi),normal screen landscape
					
			}
        }
        if (density==DENSITY_LOW){
        	if (hauteur==320&&largeur==240){//QVGA, lowdensity(120dpi),small screen
          		
          	}
			if (hauteur==400&&largeur==200){//WQVGA, lowdensity(120dpi),normal screen
			          		
			}
			if (hauteur==432&&largeur==240){//WQVGA, lowdensity(120dpi),normal screen
					
			}
        }
        if (density==DENSITY_MEDIUM){
    		if (hauteur==480&&largeur==320){//HVGA, mediumDensity(160dpi),normal screen
          		
          	}
    		if (hauteur==480&&largeur==800){//WVGA, mediumDensity(160dpi),large screen landscape
          		
          	}
			if (hauteur==480&&largeur==854){//WVGA, mediumDensity(160dpi),large screen landscape
					
			}
        }
      	
      	

      

      	
      	
        setContentView(R.layout.main);
    }
}