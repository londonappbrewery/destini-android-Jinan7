package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    final private story[] Scenarios = new story[]{
            new story(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new story(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new story(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),

    };
    int mcurrentScene;
    int mtopState;
    int mbottomState;
    int mIndex = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcurrentScene = Scenarios[mIndex - 1].getStory();
        mtopState = Scenarios[mIndex - 1].getTopOption();
        mbottomState = Scenarios[mIndex - 1 ].getBottomOption();



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mStoryTextView = (TextView)findViewById(R.id.storyTextView);
            mButtonTop = (Button)findViewById(R.id.buttonTop);
            mButtonBottom = (Button)findViewById(R.id.buttonBottom);
            mStoryTextView.setText(mcurrentScene);
            mButtonTop.setText(mtopState);
            mButtonBottom.setText(mbottomState);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mIndex == 1){
                    mIndex = 3;
                    updateScene(Scenarios[mIndex - 1]);
                } else if (mIndex == 2){
                    mIndex = 3;
                    updateScene(Scenarios[mIndex - 1]);

                } else if (mIndex == 3){
                    mStoryTextView.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }



            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mIndex == 1){
                    mIndex = 2;
                    updateScene(Scenarios[mIndex - 1]);
                } else if (mIndex == 2){
                    mStoryTextView.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);

                } else if (mIndex == 3){
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }

            }
        });




    }
    public void updateScene(story uStory) {
        mStoryTextView.setText(uStory.getStory());
        mButtonTop.setText(uStory.getTopOption());
        mButtonBottom.setText(uStory.getBottomOption());
    }
}
