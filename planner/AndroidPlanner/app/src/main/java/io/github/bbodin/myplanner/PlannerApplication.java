package io.github.bbodin.myplanner;

import android.app.Application;

public class PlannerApplication extends Application {

    Planner p = null;

    Planner getPlanner() {
        return p;
    }


}
