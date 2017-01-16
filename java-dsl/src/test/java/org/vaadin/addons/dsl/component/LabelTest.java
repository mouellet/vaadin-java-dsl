package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.label;
import static org.vaadin.addons.dsl.Properties.contentMode;
import static org.vaadin.addons.dsl.Properties.locale;
import static org.vaadin.addons.dsl.Properties.propertyDataSource;

import java.util.Locale;

import org.junit.Test;

import com.vaadin.data.util.ObjectProperty;
import com.vaadin.data.util.converter.Converter;
import com.vaadin.shared.ui.label.ContentMode;

public class LabelTest {

    @Test
    public void testSpecificPropertySetters() {

        label(
            contentMode(ContentMode.HTML),
            // FIXME conflicts w. AbstractField
            // converter(new LabelConverter()),
            locale(Locale.getDefault()),
            // FIXME conflicts w. AbstractTextField
            // value("value"),
            propertyDataSource(new ObjectProperty<>("Test")));
    }

    static class LabelConverter implements Converter<String, Object> {

        @Override
        public Object convertToModel(String value, Class<? extends Object> targetType, Locale locale)
                throws com.vaadin.data.util.converter.Converter.ConversionException {
            return null;
        }

        @Override
        public String convertToPresentation(Object value, Class<? extends String> targetType, Locale locale)
                throws com.vaadin.data.util.converter.Converter.ConversionException {
            return null;
        }

        @Override
        public Class<Object> getModelType() {
            return null;
        }

        @Override
        public Class<String> getPresentationType() {
            return null;
        }
    }
}
