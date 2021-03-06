package com.example.rh.artlive.util;

public class Constants {
	// APP_ID 替换为你的应用从官方网站申请到的合法appId
    public static final String APP_ID = "wx33715f77a6554167";
    public static final int payResult = 0;

    public static class ShowMsgActivity {
		public static final String STitle = "showmsg_title";
		public static final String SMessage = "showmsg_message";
		public static final String BAThumbData = "showmsg_thumb_data";
	}


	public static final String MESSAGE_ATTR_IS_VOICE_CALL = "is_voice_call";
	public static final String MESSAGE_ATTR_IS_VIDEO_CALL = "is_video_call";

	public static final String MESSAGE_ATTR_IS_BIG_EXPRESSION = "em_is_big_expression";
	public static final String MESSAGE_ATTR_EXPRESSION_ID = "em_expression_id";



	public static final int CHATTYPE_SINGLE = 1;
	public static final int CHATTYPE_GROUP = 2;
	public static final int CHATTYPE_CHATROOM = 3;

	public static final String EXTRA_CHAT_TYPE = "chatType";
	public static final String EXTRA_USER_ID = "userId";
	public static final String NEW_FRIENDS_USERNAME = "item_new_friends";
	public static final String GROUP_USERNAME = "item_groups";
	public static final String CHAT_ROOM = "item_chatroom";
	public static final String ACCOUNT_REMOVED = "account_removed";
	public static final String ACCOUNT_CONFLICT = "conflict";
	public static final String CHAT_ROBOT = "item_robots";
	public static final String MESSAGE_ATTR_ROBOT_MSGTYPE = "msgtype";
	public static final String ACTION_GROUP_CHANAGED = "action_group_changed";
	public static final String ACTION_CONTACT_CHANAGED = "action_contact_changed";

	//Myinfo中保存环信账号
	public static final String KEY_USERNAME = "username";
}
