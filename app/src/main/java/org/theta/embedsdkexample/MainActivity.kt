package org.theta.embedsdkexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.theta.esmbedsdk.ui.ThetaEmbedFragment

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
            "USER_ID", //mandatory
            "USER_TOKEN", //mandatory
            "PARTNER_ID" //mandatory
        ).let { fragment ->
            transaction.add(R.id.rootContainer, fragment)
            transaction.commit()
        }
    }

}