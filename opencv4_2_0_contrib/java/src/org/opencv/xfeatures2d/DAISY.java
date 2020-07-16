//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.core.Mat;
import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.DAISY;

// C++: class DAISY
/**
 * Class implementing DAISY descriptor, described in CITE: Tola10
 *
 * radius radius of the descriptor at the initial scale
 * q_radius amount of radial range division quantity
 * q_theta amount of angular range division quantity
 * q_hist amount of gradient orientations range division quantity
 * norm choose descriptors normalization type, where
 * DAISY::NRM_NONE will not do any normalization (default),
 * DAISY::NRM_PARTIAL mean that histograms are normalized independently for L2 norm equal to 1.0,
 * DAISY::NRM_FULL mean that descriptors are normalized for L2 norm equal to 1.0,
 * DAISY::NRM_SIFT mean that descriptors are normalized for L2 norm equal to 1.0 but no individual one is bigger than 0.154 as in SIFT
 * H optional 3x3 homography matrix used to warp the grid of daisy but sampling keypoints remains unwarped on image
 * interpolation switch to disable interpolation for speed improvement at minor quality loss
 * use_orientation sample patterns using keypoints orientation, disabled by default.
 */
public class DAISY extends Feature2D {

    protected DAISY(long addr) { super(addr); }

    // internal usage only
    public static DAISY __fromPtr__(long addr) { return new DAISY(addr); }

    // C++: enum NormalizationType
    public static final int
            NRM_NONE = 100,
            NRM_PARTIAL = 101,
            NRM_FULL = 102,
            NRM_SIFT = 103;


    //
    // C++: static Ptr_DAISY cv::xfeatures2d::DAISY::create(float radius = 15, int q_radius = 3, int q_theta = 8, int q_hist = 8, DAISY_NormalizationType norm = DAISY::NRM_NONE, Mat H = Mat(), bool interpolation = true, bool use_orientation = false)
    //

    public static DAISY create(float radius, int q_radius, int q_theta, int q_hist, Mat H, boolean interpolation, boolean use_orientation) {
        return DAISY.__fromPtr__(create_0(radius, q_radius, q_theta, q_hist, H.nativeObj, interpolation, use_orientation));
    }

    public static DAISY create(float radius, int q_radius, int q_theta, int q_hist, Mat H, boolean interpolation) {
        return DAISY.__fromPtr__(create_1(radius, q_radius, q_theta, q_hist, H.nativeObj, interpolation));
    }

    public static DAISY create(float radius, int q_radius, int q_theta, int q_hist, Mat H) {
        return DAISY.__fromPtr__(create_2(radius, q_radius, q_theta, q_hist, H.nativeObj));
    }

    public static DAISY create(float radius, int q_radius, int q_theta, int q_hist) {
        return DAISY.__fromPtr__(create_3(radius, q_radius, q_theta, q_hist));
    }

    public static DAISY create(float radius, int q_radius, int q_theta) {
        return DAISY.__fromPtr__(create_5(radius, q_radius, q_theta));
    }

    public static DAISY create(float radius, int q_radius) {
        return DAISY.__fromPtr__(create_6(radius, q_radius));
    }

    public static DAISY create(float radius) {
        return DAISY.__fromPtr__(create_7(radius));
    }

    public static DAISY create() {
        return DAISY.__fromPtr__(create_8());
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_DAISY cv::xfeatures2d::DAISY::create(float radius = 15, int q_radius = 3, int q_theta = 8, int q_hist = 8, DAISY_NormalizationType norm = DAISY::NRM_NONE, Mat H = Mat(), bool interpolation = true, bool use_orientation = false)
    private static native long create_0(float radius, int q_radius, int q_theta, int q_hist, long H_nativeObj, boolean interpolation, boolean use_orientation);
    private static native long create_1(float radius, int q_radius, int q_theta, int q_hist, long H_nativeObj, boolean interpolation);
    private static native long create_2(float radius, int q_radius, int q_theta, int q_hist, long H_nativeObj);
    private static native long create_3(float radius, int q_radius, int q_theta, int q_hist);
    private static native long create_5(float radius, int q_radius, int q_theta);
    private static native long create_6(float radius, int q_radius);
    private static native long create_7(float radius);
    private static native long create_8();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
