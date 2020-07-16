//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bgsegm;

import org.opencv.video.BackgroundSubtractor;

// C++: class BackgroundSubtractorGMG
/**
 * Background Subtractor module based on the algorithm given in CITE: Gold2012 .
 *
 *  Takes a series of images and returns a sequence of mask (8UC1)
 *  images of the same size, where 255 indicates Foreground and 0 represents Background.
 *  This class implements an algorithm described in "Visual Tracking of Human Visitors under
 *  Variable-Lighting Conditions for a Responsive Audio Art Installation," A. Godbehere,
 *  A. Matsukawa, K. Goldberg, American Control Conference, Montreal, June 2012.
 */
public class BackgroundSubtractorGMG extends BackgroundSubtractor {

    protected BackgroundSubtractorGMG(long addr) { super(addr); }

    // internal usage only
    public static BackgroundSubtractorGMG __fromPtr__(long addr) { return new BackgroundSubtractorGMG(addr); }

    //
    // C++:  bool cv::bgsegm::BackgroundSubtractorGMG::getUpdateBackgroundModel()
    //

    /**
     * Returns the status of background model update
     * @return automatically generated
     */
    public boolean getUpdateBackgroundModel() {
        return getUpdateBackgroundModel_0(nativeObj);
    }


    //
    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getBackgroundPrior()
    //

    /**
     * Returns the prior probability that each individual pixel is a background pixel.
     * @return automatically generated
     */
    public double getBackgroundPrior() {
        return getBackgroundPrior_0(nativeObj);
    }


    //
    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getDecisionThreshold()
    //

    /**
     * Returns the value of decision threshold.
     *
     *     Decision value is the value above which pixel is determined to be FG.
     * @return automatically generated
     */
    public double getDecisionThreshold() {
        return getDecisionThreshold_0(nativeObj);
    }


    //
    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getDefaultLearningRate()
    //

    /**
     * Returns the learning rate of the algorithm.
     *
     *     It lies between 0.0 and 1.0. It determines how quickly features are "forgotten" from
     *     histograms.
     * @return automatically generated
     */
    public double getDefaultLearningRate() {
        return getDefaultLearningRate_0(nativeObj);
    }


    //
    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getMaxVal()
    //

    /**
     * Returns the maximum value taken on by pixels in image sequence. e.g. 1.0 or 255.
     * @return automatically generated
     */
    public double getMaxVal() {
        return getMaxVal_0(nativeObj);
    }


    //
    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getMinVal()
    //

    /**
     * Returns the minimum value taken on by pixels in image sequence. Usually 0.
     * @return automatically generated
     */
    public double getMinVal() {
        return getMinVal_0(nativeObj);
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getMaxFeatures()
    //

    /**
     * Returns total number of distinct colors to maintain in histogram.
     * @return automatically generated
     */
    public int getMaxFeatures() {
        return getMaxFeatures_0(nativeObj);
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getNumFrames()
    //

    /**
     * Returns the number of frames used to initialize background model.
     * @return automatically generated
     */
    public int getNumFrames() {
        return getNumFrames_0(nativeObj);
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getQuantizationLevels()
    //

    /**
     * Returns the parameter used for quantization of color-space.
     *
     *     It is the number of discrete levels in each channel to be used in histograms.
     * @return automatically generated
     */
    public int getQuantizationLevels() {
        return getQuantizationLevels_0(nativeObj);
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getSmoothingRadius()
    //

    /**
     * Returns the kernel radius used for morphological operations
     * @return automatically generated
     */
    public int getSmoothingRadius() {
        return getSmoothingRadius_0(nativeObj);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setBackgroundPrior(double bgprior)
    //

    /**
     * Sets the prior probability that each individual pixel is a background pixel.
     * @param bgprior automatically generated
     */
    public void setBackgroundPrior(double bgprior) {
        setBackgroundPrior_0(nativeObj, bgprior);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setDecisionThreshold(double thresh)
    //

    /**
     * Sets the value of decision threshold.
     * @param thresh automatically generated
     */
    public void setDecisionThreshold(double thresh) {
        setDecisionThreshold_0(nativeObj, thresh);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setDefaultLearningRate(double lr)
    //

    /**
     * Sets the learning rate of the algorithm.
     * @param lr automatically generated
     */
    public void setDefaultLearningRate(double lr) {
        setDefaultLearningRate_0(nativeObj, lr);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setMaxFeatures(int maxFeatures)
    //

    /**
     * Sets total number of distinct colors to maintain in histogram.
     * @param maxFeatures automatically generated
     */
    public void setMaxFeatures(int maxFeatures) {
        setMaxFeatures_0(nativeObj, maxFeatures);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setMaxVal(double val)
    //

    /**
     * Sets the maximum value taken on by pixels in image sequence.
     * @param val automatically generated
     */
    public void setMaxVal(double val) {
        setMaxVal_0(nativeObj, val);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setMinVal(double val)
    //

    /**
     * Sets the minimum value taken on by pixels in image sequence.
     * @param val automatically generated
     */
    public void setMinVal(double val) {
        setMinVal_0(nativeObj, val);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setNumFrames(int nframes)
    //

    /**
     * Sets the number of frames used to initialize background model.
     * @param nframes automatically generated
     */
    public void setNumFrames(int nframes) {
        setNumFrames_0(nativeObj, nframes);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setQuantizationLevels(int nlevels)
    //

    /**
     * Sets the parameter used for quantization of color-space
     * @param nlevels automatically generated
     */
    public void setQuantizationLevels(int nlevels) {
        setQuantizationLevels_0(nativeObj, nlevels);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setSmoothingRadius(int radius)
    //

    /**
     * Sets the kernel radius used for morphological operations
     * @param radius automatically generated
     */
    public void setSmoothingRadius(int radius) {
        setSmoothingRadius_0(nativeObj, radius);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setUpdateBackgroundModel(bool update)
    //

    /**
     * Sets the status of background model update
     * @param update automatically generated
     */
    public void setUpdateBackgroundModel(boolean update) {
        setUpdateBackgroundModel_0(nativeObj, update);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool cv::bgsegm::BackgroundSubtractorGMG::getUpdateBackgroundModel()
    private static native boolean getUpdateBackgroundModel_0(long nativeObj);

    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getBackgroundPrior()
    private static native double getBackgroundPrior_0(long nativeObj);

    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getDecisionThreshold()
    private static native double getDecisionThreshold_0(long nativeObj);

    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getDefaultLearningRate()
    private static native double getDefaultLearningRate_0(long nativeObj);

    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getMaxVal()
    private static native double getMaxVal_0(long nativeObj);

    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getMinVal()
    private static native double getMinVal_0(long nativeObj);

    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getMaxFeatures()
    private static native int getMaxFeatures_0(long nativeObj);

    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getNumFrames()
    private static native int getNumFrames_0(long nativeObj);

    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getQuantizationLevels()
    private static native int getQuantizationLevels_0(long nativeObj);

    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getSmoothingRadius()
    private static native int getSmoothingRadius_0(long nativeObj);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setBackgroundPrior(double bgprior)
    private static native void setBackgroundPrior_0(long nativeObj, double bgprior);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setDecisionThreshold(double thresh)
    private static native void setDecisionThreshold_0(long nativeObj, double thresh);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setDefaultLearningRate(double lr)
    private static native void setDefaultLearningRate_0(long nativeObj, double lr);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setMaxFeatures(int maxFeatures)
    private static native void setMaxFeatures_0(long nativeObj, int maxFeatures);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setMaxVal(double val)
    private static native void setMaxVal_0(long nativeObj, double val);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setMinVal(double val)
    private static native void setMinVal_0(long nativeObj, double val);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setNumFrames(int nframes)
    private static native void setNumFrames_0(long nativeObj, int nframes);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setQuantizationLevels(int nlevels)
    private static native void setQuantizationLevels_0(long nativeObj, int nlevels);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setSmoothingRadius(int radius)
    private static native void setSmoothingRadius_0(long nativeObj, int radius);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setUpdateBackgroundModel(bool update)
    private static native void setUpdateBackgroundModel_0(long nativeObj, boolean update);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
