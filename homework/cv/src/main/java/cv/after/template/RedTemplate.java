package cv.after.template;

import cv.after.template.element.line.LineFactory;
import cv.after.template.element.paragraph.ParagraphFactory;
import cv.after.template.element.paragraph.ParagraphTypes;

public class RedTemplate extends Template {

    public RedTemplate(ParagraphFactory paragraphFactory, LineFactory lineFactory) {
        super(paragraphFactory, lineFactory);
    }

    @Override
    protected void drawBody() {
        layout.addElement(paragraphFactory.create(ParagraphTypes.DEFAULT, "RedTemplate body"));
    }

}