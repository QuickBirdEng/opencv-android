//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.BoostDesc;

// C++: class BoostDesc
/**
 * Class implementing BoostDesc (Learning Image Descriptors with Boosting), described in
 * CITE: Trzcinski13a and CITE: Trzcinski13b.
 *
 * desc type of descriptor to use, BoostDesc::BINBOOST_256 is default (256 bit long dimension)
 * Available types are: BoostDesc::BGM, BoostDesc::BGM_HARD, BoostDesc::BGM_BILINEAR, BoostDesc::LBGM,
 * BoostDesc::BINBOOST_64, BoostDesc::BINBOOST_128, BoostDesc::BINBOOST_256
 * use_orientation sample patterns using keypoints orientation, enabled by default
 * scale_factor adjust the sampling window of detected keypoints
 * 6.25f is default and fits for KAZE, SURF detected keypoints window ratio
 * 6.75f should be the scale for SIFT detected keypoints window ratio
 * 5.00f should be the scale for AKAZE, MSD, AGAST, FAST, BRISK keypoints window ratio
 * 0.75f should be the scale for ORB keypoints ratio
 * 1.50f was the default in original implementation
 *
 * <b>Note:</b> BGM is the base descriptor where each binary dimension is computed as the output of a single weak learner.
 * BGM_HARD and BGM_BILINEAR refers to same BGM but use different type of gradient binning. In the BGM_HARD that
 * use ASSIGN_HARD binning type the gradient is assigned to the nearest orientation bin. In the BGM_BILINEAR that use
 * ASSIGN_BILINEAR binning type the gradient is assigned to the two neighbouring bins. In the BGM and all other modes that use
 * ASSIGN_SOFT binning type the gradient is assigned to 8 nearest bins according to the cosine value between the gradient
 * angle and the bin center. LBGM (alias FP-Boost) is the floating point extension where each dimension is computed
 * as a linear combination of the weak learner responses. BINBOOST and subvariants are the binary extensions of LBGM
 * where each bit is computed as a thresholded linear combination of a set of weak learners.
 * BoostDesc header files (boostdesc_*.i) was exported from original binaries with export-boostdesc.py script from
 * samples subfolder.
 */
public class BoostDesc extends Feature2D {

    protected BoostDesc(long addr) { super(addr); }

    // internal usage only
    public static BoostDesc __fromPtr__(long addr) { return new BoostDesc(addr); }

    //
    // C++: static Ptr_BoostDesc cv::xfeatures2d::BoostDesc::create(int desc = BoostDesc::BINBOOST_256, bool use_scale_orientation = true, float scale_factor = 6.25f)
    //

    public static BoostDesc create(int desc, boolean use_scale_orientation, float scale_factor) {
        return BoostDesc.__fromPtr__(create_0(desc, use_scale_orientation, scale_factor));
    }

    public static BoostDesc create(int desc, boolean use_scale_orientation) {
        return BoostDesc.__fromPtr__(create_1(desc, use_scale_orientation));
    }

    public static BoostDesc create(int desc) {
        return BoostDesc.__fromPtr__(create_2(desc));
    }

    public static BoostDesc create() {
        return BoostDesc.__fromPtr__(create_3());
    }


    //
    // C++:  bool cv::xfeatures2d::BoostDesc::getUseScaleOrientation()
    //

    public boolean getUseScaleOrientation() {
        return getUseScaleOrientation_0(nativeObj);
    }


    //
    // C++:  float cv::xfeatures2d::BoostDesc::getScaleFactor()
    //

    public float getScaleFactor() {
        return getScaleFactor_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::BoostDesc::setScaleFactor(float scale_factor)
    //

    public void setScaleFactor(float scale_factor) {
        setScaleFactor_0(nativeObj, scale_factor);
    }


    //
    // C++:  void cv::xfeatures2d::BoostDesc::setUseScaleOrientation(bool use_scale_orientation)
    //

    public void setUseScaleOrientation(boolean use_scale_orientation) {
        setUseScaleOrientation_0(nativeObj, use_scale_orientation);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_BoostDesc cv::xfeatures2d::BoostDesc::create(int desc = BoostDesc::BINBOOST_256, bool use_scale_orientation = true, float scale_factor = 6.25f)
    private static native long create_0(int desc, boolean use_scale_orientation, float scale_factor);
    private static native long create_1(int desc, boolean use_scale_orientation);
    private static native long create_2(int desc);
    private static native long create_3();

    // C++:  bool cv::xfeatures2d::BoostDesc::getUseScaleOrientation()
    private static native boolean getUseScaleOrientation_0(long nativeObj);

    // C++:  float cv::xfeatures2d::BoostDesc::getScaleFactor()
    private static native float getScaleFactor_0(long nativeObj);

    // C++:  void cv::xfeatures2d::BoostDesc::setScaleFactor(float scale_factor)
    private static native void setScaleFactor_0(long nativeObj, float scale_factor);

    // C++:  void cv::xfeatures2d::BoostDesc::setUseScaleOrientation(bool use_scale_orientation)
    private static native void setUseScaleOrientation_0(long nativeObj, boolean use_scale_orientation);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
