//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class GraphSegmentation
//javadoc: GraphSegmentation

public class GraphSegmentation extends Algorithm {

    protected GraphSegmentation(long addr) { super(addr); }

    // internal usage only
    public static GraphSegmentation __fromPtr__(long addr) { return new GraphSegmentation(addr); }

    //
    // C++:  double cv::ximgproc::segmentation::GraphSegmentation::getSigma()
    //

    //javadoc: GraphSegmentation::getSigma()
    public  double getSigma()
    {
        
        double retVal = getSigma_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::ximgproc::segmentation::GraphSegmentation::getK()
    //

    //javadoc: GraphSegmentation::getK()
    public  float getK()
    {
        
        float retVal = getK_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::ximgproc::segmentation::GraphSegmentation::getMinSize()
    //

    //javadoc: GraphSegmentation::getMinSize()
    public  int getMinSize()
    {
        
        int retVal = getMinSize_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::processImage(Mat src, Mat& dst)
    //

    //javadoc: GraphSegmentation::processImage(src, dst)
    public  void processImage(Mat src, Mat dst)
    {
        
        processImage_0(nativeObj, src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::setK(float k)
    //

    //javadoc: GraphSegmentation::setK(k)
    public  void setK(float k)
    {
        
        setK_0(nativeObj, k);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::setMinSize(int min_size)
    //

    //javadoc: GraphSegmentation::setMinSize(min_size)
    public  void setMinSize(int min_size)
    {
        
        setMinSize_0(nativeObj, min_size);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::setSigma(double sigma)
    //

    //javadoc: GraphSegmentation::setSigma(sigma)
    public  void setSigma(double sigma)
    {
        
        setSigma_0(nativeObj, sigma);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  double cv::ximgproc::segmentation::GraphSegmentation::getSigma()
    private static native double getSigma_0(long nativeObj);

    // C++:  float cv::ximgproc::segmentation::GraphSegmentation::getK()
    private static native float getK_0(long nativeObj);

    // C++:  int cv::ximgproc::segmentation::GraphSegmentation::getMinSize()
    private static native int getMinSize_0(long nativeObj);

    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::processImage(Mat src, Mat& dst)
    private static native void processImage_0(long nativeObj, long src_nativeObj, long dst_nativeObj);

    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::setK(float k)
    private static native void setK_0(long nativeObj, float k);

    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::setMinSize(int min_size)
    private static native void setMinSize_0(long nativeObj, int min_size);

    // C++:  void cv::ximgproc::segmentation::GraphSegmentation::setSigma(double sigma)
    private static native void setSigma_0(long nativeObj, double sigma);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
