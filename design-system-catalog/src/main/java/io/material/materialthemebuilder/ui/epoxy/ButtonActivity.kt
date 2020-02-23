package io.material.materialthemebuilder.ui.epoxy

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Flow
import androidx.transition.TransitionManager
import io.material.materialthemebuilder.R
import kotlinx.android.synthetic.main.activity_button.parentView
import kotlinx.android.synthetic.main.activity_button.switch_enable
import kotlinx.android.synthetic.main.activity_button.switch_show_usage
import kotlinx.android.synthetic.main.activity_button.toolbar
import kotlinx.android.synthetic.main.component_buttons.flow

/**
 * Created by lin min phyo on 2020-02-19.
 */
class ButtonActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_button)

    setSupportActionBar(toolbar)
    supportActionBar?.let {
      it.title = "Buttons"
      it.setDisplayHomeAsUpEnabled(true)
    }

    switch_enable.setOnCheckedChangeListener { buttonView, isChecked ->
      if (isChecked) {
        switch_enable.text = "Enable State"
      } else {
        switch_enable.text = "Disable State"
      }

      TransitionManager.beginDelayedTransition(parentView)
      flow.referencedIds.forEach {
        findViewById<View>(it).isEnabled = isChecked
      }
    }

    switch_show_usage.setOnCheckedChangeListener { buttonView, showUsage ->
      TransitionManager.beginDelayedTransition(parentView)
      flow.referencedIds.map { findViewById<View>(it) }
          .forEach {
            if (it !is Button) {
              if (showUsage) {
                flow.setHorizontalStyle(Flow.CHAIN_SPREAD_INSIDE)
                flow.setMaxElementsWrap(2)
                it.visibility = View.VISIBLE
              } else {
                flow.setHorizontalStyle(Flow.CHAIN_SPREAD)
                flow.setMaxElementsWrap(4)
                it.visibility = View.GONE
              }
            }
          }
    }
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    if (item.itemId == android.R.id.home) {
      super.onBackPressed()
      return true
    }
    return super.onOptionsItemSelected(item)
  }
}