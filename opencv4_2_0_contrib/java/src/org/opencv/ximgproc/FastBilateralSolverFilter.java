//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class FastBilateralSolverFilter
/**
 * Interface for implementations of Fast Bilateral Solver.
 *
 * For more details about this solver see CITE: BarronPoole2016 .
 */
public class FastBilateralSolverFilter extends Algorithm {

    protected FastBilateralSolverFilter(long addr) { super(addr); }

    // internal usage only
    public static FastBilateralSolverFilter __fromPtr__(long addr) { return new FastBilateralSolverFilter(addr); }

    //
    // C++:  void cv::ximgproc::FastBilateralSolverFilter::filter(Mat src, Mat confidence, Mat& dst)
    //

    /**
     * Apply smoothing operation to the source image.
     *
     *     @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 3 channels.
     *
     *     @param confidence confidence image with unsigned 8-bit or floating-point 32-bit confidence and 1 channel.
     *
     *     @param dst destination image.
     *
     *     <b>Note:</b> Confidence images with CV_8U depth are expected to in [0, 255] and CV_32F in [0, 1] range.
     */
    public void filter(Mat src, Mat confidence, Mat dst) {
        filter_0(nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::FastBilateralSolverFilter::filter(Mat src, Mat confidence, Mat& dst)
    private static native void filter_0(long nativeObj, long src_nativeObj, long confidence_nativeObj, long dst_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
