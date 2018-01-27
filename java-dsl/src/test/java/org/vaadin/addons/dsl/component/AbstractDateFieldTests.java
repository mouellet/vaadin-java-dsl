package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.dateField;
import static org.vaadin.addons.dsl.Properties.dateFormat;
import static org.vaadin.addons.dsl.Properties.dateOutOfRangeMessage;
import static org.vaadin.addons.dsl.Properties.defaultValue;
import static org.vaadin.addons.dsl.Properties.lenient;
import static org.vaadin.addons.dsl.Properties.parseErrorMessage;
import static org.vaadin.addons.dsl.Properties.rangeEnd;
import static org.vaadin.addons.dsl.Properties.rangeStart;
import static org.vaadin.addons.dsl.Properties.resolution;
import static org.vaadin.addons.dsl.Properties.showISOWeekNumbers;
import static org.vaadin.addons.dsl.Properties.value;
import static org.vaadin.addons.dsl.Properties.zoneId;

import java.time.LocalDate;
import java.time.ZoneId;

import org.junit.Test;

import com.vaadin.shared.ui.datefield.DateResolution;
import com.vaadin.ui.DateField;

public class AbstractDateFieldTests {

    private static final String DATE_FORMAT = "yyyy-MM-dd";
    private static final String DATE_OUT_OF_RANGE_MESSAGE = "dateOutOfRangeMessage";
    private static final String DEFAULT_VALUE = "2020-01-31";
    private static final String PARSE_ERROR_MESSAGE = "parseErrorMessage";
    private static final String RANGE_START = "1904-01-01";
    private static final String RANGE_END = "2040-12-31";
    private static final DateResolution RESOLUTION = DateResolution.DAY;
    private static final LocalDate VALUE = LocalDate.now();
    private static final ZoneId ZONE_ID = ZoneId.systemDefault();

    @Test
    public void testSpecificPropertySetters() {
        DateField component = dateField(
            dateFormat(DATE_FORMAT),
            dateOutOfRangeMessage(DATE_OUT_OF_RANGE_MESSAGE),
            defaultValue(LocalDate.parse(DEFAULT_VALUE)),
            lenient(true),
            parseErrorMessage(PARSE_ERROR_MESSAGE),
            rangeStart(LocalDate.parse(RANGE_START)),
            rangeEnd(LocalDate.parse(RANGE_END)),
            resolution(RESOLUTION),
            showISOWeekNumbers(true),
            value(VALUE),
            zoneId(ZONE_ID))
                .get();

        assertThat(component.getDateFormat()).isEqualTo(DATE_FORMAT);
        assertThat(component.getDateOutOfRangeMessage()).isEqualTo(DATE_OUT_OF_RANGE_MESSAGE);
        assertThat(component.getDefaultValue()).isEqualTo(DEFAULT_VALUE);
        assertThat(component.isLenient()).isTrue();
        assertThat(component.getParseErrorMessage()).isEqualTo(PARSE_ERROR_MESSAGE);
        assertThat(component.getRangeStart()).isEqualTo(RANGE_START);
        assertThat(component.getRangeEnd()).isEqualTo(RANGE_END);
        assertThat(component.getResolution()).isEqualByComparingTo(RESOLUTION);
        assertThat(component.isShowISOWeekNumbers()).isTrue();
        assertThat(component.getValue()).isEqualTo(VALUE);
        assertThat(component.getZoneId()).isEqualTo(ZONE_ID);
    }
}
