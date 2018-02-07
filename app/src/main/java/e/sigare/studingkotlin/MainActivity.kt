package e.sigare.studingkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wv.loadUrl("https://www.facebook.com")
        wv.settings.javaScriptEnabled = true
        wv.settings.builtInZoomControls = true
        wv.webViewClient = WebViewClient()
        cb.setText("Xuylo Prinimay")
        sw.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                tv.setText("Sosanuuuul")
            }
            else {
                tv.setText("Xula vikluchil")
            }
        })

    }






}
