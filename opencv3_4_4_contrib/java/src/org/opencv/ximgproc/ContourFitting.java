//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class ContourFitting
//javadoc: ContourFitting

public class ContourFitting extends Algorithm {

    protected ContourFitting(long addr) { super(addr); }

    // internal usage only
    public static ContourFitting __fromPtr__(long addr) { return new ContourFitting(addr); }

    //
    // C++:  int cv::ximgproc::ContourFitting::getCtrSize()
    //

    //javadoc: ContourFitting::getCtrSize()
    public  int getCtrSize()
    {
        
        int retVal = getCtrSize_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::ximgproc::ContourFitting::getFDSize()
    //

    //javadoc: ContourFitting::getFDSize()
    public  int getFDSize()
    {
        
        int retVal = getFDSize_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::ximgproc::ContourFitting::estimateTransformation(Mat src, Mat dst, Mat& alphaPhiST, double& dist, bool fdContour = false)
    //

    //javadoc: ContourFitting::estimateTransformation(src, dst, alphaPhiST, dist, fdContour)
    public  void estimateTransformation(Mat src, Mat dst, Mat alphaPhiST, double[] dist, boolean fdContour)
    {
        double[] dist_out = new double[1];
        estimateTransformation_0(nativeObj, src.nativeObj, dst.nativeObj, alphaPhiST.nativeObj, dist_out, fdContour);
        if(dist!=null) dist[0] = (double)dist_out[0];
        return;
    }

    //javadoc: ContourFitting::estimateTransformation(src, dst, alphaPhiST, dist)
    public  void estimateTransformation(Mat src, Mat dst, Mat alphaPhiST, double[] dist)
    {
        double[] dist_out = new double[1];
        estimateTransformation_1(nativeObj, src.nativeObj, dst.nativeObj, alphaPhiST.nativeObj, dist_out);
        if(dist!=null) dist[0] = (double)dist_out[0];
        return;
    }


    //
    // C++:  void cv::ximgproc::ContourFitting::setCtrSize(int n)
    //

    //javadoc: ContourFitting::setCtrSize(n)
    public  void setCtrSize(int n)
    {
        
        setCtrSize_0(nativeObj, n);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::ContourFitting::setFDSize(int n)
    //

    //javadoc: ContourFitting::setFDSize(n)
    public  void setFDSize(int n)
    {
        
        setFDSize_0(nativeObj, n);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  int cv::ximgproc::ContourFitting::getCtrSize()
    private static native int getCtrSize_0(long nativeObj);

    // C++:  int cv::ximgproc::ContourFitting::getFDSize()
    private static native int getFDSize_0(long nativeObj);

    // C++:  void cv::ximgproc::ContourFitting::estimateTransformation(Mat src, Mat dst, Mat& alphaPhiST, double& dist, bool fdContour = false)
    private static native void estimateTransformation_0(long nativeObj, long src_nativeObj, long dst_nativeObj, long alphaPhiST_nativeObj, double[] dist_out, boolean fdContour);
    private static native void estimateTransformation_1(long nativeObj, long src_nativeObj, long dst_nativeObj, long alphaPhiST_nativeObj, double[] dist_out);

    // C++:  void cv::ximgproc::ContourFitting::setCtrSize(int n)
    private static native void setCtrSize_0(long nativeObj, int n);

    // C++:  void cv::ximgproc::ContourFitting::setFDSize(int n)
    private static native void setFDSize_0(long nativeObj, int n);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
