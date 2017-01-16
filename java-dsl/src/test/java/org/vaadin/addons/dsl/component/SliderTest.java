package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.slider;
import static org.vaadin.addons.dsl.Properties.max;
import static org.vaadin.addons.dsl.Properties.min;
import static org.vaadin.addons.dsl.Properties.orientation;
import static org.vaadin.addons.dsl.Properties.resolution;
import static org.vaadin.addons.dsl.Properties.value;

import org.junit.Test;

import com.vaadin.shared.ui.slider.SliderOrientation;

public class SliderTest {

    @Test
    public void testSpecificPropertySetters() {
        slider(
            max(10d),
            min(10d),
            orientation(SliderOrientation.VERTICAL),
            resolution(100),
            value(Double.valueOf(10d)));
    }
}
