package org.vaadin.addons.dsl.component;

import static org.vaadin.addons.dsl.Components.upload;
import static org.vaadin.addons.dsl.Properties.buttonCaption;
import static org.vaadin.addons.dsl.Properties.receiver;
import static org.vaadin.addons.dsl.Properties.tabIndex;

import java.io.OutputStream;

import org.junit.Test;

import com.vaadin.ui.Upload;

public class UploadTest {

    @Test
    public void testSpecificPropertySetters() {
        upload(
            buttonCaption(""),
            receiver(new UploadReceiver()),
            tabIndex(1));
    }

    static class UploadReceiver implements Upload.Receiver {

        @Override
        public OutputStream receiveUpload(String filename, String mimeType) {
            return null;
        }
    }
}
