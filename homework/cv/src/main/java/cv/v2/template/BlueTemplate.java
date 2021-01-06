package cv.v2.template;

import cv.v2.template.layout.line.LineFactory;
import cv.v2.template.layout.paragraph.ParagraphFactory;
import cv.v2.template.layout.paragraph.ParagraphTypes;
import org.springframework.stereotype.Component;

@Component
public class BlueTemplate extends Template {

    public BlueTemplate(ParagraphFactory paragraphFactory, LineFactory lineFactory) {
        super(paragraphFactory, lineFactory);
    }

    @Override
    protected void drawBody() {
        layout.addElement(paragraphFactory.create(ParagraphTypes.DEFAULT, "BlueTemplate body"));
    }

}