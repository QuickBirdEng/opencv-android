//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class GuidedFilter
//javadoc: GuidedFilter

public class GuidedFilter extends Algorithm {

    protected GuidedFilter(long addr) { super(addr); }

    // internal usage only
    public static GuidedFilter __fromPtr__(long addr) { return new GuidedFilter(addr); }

    //
    // C++:  void cv::ximgproc::GuidedFilter::filter(Mat src, Mat& dst, int dDepth = -1)
    //

    //javadoc: GuidedFilter::filter(src, dst, dDepth)
    public  void filter(Mat src, Mat dst, int dDepth)
    {
        
        filter_0(nativeObj, src.nativeObj, dst.nativeObj, dDepth);
        
        return;
    }

    //javadoc: GuidedFilter::filter(src, dst)
    public  void filter(Mat src, Mat dst)
    {
        
        filter_1(nativeObj, src.nativeObj, dst.nativeObj);
        
        return;
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
