//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xphoto;

import org.opencv.core.Mat;
import org.opencv.xphoto.WhiteBalancer;

// C++: class LearningBasedWB
/**
 * More sophisticated learning-based automatic white balance algorithm.
 *
 * As REF: GrayworldWB, this algorithm works by applying different gains to the input
 * image channels, but their computation is a bit more involved compared to the
 * simple gray-world assumption. More details about the algorithm can be found in
 * CITE: Cheng2015 .
 *
 * To mask out saturated pixels this function uses only pixels that satisfy the
 * following condition:
 *
 * \( \frac{\textrm{max}(R,G,B)}{\texttt{range_max_val}} &lt; \texttt{saturation_thresh} \)
 *
 * Currently supports images of type REF: CV_8UC3 and REF: CV_16UC3.
 */
public class LearningBasedWB extends WhiteBalancer {

    protected LearningBasedWB(long addr) { super(addr); }

    // internal usage only
    public static LearningBasedWB __fromPtr__(long addr) { return new LearningBasedWB(addr); }

    //
    // C++:  float cv::xphoto::LearningBasedWB::getSaturationThreshold()
    //

    /**
     * Threshold that is used to determine saturated pixels, i.e. pixels where at least one of the
     *         channels exceeds \(\texttt{saturation_threshold}\times\texttt{range_max_val}\) are ignored.
     * SEE: setSaturationThreshold
     * @return automatically generated
     */
    public float getSaturationThreshold() {
        return getSaturationThreshold_0(nativeObj);
    }


    //
    // C++:  int cv::xphoto::LearningBasedWB::getHistBinNum()
    //

    /**
     * Defines the size of one dimension of a three-dimensional RGB histogram that is used internally
     *         by the algorithm. It often makes sense to increase the number of bins for images with higher bit depth
     *         (e.g. 256 bins for a 12 bit image).
     * SEE: setHistBinNum
     * @return automatically generated
     */
    public int getHistBinNum() {
        return getHistBinNum_0(nativeObj);
    }


    //
    // C++:  int cv::xphoto::LearningBasedWB::getRangeMaxVal()
    //

    /**
     * Maximum possible value of the input image (e.g. 255 for 8 bit images,
     *                4095 for 12 bit images)
     * SEE: setRangeMaxVal
     * @return automatically generated
     */
    public int getRangeMaxVal() {
        return getRangeMaxVal_0(nativeObj);
    }


    //
    // C++:  void cv::xphoto::LearningBasedWB::extractSimpleFeatures(Mat src, Mat& dst)
    //

    /**
     * Implements the feature extraction part of the algorithm.
     *
     *     In accordance with CITE: Cheng2015 , computes the following features for the input image:
     *     1. Chromaticity of an average (R,G,B) tuple
     *     2. Chromaticity of the brightest (R,G,B) tuple (while ignoring saturated pixels)
     *     3. Chromaticity of the dominant (R,G,B) tuple (the one that has the highest value in the RGB histogram)
     *     4. Mode of the chromaticity palette, that is constructed by taking 300 most common colors according to
     *        the RGB histogram and projecting them on the chromaticity plane. Mode is the most high-density point
     *        of the palette, which is computed by a straightforward fixed-bandwidth kernel density estimator with
     *        a Epanechnikov kernel function.
     *
     *     @param src Input three-channel image (BGR color space is assumed).
     *     @param dst An array of four (r,g) chromaticity tuples corresponding to the features listed above.
     */
    public void extractSimpleFeatures(Mat src, Mat dst) {
        extractSimpleFeatures_0(nativeObj, src.nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::xphoto::LearningBasedWB::setHistBinNum(int val)
    //

    /**
     *  getHistBinNum SEE: getHistBinNum
     * @param val automatically generated
     */
    public void setHistBinNum(int val) {
        setHistBinNum_0(nativeObj, val);
    }


    //
    // C++:  void cv::xphoto::LearningBasedWB::setRangeMaxVal(int val)
    //

    /**
     *  getRangeMaxVal SEE: getRangeMaxVal
     * @param val automatically generated
     */
    public void setRangeMaxVal(int val) {
        setRangeMaxVal_0(nativeObj, val);
    }


    //
    // C++:  void cv::xphoto::LearningBasedWB::setSaturationThreshold(float val)
    //

    /**
     *  getSaturationThreshold SEE: getSaturationThreshold
     * @param val automatically generated
     */
    public void setSaturationThreshold(float val) {
        setSaturationThreshold_0(nativeObj, val);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  float cv::xphoto::LearningBasedWB::getSaturationThreshold()
    private static native float getSaturationThreshold_0(long nativeObj);

    // C++:  int cv::xphoto::LearningBasedWB::getHistBinNum()
    private static native int getHistBinNum_0(long nativeObj);

    // C++:  int cv::xphoto::LearningBasedWB::getRangeMaxVal()
    private static native int getRangeMaxVal_0(long nativeObj);

    // C++:  void cv::xphoto::LearningBasedWB::extractSimpleFeatures(Mat src, Mat& dst)
    private static native void extractSimpleFeatures_0(long nativeObj, long src_nativeObj, long dst_nativeObj);

    // C++:  void cv::xphoto::LearningBasedWB::setHistBinNum(int val)
    private static native void setHistBinNum_0(long nativeObj, int val);

    // C++:  void cv::xphoto::LearningBasedWB::setRangeMaxVal(int val)
    private static native void setRangeMaxVal_0(long nativeObj, int val);

    // C++:  void cv::xphoto::LearningBasedWB::setSaturationThreshold(float val)
    private static native void setSaturationThreshold_0(long nativeObj, float val);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
