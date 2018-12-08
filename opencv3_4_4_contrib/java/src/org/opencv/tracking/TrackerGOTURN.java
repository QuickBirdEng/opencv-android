//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.Tracker;
import org.opencv.tracking.TrackerGOTURN;

// C++: class TrackerGOTURN
//javadoc: TrackerGOTURN

public class TrackerGOTURN extends Tracker {

    protected TrackerGOTURN(long addr) { super(addr); }

    // internal usage only
    public static TrackerGOTURN __fromPtr__(long addr) { return new TrackerGOTURN(addr); }

    //
    // C++: static Ptr_TrackerGOTURN cv::TrackerGOTURN::create()
    //

    //javadoc: TrackerGOTURN::create()
    public static TrackerGOTURN create()
    {
        
        TrackerGOTURN retVal = TrackerGOTURN.__fromPtr__(create_0());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_TrackerGOTURN cv::TrackerGOTURN::create()
    private static native long create_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
