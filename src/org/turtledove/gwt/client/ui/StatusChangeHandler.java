package org.turtledove.gwt.client.ui;

public interface StatusChangeHandler {
	
	void statusChanged(CheckableTreeItem item, int oldValue, int newValue);

}
