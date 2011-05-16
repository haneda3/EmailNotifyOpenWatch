package com.haneda3.emailnotifyopenwatch;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Receiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent it = new Intent("com.smartmadsoft.openwatch.action.ENVELOPE");
		context.sendBroadcast(it);
	}

}
