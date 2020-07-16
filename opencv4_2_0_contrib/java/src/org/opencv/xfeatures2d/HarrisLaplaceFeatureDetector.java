//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.HarrisLaplaceFeatureDetector;

// C++: class HarrisLaplaceFeatureDetector
/**
 * Class implementing the Harris-Laplace feature detector as described in CITE: Mikolajczyk2004.
 */
public class HarrisLaplaceFeatureDetector extends Feature2D {

    protected HarrisLaplaceFeatureDetector(long addr) { super(addr); }

    // internal usage only
    public static HarrisLaplaceFeatureDetector __fromPtr__(long addr) { return new HarrisLaplaceFeatureDetector(addr); }

    //
    // C++: static Ptr_HarrisLaplaceFeatureDetector cv::xfeatures2d::HarrisLaplaceFeatureDetector::create(int numOctaves = 6, float corn_thresh = 0.01f, float DOG_thresh = 0.01f, int maxCorners = 5000, int num_layers = 4)
    //

    /**
     * Creates a new implementation instance.
     *
     * @param numOctaves the number of octaves in the scale-space pyramid
     * @param corn_thresh the threshold for the Harris cornerness measure
     * @param DOG_thresh the threshold for the Difference-of-Gaussians scale selection
     * @param maxCorners the maximum number of corners to consider
     * @param num_layers the number of intermediate scales per octave
     * @return automatically generated
     */
    public static HarrisLaplaceFeatureDetector create(int numOctaves, float corn_thresh, float DOG_thresh, int maxCorners, int num_layers) {
        return HarrisLaplaceFeatureDetector.__fromPtr__(create_0(numOctaves, corn_thresh, DOG_thresh, maxCorners, num_layers));
    }

    /**
     * Creates a new implementation instance.
     *
     * @param numOctaves the number of octaves in the scale-space pyramid
     * @param corn_thresh the threshold for the Harris cornerness measure
     * @param DOG_thresh the threshold for the Difference-of-Gaussians scale selection
     * @param maxCorners the maximum number of corners to consider
     * @return automatically generated
     */
    public static HarrisLaplaceFeatureDetector create(int numOctaves, float corn_thresh, float DOG_thresh, int maxCorners) {
        return HarrisLaplaceFeatureDetector.__fromPtr__(create_1(numOctaves, corn_thresh, DOG_thresh, maxCorners));
    }

    /**
     * Creates a new implementation instance.
     *
     * @param numOctaves the number of octaves in the scale-space pyramid
     * @param corn_thresh the threshold for the Harris cornerness measure
     * @param DOG_thresh the threshold for the Difference-of-Gaussians scale selection
     * @return automatically generated
     */
    public static HarrisLaplaceFeatureDetector create(int numOctaves, float corn_thresh, float DOG_thresh) {
        return HarrisLaplaceFeatureDetector.__fromPtr__(create_2(numOctaves, corn_thresh, DOG_thresh));
    }

    /**
     * Creates a new implementation instance.
     *
     * @param numOctaves the number of octaves in the scale-space pyramid
     * @param corn_thresh the threshold for the Harris cornerness measure
     * @return automatically generated
     */
    public static HarrisLaplaceFeatureDetector create(int numOctaves, float corn_thresh) {
        return HarrisLaplaceFeatureDetector.__fromPtr__(create_3(numOctaves, corn_thresh));
    }

    /**
     * Creates a new implementation instance.
     *
     * @param numOctaves the number of octaves in the scale-space pyramid
     * @return automatically generated
     */
    public static HarrisLaplaceFeatureDetector create(int numOctaves) {
        return HarrisLaplaceFeatureDetector.__fromPtr__(create_4(numOctaves));
    }

    /**
     * Creates a new implementation instance.
     *
     * @return automatically generated
     */
    public static HarrisLaplaceFeatureDetector create() {
        return HarrisLaplaceFeatureDetector.__fromPtr__(create_5());
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_HarrisLaplaceFeatureDetector cv::xfeatures2d::HarrisLaplaceFeatureDetector::create(int numOctaves = 6, float corn_thresh = 0.01f, float DOG_thresh = 0.01f, int maxCorners = 5000, int num_layers = 4)
    private static native long create_0(int numOctaves, float corn_thresh, float DOG_thresh, int maxCorners, int num_layers);
    private static native long create_1(int numOctaves, float corn_thresh, float DOG_thresh, int maxCorners);
    private static native long create_2(int numOctaves, float corn_thresh, float DOG_thresh);
    private static native long create_3(int numOctaves, float corn_thresh);
    private static native long create_4(int numOctaves);
    private static native long create_5();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
