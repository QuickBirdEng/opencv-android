//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.Tracker;
import org.opencv.tracking.TrackerTLD;

// C++: class TrackerTLD
//javadoc: TrackerTLD

public class TrackerTLD extends Tracker {

    protected TrackerTLD(long addr) { super(addr); }

    // internal usage only
    public static TrackerTLD __fromPtr__(long addr) { return new TrackerTLD(addr); }

    //
    // C++: static Ptr_TrackerTLD cv::TrackerTLD::create()
    //

    //javadoc: TrackerTLD::create()
    public static TrackerTLD create()
    {
        
        TrackerTLD retVal = TrackerTLD.__fromPtr__(create_0());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_TrackerTLD cv::TrackerTLD::create()
    private static native long create_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
