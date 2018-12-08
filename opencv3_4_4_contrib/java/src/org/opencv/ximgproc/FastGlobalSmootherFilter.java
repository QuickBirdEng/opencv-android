//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class FastGlobalSmootherFilter
//javadoc: FastGlobalSmootherFilter

public class FastGlobalSmootherFilter extends Algorithm {

    protected FastGlobalSmootherFilter(long addr) { super(addr); }

    // internal usage only
    public static FastGlobalSmootherFilter __fromPtr__(long addr) { return new FastGlobalSmootherFilter(addr); }

    //
    // C++:  void cv::ximgproc::FastGlobalSmootherFilter::filter(Mat src, Mat& dst)
    //

    //javadoc: FastGlobalSmootherFilter::filter(src, dst)
    public  void filter(Mat src, Mat dst)
    {
        
        filter_0(nativeObj, src.nativeObj, dst.nativeObj);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::FastGlobalSmootherFilter::filter(Mat src, Mat& dst)
    private static native void filter_0(long nativeObj, long src_nativeObj, long dst_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
