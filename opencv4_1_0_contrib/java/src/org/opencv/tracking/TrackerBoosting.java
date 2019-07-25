//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.Tracker;
import org.opencv.tracking.TrackerBoosting;

// C++: class TrackerBoosting
//javadoc: TrackerBoosting

public class TrackerBoosting extends Tracker {

    protected TrackerBoosting(long addr) { super(addr); }

    // internal usage only
    public static TrackerBoosting __fromPtr__(long addr) { return new TrackerBoosting(addr); }

    //
    // C++: static Ptr_TrackerBoosting cv::TrackerBoosting::create()
    //

    //javadoc: TrackerBoosting::create()
    public static TrackerBoosting create()
    {
        
        TrackerBoosting retVal = TrackerBoosting.__fromPtr__(create_0());
        
        return retVal;
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
