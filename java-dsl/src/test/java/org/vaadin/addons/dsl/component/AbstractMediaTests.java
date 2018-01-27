package org.vaadin.addons.dsl.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vaadin.addons.dsl.Components.video;
import static org.vaadin.addons.dsl.Properties.altText;
import static org.vaadin.addons.dsl.Properties.autoplay;
import static org.vaadin.addons.dsl.Properties.loop;
import static org.vaadin.addons.dsl.Properties.muted;
import static org.vaadin.addons.dsl.Properties.preload;
import static org.vaadin.addons.dsl.Properties.showControls;
import static org.vaadin.addons.dsl.Properties.sources;

import org.junit.Test;

import com.vaadin.server.ExternalResource;
import com.vaadin.shared.ui.PreloadMode;
import com.vaadin.ui.Video;

public class AbstractMediaTests {

    private static final String ALT_TEXT = "altText";
    private static final PreloadMode PRELOAD_MODE = PreloadMode.NONE;
    private static final ExternalResource SOURCES = new ExternalResource("");

    @Test
    public void testProperties() {
        Video component = video(
            altText(ALT_TEXT),
            autoplay(false),
            loop(false),
            muted(false),
            preload(PRELOAD_MODE),
            showControls(true),
            sources(SOURCES)).get();

        assertThat(component.getAltText()).isEqualTo(ALT_TEXT);
        assertThat(component.isAutoplay()).isFalse();
        assertThat(component.isLoop()).isFalse();
        assertThat(component.isMuted()).isFalse();
        assertThat(component.getPreload()).isEqualTo(PRELOAD_MODE);
        assertThat(component.isShowControls()).isTrue();
        assertThat(component.getSources()).contains(SOURCES);
    }

}
