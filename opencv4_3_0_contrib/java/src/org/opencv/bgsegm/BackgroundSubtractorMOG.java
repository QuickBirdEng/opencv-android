//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bgsegm;

import org.opencv.video.BackgroundSubtractor;

// C++: class BackgroundSubtractorMOG
/**
 * Gaussian Mixture-based Background/Foreground Segmentation Algorithm.
 *
 * The class implements the algorithm described in CITE: KB2001 .
 */
public class BackgroundSubtractorMOG extends BackgroundSubtractor {

    protected BackgroundSubtractorMOG(long addr) { super(addr); }

    // internal usage only
    public static BackgroundSubtractorMOG __fromPtr__(long addr) { return new BackgroundSubtractorMOG(addr); }

    //
    // C++:  double cv::bgsegm::BackgroundSubtractorMOG::getBackgroundRatio()
    //

    public double getBackgroundRatio() {
        return getBackgroundRatio_0(nativeObj);
    }


    //
    // C++:  double cv::bgsegm::BackgroundSubtractorMOG::getNoiseSigma()
    //

    public double getNoiseSigma() {
        return getNoiseSigma_0(nativeObj);
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorMOG::getHistory()
    //

    public int getHistory() {
        return getHistory_0(nativeObj);
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorMOG::getNMixtures()
    //

    public int getNMixtures() {
        return getNMixtures_0(nativeObj);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setBackgroundRatio(double backgroundRatio)
    //

    public void setBackgroundRatio(double backgroundRatio) {
        setBackgroundRatio_0(nativeObj, backgroundRatio);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setHistory(int nframes)
    //

    public void setHistory(int nframes) {
        setHistory_0(nativeObj, nframes);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setNMixtures(int nmix)
    //

    public void setNMixtures(int nmix) {
        setNMixtures_0(nativeObj, nmix);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setNoiseSigma(double noiseSigma)
    //

    public void setNoiseSigma(double noiseSigma) {
        setNoiseSigma_0(nativeObj, noiseSigma);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  double cv::bgsegm::BackgroundSubtractorMOG::getBackgroundRatio()
    private static native double getBackgroundRatio_0(long nativeObj);

    // C++:  double cv::bgsegm::BackgroundSubtractorMOG::getNoiseSigma()
    private static native double getNoiseSigma_0(long nativeObj);

    // C++:  int cv::bgsegm::BackgroundSubtractorMOG::getHistory()
    private static native int getHistory_0(long nativeObj);

    // C++:  int cv::bgsegm::BackgroundSubtractorMOG::getNMixtures()
    private static native int getNMixtures_0(long nativeObj);

    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setBackgroundRatio(double backgroundRatio)
    private static native void setBackgroundRatio_0(long nativeObj, double backgroundRatio);

    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setHistory(int nframes)
    private static native void setHistory_0(long nativeObj, int nframes);

    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setNMixtures(int nmix)
    private static native void setNMixtures_0(long nativeObj, int nmix);

    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setNoiseSigma(double noiseSigma)
    private static native void setNoiseSigma_0(long nativeObj, double noiseSigma);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
