//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.face.BIF;

// C++: class BIF
/**
 * Implementation of bio-inspired features (BIF) from the paper:
 * Guo, Guodong, et al. "Human age estimation using bio-inspired features."
 * Computer Vision and Pattern Recognition, 2009. CVPR 2009.
 */
public class BIF extends Algorithm {

    protected BIF(long addr) { super(addr); }

    // internal usage only
    public static BIF __fromPtr__(long addr) { return new BIF(addr); }

    //
    // C++: static Ptr_BIF cv::face::BIF::create(int num_bands = 8, int num_rotations = 12)
    //

    /**
     * @param num_bands The number of filter bands (&lt;=8) used for computing BIF.
     * @param num_rotations The number of image rotations for computing BIF.
     * @return Object for computing BIF.
     */
    public static BIF create(int num_bands, int num_rotations) {
        return BIF.__fromPtr__(create_0(num_bands, num_rotations));
    }

    /**
     * @param num_bands The number of filter bands (&lt;=8) used for computing BIF.
     * @return Object for computing BIF.
     */
    public static BIF create(int num_bands) {
        return BIF.__fromPtr__(create_1(num_bands));
    }

    /**
     * @return Object for computing BIF.
     */
    public static BIF create() {
        return BIF.__fromPtr__(create_2());
    }


    //
    // C++:  int cv::face::BIF::getNumBands()
    //

    /**
     * @return The number of filter bands used for computing BIF.
     */
    public int getNumBands() {
        return getNumBands_0(nativeObj);
    }


    //
    // C++:  int cv::face::BIF::getNumRotations()
    //

    /**
     * @return The number of image rotations.
     */
    public int getNumRotations() {
        return getNumRotations_0(nativeObj);
    }


    //
    // C++:  void cv::face::BIF::compute(Mat image, Mat& features)
    //

    /**
     * Computes features sby input image.
     * @param image Input image (CV_32FC1).
     * @param features Feature vector (CV_32FC1).
     */
    public void compute(Mat image, Mat features) {
        compute_0(nativeObj, image.nativeObj, features.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_BIF cv::face::BIF::create(int num_bands = 8, int num_rotations = 12)
    private static native long create_0(int num_bands, int num_rotations);
    private static native long create_1(int num_bands);
    private static native long create_2();

    // C++:  int cv::face::BIF::getNumBands()
    private static native int getNumBands_0(long nativeObj);

    // C++:  int cv::face::BIF::getNumRotations()
    private static native int getNumRotations_0(long nativeObj);

    // C++:  void cv::face::BIF::compute(Mat image, Mat& features)
    private static native void compute_0(long nativeObj, long image_nativeObj, long features_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
