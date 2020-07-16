//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.Tracker;
import org.opencv.tracking.TrackerMedianFlow;

// C++: class TrackerMedianFlow
/**
 * the Median Flow tracker
 *
 * Implementation of a paper CITE: MedianFlow .
 *
 * The tracker is suitable for very smooth and predictable movements when object is visible throughout
 * the whole sequence. It's quite and accurate for this type of problems (in particular, it was shown
 * by authors to outperform MIL). During the implementation period the code at
 * &lt;http://www.aonsquared.co.uk/node/5&gt;, the courtesy of the author Arthur Amarra, was used for the
 * reference purpose.
 */
public class TrackerMedianFlow extends Tracker {

    protected TrackerMedianFlow(long addr) { super(addr); }

    // internal usage only
    public static TrackerMedianFlow __fromPtr__(long addr) { return new TrackerMedianFlow(addr); }

    //
    // C++: static Ptr_TrackerMedianFlow cv::TrackerMedianFlow::create()
    //

    /**
     * Constructor
     * @return automatically generated
     */
    public static TrackerMedianFlow create() {
        return TrackerMedianFlow.__fromPtr__(create_0());
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
