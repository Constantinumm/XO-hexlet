package io.hexlet.xo.model;

import com.sun.tools.internal.xjc.outline.PackageOutline;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by Constantinum on 03.10.16.
 */
public class FieldTest {

    @Test
    public void testGetSize() throws Exception {
        final Field field = new Field();

        assertEquals(3, field.getSize());
    }

    @Test
    public void testSetFigure() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;

        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertEquals(inputFigure, actualFigure);

    }
}