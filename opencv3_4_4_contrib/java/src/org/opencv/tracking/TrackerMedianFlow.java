//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.Tracker;
import org.opencv.tracking.TrackerMedianFlow;

// C++: class TrackerMedianFlow
//javadoc: TrackerMedianFlow

public class TrackerMedianFlow extends Tracker {

    protected TrackerMedianFlow(long addr) { super(addr); }

    // internal usage only
    public static TrackerMedianFlow __fromPtr__(long addr) { return new TrackerMedianFlow(addr); }

    //
    // C++: static Ptr_TrackerMedianFlow cv::TrackerMedianFlow::create()
    //

    //javadoc: TrackerMedianFlow::create()
    public static TrackerMedianFlow create()
    {
        
        TrackerMedianFlow retVal = TrackerMedianFlow.__fromPtr__(create_0());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_TrackerMedianFlow cv::TrackerMedianFlow::create()
    private static native long create_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
