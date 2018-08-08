package com.monsanto.mbt;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * ShipmentTest
 * @author vikas
 *
 */
public class ShipmentTest {
    private Shipment shipment;

    @Before
    public void init() {
        shipment = new Shipment();
    }

    @After
    public void close() {
        shipment = null;
    }

    /**
     * Test case for widgets sorted by color
     */
    @Test
    public void testShipment_Sorted_By_Color() {
        List<Widget> widgets = shipment.getWidgetsSortedByColor();
        assertNotNull(widgets);
        assertTrue(widgets.size() == 10);
        Widget widget1 = (Widget) widgets.get(0);
        Widget widget2 = (Widget) widgets.get(1);
        assertTrue(widget1.getColor().compareTo(widget2.getColor()) <= 0);
    }

    /**
     * Test case for widgets sorted by date
     */
    @Test
    public void testShipment_Sorted_By_Date() {
        List<Widget> widgets = shipment.getWidgetsSortedByDate();
        assertNotNull(widgets);
        assertTrue(widgets.size() == 10);
        Widget widget1 = (Widget) widgets.get(0);
        Widget widget2 = (Widget) widgets.get(1);
        assertTrue(widget1.getColor().compareTo(widget2.getColor()) <= 0);
    }

}
