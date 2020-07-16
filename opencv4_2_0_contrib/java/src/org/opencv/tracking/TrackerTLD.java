//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.Tracker;
import org.opencv.tracking.TrackerTLD;

// C++: class TrackerTLD
/**
 * the TLD (Tracking, learning and detection) tracker
 *
 * TLD is a novel tracking framework that explicitly decomposes the long-term tracking task into
 * tracking, learning and detection.
 *
 * The tracker follows the object from frame to frame. The detector localizes all appearances that
 * have been observed so far and corrects the tracker if necessary. The learning estimates detector's
 * errors and updates it to avoid these errors in the future. The implementation is based on CITE: TLD .
 *
 * The Median Flow algorithm (see cv::TrackerMedianFlow) was chosen as a tracking component in this
 * implementation, following authors. The tracker is supposed to be able to handle rapid motions, partial
 * occlusions, object absence etc.
 */
public class TrackerTLD extends Tracker {

    protected TrackerTLD(long addr) { super(addr); }

    // internal usage only
    public static TrackerTLD __fromPtr__(long addr) { return new TrackerTLD(addr); }

    //
    // C++: static Ptr_TrackerTLD cv::TrackerTLD::create()
    //

    /**
     * Constructor
     * @return automatically generated
     */
    public static TrackerTLD create() {
        return TrackerTLD.__fromPtr__(create_0());
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
