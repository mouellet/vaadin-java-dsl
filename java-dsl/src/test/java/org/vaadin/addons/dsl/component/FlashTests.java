package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.flash;
import static org.vaadin.addons.dsl.Properties.archive;
import static org.vaadin.addons.dsl.Properties.codebase;
import static org.vaadin.addons.dsl.Properties.codetype;
import static org.vaadin.addons.dsl.Properties.parameter;
import static org.vaadin.addons.dsl.Properties.standby;

import org.junit.Test;

import com.vaadin.ui.Flash;

public class FlashTests {

    private static final String ARCHIVE = "archive";
    private static final String CODEBASE = "codebase";
    private static final String CODETYPE = "codetype";
    private static final String PARAMETER_NAME = "name";
    private static final String PARAMETER_VALUE = "value";
    private static final String STANDBY = "standby";

    @Test
    public void testSpecificPropertySetters() {
        Flash component = flash(
            archive(ARCHIVE),
            codebase(CODEBASE),
            codetype(CODETYPE),
            parameter(PARAMETER_NAME, PARAMETER_VALUE),
            standby(STANDBY))
                .get();

        assertThat(component.getArchive()).isEqualTo(ARCHIVE);
        assertThat(component.getCodebase()).isEqualTo(CODEBASE);
        assertThat(component.getCodetype()).isEqualTo(CODETYPE);
        assertThat(component.getParameter(PARAMETER_NAME)).isEqualTo(PARAMETER_VALUE);
        assertThat(component.getStandby()).isEqualTo(STANDBY);
    }
}
