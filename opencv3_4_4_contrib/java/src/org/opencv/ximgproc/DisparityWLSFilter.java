//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.ximgproc.DisparityFilter;

// C++: class DisparityWLSFilter
//javadoc: DisparityWLSFilter

public class DisparityWLSFilter extends DisparityFilter {

    protected DisparityWLSFilter(long addr) { super(addr); }

    // internal usage only
    public static DisparityWLSFilter __fromPtr__(long addr) { return new DisparityWLSFilter(addr); }

    //
    // C++:  Mat cv::ximgproc::DisparityWLSFilter::getConfidenceMap()
    //

    //javadoc: DisparityWLSFilter::getConfidenceMap()
    public  Mat getConfidenceMap()
    {
        
        Mat retVal = new Mat(getConfidenceMap_0(nativeObj));
        
        return retVal;
    }


    //
    // C++:  Rect cv::ximgproc::DisparityWLSFilter::getROI()
    //

    //javadoc: DisparityWLSFilter::getROI()
    public  Rect getROI()
    {
        
        Rect retVal = new Rect(getROI_0(nativeObj));
        
        return retVal;
    }


    //
    // C++:  double cv::ximgproc::DisparityWLSFilter::getLambda()
    //

    //javadoc: DisparityWLSFilter::getLambda()
    public  double getLambda()
    {
        
        double retVal = getLambda_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  double cv::ximgproc::DisparityWLSFilter::getSigmaColor()
    //

    //javadoc: DisparityWLSFilter::getSigmaColor()
    public  double getSigmaColor()
    {
        
        double retVal = getSigmaColor_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::ximgproc::DisparityWLSFilter::getDepthDiscontinuityRadius()
    //

    //javadoc: DisparityWLSFilter::getDepthDiscontinuityRadius()
    public  int getDepthDiscontinuityRadius()
    {
        
        int retVal = getDepthDiscontinuityRadius_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::ximgproc::DisparityWLSFilter::getLRCthresh()
    //

    //javadoc: DisparityWLSFilter::getLRCthresh()
    public  int getLRCthresh()
    {
        
        int retVal = getLRCthresh_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::ximgproc::DisparityWLSFilter::setDepthDiscontinuityRadius(int _disc_radius)
    //

    //javadoc: DisparityWLSFilter::setDepthDiscontinuityRadius(_disc_radius)
    public  void setDepthDiscontinuityRadius(int _disc_radius)
    {
        
        setDepthDiscontinuityRadius_0(nativeObj, _disc_radius);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::DisparityWLSFilter::setLRCthresh(int _LRC_thresh)
    //

    //javadoc: DisparityWLSFilter::setLRCthresh(_LRC_thresh)
    public  void setLRCthresh(int _LRC_thresh)
    {
        
        setLRCthresh_0(nativeObj, _LRC_thresh);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::DisparityWLSFilter::setLambda(double _lambda)
    //

    //javadoc: DisparityWLSFilter::setLambda(_lambda)
    public  void setLambda(double _lambda)
    {
        
        setLambda_0(nativeObj, _lambda);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::DisparityWLSFilter::setSigmaColor(double _sigma_color)
    //

    //javadoc: DisparityWLSFilter::setSigmaColor(_sigma_color)
    public  void setSigmaColor(double _sigma_color)
    {
        
        setSigmaColor_0(nativeObj, _sigma_color);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  Mat cv::ximgproc::DisparityWLSFilter::getConfidenceMap()
    private static native long getConfidenceMap_0(long nativeObj);

    // C++:  Rect cv::ximgproc::DisparityWLSFilter::getROI()
    private static native double[] getROI_0(long nativeObj);

    // C++:  double cv::ximgproc::DisparityWLSFilter::getLambda()
    private static native double getLambda_0(long nativeObj);

    // C++:  double cv::ximgproc::DisparityWLSFilter::getSigmaColor()
    private static native double getSigmaColor_0(long nativeObj);

    // C++:  int cv::ximgproc::DisparityWLSFilter::getDepthDiscontinuityRadius()
    private static native int getDepthDiscontinuityRadius_0(long nativeObj);

    // C++:  int cv::ximgproc::DisparityWLSFilter::getLRCthresh()
    private static native int getLRCthresh_0(long nativeObj);

    // C++:  void cv::ximgproc::DisparityWLSFilter::setDepthDiscontinuityRadius(int _disc_radius)
    private static native void setDepthDiscontinuityRadius_0(long nativeObj, int _disc_radius);

    // C++:  void cv::ximgproc::DisparityWLSFilter::setLRCthresh(int _LRC_thresh)
    private static native void setLRCthresh_0(long nativeObj, int _LRC_thresh);

    // C++:  void cv::ximgproc::DisparityWLSFilter::setLambda(double _lambda)
    private static native void setLambda_0(long nativeObj, double _lambda);

    // C++:  void cv::ximgproc::DisparityWLSFilter::setSigmaColor(double _sigma_color)
    private static native void setSigmaColor_0(long nativeObj, double _sigma_color);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
