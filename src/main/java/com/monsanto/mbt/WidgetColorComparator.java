package com.monsanto.mbt;

import java.util.Comparator;

/**
 * Sort widgets by color
 * @author vikas
 *
 */
public class WidgetColorComparator implements Comparator<Widget> {

    public int compare(Widget o1, Widget o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}