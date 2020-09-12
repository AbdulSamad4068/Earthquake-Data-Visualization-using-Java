package module;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for land earthquakes on an earthquake map
 */
public class LandQuakeMarker extends EarthquakeMarker {
	
	
	public LandQuakeMarker(PointFeature quake) {
		
		// calling EarthquakeMarker constructor
		super(quake);
		
		isOnLand = true;
	}


	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		pg.noStroke();
		//pg.fill(122, 232, 139, 100);
		pg.ellipse(x, y, 2*radius, 2*radius);
		pg.fill(255, 100);
		pg.ellipse(x, y, (float)1.2*radius, (float)1.2*radius);
		
	}
	

	public String getCountry() {
		return (String) getProperty("country");
	}

		
}