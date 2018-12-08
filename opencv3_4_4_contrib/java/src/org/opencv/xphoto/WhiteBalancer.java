//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xphoto;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class WhiteBalancer
//javadoc: WhiteBalancer

public class WhiteBalancer extends Algorithm {

    protected WhiteBalancer(long addr) { super(addr); }

    // internal usage only
    public static WhiteBalancer __fromPtr__(long addr) { return new WhiteBalancer(addr); }

    //
    // C++:  void cv::xphoto::WhiteBalancer::balanceWhite(Mat src, Mat& dst)
    //

    //javadoc: WhiteBalancer::balanceWhite(src, dst)
    public  void balanceWhite(Mat src, Mat dst)
    {
        
        balanceWhite_0(nativeObj, src.nativeObj, dst.nativeObj);
        
        return;
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
