package com.yolo.idea.plugin.bean

data class ActivityInfo(
        var display: DisplayInfo
)

data class DisplayInfo(
        var id: String,
        var desc: String
)

data class StackInfo(
        var stackId: String,
        var fullscreen: Boolean,
        var bounds: Rect,
        var minWidth: Int,
        var minHeight: Int
)

data class TaskRecord(
        var stackId: String
)

data class Rect(
        var left: Int,
        var top: Int,
        var right: Int,
        var bottom: Int
)

/**
 *  Display-
 *          Stack-
 *              mFullscreen
 *              id
 *
 */

/**

ACTIVITY MANAGER ACTIVITIES (dumpsys activity activities)
Display #0 (activities from top to bottom):
Stack #0:
mFullscreen=true
mBounds=null
Task id #40
mFullscreen=true
mBounds=null
mMinWidth=-1
mMinHeight=-1
mLastNonFullscreenBounds=null
 * TaskRecord{1891b0b #40 I=com.google.android.apps.nexuslauncher/.NexusLauncherActivity U=0 StackId=0 sz=1}


userId=0 effectiveUid=u0a23 mCallingUid=1000 mUserSetupComplete=true mCallingPackage=android


intent={act=android.intent.action.MAIN cat=[android.intent.category.HOME] flg=0x10000100 cmp=com.google.android.apps.nexuslauncher/.NexusLauncherActivity}


realActivity=com.google.android.apps.nexuslauncher/.NexusLauncherActivity


autoRemoveRecents=false
isPersistable=true
numFullscreen=1
taskType=1
mTaskToReturnTo=0
rootWasReset=false
mNeverRelinquishIdentity=true
mReuseTask=false
mLockTaskAuth=LOCK_TASK_AUTH_PINNABLE
Activities=[ActivityRecord{b9793ac u0 com.google.android.apps.nexuslauncher/.NexusLauncherActivity t40}]

askedCompatMode=false
inRecents=true
isAvailable=true
lastThumbnail=null
lastThumbnailFile=/data/system_ce/0/recent_images/40_task_thumbnail.png
stackId=0
hasBeenVisible=true
mResizeMode=RESIZE_MODE_RESIZEABLE
mSupportsPictureInPicture=false
isResizeable=true
firstActiveTime=1544360899261
lastActiveTime=1544360899261 (inactive for 8s)


 * Hist #0: ActivityRecord{b9793ac u0 com.google.android.apps.nexuslauncher/.NexusLauncherActivity t40}


packageName=com.google.android.apps.nexuslauncher processName=com.google.android.apps.nexuslauncher
launchedFromUid=0 launchedFromPackage=null userId=0
app=ProcessRecord{c3ee8f8 2354:com.google.android.apps.nexuslauncher/u0a23}

Intent { act=android.intent.action.MAIN cat=[android.intent.category.HOME] flg=0x10000100 cmp=com.google.android.apps.nexuslauncher/.NexusLauncherActivity }

frontOfTask=true task=TaskRecord{1891b0b #40 I=com.google.android.apps.nexuslauncher/.NexusLauncherActivity U=0 StackId=0 sz=1}

taskAffinity=null

realActivity=com.google.android.apps.nexuslauncher/.NexusLauncherActivity
baseDir=/system/priv-app/NexusLauncherPrebuilt/NexusLauncherPrebuilt.apk
dataDir=/data/user/0/com.google.android.apps.nexuslauncher
stateNotNeeded=true
componentSpecified=false
mActivityType=1
compat={560dpi} labelRes=0x7f0c0089 icon=0x7f020040 theme=0x7f120001
mLastReportedConfigurations:
mGlobalConfig={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}

mOverrideConfig={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}

CurrentConfiguration={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}

taskDescription: iconFilename=null label="null" primaryColor=fff5f5f5

backgroundColor=fffafafa
statusBarColor=0
navigationBarColor=0
launchFailed=false
launchCount=0
lastLaunchTime=-1h33m31s549ms
haveState=false
icicle=null
state=RESUMED
stopped=false
delayedResume=false
finishing=false
keysPaused=false
inHistory=true
visible=true
sleeping=false
idle=true
mStartingWindowState=STARTING_WINDOW_NOT_SHOWN
fullscreen=true
noDisplay=false
immersive=false
launchMode=2
frozenBeforeDestroy=false
forceNewConfig=false
mActivityType=HOME_ACTIVITY_TYPE
waitingVisible=false
nowVisible=true
lastVisibleTime=-8s314ms
connections=[ConnectionRecord{78a29d8 u0 CR IMP com.google.android.googlequicksearchbox/com.google.android.apps.gsa.nowoverlayservice.DrawerOverlayService:@77b70bb}]

resizeMode=RESIZE_MODE_RESIZEABLE
mLastReportedMultiWindowMode=false
mLastReportedPictureInPictureMode=false

Running activities (most recent first):
TaskRecord{1891b0b #40 I=com.google.android.apps.nexuslauncher/.NexusLauncherActivity U=0 StackId=0 sz=1}
Run #0: ActivityRecord{b9793ac u0 com.google.android.apps.nexuslauncher/.NexusLauncherActivity t40}

mResumedActivity: ActivityRecord{b9793ac u0 com.google.android.apps.nexuslauncher/.NexusLauncherActivity t40}

Stack #1:
mFullscreen=true
mBounds=null
Task id #45
mFullscreen=true
mBounds=null
mMinWidth=-1
mMinHeight=-1
mLastNonFullscreenBounds=null
 * TaskRecord{ea68ad9 #45 A=com.google.android.apps.messaging U=0 StackId=1 sz=1}
userId=0 effectiveUid=u0a67 mCallingUid=u0a23 mUserSetupComplete=true mCallingPackage=com.google.android.apps.nexuslauncher
affinity=com.google.android.apps.messaging
intent={act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] flg=0x10200000 cmp=com.google.android.apps.messaging/.ui.conversationlist.ConversationListActivity}
origActivity=com.google.android.apps.messaging/.ui.ConversationListActivity
realActivity=com.google.android.apps.messaging/.ui.conversationlist.ConversationListActivity
autoRemoveRecents=false isPersistable=true numFullscreen=1 taskType=0 mTaskToReturnTo=1
rootWasReset=true mNeverRelinquishIdentity=true mReuseTask=false mLockTaskAuth=LOCK_TASK_AUTH_PINNABLE
Activities=[ActivityRecord{74c9f4b u0 com.google.android.apps.messaging/.ui.ConversationListActivity t45}]
askedCompatMode=false inRecents=true isAvailable=true
lastThumbnail=null lastThumbnailFile=/data/system_ce/0/recent_images/45_task_thumbnail.png
stackId=1
hasBeenVisible=true mResizeMode=RESIZE_MODE_RESIZEABLE_VIA_SDK_VERSION mSupportsPictureInPicture=false isResizeable=true firstActiveTime=1544360899255 lastActiveTime=1544360899255 (inactive for 8s)
 * Hist #0: ActivityRecord{74c9f4b u0 com.google.android.apps.messaging/.ui.ConversationListActivity t45}
packageName=com.google.android.apps.messaging processName=com.google.android.apps.messaging
launchedFromUid=10023 launchedFromPackage=com.google.android.apps.nexuslauncher userId=0
app=ProcessRecord{5f185b1 9491:com.google.android.apps.messaging/u0a67}
Intent { act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] flg=0x10200000 cmp=com.google.android.apps.messaging/.ui.ConversationListActivity bnds=[306,2432][582,2712] }
frontOfTask=true task=TaskRecord{ea68ad9 #45 A=com.google.android.apps.messaging U=0 StackId=1 sz=1}
taskAffinity=com.google.android.apps.messaging
realActivity=com.google.android.apps.messaging/.ui.conversationlist.ConversationListActivity
baseDir=/system/app/PrebuiltBugle/PrebuiltBugle.apk
dataDir=/data/user/0/com.google.android.apps.messaging
stateNotNeeded=false componentSpecified=true mActivityType=0
compat={560dpi} labelRes=0x7f120055 icon=0x7f030000 theme=0x7f1300ad
mLastReportedConfigurations:
mGlobalConfig={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
mOverrideConfig={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
CurrentConfiguration={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
taskDescription: iconFilename=null label="null" primaryColor=ff2a56c6
backgroundColor=fffafafa
statusBarColor=ff1c3aa9
navigationBarColor=ff000000
launchFailed=false launchCount=0 lastLaunchTime=-12s282ms
haveState=true icicle=Bundle[mParcelledData.dataSize=2848]
state=STOPPED stopped=true delayedResume=false finishing=false
keysPaused=false inHistory=true visible=false sleeping=false idle=true mStartingWindowState=STARTING_WINDOW_REMOVED
fullscreen=true noDisplay=false immersive=false launchMode=0
frozenBeforeDestroy=false forceNewConfig=false
mActivityType=APPLICATION_ACTIVITY_TYPE
waitingVisible=false nowVisible=false lastVisibleTime=-11s261ms
resizeMode=RESIZE_MODE_RESIZEABLE_VIA_SDK_VERSION
mLastReportedMultiWindowMode=false mLastReportedPictureInPictureMode=false

Task id #44
mFullscreen=true
mBounds=null
mMinWidth=-1
mMinHeight=-1
mLastNonFullscreenBounds=null
 * TaskRecord{80d6c9e #44 A=com.google.android.gm U=0 StackId=1 sz=2}
userId=0 effectiveUid=u0a70 mCallingUid=u0a70 mUserSetupComplete=true mCallingPackage=com.google.android.gm
affinity=com.google.android.gm
intent={act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] flg=0x10200000 cmp=com.google.android.gm/.ui.MailActivityGmail}
origActivity=com.google.android.gm/.ConversationListActivityGmail
realActivity=com.google.android.gm/.ui.MailActivityGmail
autoRemoveRecents=false isPersistable=true numFullscreen=2 taskType=0 mTaskToReturnTo=1
rootWasReset=true mNeverRelinquishIdentity=true mReuseTask=false mLockTaskAuth=LOCK_TASK_AUTH_PINNABLE
Activities=[ActivityRecord{7a2bf51 u0 com.google.android.gm/.welcome.WelcomeTourActivity t44}, ActivityRecord{446d17b u0 com.google.android.gm/.welcome.SetupAddressesActivity t44}]
askedCompatMode=false inRecents=true isAvailable=true
lastThumbnail=null lastThumbnailFile=/data/system_ce/0/recent_images/44_task_thumbnail.png
stackId=1
hasBeenVisible=true mResizeMode=RESIZE_MODE_RESIZEABLE mSupportsPictureInPicture=false isResizeable=true firstActiveTime=1544360894416 lastActiveTime=1544360894416 (inactive for 13s)
 * Hist #1: ActivityRecord{446d17b u0 com.google.android.gm/.welcome.SetupAddressesActivity t44}
packageName=com.google.android.gm processName=com.google.android.gm
launchedFromUid=10070 launchedFromPackage=com.google.android.gm userId=0
app=ProcessRecord{939f2ea 9426:com.google.android.gm/u0a70}
Intent { cmp=com.google.android.gm/.welcome.SetupAddressesActivity (has extras) }
frontOfTask=false task=TaskRecord{80d6c9e #44 A=com.google.android.gm U=0 StackId=1 sz=2}
taskAffinity=com.google.android.gm
realActivity=com.google.android.gm/.welcome.SetupAddressesActivity
baseDir=/system/app/PrebuiltGmail/PrebuiltGmail.apk
dataDir=/data/user/0/com.google.android.gm
stateNotNeeded=false componentSpecified=true mActivityType=0
compat={560dpi} labelRes=0x7f10019c icon=0x7f030002 theme=0x7f110168
mLastReportedConfigurations:
mGlobalConfig={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
mOverrideConfig={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
CurrentConfiguration={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
resultTo=ActivityRecord{7a2bf51 u0 com.google.android.gm/.welcome.WelcomeTourActivity t44} resultWho=null resultCode=1
taskDescription: iconFilename=null label="null" primaryColor=ff039be5
backgroundColor=fffafafa
statusBarColor=ff0288d1
navigationBarColor=ff000000
launchFailed=false launchCount=0 lastLaunchTime=-14s844ms
haveState=true icicle=Bundle[mParcelledData.dataSize=1112]
state=STOPPED stopped=true delayedResume=false finishing=false
keysPaused=false inHistory=true visible=false sleeping=false idle=true mStartingWindowState=STARTING_WINDOW_NOT_SHOWN
fullscreen=true noDisplay=false immersive=false launchMode=1
frozenBeforeDestroy=false forceNewConfig=false
mActivityType=APPLICATION_ACTIVITY_TYPE
waitingVisible=false nowVisible=false lastVisibleTime=-14s269ms
resizeMode=RESIZE_MODE_RESIZEABLE
mLastReportedMultiWindowMode=false mLastReportedPictureInPictureMode=false
 * Hist #0: ActivityRecord{7a2bf51 u0 com.google.android.gm/.welcome.WelcomeTourActivity t44}
packageName=com.google.android.gm processName=com.google.android.gm
launchedFromUid=10070 launchedFromPackage=com.google.android.gm userId=0
app=ProcessRecord{939f2ea 9426:com.google.android.gm/u0a70}
Intent { flg=0x4000000 cmp=com.google.android.gm/.welcome.WelcomeTourActivity (has extras) }
frontOfTask=true task=TaskRecord{80d6c9e #44 A=com.google.android.gm U=0 StackId=1 sz=2}
taskAffinity=com.google.android.gm
realActivity=com.google.android.gm/.welcome.WelcomeTourActivity
baseDir=/system/app/PrebuiltGmail/PrebuiltGmail.apk
dataDir=/data/user/0/com.google.android.gm
stateNotNeeded=false componentSpecified=true mActivityType=0
compat={560dpi} labelRes=0x7f10019c icon=0x7f030002 theme=0x7f110169
mLastReportedConfigurations:
mGlobalConfig={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
mOverrideConfig={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
CurrentConfiguration={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
taskDescription: iconFilename=null label="null" primaryColor=ffdb4437
backgroundColor=fffafafa
statusBarColor=ffbdbdbd
navigationBarColor=ff000000
launchFailed=false launchCount=0 lastLaunchTime=-16s494ms
haveState=true icicle=Bundle[mParcelledData.dataSize=1444]
state=STOPPED stopped=true delayedResume=false finishing=false
keysPaused=false inHistory=true visible=false sleeping=false idle=true mStartingWindowState=STARTING_WINDOW_REMOVED
fullscreen=true noDisplay=false immersive=false launchMode=1
frozenBeforeDestroy=false forceNewConfig=false
mActivityType=APPLICATION_ACTIVITY_TYPE
waitingVisible=false nowVisible=false lastVisibleTime=-16s195ms
resizeMode=RESIZE_MODE_RESIZEABLE
mLastReportedMultiWindowMode=false mLastReportedPictureInPictureMode=false

Task id #43
mFullscreen=true
mBounds=null
mMinWidth=-1
mMinHeight=-1
mLastNonFullscreenBounds=null
 * TaskRecord{503937f #43 A=com.android.chrome U=0 StackId=1 sz=1}
userId=0 effectiveUid=u0a43 mCallingUid=u0a43 mUserSetupComplete=true mCallingPackage=com.android.chrome
affinity=com.android.chrome
intent={act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] flg=0x14002000 cmp=com.android.chrome/org.chromium.chrome.browser.ChromeTabbedActivity}
realActivity=com.android.chrome/org.chromium.chrome.browser.ChromeTabbedActivity
autoRemoveRecents=false isPersistable=true numFullscreen=1 taskType=0 mTaskToReturnTo=1
rootWasReset=false mNeverRelinquishIdentity=true mReuseTask=false mLockTaskAuth=LOCK_TASK_AUTH_PINNABLE
Activities=[ActivityRecord{c062f46 u0 com.android.chrome/org.chromium.chrome.browser.ChromeTabbedActivity t43}]
askedCompatMode=false inRecents=true isAvailable=true
lastThumbnail=null lastThumbnailFile=/data/system_ce/0/recent_images/43_task_thumbnail.png
stackId=1
hasBeenVisible=true mResizeMode=RESIZE_MODE_RESIZEABLE mSupportsPictureInPicture=true isResizeable=true firstActiveTime=1544360889085 lastActiveTime=1544360889085 (inactive for 18s)
 * Hist #0: ActivityRecord{c062f46 u0 com.android.chrome/org.chromium.chrome.browser.ChromeTabbedActivity t43}
packageName=com.android.chrome processName=com.android.chrome
launchedFromUid=10043 launchedFromPackage=com.android.chrome userId=0
app=ProcessRecord{be6b6cd 9241:com.android.chrome/u0a43}
Intent { act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] flg=0x14002000 cmp=com.android.chrome/org.chromium.chrome.browser.ChromeTabbedActivity bnds=[858,2432][1134,2712] (has extras) }
frontOfTask=true task=TaskRecord{503937f #43 A=com.android.chrome U=0 StackId=1 sz=1}
taskAffinity=com.android.chrome
realActivity=com.android.chrome/org.chromium.chrome.browser.ChromeTabbedActivity
baseDir=/system/app/Chrome/Chrome.apk
dataDir=/data/user/0/com.android.chrome
stateNotNeeded=false componentSpecified=true mActivityType=0
compat={560dpi} labelRes=0x7f0a04e5 icon=0x7f02011c theme=0x7f0c019c
mLastReportedConfigurations:
mGlobalConfig={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
mOverrideConfig={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
CurrentConfiguration={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
taskDescription: iconFilename=null label="null" primaryColor=fff5f5f5
backgroundColor=fffafafa
statusBarColor=ff000000
navigationBarColor=ff000000
launchFailed=false launchCount=0 lastLaunchTime=-22s714ms
haveState=true icicle=Bundle[mParcelledData.dataSize=4416]
state=STOPPED stopped=true delayedResume=false finishing=false
keysPaused=false inHistory=true visible=false sleeping=false idle=true mStartingWindowState=STARTING_WINDOW_REMOVED
fullscreen=true noDisplay=false immersive=false launchMode=2
frozenBeforeDestroy=false forceNewConfig=false
mActivityType=APPLICATION_ACTIVITY_TYPE
waitingVisible=false nowVisible=false lastVisibleTime=-22s138ms
mDeferHidingClient=true
resizeMode=RESIZE_MODE_RESIZEABLE
mLastReportedMultiWindowMode=false mLastReportedPictureInPictureMode=false
supportsPictureInPicture=true
supportsPictureInPictureWhilePausing: true

Running activities (most recent first):
TaskRecord{ea68ad9 #45 A=com.google.android.apps.messaging U=0 StackId=1 sz=1}
Run #3: ActivityRecord{74c9f4b u0 com.google.android.apps.messaging/.ui.ConversationListActivity t45}
TaskRecord{80d6c9e #44 A=com.google.android.gm U=0 StackId=1 sz=2}
Run #2: ActivityRecord{446d17b u0 com.google.android.gm/.welcome.SetupAddressesActivity t44}
Run #1: ActivityRecord{7a2bf51 u0 com.google.android.gm/.welcome.WelcomeTourActivity t44}
TaskRecord{503937f #43 A=com.android.chrome U=0 StackId=1 sz=1}
Run #0: ActivityRecord{c062f46 u0 com.android.chrome/org.chromium.chrome.browser.ChromeTabbedActivity t43}

mLastPausedActivity: ActivityRecord{74c9f4b u0 com.google.android.apps.messaging/.ui.ConversationListActivity t45}

Stack #5:
mFullscreen=true
mBounds=null
Task id #41
mFullscreen=true
mBounds=null
mMinWidth=-1
mMinHeight=-1
mLastNonFullscreenBounds=null
 * TaskRecord{d75905f #41 A=com.android.systemui U=0 StackId=5 sz=1}
userId=0 effectiveUid=u0a29 mCallingUid=u0a29 mUserSetupComplete=true mCallingPackage=com.android.systemui
affinity=com.android.systemui
intent={flg=0x10804000 cmp=com.android.systemui/.recents.RecentsActivity}
realActivity=com.android.systemui/.recents.RecentsActivity
autoRemoveRecents=false isPersistable=false numFullscreen=1 taskType=2 mTaskToReturnTo=1
rootWasReset=false mNeverRelinquishIdentity=true mReuseTask=false mLockTaskAuth=LOCK_TASK_AUTH_PINNABLE
Activities=[ActivityRecord{12d1dda u0 com.android.systemui/.recents.RecentsActivity t41}]
askedCompatMode=false inRecents=true isAvailable=true
lastThumbnail=null lastThumbnailFile=/data/system_ce/0/recent_images/41_task_thumbnail.png
stackId=5
hasBeenVisible=true mResizeMode=RESIZE_MODE_RESIZEABLE mSupportsPictureInPicture=false isResizeable=true firstActiveTime=1544360682398 lastActiveTime=1544360682398 (inactive for 225s)
 * Hist #0: ActivityRecord{12d1dda u0 com.android.systemui/.recents.RecentsActivity t41}
packageName=com.android.systemui processName=com.android.systemui
launchedFromUid=10029 launchedFromPackage=com.android.systemui userId=0
app=ProcessRecord{a4b2e50 1773:com.android.systemui/u0a29}
Intent { flg=0x10804000 cmp=com.android.systemui/.recents.RecentsActivity }
frontOfTask=true task=TaskRecord{d75905f #41 A=com.android.systemui U=0 StackId=5 sz=1}
taskAffinity=com.android.systemui
realActivity=com.android.systemui/.recents.RecentsActivity
baseDir=/system/priv-app/SystemUIGoogle/SystemUIGoogle.apk
dataDir=/data/user_de/0/com.android.systemui
stateNotNeeded=true componentSpecified=true mActivityType=2
compat={560dpi} labelRes=0x7f110063 icon=0x7f0801fa theme=0x7f1200ee
mLastReportedConfigurations:
mGlobalConfig={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
mOverrideConfig={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
CurrentConfiguration={1.0 310mcc260mnc [en_US] ldltr sw411dp w411dp h750dp 560dpi nrml long port finger qwerty/v/v -nav/h appBounds=Rect(0, 0 - 1440, 2712) s.6}
taskDescription: iconFilename=null label="null" primaryColor=ff212121
backgroundColor=ff303030
statusBarColor=0
navigationBarColor=0
launchFailed=false launchCount=0 lastLaunchTime=-3m54s64ms
haveState=true icicle=Bundle[mParcelledData.dataSize=560]
state=STOPPED stopped=true delayedResume=false finishing=false
keysPaused=false inHistory=true visible=false sleeping=false idle=true mStartingWindowState=STARTING_WINDOW_NOT_SHOWN
fullscreen=true noDisplay=false immersive=false launchMode=3
frozenBeforeDestroy=false forceNewConfig=false
mActivityType=RECENTS_ACTIVITY_TYPE
waitingVisible=false nowVisible=false lastVisibleTime=-3m53s549ms
resizeMode=RESIZE_MODE_RESIZEABLE
mLastReportedMultiWindowMode=false mLastReportedPictureInPictureMode=false

Running activities (most recent first):
TaskRecord{d75905f #41 A=com.android.systemui U=0 StackId=5 sz=1}
Run #0: ActivityRecord{12d1dda u0 com.android.systemui/.recents.RecentsActivity t41}

mLastPausedActivity: ActivityRecord{12d1dda u0 com.android.systemui/.recents.RecentsActivity t41}

ResumedActivity: ActivityRecord{b9793ac u0 com.google.android.apps.nexuslauncher/.NexusLauncherActivity t40}
mFocusedStack=ActivityStack{3200de8 stackId=0, 1 tasks} mLastFocusedStack=ActivityStack{3200de8 stackId=0, 1 tasks}
mSleepTimeout=false
mCurTaskIdForUser={0=45}
mUserStackInFront={}
mActivityContainers={0=ActivtyContainer{0}A, 1=ActivtyContainer{1}A, 5=ActivtyContainer{5}A}
mLockTaskModeState=NONE  mLockTaskPackages (userId:packages)=
0:[]
mLockTaskModeTasks[]
KeyguardController:
mKeyguardShowing=false
mKeyguardGoingAway=false
mOccluded=false
mDismissingKeyguardActivity=null
mDismissalRequested=false
mVisibilityTransactionDepth=0




 */