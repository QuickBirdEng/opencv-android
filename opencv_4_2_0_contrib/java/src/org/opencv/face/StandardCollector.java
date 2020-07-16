//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import org.opencv.face.PredictCollector;
import org.opencv.face.StandardCollector;

// C++: class StandardCollector
/**
 * Default predict collector
 *
 * Trace minimal distance with treshhold checking (that is default behavior for most predict logic)
 */
public class StandardCollector extends PredictCollector {

    protected StandardCollector(long addr) { super(addr); }

    // internal usage only
    public static StandardCollector __fromPtr__(long addr) { return new StandardCollector(addr); }

    //
    // C++: static Ptr_StandardCollector cv::face::StandardCollector::create(double threshold = DBL_MAX)
    //

    /**
     * Static constructor
     *     @param threshold set threshold
     * @return automatically generated
     */
    public static StandardCollector create(double threshold) {
        return StandardCollector.__fromPtr__(create_0(threshold));
    }

    /**
     * Static constructor
     * @return automatically generated
     */
    public static StandardCollector create() {
        return StandardCollector.__fromPtr__(create_1());
    }


    //
    // C++:  double cv::face::StandardCollector::getMinDist()
    //

    /**
     * Returns minimal distance value
     * @return automatically generated
     */
    public double getMinDist() {
        return getMinDist_0(nativeObj);
    }


    //
    // C++:  int cv::face::StandardCollector::getMinLabel()
    //

    /**
     * Returns label with minimal distance
     * @return automatically generated
     */
    public int getMinLabel() {
        return getMinLabel_0(nativeObj);
    }


    //
    // C++:  vector_pair_int_and_double cv::face::StandardCollector::getResults(bool sorted = false)
    //

    // Return type 'vector_pair_int_and_double' is not supported, skipping the function


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_StandardCollector cv::face::StandardCollector::create(double threshold = DBL_MAX)
    private static native long create_0(double threshold);
    private static native long create_1();

    // C++:  double cv::face::StandardCollector::getMinDist()
    private static native double getMinDist_0(long nativeObj);

    // C++:  int cv::face::StandardCollector::getMinLabel()
    private static native int getMinLabel_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
