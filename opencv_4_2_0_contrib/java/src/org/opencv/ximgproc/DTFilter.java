//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class DTFilter
/**
 * Interface for realizations of Domain Transform filter.
 *
 * For more details about this filter see CITE: Gastal11 .
 */
public class DTFilter extends Algorithm {

    protected DTFilter(long addr) { super(addr); }

    // internal usage only
    public static DTFilter __fromPtr__(long addr) { return new DTFilter(addr); }

    //
    // C++:  void cv::ximgproc::DTFilter::filter(Mat src, Mat& dst, int dDepth = -1)
    //

    /**
     * Produce domain transform filtering operation on source image.
     *
     *     @param src filtering image with unsigned 8-bit or floating-point 32-bit depth and up to 4 channels.
     *
     *     @param dst destination image.
     *
     *     @param dDepth optional depth of the output image. dDepth can be set to -1, which will be equivalent
     *     to src.depth().
     */
    public void filter(Mat src, Mat dst, int dDepth) {
        filter_0(nativeObj, src.nativeObj, dst.nativeObj, dDepth);
    }

    /**
     * Produce domain transform filtering operation on source image.
     *
     *     @param src filtering image with unsigned 8-bit or floating-point 32-bit depth and up to 4 channels.
     *
     *     @param dst destination image.
     *
     *     to src.depth().
     */
    public void filter(Mat src, Mat dst) {
        filter_1(nativeObj, src.nativeObj, dst.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::DTFilter::filter(Mat src, Mat& dst, int dDepth = -1)
    private static native void filter_0(long nativeObj, long src_nativeObj, long dst_nativeObj, int dDepth);
    private static native void filter_1(long nativeObj, long src_nativeObj, long dst_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
