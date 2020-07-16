//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.structured_light;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.structured_light.SinusoidalPattern;
import org.opencv.utils.Converters;

// C++: class SinusoidalPattern
/**
 * Class implementing Fourier transform profilometry (FTP) , phase-shifting profilometry (PSP)
 * and Fourier-assisted phase-shifting profilometry (FAPS) based on CITE: faps.
 *
 * This class generates sinusoidal patterns that can be used with FTP, PSP and FAPS.
 */
public class SinusoidalPattern extends StructuredLightPattern {

    protected SinusoidalPattern(long addr) { super(addr); }

    // internal usage only
    public static SinusoidalPattern __fromPtr__(long addr) { return new SinusoidalPattern(addr); }

    //
    // C++: static Ptr_SinusoidalPattern cv::structured_light::SinusoidalPattern::create(Ptr_SinusoidalPattern_Params parameters = makePtr<SinusoidalPattern::Params>())
    //

    /**
     * Constructor.
     *
     * @return automatically generated
     */
    public static SinusoidalPattern create() {
        return SinusoidalPattern.__fromPtr__(create_0());
    }


    //
    // C++:  void cv::structured_light::SinusoidalPattern::computeDataModulationTerm(vector_Mat patternImages, Mat& dataModulationTerm, Mat shadowMask)
    //

    /**
     * compute the data modulation term.
     * @param patternImages captured images with projected patterns.
     * @param dataModulationTerm Mat where the data modulation term is saved.
     * @param shadowMask Mask used to discard shadow regions.
     */
    public void computeDataModulationTerm(List<Mat> patternImages, Mat dataModulationTerm, Mat shadowMask) {
        Mat patternImages_mat = Converters.vector_Mat_to_Mat(patternImages);
        computeDataModulationTerm_0(nativeObj, patternImages_mat.nativeObj, dataModulationTerm.nativeObj, shadowMask.nativeObj);
    }


    //
    // C++:  void cv::structured_light::SinusoidalPattern::computePhaseMap(vector_Mat patternImages, Mat& wrappedPhaseMap, Mat& shadowMask = Mat(), Mat fundamental = Mat())
    //

    /**
     * Compute a wrapped phase map from sinusoidal patterns.
     * @param patternImages Input data to compute the wrapped phase map.
     * @param wrappedPhaseMap Wrapped phase map obtained through one of the three methods.
     * @param shadowMask Mask used to discard shadow regions.
     * @param fundamental Fundamental matrix used to compute epipolar lines and ease the matching step.
     */
    public void computePhaseMap(List<Mat> patternImages, Mat wrappedPhaseMap, Mat shadowMask, Mat fundamental) {
        Mat patternImages_mat = Converters.vector_Mat_to_Mat(patternImages);
        computePhaseMap_0(nativeObj, patternImages_mat.nativeObj, wrappedPhaseMap.nativeObj, shadowMask.nativeObj, fundamental.nativeObj);
    }

    /**
     * Compute a wrapped phase map from sinusoidal patterns.
     * @param patternImages Input data to compute the wrapped phase map.
     * @param wrappedPhaseMap Wrapped phase map obtained through one of the three methods.
     * @param shadowMask Mask used to discard shadow regions.
     */
    public void computePhaseMap(List<Mat> patternImages, Mat wrappedPhaseMap, Mat shadowMask) {
        Mat patternImages_mat = Converters.vector_Mat_to_Mat(patternImages);
        computePhaseMap_1(nativeObj, patternImages_mat.nativeObj, wrappedPhaseMap.nativeObj, shadowMask.nativeObj);
    }

    /**
     * Compute a wrapped phase map from sinusoidal patterns.
     * @param patternImages Input data to compute the wrapped phase map.
     * @param wrappedPhaseMap Wrapped phase map obtained through one of the three methods.
     */
    public void computePhaseMap(List<Mat> patternImages, Mat wrappedPhaseMap) {
        Mat patternImages_mat = Converters.vector_Mat_to_Mat(patternImages);
        computePhaseMap_2(nativeObj, patternImages_mat.nativeObj, wrappedPhaseMap.nativeObj);
    }


    //
    // C++:  void cv::structured_light::SinusoidalPattern::findProCamMatches(Mat projUnwrappedPhaseMap, Mat camUnwrappedPhaseMap, vector_Mat& matches)
    //

    /**
     * Find correspondences between the two devices thanks to unwrapped phase maps.
     * @param projUnwrappedPhaseMap Projector's unwrapped phase map.
     * @param camUnwrappedPhaseMap Camera's unwrapped phase map.
     * @param matches Images used to display correspondences map.
     */
    public void findProCamMatches(Mat projUnwrappedPhaseMap, Mat camUnwrappedPhaseMap, List<Mat> matches) {
        Mat matches_mat = new Mat();
        findProCamMatches_0(nativeObj, projUnwrappedPhaseMap.nativeObj, camUnwrappedPhaseMap.nativeObj, matches_mat.nativeObj);
        Converters.Mat_to_vector_Mat(matches_mat, matches);
        matches_mat.release();
    }


    //
    // C++:  void cv::structured_light::SinusoidalPattern::unwrapPhaseMap(vector_Mat wrappedPhaseMap, Mat& unwrappedPhaseMap, Size camSize, Mat shadowMask = Mat())
    //

    /**
     * Unwrap the wrapped phase map to remove phase ambiguities.
     * @param wrappedPhaseMap The wrapped phase map computed from the pattern.
     * @param unwrappedPhaseMap The unwrapped phase map used to find correspondences between the two devices.
     * @param camSize Resolution of the camera.
     * @param shadowMask Mask used to discard shadow regions.
     */
    public void unwrapPhaseMap(List<Mat> wrappedPhaseMap, Mat unwrappedPhaseMap, Size camSize, Mat shadowMask) {
        Mat wrappedPhaseMap_mat = Converters.vector_Mat_to_Mat(wrappedPhaseMap);
        unwrapPhaseMap_0(nativeObj, wrappedPhaseMap_mat.nativeObj, unwrappedPhaseMap.nativeObj, camSize.width, camSize.height, shadowMask.nativeObj);
    }

    /**
     * Unwrap the wrapped phase map to remove phase ambiguities.
     * @param wrappedPhaseMap The wrapped phase map computed from the pattern.
     * @param unwrappedPhaseMap The unwrapped phase map used to find correspondences between the two devices.
     * @param camSize Resolution of the camera.
     */
    public void unwrapPhaseMap(List<Mat> wrappedPhaseMap, Mat unwrappedPhaseMap, Size camSize) {
        Mat wrappedPhaseMap_mat = Converters.vector_Mat_to_Mat(wrappedPhaseMap);
        unwrapPhaseMap_1(nativeObj, wrappedPhaseMap_mat.nativeObj, unwrappedPhaseMap.nativeObj, camSize.width, camSize.height);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_SinusoidalPattern cv::structured_light::SinusoidalPattern::create(Ptr_SinusoidalPattern_Params parameters = makePtr<SinusoidalPattern::Params>())
    private static native long create_0();

    // C++:  void cv::structured_light::SinusoidalPattern::computeDataModulationTerm(vector_Mat patternImages, Mat& dataModulationTerm, Mat shadowMask)
    private static native void computeDataModulationTerm_0(long nativeObj, long patternImages_mat_nativeObj, long dataModulationTerm_nativeObj, long shadowMask_nativeObj);

    // C++:  void cv::structured_light::SinusoidalPattern::computePhaseMap(vector_Mat patternImages, Mat& wrappedPhaseMap, Mat& shadowMask = Mat(), Mat fundamental = Mat())
    private static native void computePhaseMap_0(long nativeObj, long patternImages_mat_nativeObj, long wrappedPhaseMap_nativeObj, long shadowMask_nativeObj, long fundamental_nativeObj);
    private static native void computePhaseMap_1(long nativeObj, long patternImages_mat_nativeObj, long wrappedPhaseMap_nativeObj, long shadowMask_nativeObj);
    private static native void computePhaseMap_2(long nativeObj, long patternImages_mat_nativeObj, long wrappedPhaseMap_nativeObj);

    // C++:  void cv::structured_light::SinusoidalPattern::findProCamMatches(Mat projUnwrappedPhaseMap, Mat camUnwrappedPhaseMap, vector_Mat& matches)
    private static native void findProCamMatches_0(long nativeObj, long projUnwrappedPhaseMap_nativeObj, long camUnwrappedPhaseMap_nativeObj, long matches_mat_nativeObj);

    // C++:  void cv::structured_light::SinusoidalPattern::unwrapPhaseMap(vector_Mat wrappedPhaseMap, Mat& unwrappedPhaseMap, Size camSize, Mat shadowMask = Mat())
    private static native void unwrapPhaseMap_0(long nativeObj, long wrappedPhaseMap_mat_nativeObj, long unwrappedPhaseMap_nativeObj, double camSize_width, double camSize_height, long shadowMask_nativeObj);
    private static native void unwrapPhaseMap_1(long nativeObj, long wrappedPhaseMap_mat_nativeObj, long unwrappedPhaseMap_nativeObj, double camSize_width, double camSize_height);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
