package io.hexlet.xo.model;


import io.hexlet.xo.model.exceptions.AlreadyOccupiedExceptions;
import io.hexlet.xo.model.exceptions.InvalidPointExceptions;

import java.awt.*;

public class Field {

    private static final int FIELD_SIZE = 3;

    private static final int MIN_COORDINATE = 0;

    private static final int MAX_COORDINATE = FIELD_SIZE;

    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize() {
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidPointExceptions {
        if (!checkPoint(point)) {
            throw new InvalidPointExceptions();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure)  throws InvalidPointExceptions, AlreadyOccupiedExceptions {
        if (!checkPoint(point)) {
            throw new InvalidPointExceptions();
        }
        if (field[point.x][point.y] != null) {
            throw new AlreadyOccupiedExceptions();
        }
        field[point.x][point.y] = figure;
    }

    private boolean checkPoint(final Point point) {
        return checkCordinate(point.x) && checkCordinate(point.y);
    }

    private boolean checkCordinate(final int coordinate) {
        return coordinate >= MIN_COORDINATE && coordinate < FIELD_SIZE;
    }
}
