package org.devio.rn.splashscreen;

import android.app.Activity;

/**
 * SplashScreen
 * 启动屏
 * from：http://www.devio.org
 * Author:CrazyCodeBoy
 * GitHub:https://github.com/crazycodeboy
 * Email:crazycodeboy@gmail.com
 */
public class SplashScreen {
    private static boolean keep = true;

    /**
     * 打开启动屏
     */
    public static void show(final Activity activity) {
        if (activity == null) return;
        androidx.core.splashscreen.SplashScreen splash = androidx.core.splashscreen.SplashScreen.installSplashScreen(activity);
        splash.setKeepOnScreenCondition(() -> keep);
    }

    /**
     * 关闭启动屏
     */
    public static void hide(Activity activity) {
        if (activity == null) return;
        keep = false;
    }
}
