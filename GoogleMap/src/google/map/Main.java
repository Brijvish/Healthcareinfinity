package google.map; 


import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

import android.os.Bundle;

public class Main extends MapActivity {
	MapView map;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        map = (MapView) findViewById(R.id.mvMain);
        map.setBuiltInZoomControls(true);
        
	}
	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return true;
	}
}
