//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.StarDetector;

// C++: class StarDetector
/**
 * The class implements the keypoint detector introduced by CITE: Agrawal08, synonym of StarDetector. :
 */
public class StarDetector extends Feature2D {

    protected StarDetector(long addr) { super(addr); }

    // internal usage only
    public static StarDetector __fromPtr__(long addr) { return new StarDetector(addr); }

    //
    // C++: static Ptr_StarDetector cv::xfeatures2d::StarDetector::create(int maxSize = 45, int responseThreshold = 30, int lineThresholdProjected = 10, int lineThresholdBinarized = 8, int suppressNonmaxSize = 5)
    //

    public static StarDetector create(int maxSize, int responseThreshold, int lineThresholdProjected, int lineThresholdBinarized, int suppressNonmaxSize) {
        return StarDetector.__fromPtr__(create_0(maxSize, responseThreshold, lineThresholdProjected, lineThresholdBinarized, suppressNonmaxSize));
    }

    public static StarDetector create(int maxSize, int responseThreshold, int lineThresholdProjected, int lineThresholdBinarized) {
        return StarDetector.__fromPtr__(create_1(maxSize, responseThreshold, lineThresholdProjected, lineThresholdBinarized));
    }

    public static StarDetector create(int maxSize, int responseThreshold, int lineThresholdProjected) {
        return StarDetector.__fromPtr__(create_2(maxSize, responseThreshold, lineThresholdProjected));
    }

    public static StarDetector create(int maxSize, int responseThreshold) {
        return StarDetector.__fromPtr__(create_3(maxSize, responseThreshold));
    }

    public static StarDetector create(int maxSize) {
        return StarDetector.__fromPtr__(create_4(maxSize));
    }

    public static StarDetector create() {
        return StarDetector.__fromPtr__(create_5());
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_StarDetector cv::xfeatures2d::StarDetector::create(int maxSize = 45, int responseThreshold = 30, int lineThresholdProjected = 10, int lineThresholdBinarized = 8, int suppressNonmaxSize = 5)
    private static native long create_0(int maxSize, int responseThreshold, int lineThresholdProjected, int lineThresholdBinarized, int suppressNonmaxSize);
    private static native long create_1(int maxSize, int responseThreshold, int lineThresholdProjected, int lineThresholdBinarized);
    private static native long create_2(int maxSize, int responseThreshold, int lineThresholdProjected);
    private static native long create_3(int maxSize, int responseThreshold);
    private static native long create_4(int maxSize);
    private static native long create_5();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
