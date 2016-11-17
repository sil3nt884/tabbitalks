package com.tabbitalks.client;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.IFrameElement;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class UI extends Composite implements ResizeHandler{

	private static UIUiBinder uiBinder = GWT.create(UIUiBinder.class);

	interface UIUiBinder extends UiBinder<Widget, UI> {
	}

	public UI() {
		initWidget(uiBinder.createAndBindUi(this));
		Window.addResizeHandler(this);
	}

	@Override
	public void onResize(ResizeEvent event) {
	
		
		
	}

}
