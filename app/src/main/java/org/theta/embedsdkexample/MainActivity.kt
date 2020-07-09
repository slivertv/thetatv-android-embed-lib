package org.theta.embedsdkexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.theta.embedsdk.ui.EmbedFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initThetaEmbedSDKFragment()
    }

    private fun initThetaEmbedSDKFragment() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        EmbedFragment.newInstance(
            partnerId = "YOUR_PARTNER_ID", //mandatory
            partnerSecret = "YOUR_PARTNER_SECRET", //mandatory
            currentUserId = "CURRENT_USER_ID", //mandatory
            currentUsername = "CURRENT_USERNAME" //optionnal
        ).let { fragment ->
            transaction.add(R.id.rootContainer, fragment)
            transaction.commit()
        }
    }

}