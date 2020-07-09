package org.theta.embedsdkexample;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import org.theta.embedsdk.ui.EmbedFragment;

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
        EmbedFragment embedFragment = EmbedFragment.Companion.newInstance(
                "YOUR_PARTNER_ID", //mandatory
                "YOUR_PARTNER_SECRET", //mandatory
                "CURRENT_USER_ID", //mandatory
                "CURRENT_USERNAME" //optionnal
        );
        fragmentTransaction.add(R.id.rootContainer, embedFragment);
        fragmentTransaction.commit();
    }
}
