//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.features2d.Feature2D;
import org.opencv.utils.Converters;
import org.opencv.xfeatures2d.FREAK;

// C++: class FREAK
/**
 * Class implementing the FREAK (*Fast Retina Keypoint*) keypoint descriptor, described in CITE: AOV12 .
 *
 * The algorithm propose a novel keypoint descriptor inspired by the human visual system and more
 * precisely the retina, coined Fast Retina Key- point (FREAK). A cascade of binary strings is
 * computed by efficiently comparing image intensities over a retinal sampling pattern. FREAKs are in
 * general faster to compute with lower memory load and also more robust than SIFT, SURF or BRISK.
 * They are competitive alternatives to existing keypoints in particular for embedded applications.
 *
 * <b>Note:</b>
 * <ul>
 *   <li>
 *       An example on how to use the FREAK descriptor can be found at
 *         opencv_source_code/samples/cpp/freak_demo.cpp
 *   </li>
 * </ul>
 */
public class FREAK extends Feature2D {

    protected FREAK(long addr) { super(addr); }

    // internal usage only
    public static FREAK __fromPtr__(long addr) { return new FREAK(addr); }

    //
    // C++: static Ptr_FREAK cv::xfeatures2d::FREAK::create(bool orientationNormalized = true, bool scaleNormalized = true, float patternScale = 22.0f, int nOctaves = 4, vector_int selectedPairs = std::vector<int>())
    //

    /**
     * @param orientationNormalized Enable orientation normalization.
     *     @param scaleNormalized Enable scale normalization.
     *     @param patternScale Scaling of the description pattern.
     *     @param nOctaves Number of octaves covered by the detected keypoints.
     *     @param selectedPairs (Optional) user defined selected pairs indexes,
     * @return automatically generated
     */
    public static FREAK create(boolean orientationNormalized, boolean scaleNormalized, float patternScale, int nOctaves, MatOfInt selectedPairs) {
        Mat selectedPairs_mat = selectedPairs;
        return FREAK.__fromPtr__(create_0(orientationNormalized, scaleNormalized, patternScale, nOctaves, selectedPairs_mat.nativeObj));
    }

    /**
     * @param orientationNormalized Enable orientation normalization.
     *     @param scaleNormalized Enable scale normalization.
     *     @param patternScale Scaling of the description pattern.
     *     @param nOctaves Number of octaves covered by the detected keypoints.
     * @return automatically generated
     */
    public static FREAK create(boolean orientationNormalized, boolean scaleNormalized, float patternScale, int nOctaves) {
        return FREAK.__fromPtr__(create_1(orientationNormalized, scaleNormalized, patternScale, nOctaves));
    }

    /**
     * @param orientationNormalized Enable orientation normalization.
     *     @param scaleNormalized Enable scale normalization.
     *     @param patternScale Scaling of the description pattern.
     * @return automatically generated
     */
    public static FREAK create(boolean orientationNormalized, boolean scaleNormalized, float patternScale) {
        return FREAK.__fromPtr__(create_2(orientationNormalized, scaleNormalized, patternScale));
    }

    /**
     * @param orientationNormalized Enable orientation normalization.
     *     @param scaleNormalized Enable scale normalization.
     * @return automatically generated
     */
    public static FREAK create(boolean orientationNormalized, boolean scaleNormalized) {
        return FREAK.__fromPtr__(create_3(orientationNormalized, scaleNormalized));
    }

    /**
     * @param orientationNormalized Enable orientation normalization.
     * @return automatically generated
     */
    public static FREAK create(boolean orientationNormalized) {
        return FREAK.__fromPtr__(create_4(orientationNormalized));
    }

    /**
     * @return automatically generated
     */
    public static FREAK create() {
        return FREAK.__fromPtr__(create_5());
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_FREAK cv::xfeatures2d::FREAK::create(bool orientationNormalized = true, bool scaleNormalized = true, float patternScale = 22.0f, int nOctaves = 4, vector_int selectedPairs = std::vector<int>())
    private static native long create_0(boolean orientationNormalized, boolean scaleNormalized, float patternScale, int nOctaves, long selectedPairs_mat_nativeObj);
    private static native long create_1(boolean orientationNormalized, boolean scaleNormalized, float patternScale, int nOctaves);
    private static native long create_2(boolean orientationNormalized, boolean scaleNormalized, float patternScale);
    private static native long create_3(boolean orientationNormalized, boolean scaleNormalized);
    private static native long create_4(boolean orientationNormalized);
    private static native long create_5();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
