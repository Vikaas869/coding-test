package com.monsanto.mbt;

import java.util.Comparator;
/**
 * Sort widgets by date
 * @author vikas
 *
 */
public class WidgetDateComparator implements Comparator<Widget> {

    public int compare(Widget o1, Widget o2) {
        return o1.getProductionDate().compareTo(o2.getProductionDate());
    }
}