package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.checkBox;
import static org.vaadin.addons.dsl.Properties.buffered;
import static org.vaadin.addons.dsl.Properties.conversionError;
import static org.vaadin.addons.dsl.Properties.convertedValue;
import static org.vaadin.addons.dsl.Properties.converter;
import static org.vaadin.addons.dsl.Properties.currentBufferedSourceException;
import static org.vaadin.addons.dsl.Properties.invalidAllowed;
import static org.vaadin.addons.dsl.Properties.invalidCommitted;
import static org.vaadin.addons.dsl.Properties.locale;
import static org.vaadin.addons.dsl.Properties.propertyDataSource;
import static org.vaadin.addons.dsl.Properties.readOnly;
import static org.vaadin.addons.dsl.Properties.required;
import static org.vaadin.addons.dsl.Properties.requiredError;
import static org.vaadin.addons.dsl.Properties.tabIndex;
import static org.vaadin.addons.dsl.Properties.validationVisible;
import static org.vaadin.addons.dsl.Properties.value;

import java.util.Locale;

import org.junit.Test;

import com.vaadin.data.util.ObjectProperty;
import com.vaadin.data.util.converter.Converter;

public class AbstractFieldTest {

    @Test
    public void testSpecificPropertySetters() {
        checkBox(
            buffered(true),
            conversionError(""),
            convertedValue(new Object()),
            converter(new AbstractFieldConverter()),
            converter(AbstractFieldConverter.class),
            currentBufferedSourceException(null),
            invalidAllowed(true),
            invalidCommitted(true),
            locale(Locale.getDefault()),
            propertyDataSource(new ObjectProperty<>("Test")),
            readOnly(true),
            required(true),
            requiredError(""),
            tabIndex(1),
            validationVisible(true),
            value(new Object()));
    }

    static class AbstractFieldConverter implements Converter<String, Object> {

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
