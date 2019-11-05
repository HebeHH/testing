package io.github.bbodin.myplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonAddBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAddBoard = (Button) this.findViewById(R.id.buttonAddBoard);
        buttonAddBoard.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonAddBoard :
                // This is a message from the button Add New Board
                // We need to open a new Activity

                //Intent intent = new Intent(this, AddNewBoardActivity.class);
                //startActivity(intent);
                PlannerApplication app = (PlannerApplication) getApplication();
                Planner p = app.getPlanner();



        }
    }

}
