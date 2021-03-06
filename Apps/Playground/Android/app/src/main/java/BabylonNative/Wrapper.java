package BabylonNative;

import android.content.Context;
import android.view.Surface;

public class Wrapper {
    // JNI interface
    static {
        System.loadLibrary("BabylonNativeJNI");
    }

    public static native void initEngine();

    public static native void finishEngine();

    public static native void surfaceCreated(Surface surface, Context appContext);

    public static native void surfaceChanged(int width, int height, Surface surface);

    public static native void activityOnPause();

    public static native void activityOnResume();

    public static native void setTouchInfo(float dx, float dy, boolean down);

    public static native void loadScript(String path);

    public static native void eval(String source, String sourceURL);
}