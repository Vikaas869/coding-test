package com.monsanto.mbt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shipment {

    public List<Widget> getWidgetsSortedByColor() {
        List<Widget> widgets = WidgetUtils.getSampleWidgets();
        Collections.sort(widgets, new WidgetColorComparator());
        List<Widget> topTen = new ArrayList<Widget>();
        for (int i = 0; i < 10 && i < widgets.size(); i++) {
            topTen.add(widgets.get(i));
        }
        return topTen;
    }

    public List<Widget> getWidgetsSortedByDate() {
        List<Widget> widgets = WidgetUtils.getSampleWidgets();
        Collections.sort(widgets, new WidgetDateComparator());
        List<Widget> topTen = new ArrayList<Widget>();
        for (int i = 0; i < 10 && i < widgets.size(); i++) {
            topTen.add(widgets.get(i));
        }
        return topTen;
    }
}