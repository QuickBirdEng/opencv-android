//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bgsegm;

import org.opencv.core.Mat;
import org.opencv.video.BackgroundSubtractor;

// C++: class BackgroundSubtractorCNT
/**
 * Background subtraction based on counting.
 *
 *   About as fast as MOG2 on a high end system.
 *   More than twice faster than MOG2 on cheap hardware (benchmarked on Raspberry Pi3).
 *
 *   %Algorithm by Sagi Zeevi ( https://github.com/sagi-z/BackgroundSubtractorCNT )
 */
public class BackgroundSubtractorCNT extends BackgroundSubtractor {

    protected BackgroundSubtractorCNT(long addr) { super(addr); }

    // internal usage only
    public static BackgroundSubtractorCNT __fromPtr__(long addr) { return new BackgroundSubtractorCNT(addr); }

    //
    // C++:  bool cv::bgsegm::BackgroundSubtractorCNT::getIsParallel()
    //

    /**
     * Returns if we're parallelizing the algorithm.
     * @return automatically generated
     */
    public boolean getIsParallel() {
        return getIsParallel_0(nativeObj);
    }


    //
    // C++:  bool cv::bgsegm::BackgroundSubtractorCNT::getUseHistory()
    //

    /**
     * Returns if we're giving a pixel credit for being stable for a long time.
     * @return automatically generated
     */
    public boolean getUseHistory() {
        return getUseHistory_0(nativeObj);
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorCNT::getMaxPixelStability()
    //

    /**
     * Returns maximum allowed credit for a pixel in history.
     * @return automatically generated
     */
    public int getMaxPixelStability() {
        return getMaxPixelStability_0(nativeObj);
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorCNT::getMinPixelStability()
    //

    /**
     * Returns number of frames with same pixel color to consider stable.
     * @return automatically generated
     */
    public int getMinPixelStability() {
        return getMinPixelStability_0(nativeObj);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorCNT::apply(Mat image, Mat& fgmask, double learningRate = -1)
    //

    public void apply(Mat image, Mat fgmask, double learningRate) {
        apply_0(nativeObj, image.nativeObj, fgmask.nativeObj, learningRate);
    }

    public void apply(Mat image, Mat fgmask) {
        apply_1(nativeObj, image.nativeObj, fgmask.nativeObj);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorCNT::getBackgroundImage(Mat& backgroundImage)
    //

    public void getBackgroundImage(Mat backgroundImage) {
        getBackgroundImage_0(nativeObj, backgroundImage.nativeObj);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorCNT::setIsParallel(bool value)
    //

    /**
     * Sets if we're parallelizing the algorithm.
     * @param value automatically generated
     */
    public void setIsParallel(boolean value) {
        setIsParallel_0(nativeObj, value);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorCNT::setMaxPixelStability(int value)
    //

    /**
     * Sets the maximum allowed credit for a pixel in history.
     * @param value automatically generated
     */
    public void setMaxPixelStability(int value) {
        setMaxPixelStability_0(nativeObj, value);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorCNT::setMinPixelStability(int value)
    //

    /**
     * Sets the number of frames with same pixel color to consider stable.
     * @param value automatically generated
     */
    public void setMinPixelStability(int value) {
        setMinPixelStability_0(nativeObj, value);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorCNT::setUseHistory(bool value)
    //

    /**
     * Sets if we're giving a pixel credit for being stable for a long time.
     * @param value automatically generated
     */
    public void setUseHistory(boolean value) {
        setUseHistory_0(nativeObj, value);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool cv::bgsegm::BackgroundSubtractorCNT::getIsParallel()
    private static native boolean getIsParallel_0(long nativeObj);

    // C++:  bool cv::bgsegm::BackgroundSubtractorCNT::getUseHistory()
    private static native boolean getUseHistory_0(long nativeObj);

    // C++:  int cv::bgsegm::BackgroundSubtractorCNT::getMaxPixelStability()
    private static native int getMaxPixelStability_0(long nativeObj);

    // C++:  int cv::bgsegm::BackgroundSubtractorCNT::getMinPixelStability()
    private static native int getMinPixelStability_0(long nativeObj);

    // C++:  void cv::bgsegm::BackgroundSubtractorCNT::apply(Mat image, Mat& fgmask, double learningRate = -1)
    private static native void apply_0(long nativeObj, long image_nativeObj, long fgmask_nativeObj, double learningRate);
    private static native void apply_1(long nativeObj, long image_nativeObj, long fgmask_nativeObj);

    // C++:  void cv::bgsegm::BackgroundSubtractorCNT::getBackgroundImage(Mat& backgroundImage)
    private static native void getBackgroundImage_0(long nativeObj, long backgroundImage_nativeObj);

    // C++:  void cv::bgsegm::BackgroundSubtractorCNT::setIsParallel(bool value)
    private static native void setIsParallel_0(long nativeObj, boolean value);

    // C++:  void cv::bgsegm::BackgroundSubtractorCNT::setMaxPixelStability(int value)
    private static native void setMaxPixelStability_0(long nativeObj, int value);

    // C++:  void cv::bgsegm::BackgroundSubtractorCNT::setMinPixelStability(int value)
    private static native void setMinPixelStability_0(long nativeObj, int value);

    // C++:  void cv::bgsegm::BackgroundSubtractorCNT::setUseHistory(bool value)
    private static native void setUseHistory_0(long nativeObj, boolean value);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
