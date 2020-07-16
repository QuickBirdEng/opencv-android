//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.Tracker;
import org.opencv.tracking.TrackerBoosting;

// C++: class TrackerBoosting
/**
 * the Boosting tracker
 *
 * This is a real-time object tracking based on a novel on-line version of the AdaBoost algorithm.
 * The classifier uses the surrounding background as negative examples in update step to avoid the
 * drifting problem. The implementation is based on CITE: OLB .
 */
public class TrackerBoosting extends Tracker {

    protected TrackerBoosting(long addr) { super(addr); }

    // internal usage only
    public static TrackerBoosting __fromPtr__(long addr) { return new TrackerBoosting(addr); }

    //
    // C++: static Ptr_TrackerBoosting cv::TrackerBoosting::create()
    //

    /**
     * Constructor
     * @return automatically generated
     */
    public static TrackerBoosting create() {
        return TrackerBoosting.__fromPtr__(create_0());
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_TrackerBoosting cv::TrackerBoosting::create()
    private static native long create_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
