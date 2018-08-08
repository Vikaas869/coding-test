package com.monsanto.mbt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Shipment
 * 
 * @author vikas
 *
 */
public class Shipment {

	/**
	 * Get sorted widgets by color
	 * 
	 * @return
	 */
	public List<Widget> getWidgetsSortedByColor() {
		List<Widget> widgets = WidgetUtils.getSampleWidgets();
		Collections.sort(widgets, new WidgetColorComparator());
		List<Widget> topTen = new ArrayList<Widget>();
		// Get top ten widgets
		for (int i = 0; i < 10 && i < widgets.size(); i++) {
			topTen.add(widgets.get(i));
		}
		return topTen;
	}

	/**
	 * Get sorted widgets by date
	 * 
	 * @return
	 */
	public List<Widget> getWidgetsSortedByDate() {
		List<Widget> widgets = WidgetUtils.getSampleWidgets();
		Collections.sort(widgets, new WidgetDateComparator());
		List<Widget> topTen = new ArrayList<Widget>();
		// Get top ten widgets
		for (int i = 0; i < 10 && i < widgets.size(); i++) {
			topTen.add(widgets.get(i));
		}
		return topTen;
	}
}