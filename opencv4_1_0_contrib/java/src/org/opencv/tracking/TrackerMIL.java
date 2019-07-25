//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.Tracker;
import org.opencv.tracking.TrackerMIL;

// C++: class TrackerMIL
//javadoc: TrackerMIL

public class TrackerMIL extends Tracker {

    protected TrackerMIL(long addr) { super(addr); }

    // internal usage only
    public static TrackerMIL __fromPtr__(long addr) { return new TrackerMIL(addr); }

    //
    // C++: static Ptr_TrackerMIL cv::TrackerMIL::create()
    //

    //javadoc: TrackerMIL::create()
    public static TrackerMIL create()
    {
        
        TrackerMIL retVal = TrackerMIL.__fromPtr__(create_0());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_TrackerMIL cv::TrackerMIL::create()
    private static native long create_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
