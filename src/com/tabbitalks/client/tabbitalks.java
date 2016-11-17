package com.tabbitalks.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;


public class tabbitalks implements EntryPoint {
	
	UI ui = new UI();

	@Override
	public void onModuleLoad() {
		RootLayoutPanel root =RootLayoutPanel.get();
		root.add(ui);
	
	}

}
