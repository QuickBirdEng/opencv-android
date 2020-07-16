//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class GuidedFilter
/**
 * Interface for realizations of Guided Filter.
 *
 * For more details about this filter see CITE: Kaiming10 .
 */
public class GuidedFilter extends Algorithm {

    protected GuidedFilter(long addr) { super(addr); }

    // internal usage only
    public static GuidedFilter __fromPtr__(long addr) { return new GuidedFilter(addr); }

    //
    // C++:  void cv::ximgproc::GuidedFilter::filter(Mat src, Mat& dst, int dDepth = -1)
    //

    /**
     * Apply Guided Filter to the filtering image.
     *
     *     @param src filtering image with any numbers of channels.
     *
     *     @param dst output image.
     *
     *     @param dDepth optional depth of the output image. dDepth can be set to -1, which will be equivalent
     *     to src.depth().
     */
    public void filter(Mat src, Mat dst, int dDepth) {
        filter_0(nativeObj, src.nativeObj, dst.nativeObj, dDepth);
    }

    /**
     * Apply Guided Filter to the filtering image.
     *
     *     @param src filtering image with any numbers of channels.
     *
     *     @param dst output image.
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



    // C++:  void cv::ximgproc::GuidedFilter::filter(Mat src, Mat& dst, int dDepth = -1)
    private static native void filter_0(long nativeObj, long src_nativeObj, long dst_nativeObj, int dDepth);
    private static native void filter_1(long nativeObj, long src_nativeObj, long dst_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
