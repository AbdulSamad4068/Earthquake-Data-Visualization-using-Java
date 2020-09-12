package module;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		isOnLand = false;
	}
	

	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		
		pg.noStroke();
		//pg.fill(122, 232, 139, 100);
		pg.rect(x-radius, y-radius, 2*radius, 2*radius);
		pg.fill(255, 100);
		pg.rect((float)(x-(0.5*radius)), (float)(y-(0.5*radius)), (float)1.2*radius, (float)1.2*radius);
	}
}
