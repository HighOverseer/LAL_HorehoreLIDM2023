package com.example.horehorelidm.ui.mainpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.horehorelidm.R
import com.example.horehorelidm.databinding.ActivityMainPageBinding
import np.com.susanthapa.curved_bottom_navigation.CbnMenuItem

class MainPageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainPageBinding
    private lateinit var navController: NavController
    private val menuItems = arrayOf(
        CbnMenuItem(
            R.drawable.ic_menu_home,
            R.drawable.ic_avd_menu_home,
            MENU_HOME
        ),
        CbnMenuItem(
            R.drawable.ic_menu_pembelajaran,
            R.drawable.ic_avd_menu_pembelajaran,
            MENU_PEMBELAJARAN
        ),
        CbnMenuItem(
            R.drawable.ic_menu_forum_diskusi,
            R.drawable.ic_avd_menu_forum_diskusi,
            MENU_FORUM_DISKSUI
        ),
        CbnMenuItem(
            R.drawable.ic_menu_chat,
            R.drawable.ic_avd_menu_chat,
            MENU_CHAT
        )
    )

    companion object {
        private const val MENU_HOME = R.id.menu_home
        private const val MENU_PEMBELAJARAN = R.id.menu_pembelajaran
        private const val MENU_FORUM_DISKSUI = R.id.menu_forum_diskusi
        private const val MENU_CHAT = R.id.menu_chat
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpBnv()

    }

    private fun initNavHost() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            navController = navHostFragment.navController
    }

    private fun setUpBnv() {
        binding.apply {
            initNavHost()
            bottomNavigationView.setMenuItems(menuItems, 0)
            bottomNavigationView.setupWithNavController(navController)
        }
    }


}
