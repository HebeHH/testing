package io.github.bbodin.myplanner;

class Planner {

    static Planner singlePlanner = null;

    static Planner getPlanner() {
        if (singlePlanner == null) singlePlanner = new Planner();
        return singlePlanner;
    }
    static void setPlanner (Planner p) {
        singlePlanner = p;
    }

}
