//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.ximgproc.AdaptiveManifoldFilter;

// C++: class AdaptiveManifoldFilter
/**
 * Interface for Adaptive Manifold Filter realizations.
 *
 * For more details about this filter see CITE: Gastal12 and References_.
 *
 * Below listed optional parameters which may be set up with Algorithm::set function.
 * <ul>
 *   <li>
 *    member double sigma_s = 16.0
 * Spatial standard deviation.
 *   </li>
 *   <li>
 *    member double sigma_r = 0.2
 * Color space standard deviation.
 *   </li>
 *   <li>
 *    member int tree_height = -1
 * Height of the manifold tree (default = -1 : automatically computed).
 *   </li>
 *   <li>
 *    member int num_pca_iterations = 1
 * Number of iterations to computed the eigenvector.
 *   </li>
 *   <li>
 *    member bool adjust_outliers = false
 * Specify adjust outliers using Eq. 9 or not.
 *   </li>
 *   <li>
 *    member bool use_RNG = true
 * Specify use random number generator to compute eigenvector or not.
 *   </li>
 * </ul>
 */
public class AdaptiveManifoldFilter extends Algorithm {

    protected AdaptiveManifoldFilter(long addr) { super(addr); }

    // internal usage only
    public static AdaptiveManifoldFilter __fromPtr__(long addr) { return new AdaptiveManifoldFilter(addr); }

    //
    // C++: static Ptr_AdaptiveManifoldFilter cv::ximgproc::AdaptiveManifoldFilter::create()
    //

    public static AdaptiveManifoldFilter create() {
        return AdaptiveManifoldFilter.__fromPtr__(create_0());
    }


    //
    // C++:  void cv::ximgproc::AdaptiveManifoldFilter::collectGarbage()
    //

    public void collectGarbage() {
        collectGarbage_0(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::AdaptiveManifoldFilter::filter(Mat src, Mat& dst, Mat joint = Mat())
    //

    /**
     * Apply high-dimensional filtering using adaptive manifolds.
     *
     *     @param src filtering image with any numbers of channels.
     *
     *     @param dst output image.
     *
     *     @param joint optional joint (also called as guided) image with any numbers of channels.
     */
    public void filter(Mat src, Mat dst, Mat joint) {
        filter_0(nativeObj, src.nativeObj, dst.nativeObj, joint.nativeObj);
    }

    /**
     * Apply high-dimensional filtering using adaptive manifolds.
     *
     *     @param src filtering image with any numbers of channels.
     *
     *     @param dst output image.
     *
     */
    public void filter(Mat src, Mat dst) {
        filter_1(nativeObj, src.nativeObj, dst.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_AdaptiveManifoldFilter cv::ximgproc::AdaptiveManifoldFilter::create()
    private static native long create_0();

    // C++:  void cv::ximgproc::AdaptiveManifoldFilter::collectGarbage()
    private static native void collectGarbage_0(long nativeObj);

    // C++:  void cv::ximgproc::AdaptiveManifoldFilter::filter(Mat src, Mat& dst, Mat joint = Mat())
    private static native void filter_0(long nativeObj, long src_nativeObj, long dst_nativeObj, long joint_nativeObj);
    private static native void filter_1(long nativeObj, long src_nativeObj, long dst_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
