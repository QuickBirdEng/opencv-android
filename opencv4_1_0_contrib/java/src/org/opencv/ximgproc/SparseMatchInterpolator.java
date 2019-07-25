//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class SparseMatchInterpolator
//javadoc: SparseMatchInterpolator

public class SparseMatchInterpolator extends Algorithm {

    protected SparseMatchInterpolator(long addr) { super(addr); }

    // internal usage only
    public static SparseMatchInterpolator __fromPtr__(long addr) { return new SparseMatchInterpolator(addr); }

    //
    // C++:  void cv::ximgproc::SparseMatchInterpolator::interpolate(Mat from_image, Mat from_points, Mat to_image, Mat to_points, Mat& dense_flow)
    //

    //javadoc: SparseMatchInterpolator::interpolate(from_image, from_points, to_image, to_points, dense_flow)
    public  void interpolate(Mat from_image, Mat from_points, Mat to_image, Mat to_points, Mat dense_flow)
    {
        
        interpolate_0(nativeObj, from_image.nativeObj, from_points.nativeObj, to_image.nativeObj, to_points.nativeObj, dense_flow.nativeObj);
        
        return;
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
