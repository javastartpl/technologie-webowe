package pl.javastart.paintcalc;

import java.util.Arrays;

class PaintCalculator {
    static int calculatePaintArea(Room room,
                                  ConstructionElement[] constructionElements) {
        int wallArea = room.getWallArea();
        int cutArea = getConstructionElementsArea(constructionElements);
        return wallArea - cutArea;
    }

    static int calculatePaintAmount(Room room,
                                    ConstructionElement[] constructionElements,
                                    PaintDetails paintDetails) {
        int areaToPaint = calculatePaintArea(room, constructionElements);
        int coverage = paintDetails.getCoverage();
        int singleCoatLiters = areaToPaint / coverage;
        int multipleCoatsLiters = singleCoatLiters * paintDetails.getCoats();
        return multipleCoatsLiters;
    }

    private static int getConstructionElementsArea(ConstructionElement[] constructionElements) {
        return Arrays.stream(constructionElements)
                .mapToInt(ConstructionElement::getArea)
                .sum();
    }

}
