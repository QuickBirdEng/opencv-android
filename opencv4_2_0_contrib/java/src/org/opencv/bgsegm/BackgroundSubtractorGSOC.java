//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bgsegm;

import org.opencv.core.Mat;
import org.opencv.video.BackgroundSubtractor;

// C++: class BackgroundSubtractorGSOC
/**
 * Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
 *
 * This algorithm demonstrates better performance on CDNET 2014 dataset compared to other algorithms in OpenCV.
 */
public class BackgroundSubtractorGSOC extends BackgroundSubtractor {

    protected BackgroundSubtractorGSOC(long addr) { super(addr); }

    // internal usage only
    public static BackgroundSubtractorGSOC __fromPtr__(long addr) { return new BackgroundSubtractorGSOC(addr); }

    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGSOC::apply(Mat image, Mat& fgmask, double learningRate = -1)
    //

    public void apply(Mat image, Mat fgmask, double learningRate) {
        apply_0(nativeObj, image.nativeObj, fgmask.nativeObj, learningRate);
    }

    public void apply(Mat image, Mat fgmask) {
        apply_1(nativeObj, image.nativeObj, fgmask.nativeObj);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGSOC::getBackgroundImage(Mat& backgroundImage)
    //

    public void getBackgroundImage(Mat backgroundImage) {
        getBackgroundImage_0(nativeObj, backgroundImage.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::bgsegm::BackgroundSubtractorGSOC::apply(Mat image, Mat& fgmask, double learningRate = -1)
    private static native void apply_0(long nativeObj, long image_nativeObj, long fgmask_nativeObj, double learningRate);
    private static native void apply_1(long nativeObj, long image_nativeObj, long fgmask_nativeObj);

    // C++:  void cv::bgsegm::BackgroundSubtractorGSOC::getBackgroundImage(Mat& backgroundImage)
    private static native void getBackgroundImage_0(long nativeObj, long backgroundImage_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
