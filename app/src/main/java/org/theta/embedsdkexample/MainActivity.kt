package org.theta.embedsdkexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.theta.embedsdk.ui.ThetaEmbedFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initThetaEmbedSDKFragment()
    }

    private fun initThetaEmbedSDKFragment() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()

        ThetaEmbedFragment.newInstance(
            userId = "USER_ID", //mandatory
            userToken = "USER_TOKEN", //mandatory
            partnerId = "PARTNER_ID", //mandatory
            path = "path" //optional
        ).let { fragment ->
            transaction.add(R.id.rootContainer, fragment)
            transaction.commit()
        }
    }

}
