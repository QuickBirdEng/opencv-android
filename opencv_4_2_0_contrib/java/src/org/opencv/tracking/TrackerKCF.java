//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.Tracker;
import org.opencv.tracking.TrackerKCF;

// C++: class TrackerKCF
/**
 * the KCF (Kernelized Correlation Filter) tracker
 *
 * KCF is a novel tracking framework that utilizes properties of circulant matrix to enhance the processing speed.
 * This tracking method is an implementation of CITE: KCF_ECCV which is extended to KCF with color-names features (CITE: KCF_CN).
 * The original paper of KCF is available at &lt;http://www.robots.ox.ac.uk/~joao/publications/henriques_tpami2015.pdf&gt;
 * as well as the matlab implementation. For more information about KCF with color-names features, please refer to
 * &lt;http://www.cvl.isy.liu.se/research/objrec/visualtracking/colvistrack/index.html&gt;.
 */
public class TrackerKCF extends Tracker {

    protected TrackerKCF(long addr) { super(addr); }

    // internal usage only
    public static TrackerKCF __fromPtr__(long addr) { return new TrackerKCF(addr); }

    // C++: enum MODE
    public static final int
            GRAY = (1 << 0),
            CN = (1 << 1),
            CUSTOM = (1 << 2);


    //
    // C++: static Ptr_TrackerKCF cv::TrackerKCF::create()
    //

    /**
     * Constructor
     * @return automatically generated
     */
    public static TrackerKCF create() {
        return TrackerKCF.__fromPtr__(create_0());
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_TrackerKCF cv::TrackerKCF::create()
    private static native long create_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
