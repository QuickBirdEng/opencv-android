//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.Tracker;
import org.opencv.tracking.TrackerMIL;

// C++: class TrackerMIL
/**
 * The MIL algorithm trains a classifier in an online manner to separate the object from the
 * background.
 *
 * Multiple Instance Learning avoids the drift problem for a robust tracking. The implementation is
 * based on CITE: MIL .
 *
 * Original code can be found here &lt;http://vision.ucsd.edu/~bbabenko/project_miltrack.shtml&gt;
 */
public class TrackerMIL extends Tracker {

    protected TrackerMIL(long addr) { super(addr); }

    // internal usage only
    public static TrackerMIL __fromPtr__(long addr) { return new TrackerMIL(addr); }

    //
    // C++: static Ptr_TrackerMIL cv::TrackerMIL::create()
    //

    /**
     * Constructor
     * @return automatically generated
     */
    public static TrackerMIL create() {
        return TrackerMIL.__fromPtr__(create_0());
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
