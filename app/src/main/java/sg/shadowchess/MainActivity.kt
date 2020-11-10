package sg.shadowchess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sg.shadowchess.ui.main.GameFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, GameFragment())
                .commitNow()
        }
    }
}