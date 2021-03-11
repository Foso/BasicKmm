package de.jensklingenberg.basickmm.androidApp

class MainActivity : SingleFragmentActivity() {
    override fun createFragment() = MainFragment.newInstance()
}
