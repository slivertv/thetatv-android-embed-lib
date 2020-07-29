package org.theta.embedsdkexample;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import org.theta.embedsdk.models.EmbedOption;
import org.theta.embedsdk.ui.ThetaEmbedFragment;

import java.util.ArrayList;

public class MainActivityJava extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initThetaEmbedSDKFragment();
    }

    private void initThetaEmbedSDKFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ThetaEmbedFragment embedFragment = ThetaEmbedFragment.newInstance(
                "USER_ID", //mandatory
                "USER_TOKEN", //mandatory
                "PARTNER_ID", //mandatory
                null, //options for future release
                "PATH" //optional
        );
        fragmentTransaction.add(R.id.rootContainer, embedFragment);
        fragmentTransaction.commit();
    }

}
