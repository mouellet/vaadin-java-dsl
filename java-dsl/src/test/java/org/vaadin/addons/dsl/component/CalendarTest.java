package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.calendar;
import static org.vaadin.addons.dsl.Properties.containerDataSource;
import static org.vaadin.addons.dsl.Properties.endDate;
import static org.vaadin.addons.dsl.Properties.eventCaptionAsHtml;
import static org.vaadin.addons.dsl.Properties.eventProvider;
import static org.vaadin.addons.dsl.Properties.firstDayOfWeek;
import static org.vaadin.addons.dsl.Properties.firstVisibleDayOfWeek;
import static org.vaadin.addons.dsl.Properties.firstVisibleHourOfDay;
import static org.vaadin.addons.dsl.Properties.handler;
import static org.vaadin.addons.dsl.Properties.lastVisibleDayOfWeek;
import static org.vaadin.addons.dsl.Properties.lastVisibleHourOfDay;
import static org.vaadin.addons.dsl.Properties.locale;
import static org.vaadin.addons.dsl.Properties.startDate;
import static org.vaadin.addons.dsl.Properties.timeFormat;
import static org.vaadin.addons.dsl.Properties.weeklyCaptionFormat;

import java.util.Date;
import java.util.Locale;

import org.junit.Test;
import org.vaadin.addons.dsl.test.Pojo;

import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.event.dd.DragAndDropEvent;
import com.vaadin.event.dd.DropHandler;
import com.vaadin.event.dd.acceptcriteria.AcceptCriterion;
import com.vaadin.ui.Calendar;
import com.vaadin.ui.components.calendar.CalendarComponentEvents;
import com.vaadin.ui.components.calendar.CalendarComponentEvents.EventClick;
import com.vaadin.ui.components.calendar.CalendarComponentEvents.RangeSelectEvent;
import com.vaadin.ui.components.calendar.event.BasicEventProvider;
import com.vaadin.ui.components.calendar.handler.BasicBackwardHandler;
import com.vaadin.ui.components.calendar.handler.BasicDateClickHandler;
import com.vaadin.ui.components.calendar.handler.BasicEventMoveHandler;
import com.vaadin.ui.components.calendar.handler.BasicEventResizeHandler;
import com.vaadin.ui.components.calendar.handler.BasicForwardHandler;
import com.vaadin.ui.components.calendar.handler.BasicWeekClickHandler;

public class CalendarTest {

    @Test
    public void testSpecificPropertySetters() {

        Container.Indexed indexedContainer = new BeanItemContainer<>(Pojo.class);

        calendar(
            // FIXME conflicts w. Table
            // containerDataSource(indexedContainer)
            containerDataSource(indexedContainer, "captionProperty", "descriptionProperty", "startDateProperty", "endDateProperty", "styleNameProperty"),
            // FIXME conflicts w. Table
            // dropHandler(new CalendarDropHandler()),
            endDate(new Date()),
            eventCaptionAsHtml(true),
            eventProvider(new BasicEventProvider()),
            firstDayOfWeek(Integer.valueOf(1)),
            firstVisibleDayOfWeek(1),
            firstVisibleHourOfDay(1),
            handler(new BasicBackwardHandler()),
            handler(new BasicDateClickHandler()),
            handler(new BasicEventClickHandler()),
            handler(new BasicEventMoveHandler()),
            handler(new BasicEventResizeHandler()),
            handler(new BasicForwardHandler()),
            handler(new BasicRangeSelectHandler()),
            handler(new BasicWeekClickHandler()),
            lastVisibleDayOfWeek(0),
            lastVisibleHourOfDay(0),
            locale(Locale.getDefault()),
            startDate(new Date()),
            // FIXME conflicts w. DateField
            //timeZone(TimeZone.getDefault()),
            timeFormat(Calendar.TimeFormat.Format24H),
            weeklyCaptionFormat(""));
    }

    static class CalendarDropHandler implements DropHandler {

        @Override
        public void drop(DragAndDropEvent event) {
        }

        @Override
        public AcceptCriterion getAcceptCriterion() {
            return null;
        }
    }

    static class BasicEventClickHandler implements CalendarComponentEvents.EventClickHandler {

        @Override
        public void eventClick(EventClick event) {
        }
    }

    static class BasicRangeSelectHandler implements CalendarComponentEvents.RangeSelectHandler {

        @Override
        public void rangeSelect(RangeSelectEvent event) {
        }
    }

}
