package kz.tokarev.myapplication.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import kz.tokarev.myapplication.data.Entity.Film
import kz.tokarev.myapplication.view.notifications.NotificationConstants
import kz.tokarev.myapplication.view.notifications.NotificationHelper

class ReminderBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val bundle = intent?.getBundleExtra(NotificationConstants.FILM_BUNDLE_KEY)
        val film: Film = bundle?.get(NotificationConstants.FILM_KEY) as Film

        NotificationHelper.createNotification(context!!, film)
    }
}