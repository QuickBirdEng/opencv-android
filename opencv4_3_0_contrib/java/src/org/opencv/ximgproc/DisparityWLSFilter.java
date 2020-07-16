//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.ximgproc.DisparityFilter;

// C++: class DisparityWLSFilter
/**
 * Disparity map filter based on Weighted Least Squares filter (in form of Fast Global Smoother that
 * is a lot faster than traditional Weighted Least Squares filter implementations) and optional use of
 * left-right-consistency-based confidence to refine the results in half-occlusions and uniform areas.
 */
public class DisparityWLSFilter extends DisparityFilter {

    protected DisparityWLSFilter(long addr) { super(addr); }

    // internal usage only
    public static DisparityWLSFilter __fromPtr__(long addr) { return new DisparityWLSFilter(addr); }

    //
    // C++:  Mat cv::ximgproc::DisparityWLSFilter::getConfidenceMap()
    //

    /**
     * Get the confidence map that was used in the last filter call. It is a CV_32F one-channel image
     *     with values ranging from 0.0 (totally untrusted regions of the raw disparity map) to 255.0 (regions containing
     *     correct disparity values with a high degree of confidence).
     * @return automatically generated
     */
    public Mat getConfidenceMap() {
        return new Mat(getConfidenceMap_0(nativeObj));
    }


    //
    // C++:  Rect cv::ximgproc::DisparityWLSFilter::getROI()
    //

    /**
     * Get the ROI used in the last filter call
     * @return automatically generated
     */
    public Rect getROI() {
        return new Rect(getROI_0(nativeObj));
    }


    //
    // C++:  double cv::ximgproc::DisparityWLSFilter::getLambda()
    //

    /**
     * Lambda is a parameter defining the amount of regularization during filtering. Larger values force
     *     filtered disparity map edges to adhere more to source image edges. Typical value is 8000.
     * @return automatically generated
     */
    public double getLambda() {
        return getLambda_0(nativeObj);
    }


    //
    // C++:  double cv::ximgproc::DisparityWLSFilter::getSigmaColor()
    //

    /**
     * SigmaColor is a parameter defining how sensitive the filtering process is to source image edges.
     *     Large values can lead to disparity leakage through low-contrast edges. Small values can make the filter too
     *     sensitive to noise and textures in the source image. Typical values range from 0.8 to 2.0.
     * @return automatically generated
     */
    public double getSigmaColor() {
        return getSigmaColor_0(nativeObj);
    }


    //
    // C++:  int cv::ximgproc::DisparityWLSFilter::getDepthDiscontinuityRadius()
    //

    /**
     * DepthDiscontinuityRadius is a parameter used in confidence computation. It defines the size of
     *     low-confidence regions around depth discontinuities.
     * @return automatically generated
     */
    public int getDepthDiscontinuityRadius() {
        return getDepthDiscontinuityRadius_0(nativeObj);
    }


    //
    // C++:  int cv::ximgproc::DisparityWLSFilter::getLRCthresh()
    //

    /**
     * LRCthresh is a threshold of disparity difference used in left-right-consistency check during
     *     confidence map computation. The default value of 24 (1.5 pixels) is virtually always good enough.
     * @return automatically generated
     */
    public int getLRCthresh() {
        return getLRCthresh_0(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::DisparityWLSFilter::setDepthDiscontinuityRadius(int _disc_radius)
    //

    /**
     * SEE: getDepthDiscontinuityRadius
     * @param _disc_radius automatically generated
     */
    public void setDepthDiscontinuityRadius(int _disc_radius) {
        setDepthDiscontinuityRadius_0(nativeObj, _disc_radius);
    }


    //
    // C++:  void cv::ximgproc::DisparityWLSFilter::setLRCthresh(int _LRC_thresh)
    //

    /**
     * SEE: getLRCthresh
     * @param _LRC_thresh automatically generated
     */
    public void setLRCthresh(int _LRC_thresh) {
        setLRCthresh_0(nativeObj, _LRC_thresh);
    }


    //
    // C++:  void cv::ximgproc::DisparityWLSFilter::setLambda(double _lambda)
    //

    /**
     * SEE: getLambda
     * @param _lambda automatically generated
     */
    public void setLambda(double _lambda) {
        setLambda_0(nativeObj, _lambda);
    }


    //
    // C++:  void cv::ximgproc::DisparityWLSFilter::setSigmaColor(double _sigma_color)
    //

    /**
     * SEE: getSigmaColor
     * @param _sigma_color automatically generated
     */
    public void setSigmaColor(double _sigma_color) {
        setSigmaColor_0(nativeObj, _sigma_color);
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
