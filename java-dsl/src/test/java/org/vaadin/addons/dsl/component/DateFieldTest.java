package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.dateField;
import static org.vaadin.addons.dsl.Properties.dateFormat;
import static org.vaadin.addons.dsl.Properties.dateOutOfRangeMessage;
import static org.vaadin.addons.dsl.Properties.lenient;
import static org.vaadin.addons.dsl.Properties.parseErrorMessage;
import static org.vaadin.addons.dsl.Properties.rangeEnd;
import static org.vaadin.addons.dsl.Properties.rangeStart;
import static org.vaadin.addons.dsl.Properties.resolution;
import static org.vaadin.addons.dsl.Properties.showISOWeekNumbers;
import static org.vaadin.addons.dsl.Properties.timeZone;

import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

import com.vaadin.shared.ui.datefield.Resolution;

public class DateFieldTest {

    @Test
    public void testSpecificPropertySetters() {
        dateField(
            dateFormat(""),
            dateOutOfRangeMessage(""),
            lenient(true),
            parseErrorMessage(""),
            rangeEnd(new Date()),
            rangeStart(new Date()),
            resolution(Resolution.HOUR),
            showISOWeekNumbers(true),
            timeZone(TimeZone.getDefault()));
    }
}
