package org.example.advaned.leehyemin.uniteleven.road;

public class RoadDisplayWithLane extends RoadDisplay {
    public void draw() {
        super.draw();
        drawLane();
    }

    public void drawLane() {
        System.out.println("차선 표시");
    }
}
