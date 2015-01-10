package me.tripsit.mobile;

import me.tripsit.mobile.builders.LayoutBuilder;
import me.tripsit.mobile.chat.Chat;
import me.tripsit.mobile.chat.Constants;
import me.tripsit.mobile.factsheets.Factsheets;
import me.tripsit.mobile.wiki.Wiki;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * The main menu activity which is shown to the user on startup
 * @author Eddie Curtis
 */
public class Menu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(LayoutBuilder.buildLinearLayout(this, R.layout.activity_menu, LayoutBuilder.buildParamsLinearCenterHorizontal()));
	}
	
	public void clickTripsit(View view) {
		startChatActivity(Constants.TRIPSIT_URL);
	}
	
	public void clickGeneralChat(View view) {
		startChatActivity(Constants.GENERAL_URL);
	}
	
	public void clickFactsheets(View view) {
		Intent intent = new Intent(this, Factsheets.class);
		startActivity(intent);
	}
	
	public void clickWiki(View view) {
		Intent intent = new Intent(this, Wiki.class);
		startActivity(intent);
	}

	private void startChatActivity(String chatUrl) {
		Intent intent = new Intent(this, Chat.class);
		intent.putExtra("url", chatUrl);
		startActivity(intent);
	}
}