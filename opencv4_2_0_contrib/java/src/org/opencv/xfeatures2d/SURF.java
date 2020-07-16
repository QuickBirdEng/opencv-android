//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.SURF;

// C++: class SURF
/**
 * Class for extracting Speeded Up Robust Features from an image CITE: Bay06 .
 *
 * The algorithm parameters:
 * <ul>
 *   <li>
 *    member int extended
 *   <ul>
 *     <li>
 *        0 means that the basic descriptors (64 elements each) shall be computed
 *     </li>
 *     <li>
 *        1 means that the extended descriptors (128 elements each) shall be computed
 *     </li>
 *   </ul>
 *   <li>
 *    member int upright
 *   <ul>
 *     <li>
 *        0 means that detector computes orientation of each feature.
 *     </li>
 *     <li>
 *        1 means that the orientation is not computed (which is much, much faster). For example,
 * if you match images from a stereo pair, or do image stitching, the matched features
 * likely have very similar angles, and you can speed up feature extraction by setting
 * upright=1.
 *     </li>
 *   </ul>
 *   <li>
 *    member double hessianThreshold
 * Threshold for the keypoint detector. Only features, whose hessian is larger than
 * hessianThreshold are retained by the detector. Therefore, the larger the value, the less
 * keypoints you will get. A good default value could be from 300 to 500, depending from the
 * image contrast.
 *   </li>
 *   <li>
 *    member int nOctaves
 * The number of a gaussian pyramid octaves that the detector uses. It is set to 4 by default.
 * If you want to get very large features, use the larger value. If you want just small
 * features, decrease it.
 *   </li>
 *   <li>
 *    member int nOctaveLayers
 * The number of images within each octave of a gaussian pyramid. It is set to 2 by default.
 *   </li>
 * </ul>
 * <b>Note:</b>
 * <ul>
 *   <li>
 *       An example using the SURF feature detector can be found at
 *         opencv_source_code/samples/cpp/generic_descriptor_match.cpp
 *   <ul>
 *     <li>
 *        Another example using the SURF feature detector, extractor and matcher can be found at
 *         opencv_source_code/samples/cpp/matcher_simple.cpp
 *     </li>
 *   </ul>
 *   </li>
 * </ul>
 */
public class SURF extends Feature2D {

    protected SURF(long addr) { super(addr); }

    // internal usage only
    public static SURF __fromPtr__(long addr) { return new SURF(addr); }

    //
    // C++: static Ptr_SURF cv::xfeatures2d::SURF::create(double hessianThreshold = 100, int nOctaves = 4, int nOctaveLayers = 3, bool extended = false, bool upright = false)
    //

    /**
     * @param hessianThreshold Threshold for hessian keypoint detector used in SURF.
     *     @param nOctaves Number of pyramid octaves the keypoint detector will use.
     *     @param nOctaveLayers Number of octave layers within each octave.
     *     @param extended Extended descriptor flag (true - use extended 128-element descriptors; false - use
     *     64-element descriptors).
     *     @param upright Up-right or rotated features flag (true - do not compute orientation of features;
     *     false - compute orientation).
     * @return automatically generated
     */
    public static SURF create(double hessianThreshold, int nOctaves, int nOctaveLayers, boolean extended, boolean upright) {
        return SURF.__fromPtr__(create_0(hessianThreshold, nOctaves, nOctaveLayers, extended, upright));
    }

    /**
     * @param hessianThreshold Threshold for hessian keypoint detector used in SURF.
     *     @param nOctaves Number of pyramid octaves the keypoint detector will use.
     *     @param nOctaveLayers Number of octave layers within each octave.
     *     @param extended Extended descriptor flag (true - use extended 128-element descriptors; false - use
     *     64-element descriptors).
     *     false - compute orientation).
     * @return automatically generated
     */
    public static SURF create(double hessianThreshold, int nOctaves, int nOctaveLayers, boolean extended) {
        return SURF.__fromPtr__(create_1(hessianThreshold, nOctaves, nOctaveLayers, extended));
    }

    /**
     * @param hessianThreshold Threshold for hessian keypoint detector used in SURF.
     *     @param nOctaves Number of pyramid octaves the keypoint detector will use.
     *     @param nOctaveLayers Number of octave layers within each octave.
     *     64-element descriptors).
     *     false - compute orientation).
     * @return automatically generated
     */
    public static SURF create(double hessianThreshold, int nOctaves, int nOctaveLayers) {
        return SURF.__fromPtr__(create_2(hessianThreshold, nOctaves, nOctaveLayers));
    }

    /**
     * @param hessianThreshold Threshold for hessian keypoint detector used in SURF.
     *     @param nOctaves Number of pyramid octaves the keypoint detector will use.
     *     64-element descriptors).
     *     false - compute orientation).
     * @return automatically generated
     */
    public static SURF create(double hessianThreshold, int nOctaves) {
        return SURF.__fromPtr__(create_3(hessianThreshold, nOctaves));
    }

    /**
     * @param hessianThreshold Threshold for hessian keypoint detector used in SURF.
     *     64-element descriptors).
     *     false - compute orientation).
     * @return automatically generated
     */
    public static SURF create(double hessianThreshold) {
        return SURF.__fromPtr__(create_4(hessianThreshold));
    }

    /**
     *     64-element descriptors).
     *     false - compute orientation).
     * @return automatically generated
     */
    public static SURF create() {
        return SURF.__fromPtr__(create_5());
    }


    //
    // C++:  bool cv::xfeatures2d::SURF::getExtended()
    //

    public boolean getExtended() {
        return getExtended_0(nativeObj);
    }


    //
    // C++:  bool cv::xfeatures2d::SURF::getUpright()
    //

    public boolean getUpright() {
        return getUpright_0(nativeObj);
    }


    //
    // C++:  double cv::xfeatures2d::SURF::getHessianThreshold()
    //

    public double getHessianThreshold() {
        return getHessianThreshold_0(nativeObj);
    }


    //
    // C++:  int cv::xfeatures2d::SURF::getNOctaveLayers()
    //

    public int getNOctaveLayers() {
        return getNOctaveLayers_0(nativeObj);
    }


    //
    // C++:  int cv::xfeatures2d::SURF::getNOctaves()
    //

    public int getNOctaves() {
        return getNOctaves_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::SURF::setExtended(bool extended)
    //

    public void setExtended(boolean extended) {
        setExtended_0(nativeObj, extended);
    }


    //
    // C++:  void cv::xfeatures2d::SURF::setHessianThreshold(double hessianThreshold)
    //

    public void setHessianThreshold(double hessianThreshold) {
        setHessianThreshold_0(nativeObj, hessianThreshold);
    }


    //
    // C++:  void cv::xfeatures2d::SURF::setNOctaveLayers(int nOctaveLayers)
    //

    public void setNOctaveLayers(int nOctaveLayers) {
        setNOctaveLayers_0(nativeObj, nOctaveLayers);
    }


    //
    // C++:  void cv::xfeatures2d::SURF::setNOctaves(int nOctaves)
    //

    public void setNOctaves(int nOctaves) {
        setNOctaves_0(nativeObj, nOctaves);
    }


    //
    // C++:  void cv::xfeatures2d::SURF::setUpright(bool upright)
    //

    public void setUpright(boolean upright) {
        setUpright_0(nativeObj, upright);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_SURF cv::xfeatures2d::SURF::create(double hessianThreshold = 100, int nOctaves = 4, int nOctaveLayers = 3, bool extended = false, bool upright = false)
    private static native long create_0(double hessianThreshold, int nOctaves, int nOctaveLayers, boolean extended, boolean upright);
    private static native long create_1(double hessianThreshold, int nOctaves, int nOctaveLayers, boolean extended);
    private static native long create_2(double hessianThreshold, int nOctaves, int nOctaveLayers);
    private static native long create_3(double hessianThreshold, int nOctaves);
    private static native long create_4(double hessianThreshold);
    private static native long create_5();

    // C++:  bool cv::xfeatures2d::SURF::getExtended()
    private static native boolean getExtended_0(long nativeObj);

    // C++:  bool cv::xfeatures2d::SURF::getUpright()
    private static native boolean getUpright_0(long nativeObj);

    // C++:  double cv::xfeatures2d::SURF::getHessianThreshold()
    private static native double getHessianThreshold_0(long nativeObj);

    // C++:  int cv::xfeatures2d::SURF::getNOctaveLayers()
    private static native int getNOctaveLayers_0(long nativeObj);

    // C++:  int cv::xfeatures2d::SURF::getNOctaves()
    private static native int getNOctaves_0(long nativeObj);

    // C++:  void cv::xfeatures2d::SURF::setExtended(bool extended)
    private static native void setExtended_0(long nativeObj, boolean extended);

    // C++:  void cv::xfeatures2d::SURF::setHessianThreshold(double hessianThreshold)
    private static native void setHessianThreshold_0(long nativeObj, double hessianThreshold);

    // C++:  void cv::xfeatures2d::SURF::setNOctaveLayers(int nOctaveLayers)
    private static native void setNOctaveLayers_0(long nativeObj, int nOctaveLayers);

    // C++:  void cv::xfeatures2d::SURF::setNOctaves(int nOctaves)
    private static native void setNOctaves_0(long nativeObj, int nOctaves);

    // C++:  void cv::xfeatures2d::SURF::setUpright(bool upright)
    private static native void setUpright_0(long nativeObj, boolean upright);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
