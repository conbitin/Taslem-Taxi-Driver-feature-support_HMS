package org.xms.f.messaging;

/**
 * A remote Message.Messages will be received via onMessageReceived(RemoteMessage)and can be sent via send(RemoteMessage).<br/>
 * Combination of com.huawei.hms.push.RemoteMessage and com.google.firebase.messaging.RemoteMessage.<br/>
 * com.huawei.hms.push.RemoteMessage: A message entity class. An app calls the onMessageReceived(RemoteMessage) method in HmsMessageService to receive messages pushed by the server and calls the send(RemoteMessage) method in HmsMessaging to send uplink messages.<br/>
 * com.google.firebase.messaging.RemoteMessage: A remote Firebase Message.Messages will be received via onMessageReceived(RemoteMessage)and can be sent via send(RemoteMessage).<br/>
 */
public final class RemoteMessage extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.push.RemoteMessage.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5</a><br/>
     * com.google.firebase.messaging.RemoteMessage.CREATOR: <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.f.messaging.RemoteMessage createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.push.RemoteMessage hReturn = com.huawei.hms.push.RemoteMessage.CREATOR.createFromParcel(param0);
                return new org.xms.f.messaging.RemoteMessage(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.firebase.messaging.RemoteMessage gReturn = com.google.firebase.messaging.RemoteMessage.CREATOR.createFromParcel(param0);
                return new org.xms.f.messaging.RemoteMessage(new org.xms.g.utils.XBox(gReturn, null));
            }
        }
        
        public org.xms.f.messaging.RemoteMessage[] newArray(int param0) {
            return new org.xms.f.messaging.RemoteMessage[param0];
        }
    };
    
    /**
     * org.xms.f.messaging.RemoteMessage.RemoteMessage(org.xms.g.utils.XBox) constructor of RemoteMessage with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public RemoteMessage(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getPRIORITY_HIGH() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.PRIORITY_HIGH: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section162751911413">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section162751911413</a><br/>
     * com.google.firebase.messaging.RemoteMessage.PRIORITY_HIGH: <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-static-final-int-priority_high">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-static-final-int-priority_high</a><br/>
     *
     * @return Constant Value
     */
    public static int getPRIORITY_HIGH() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.push.RemoteMessage.PRIORITY_HIGH");
            return com.huawei.hms.push.RemoteMessage.PRIORITY_HIGH;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.messaging.RemoteMessage.PRIORITY_HIGH");
            return com.google.firebase.messaging.RemoteMessage.PRIORITY_HIGH;
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getPRIORITY_NORMAL() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.PRIORITY_NORMAL: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section368914251048">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section368914251048</a><br/>
     * com.google.firebase.messaging.RemoteMessage.PRIORITY_NORMAL: <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-static-final-int-priority_normal">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-static-final-int-priority_normal</a><br/>
     *
     * @return Constant Value
     */
    public static int getPRIORITY_NORMAL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.push.RemoteMessage.PRIORITY_NORMAL");
            return com.huawei.hms.push.RemoteMessage.PRIORITY_NORMAL;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.messaging.RemoteMessage.PRIORITY_NORMAL");
            return com.google.firebase.messaging.RemoteMessage.PRIORITY_NORMAL;
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getPRIORITY_UNKNOWN() Constant Value0.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.PRIORITY_UNKNOWN: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section104140235414">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section104140235414</a><br/>
     * com.google.firebase.messaging.RemoteMessage.PRIORITY_UNKNOWN: <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-static-final-int-priority_unknown">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-static-final-int-priority_unknown</a><br/>
     *
     * @return Constant Value
     */
    public static int getPRIORITY_UNKNOWN() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.push.RemoteMessage.PRIORITY_UNKNOWN");
            return com.huawei.hms.push.RemoteMessage.PRIORITY_UNKNOWN;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.messaging.RemoteMessage.PRIORITY_UNKNOWN");
            return com.google.firebase.messaging.RemoteMessage.PRIORITY_UNKNOWN;
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getCollapseKey() Gets the collapse key of the message.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.getCollapseKey(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section159361469">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section159361469</a><br/>
     * com.google.firebase.messaging.RemoteMessage.getCollapseKey(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-string-getcollapsekey">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-string-getcollapsekey</a><br/>
     *
     * @return The collapse key
     */
    public final java.lang.String getCollapseKey() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getCollapseKey()");
            return ((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getCollapseKey();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getCollapseKey()");
            return ((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getCollapseKey();
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getData() Gets the message payload data.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.getDataOfMap(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section164939120564">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section164939120564</a><br/>
     * com.google.firebase.messaging.RemoteMessage.getData(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-mapstring,-string-getdata">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-mapstring,-string-getdata</a><br/>
     *
     * @return A map of the message payload
     */
    public final java.util.Map<java.lang.String, java.lang.String> getData() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getDataOfMap()");
            return ((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getDataOfMap();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getData()");
            return ((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getData();
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getFrom() Get the sender of this message.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.getFrom(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section41231931104710">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section41231931104710</a><br/>
     * com.google.firebase.messaging.RemoteMessage.getFrom(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-string-getfrom">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-string-getfrom</a><br/>
     *
     * @return The message sender
     */
    public final java.lang.String getFrom() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getFrom()");
            return ((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getFrom();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getFrom()");
            return ((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getFrom();
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getMessageId() Gets the message's ID.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.getMessageId(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section1933912164816">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section1933912164816</a><br/>
     * com.google.firebase.messaging.RemoteMessage.getMessageId(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-string-getmessageid">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-string-getmessageid</a><br/>
     *
     * @return The message ID
     */
    public final java.lang.String getMessageId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getMessageId()");
            return ((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getMessageId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getMessageId()");
            return ((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getMessageId();
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getMessageType() Gets the type of message.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.getMessageType(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section653130184812">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section653130184812</a><br/>
     * com.google.firebase.messaging.RemoteMessage.getMessageType(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-string-getmessagetype">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-string-getmessagetype</a><br/>
     *
     * @return The message type
     */
    public final java.lang.String getMessageType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getMessageType()");
            return ((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getMessageType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getMessageType()");
            return ((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getMessageType();
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getNotification() Gets the notification data from the message if set.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.getNotification(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section816573816551">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section816573816551</a><br/>
     * com.google.firebase.messaging.RemoteMessage.getNotification(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-remotemessage.notification-getnotification">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-remotemessage.notification-getnotification</a><br/>
     *
     * @return The message notification or null
     */
    public org.xms.f.messaging.RemoteMessage.Notification getNotification() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getNotification()");
            com.huawei.hms.push.RemoteMessage.Notification hReturn = ((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getNotification();
            return ((hReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Notification(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getNotification()");
            com.google.firebase.messaging.RemoteMessage.Notification gReturn = ((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getNotification();
            return ((gReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Notification(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getOriginalPriority() Gets the original priority of message.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.getOriginalUrgency(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section028925611313">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section028925611313</a><br/>
     * com.google.firebase.messaging.RemoteMessage.getOriginalPriority(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-int-getoriginalpriority">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-int-getoriginalpriority</a><br/>
     *
     * @return The original message priority
     */
    public int getOriginalPriority() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getOriginalUrgency()");
            return ((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getOriginalUrgency();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getOriginalPriority()");
            return ((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getOriginalPriority();
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getPriority() Gets the priority of message as delivered. This may be lower than the priority originally requested.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.getUrgency(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section14854816165518">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section14854816165518</a><br/>
     * com.google.firebase.messaging.RemoteMessage.getPriority(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-int-getpriority">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-int-getpriority</a><br/>
     *
     * @return The message priority as delivered
     */
    public int getPriority() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getUrgency()");
            return ((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getUrgency();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getPriority()");
            return ((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getPriority();
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getSentTime() Gets the time in milliseconds from the Epoch that the message was sent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.getSentTime(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section9257184819485">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section9257184819485</a><br/>
     * com.google.firebase.messaging.RemoteMessage.getSentTime(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-long-getsenttime">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-long-getsenttime</a><br/>
     *
     * @return The time that the message was sent
     */
    public long getSentTime() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getSentTime()");
            return ((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getSentTime();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getSentTime()");
            return ((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getSentTime();
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getTo() Gets the message destination.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.getTo(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section1553225218479">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section1553225218479</a><br/>
     * com.google.firebase.messaging.RemoteMessage.getTo(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-string-getto">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-string-getto</a><br/>
     *
     * @return the message destination
     */
    public final java.lang.String getTo() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getTo()");
            return ((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getTo();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getTo()");
            return ((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getTo();
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.getTtl() Gets the message time to live(TTL)in seconds.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.push.RemoteMessage.getTtl(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section12778237175419">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-0000001050171874-V5#EN-US_TOPIC_0000001050171874__section12778237175419</a><br/>
     * com.google.firebase.messaging.RemoteMessage.getTtl(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-int-getttl">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-int-getttl</a><br/>
     *
     * @return The message TTL
     */
    public int getTtl() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getTtl()");
            return ((com.huawei.hms.push.RemoteMessage) this.getHInstance()).getTtl();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getTtl()");
            return ((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).getTtl();
        }
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.firebase.messaging.RemoteMessage.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 this param is android os parcel
     * @param param1 this param is int
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.push.RemoteMessage) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.firebase.messaging.RemoteMessage) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.f.messaging.RemoteMessage.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted RemoteMessage object
     */
    public static org.xms.f.messaging.RemoteMessage dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.messaging.RemoteMessage) param0);
    }
    
    /**
     * org.xms.f.messaging.RemoteMessage.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.push.RemoteMessage;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.messaging.RemoteMessage;
        }
    }
    
    /**
     * Builder object for constructing RemoteMessage instances.<br/>
     * Combination of com.huawei.hms.push.RemoteMessage.Builder and com.google.firebase.messaging.RemoteMessage.Builder.<br/>
     * com.huawei.hms.push.RemoteMessage.Builder: Constructs a RemoteMessage instance.<br/>
     * com.google.firebase.messaging.RemoteMessage.Builder: Builder object for constructing RemoteMessage instances.<br/>
     */
    public static class Builder extends org.xms.g.utils.XObject {
        
        
        
        /**
         * org.xms.f.messaging.RemoteMessage.Builder.Builder(org.xms.g.utils.XBox) constructor of Builder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Builder.Builder(java.lang.String) An argument constructor of the RemoteMessage.Builder class.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.messaging.RemoteMessage.Builder.Builder(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-string-to">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-string-to</a><br/>
         *
         * @param param0 The destination of the message
         */
        public Builder(java.lang.String param0) {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                this.setHInstance(new com.huawei.hms.push.RemoteMessage.Builder("push.hcm.upstream"));
            } else {
                this.setGInstance(new com.google.firebase.messaging.RemoteMessage.Builder(param0));
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Builder.addData(java.lang.String,java.lang.String) Adds a data key value pair to the message.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Builder.addData(java.lang.String,java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section1147917462010">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section1147917462010</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Builder.addData(java.lang.String,java.lang.String): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-adddata-string-key,-string-value">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-adddata-string-key,-string-value</a><br/>
         *
         * @param param0 this param is key
         * @param param1 this param is value
         * @return the Builder
         */
        public org.xms.f.messaging.RemoteMessage.Builder addData(java.lang.String param0, java.lang.String param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).addData(param0, param1)");
                com.huawei.hms.push.RemoteMessage.Builder hReturn = ((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).addData(param0, param1);
                return ((hReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).addData(param0, param1)");
                com.google.firebase.messaging.RemoteMessage.Builder gReturn = ((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).addData(param0, param1);
                return ((gReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Builder.build() Build a RemoteMessage instance.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Builder.build(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section2596125719512">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section2596125719512</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Builder.build(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage-build">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage-build</a><br/>
         *
         * @return RemoteMessage instance
         */
        public org.xms.f.messaging.RemoteMessage build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).build()");
                com.huawei.hms.push.RemoteMessage hReturn = ((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).build()");
                com.google.firebase.messaging.RemoteMessage gReturn = ((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Builder.clearData() Clears the message data.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Builder.clearData(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section1368753117116">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section1368753117116</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Builder.clearData(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-cleardata">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-cleardata</a><br/>
         *
         * @return the Builder
         */
        public org.xms.f.messaging.RemoteMessage.Builder clearData() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).clearData()");
                com.huawei.hms.push.RemoteMessage.Builder hReturn = ((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).clearData();
                return ((hReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).clearData()");
                com.google.firebase.messaging.RemoteMessage.Builder gReturn = ((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).clearData();
                return ((gReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Builder.setCollapseKey(java.lang.String) Sets the collapse key of the message.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Builder.setCollapseKey(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section62580523210">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section62580523210</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Builder.setCollapseKey(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-setcollapsekey-string-collapsekey">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-setcollapsekey-string-collapsekey</a><br/>
         *
         * @param param0 the collapse key of the message
         * @return the Builder
         */
        public org.xms.f.messaging.RemoteMessage.Builder setCollapseKey(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).setCollapseKey(param0)");
                com.huawei.hms.push.RemoteMessage.Builder hReturn = ((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).setCollapseKey(param0);
                return ((hReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).setCollapseKey(param0)");
                com.google.firebase.messaging.RemoteMessage.Builder gReturn = ((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).setCollapseKey(param0);
                return ((gReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.messaging.RemoteMessage.Builder setData(java.util.Map<java.lang.String, java.lang.String> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).setData(param0)");
                com.huawei.hms.push.RemoteMessage.Builder hReturn = ((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).setData(param0);
                return ((hReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).setData(param0)");
                com.google.firebase.messaging.RemoteMessage.Builder gReturn = ((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).setData(param0);
                return ((gReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Builder.setMessageId(java.lang.String) Sets the messages ID.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Builder.setMessageId(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section685355220114">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section685355220114</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Builder.setMessageId(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-setmessageid-string-messageid">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-setmessageid-string-messageid</a><br/>
         *
         * @param param0 ID of the message
         * @return the Builder
         */
        public org.xms.f.messaging.RemoteMessage.Builder setMessageId(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).setMessageId(param0)");
                com.huawei.hms.push.RemoteMessage.Builder hReturn = ((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).setMessageId(param0);
                return ((hReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).setMessageId(param0)");
                com.google.firebase.messaging.RemoteMessage.Builder gReturn = ((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).setMessageId(param0);
                return ((gReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Builder.setMessageType(java.lang.String) Sets the type of message.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Builder.setMessageType(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section882015111525">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section882015111525</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Builder.setMessageType(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-setmessagetype-string-messagetype">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-setmessagetype-string-messagetype</a><br/>
         *
         * @param param0 the type of message
         * @return the Builder
         */
        public org.xms.f.messaging.RemoteMessage.Builder setMessageType(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).setMessageType(param0)");
                com.huawei.hms.push.RemoteMessage.Builder hReturn = ((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).setMessageType(param0);
                return ((hReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).setMessageType(param0)");
                com.google.firebase.messaging.RemoteMessage.Builder gReturn = ((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).setMessageType(param0);
                return ((gReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Builder.setTtl(int) Sets the message time to live in seconds.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Builder.setTtl(int): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section152265331222">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-builder-0000001050413831-V5#EN-US_TOPIC_0000001050413831__section152265331222</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Builder.setTtl(int): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-setttl-int-ttl">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Builder#public-remotemessage.builder-setttl-int-ttl</a><br/>
         *
         * @param param0 Maximum cache duration of an offline message set
         * @return the Builder
         */
        public org.xms.f.messaging.RemoteMessage.Builder setTtl(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).setTtl(param0)");
                com.huawei.hms.push.RemoteMessage.Builder hReturn = ((com.huawei.hms.push.RemoteMessage.Builder) this.getHInstance()).setTtl(param0);
                return ((hReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).setTtl(param0)");
                com.google.firebase.messaging.RemoteMessage.Builder gReturn = ((com.google.firebase.messaging.RemoteMessage.Builder) this.getGInstance()).setTtl(param0);
                return ((gReturn) == null ? null : (new org.xms.f.messaging.RemoteMessage.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Builder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.f.messaging.RemoteMessage.Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted RemoteMessage Builder object
         */
        public static org.xms.f.messaging.RemoteMessage.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.f.messaging.RemoteMessage.Builder) param0);
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Builder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.push.RemoteMessage.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.messaging.RemoteMessage.Builder;
            }
        }
    }
    
    /**
     * Remote Firebase notification details.<br/>
     * Combination of com.huawei.hms.push.RemoteMessage.Notification and com.google.firebase.messaging.RemoteMessage.Notification.<br/>
     * com.huawei.hms.push.RemoteMessage.Notification: An internal class of the RemoteMessage class that indicates the notification message.<br/>
     * com.google.firebase.messaging.RemoteMessage.Notification: Remote Firebase notification details.<br/>
     */
    public static class Notification extends org.xms.g.utils.XObject {
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.Notification(org.xms.g.utils.XBox) constructor of Notification with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public Notification(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getBody() Gets the body of the notification, or null if not set.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getBody(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section0293164418620">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section0293164418620</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getBody(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getbody">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getbody</a><br/>
         *
         * @return the body of the notification
         */
        public java.lang.String getBody() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getBody()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getBody();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getBody()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getBody();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getBodyLocalizationArgs() Gets the variable string values to be used as format specifiers in the body localization key, or null if not set.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getBodyLocalizationArgs(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1595311167">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1595311167</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getBodyLocalizationArgs(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string[]-getbodylocalizationargs">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string[]-getbodylocalizationargs</a><br/>
         *
         * @return the variable string values to be used as format specifiers in the body localization key, or null if not set
         */
        public java.lang.String[] getBodyLocalizationArgs() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getBodyLocalizationArgs()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getBodyLocalizationArgs();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getBodyLocalizationArgs()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getBodyLocalizationArgs();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getBodyLocalizationKey() Gets the string resource name to use to localize the body of the notification, or null if not set.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getBodyLocalizationKey(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1299714151664">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1299714151664</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getBodyLocalizationKey(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getbodylocalizationkey">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getbodylocalizationkey</a><br/>
         *
         * @return the string resource name to use to localize the body of the notification, or null if not set
         */
        public java.lang.String getBodyLocalizationKey() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getBodyLocalizationKey()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getBodyLocalizationKey();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getBodyLocalizationKey()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getBodyLocalizationKey();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getChannelId() Gets the channel id from the notification, or null if not set.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getChannelId(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section2399714185">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section2399714185</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getChannelId(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getchannelid">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getchannelid</a><br/>
         *
         * @return the channel id from the notification, or null if not set
         */
        public java.lang.String getChannelId() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getChannelId()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getChannelId();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getChannelId()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getChannelId();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getClickAction() Gets the action to be performed on the user opening the notification, or null if not set.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getClickAction(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section48145015817">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section48145015817</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getClickAction(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getclickaction">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getclickaction</a><br/>
         *
         * @return the action to be performed on the user opening the notification, or null if not set
         */
        public java.lang.String getClickAction() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getClickAction()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getClickAction();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getClickAction()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getClickAction();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getColor() Gets the color of the notification, or null if not set.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getColor(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1195064419719">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1195064419719</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getColor(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getcolor">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getcolor</a><br/>
         *
         * @return the color of the notification, or null if not set
         */
        public java.lang.String getColor() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getColor()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getColor();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getColor()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getColor();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getDefaultLightSettings() Gets whether or not the notification uses the default notification light settings.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.isDefaultLight(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section147508181697">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section147508181697</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getDefaultLightSettings(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-boolean-getdefaultlightsettings">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-boolean-getdefaultlightsettings</a><br/>
         *
         * @return true if it is set to true; Otherwise false
         */
        public boolean getDefaultLightSettings() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).isDefaultLight()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).isDefaultLight();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getDefaultLightSettings()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getDefaultLightSettings();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getDefaultSound() Gets whether or not the notification uses the default sound.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.isDefaultSound(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section83251437591">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section83251437591</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getDefaultSound(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-boolean-getdefaultsound">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-boolean-getdefaultsound</a><br/>
         *
         * @return true if it is set to true; Otherwise false
         */
        public boolean getDefaultSound() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).isDefaultSound()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).isDefaultSound();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getDefaultSound()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getDefaultSound();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getDefaultVibrateSettings() Gets whether or not the notification uses the default vibrate pattern.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.isDefaultVibrate(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section7638452599">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section7638452599</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getDefaultVibrateSettings(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-boolean-getdefaultvibratesettings">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-boolean-getdefaultvibratesettings</a><br/>
         *
         * @return true if it is set to true; Otherwise false
         */
        public boolean getDefaultVibrateSettings() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).isDefaultVibrate()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).isDefaultVibrate();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getDefaultVibrateSettings()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getDefaultVibrateSettings();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getEventTime() Gets the eventTime from the notification.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getWhen(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section43202881017">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section43202881017</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getEventTime(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-long-geteventtime">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-long-geteventtime</a><br/>
         *
         * @return the eventTime from the notification
         */
        public java.lang.Long getEventTime() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getWhen()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getWhen();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getEventTime()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getEventTime();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getIcon() Gets the image resource name of the icon of the notification, or null if not set.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getIcon(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section673585920617">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section673585920617</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getIcon(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-geticon">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-geticon</a><br/>
         *
         * @return the image resource name of the icon of the notification, or null if not set
         */
        public java.lang.String getIcon() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getIcon()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getIcon();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getIcon()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getIcon();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getImageUrl() Gets the image URL from the notification.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getImageUrl(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1901430885">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1901430885</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getImageUrl(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-uri-getimageurl">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-uri-getimageurl</a><br/>
         *
         * @return The image URL if it was set, null otherwise
         */
        public android.net.Uri getImageUrl() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getImageUrl()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getImageUrl();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getImageUrl()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getImageUrl();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getLightSettings() Gets the lightSettings from the notification.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getLightSettings(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section265272512102">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section265272512102</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getLightSettings(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-int[]-getlightsettings">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-int[]-getlightsettings</a><br/>
         *
         * @return the lightSettings from the notification
         */
        public int[] getLightSettings() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getLightSettings()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getLightSettings();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getLightSettings()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getLightSettings();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getLink() Gets the deep link from the notification, or null if not set.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getLink(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section18340165018815">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section18340165018815</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getLink(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-uri-getlink">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-uri-getlink</a><br/>
         *
         * @return the deep link from the notification, or null if not set
         */
        public android.net.Uri getLink() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getLink()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getLink();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getLink()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getLink();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getLocalOnly() Gets whether or not this notification is only relevant to the current device.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getLocalOnly(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-boolean-getlocalonly">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-boolean-getlocalonly</a><br/>
         *
         * @return true if it is set to true; Otherwise false
         */
        public boolean getLocalOnly() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).isLocalOnly()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).isLocalOnly();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getLocalOnly()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getLocalOnly();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getNotificationCount() Gets the notificationCount from the notification.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getBadgeNumber(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section10355156151010">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section10355156151010</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getNotificationCount(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-integer-getnotificationcount">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-integer-getnotificationcount</a><br/>
         *
         * @return the notificationCount from the notification
         */
        public java.lang.Integer getNotificationCount() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getBadgeNumber()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getBadgeNumber();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getNotificationCount()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getNotificationCount();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getNotificationPriority() Gets the notificationPriority from the notification.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getImportance(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section13184843141118">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section13184843141118</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getNotificationPriority(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-integer-getnotificationpriority">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-integer-getnotificationpriority</a><br/>
         *
         * @return the notificationPriority from the notification
         */
        public java.lang.Integer getNotificationPriority() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getImportance()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getImportance();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getNotificationPriority()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getNotificationPriority();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getSound() Gets the sound to be played when the notification is shown, or null if not set.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getSound(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section963611412714">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section963611412714</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getSound(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getsound">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getsound</a><br/>
         *
         * @return the sound to be played when the notification is shown, or null if not set
         */
        public java.lang.String getSound() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getSound()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getSound();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getSound()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getSound();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getSticky() Gets whether or not the notification is considered sticky.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.isAutoCancel(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1388462315113">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1388462315113</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getSticky(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-boolean-getsticky">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-boolean-getsticky</a><br/>
         *
         * @return true if it is set to true; Otherwise false
         */
        public boolean getSticky() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).isAutoCancel()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).isAutoCancel();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getSticky()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getSticky();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getTag() Gets the tag of the notification, or null if not set.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getTag(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section68320303716">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section68320303716</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getTag(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-gettag">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-gettag</a><br/>
         *
         * @return the tag of the notification, or null if not set
         */
        public java.lang.String getTag() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getTag()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getTag();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getTag()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getTag();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getTicker() Gets the ticker text from the notification.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getTicker(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section49128181210">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section49128181210</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getTicker(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getticker">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-getticker</a><br/>
         *
         * @return the ticker text from the notification
         */
        public java.lang.String getTicker() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getTicker()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getTicker();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getTicker()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getTicker();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getTitle() Gets the title of the notification, or null if not set.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getTitle(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1092415181551">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1092415181551</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getTitle(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-gettitle">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-gettitle</a><br/>
         *
         * @return the title of the notification, or null if not set
         */
        public java.lang.String getTitle() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getTitle()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getTitle();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getTitle()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getTitle();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getTitleLocalizationArgs() Gets the variable string values to be used as format specifiers in the title localization key, or null if not set.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getTitleLocalizationArgs(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section7477125819511">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section7477125819511</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getTitleLocalizationArgs(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string[]-gettitlelocalizationargs">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string[]-gettitlelocalizationargs</a><br/>
         *
         * @return the variable string values to be used as format specifiers in the title localization key, or null if not set
         */
        public java.lang.String[] getTitleLocalizationArgs() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getTitleLocalizationArgs()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getTitleLocalizationArgs();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getTitleLocalizationArgs()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getTitleLocalizationArgs();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getTitleLocalizationKey() Gets the string resource name to use to localize the title of the notification, or null if not set.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getTitleLocalizationKey(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section193261440453">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section193261440453</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getTitleLocalizationKey(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-gettitlelocalizationkey">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-string-gettitlelocalizationkey</a><br/>
         *
         * @return the string resource name to use to localize the title of the notification, or null if not set
         */
        public java.lang.String getTitleLocalizationKey() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getTitleLocalizationKey()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getTitleLocalizationKey();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getTitleLocalizationKey()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getTitleLocalizationKey();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getVibrateTimings() Gets the vibrateTimings from the notification.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getVibrateConfig(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section16541819161217">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section16541819161217</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getVibrateTimings(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-long[]-getvibratetimings">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-long[]-getvibratetimings</a><br/>
         *
         * @return the vibrateTimings from the notification
         */
        public long[] getVibrateTimings() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getVibrateConfig()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getVibrateConfig();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getVibrateTimings()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getVibrateTimings();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.getVisibility() Gets the visibility from the notification.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.push.RemoteMessage.Notification.getVisibility(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1213193517127">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/remotemessage-notification-0000001050255662-V5#EN-US_TOPIC_0000001050255662__section1213193517127</a><br/>
         * com.google.firebase.messaging.RemoteMessage.Notification.getVisibility(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-integer-getvisibility">https://developers.google.com/android/reference/com/google/firebase/messaging/RemoteMessage.Notification#public-integer-getvisibility</a><br/>
         *
         * @return the visibility from the notification
         */
        public java.lang.Integer getVisibility() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getVisibility()");
                return ((com.huawei.hms.push.RemoteMessage.Notification) this.getHInstance()).getVisibility();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getVisibility()");
                return ((com.google.firebase.messaging.RemoteMessage.Notification) this.getGInstance()).getVisibility();
            }
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.f.messaging.RemoteMessage.Notification.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted RemoteMessage Notification object
         */
        public static org.xms.f.messaging.RemoteMessage.Notification dynamicCast(java.lang.Object param0) {
            return ((org.xms.f.messaging.RemoteMessage.Notification) param0);
        }
        
        /**
         * org.xms.f.messaging.RemoteMessage.Notification.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.push.RemoteMessage.Notification;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.messaging.RemoteMessage.Notification;
            }
        }
    }
}