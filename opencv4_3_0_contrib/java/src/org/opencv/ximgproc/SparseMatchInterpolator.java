//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class SparseMatchInterpolator
/**
 * Main interface for all filters, that take sparse matches as an
 * input and produce a dense per-pixel matching (optical flow) as an output.
 */
public class SparseMatchInterpolator extends Algorithm {

    protected SparseMatchInterpolator(long addr) { super(addr); }

    // internal usage only
    public static SparseMatchInterpolator __fromPtr__(long addr) { return new SparseMatchInterpolator(addr); }

    //
    // C++:  void cv::ximgproc::SparseMatchInterpolator::interpolate(Mat from_image, Mat from_points, Mat to_image, Mat to_points, Mat& dense_flow)
    //

    /**
     * Interpolate input sparse matches.
     *
     *     @param from_image first of the two matched images, 8-bit single-channel or three-channel.
     *
     *     @param from_points points of the from_image for which there are correspondences in the
     *     to_image (Point2f vector, size shouldn't exceed 32767)
     *
     *     @param to_image second of the two matched images, 8-bit single-channel or three-channel.
     *
     *     @param to_points points in the to_image corresponding to from_points
     *     (Point2f vector, size shouldn't exceed 32767)
     *
     *     @param dense_flow output dense matching (two-channel CV_32F image)
     */
    public void interpolate(Mat from_image, Mat from_points, Mat to_image, Mat to_points, Mat dense_flow) {
        interpolate_0(nativeObj, from_image.nativeObj, from_points.nativeObj, to_image.nativeObj, to_points.nativeObj, dense_flow.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::SparseMatchInterpolator::interpolate(Mat from_image, Mat from_points, Mat to_image, Mat to_points, Mat& dense_flow)
    private static native void interpolate_0(long nativeObj, long from_image_nativeObj, long from_points_nativeObj, long to_image_nativeObj, long to_points_nativeObj, long dense_flow_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
