//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xphoto;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class WhiteBalancer
/**
 * The base class for auto white balance algorithms.
 */
public class WhiteBalancer extends Algorithm {

    protected WhiteBalancer(long addr) { super(addr); }

    // internal usage only
    public static WhiteBalancer __fromPtr__(long addr) { return new WhiteBalancer(addr); }

    //
    // C++:  void cv::xphoto::WhiteBalancer::balanceWhite(Mat src, Mat& dst)
    //

    /**
     * Applies white balancing to the input image
     *
     *     @param src Input image
     *     @param dst White balancing result
     *     SEE: cvtColor, equalizeHist
     */
    public void balanceWhite(Mat src, Mat dst) {
        balanceWhite_0(nativeObj, src.nativeObj, dst.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::xphoto::WhiteBalancer::balanceWhite(Mat src, Mat& dst)
    private static native void balanceWhite_0(long nativeObj, long src_nativeObj, long dst_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
