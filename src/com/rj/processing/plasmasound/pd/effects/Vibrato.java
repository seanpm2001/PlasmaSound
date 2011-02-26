package com.rj.processing.plasmasound.pd.effects;

import java.util.HashMap;

import android.content.SharedPreferences;

import com.rj.processing.plasmasound.pd.instruments.Parameter;

public  class Vibrato extends Effect {	
	public final static String SPEED = "vibspeed";
	public final static String DEPTH = "vibdepth";
	
	public Vibrato() {
		params = new HashMap<String, Parameter>();
		Parameter vibspeed = new Parameter(SPEED, false);
		vibspeed.setMinMax(0f, 20f);
		vibspeed.setDefault(0.4f);
		params.put(SPEED, vibspeed );
		Parameter vibdepth = new Parameter(DEPTH, false);
		vibdepth.setMinMax(0f, 127f);
		vibdepth.setDefault(0f);
		params.put(DEPTH, vibdepth );
		
		this.yenabledlist = new String[] {
				SPEED,
				DEPTH,
		};
		this.yenabled = false;

	}


	public void updateSettings(SharedPreferences prefs, String preset) {
		
	}
	


}