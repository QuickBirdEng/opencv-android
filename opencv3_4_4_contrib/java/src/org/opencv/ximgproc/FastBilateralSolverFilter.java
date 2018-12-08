//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class FastBilateralSolverFilter
//javadoc: FastBilateralSolverFilter

public class FastBilateralSolverFilter extends Algorithm {

    protected FastBilateralSolverFilter(long addr) { super(addr); }

    // internal usage only
    public static FastBilateralSolverFilter __fromPtr__(long addr) { return new FastBilateralSolverFilter(addr); }

    //
    // C++:  void cv::ximgproc::FastBilateralSolverFilter::filter(Mat src, Mat confidence, Mat& dst)
    //

    //javadoc: FastBilateralSolverFilter::filter(src, confidence, dst)
    public  void filter(Mat src, Mat confidence, Mat dst)
    {
        
        filter_0(nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj);
        
        return;
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
