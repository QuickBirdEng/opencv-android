//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bgsegm;

import org.opencv.core.Mat;
import org.opencv.video.BackgroundSubtractor;

// C++: class BackgroundSubtractorLSBP
/**
 * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
 */
public class BackgroundSubtractorLSBP extends BackgroundSubtractor {

    protected BackgroundSubtractorLSBP(long addr) { super(addr); }

    // internal usage only
    public static BackgroundSubtractorLSBP __fromPtr__(long addr) { return new BackgroundSubtractorLSBP(addr); }

    //
    // C++:  void cv::bgsegm::BackgroundSubtractorLSBP::apply(Mat image, Mat& fgmask, double learningRate = -1)
    //

    public void apply(Mat image, Mat fgmask, double learningRate) {
        apply_0(nativeObj, image.nativeObj, fgmask.nativeObj, learningRate);
    }

    public void apply(Mat image, Mat fgmask) {
        apply_1(nativeObj, image.nativeObj, fgmask.nativeObj);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorLSBP::getBackgroundImage(Mat& backgroundImage)
    //

    public void getBackgroundImage(Mat backgroundImage) {
        getBackgroundImage_0(nativeObj, backgroundImage.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::bgsegm::BackgroundSubtractorLSBP::apply(Mat image, Mat& fgmask, double learningRate = -1)
    private static native void apply_0(long nativeObj, long image_nativeObj, long fgmask_nativeObj, double learningRate);
    private static native void apply_1(long nativeObj, long image_nativeObj, long fgmask_nativeObj);

    // C++:  void cv::bgsegm::BackgroundSubtractorLSBP::getBackgroundImage(Mat& backgroundImage)
    private static native void getBackgroundImage_0(long nativeObj, long backgroundImage_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
