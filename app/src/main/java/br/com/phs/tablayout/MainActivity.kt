package br.com.phs.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.phs.tablayout.adapters.ViewPagerAdapter
import br.com.phs.tablayout.fragments.FavoriteFragment
import br.com.phs.tablayout.fragments.HomeFragment
import br.com.phs.tablayout.fragments.SettingsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.setupTabs()

    }

    private fun setupTabs() {

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(FavoriteFragment(), "Favorite")
        adapter.addFragment(SettingsFragment(), "Settings")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
        tabs.getTabAt(0)?.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)?.setIcon(R.drawable.ic_baseline_favorite_24)
        tabs.getTabAt(2)?.setIcon(R.drawable.ic_baseline_settings_24)
    }
}