//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xphoto;

import org.opencv.core.Mat;
import org.opencv.xphoto.GrayworldWB;
import org.opencv.xphoto.LearningBasedWB;
import org.opencv.xphoto.SimpleWB;
import org.opencv.xphoto.TonemapDurand;

// C++: class Xphoto

public class Xphoto {

    // C++: enum Bm3dSteps
    public static final int
            BM3D_STEPALL = 0,
            BM3D_STEP1 = 1,
            BM3D_STEP2 = 2;


    // C++: enum InpaintTypes
    public static final int
            INPAINT_SHIFTMAP = 0,
            INPAINT_FSR_BEST = 1,
            INPAINT_FSR_FAST = 2;


    // C++: enum TransformTypes
    public static final int
            HAAR = 0;


    //
    // C++:  Ptr_GrayworldWB cv::xphoto::createGrayworldWB()
    //

    /**
     * Creates an instance of GrayworldWB
     * @return automatically generated
     */
    public static GrayworldWB createGrayworldWB() {
        return GrayworldWB.__fromPtr__(createGrayworldWB_0());
    }


    //
    // C++:  Ptr_LearningBasedWB cv::xphoto::createLearningBasedWB(String path_to_model = String())
    //

    /**
     * Creates an instance of LearningBasedWB
     *
     * @param path_to_model Path to a .yml file with the model. If not specified, the default model is used
     * @return automatically generated
     */
    public static LearningBasedWB createLearningBasedWB(String path_to_model) {
        return LearningBasedWB.__fromPtr__(createLearningBasedWB_0(path_to_model));
    }

    /**
     * Creates an instance of LearningBasedWB
     *
     * @return automatically generated
     */
    public static LearningBasedWB createLearningBasedWB() {
        return LearningBasedWB.__fromPtr__(createLearningBasedWB_1());
    }


    //
    // C++:  Ptr_SimpleWB cv::xphoto::createSimpleWB()
    //

    /**
     * Creates an instance of SimpleWB
     * @return automatically generated
     */
    public static SimpleWB createSimpleWB() {
        return SimpleWB.__fromPtr__(createSimpleWB_0());
    }


    //
    // C++:  Ptr_TonemapDurand cv::xphoto::createTonemapDurand(float gamma = 1.0f, float contrast = 4.0f, float saturation = 1.0f, float sigma_color = 2.0f, float sigma_space = 2.0f)
    //

    /**
     * Creates TonemapDurand object
     *
     * You need to set the OPENCV_ENABLE_NONFREE option in cmake to use those. Use them at your own risk.
     *
     * @param gamma gamma value for gamma correction. See createTonemap
     * @param contrast resulting contrast on logarithmic scale, i. e. log(max / min), where max and min
     * are maximum and minimum luminance values of the resulting image.
     * @param saturation saturation enhancement value. See createTonemapDrago
     * @param sigma_color bilateral filter sigma in color space
     * @param sigma_space bilateral filter sigma in coordinate space
     * @return automatically generated
     */
    public static TonemapDurand createTonemapDurand(float gamma, float contrast, float saturation, float sigma_color, float sigma_space) {
        return TonemapDurand.__fromPtr__(createTonemapDurand_0(gamma, contrast, saturation, sigma_color, sigma_space));
    }

    /**
     * Creates TonemapDurand object
     *
     * You need to set the OPENCV_ENABLE_NONFREE option in cmake to use those. Use them at your own risk.
     *
     * @param gamma gamma value for gamma correction. See createTonemap
     * @param contrast resulting contrast on logarithmic scale, i. e. log(max / min), where max and min
     * are maximum and minimum luminance values of the resulting image.
     * @param saturation saturation enhancement value. See createTonemapDrago
     * @param sigma_color bilateral filter sigma in color space
     * @return automatically generated
     */
    public static TonemapDurand createTonemapDurand(float gamma, float contrast, float saturation, float sigma_color) {
        return TonemapDurand.__fromPtr__(createTonemapDurand_1(gamma, contrast, saturation, sigma_color));
    }

    /**
     * Creates TonemapDurand object
     *
     * You need to set the OPENCV_ENABLE_NONFREE option in cmake to use those. Use them at your own risk.
     *
     * @param gamma gamma value for gamma correction. See createTonemap
     * @param contrast resulting contrast on logarithmic scale, i. e. log(max / min), where max and min
     * are maximum and minimum luminance values of the resulting image.
     * @param saturation saturation enhancement value. See createTonemapDrago
     * @return automatically generated
     */
    public static TonemapDurand createTonemapDurand(float gamma, float contrast, float saturation) {
        return TonemapDurand.__fromPtr__(createTonemapDurand_2(gamma, contrast, saturation));
    }

    /**
     * Creates TonemapDurand object
     *
     * You need to set the OPENCV_ENABLE_NONFREE option in cmake to use those. Use them at your own risk.
     *
     * @param gamma gamma value for gamma correction. See createTonemap
     * @param contrast resulting contrast on logarithmic scale, i. e. log(max / min), where max and min
     * are maximum and minimum luminance values of the resulting image.
     * @return automatically generated
     */
    public static TonemapDurand createTonemapDurand(float gamma, float contrast) {
        return TonemapDurand.__fromPtr__(createTonemapDurand_3(gamma, contrast));
    }

    /**
     * Creates TonemapDurand object
     *
     * You need to set the OPENCV_ENABLE_NONFREE option in cmake to use those. Use them at your own risk.
     *
     * @param gamma gamma value for gamma correction. See createTonemap
     * are maximum and minimum luminance values of the resulting image.
     * @return automatically generated
     */
    public static TonemapDurand createTonemapDurand(float gamma) {
        return TonemapDurand.__fromPtr__(createTonemapDurand_4(gamma));
    }

    /**
     * Creates TonemapDurand object
     *
     * You need to set the OPENCV_ENABLE_NONFREE option in cmake to use those. Use them at your own risk.
     *
     * are maximum and minimum luminance values of the resulting image.
     * @return automatically generated
     */
    public static TonemapDurand createTonemapDurand() {
        return TonemapDurand.__fromPtr__(createTonemapDurand_5());
    }


    //
    // C++:  void cv::xphoto::applyChannelGains(Mat src, Mat& dst, float gainB, float gainG, float gainR)
    //

    /**
     * Implements an efficient fixed-point approximation for applying channel gains, which is
     *     the last step of multiple white balance algorithms.
     *
     * @param src Input three-channel image in the BGR color space (either CV_8UC3 or CV_16UC3)
     * @param dst Output image of the same size and type as src.
     * @param gainB gain for the B channel
     * @param gainG gain for the G channel
     * @param gainR gain for the R channel
     */
    public static void applyChannelGains(Mat src, Mat dst, float gainB, float gainG, float gainR) {
        applyChannelGains_0(src.nativeObj, dst.nativeObj, gainB, gainG, gainR);
    }


    //
    // C++:  void cv::xphoto::bm3dDenoising(Mat src, Mat& dst, float h = 1, int templateWindowSize = 4, int searchWindowSize = 16, int blockMatchingStep1 = 2500, int blockMatchingStep2 = 400, int groupSize = 8, int slidingStep = 1, float beta = 2.0f, int normType = cv::NORM_L2, int step = cv::xphoto::BM3D_STEPALL, int transformType = cv::xphoto::HAAR)
    //

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dst Output image with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param groupSize Maximum size of the 3D group for collaborative filtering.
     *         @param slidingStep Sliding step to process every next reference block.
     *         @param beta Kaiser window parameter that affects the sidelobe attenuation of the transform of the
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         @param normType Norm used to calculate distance between blocks. L2 is slower than L1
     *         but yields more accurate results.
     *         @param step Step of BM3D to be executed. Allowed are only BM3D_STEP1 and BM3D_STEPALL.
     *         BM3D_STEP2 is not allowed as it requires basic estimate to be present.
     *         @param transformType Type of the orthogonal transform used in collaborative filtering step.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dst, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta, int normType, int step, int transformType) {
        bm3dDenoising_0(src.nativeObj, dst.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2, groupSize, slidingStep, beta, normType, step, transformType);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dst Output image with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param groupSize Maximum size of the 3D group for collaborative filtering.
     *         @param slidingStep Sliding step to process every next reference block.
     *         @param beta Kaiser window parameter that affects the sidelobe attenuation of the transform of the
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         @param normType Norm used to calculate distance between blocks. L2 is slower than L1
     *         but yields more accurate results.
     *         @param step Step of BM3D to be executed. Allowed are only BM3D_STEP1 and BM3D_STEPALL.
     *         BM3D_STEP2 is not allowed as it requires basic estimate to be present.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dst, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta, int normType, int step) {
        bm3dDenoising_1(src.nativeObj, dst.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2, groupSize, slidingStep, beta, normType, step);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dst Output image with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param groupSize Maximum size of the 3D group for collaborative filtering.
     *         @param slidingStep Sliding step to process every next reference block.
     *         @param beta Kaiser window parameter that affects the sidelobe attenuation of the transform of the
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         @param normType Norm used to calculate distance between blocks. L2 is slower than L1
     *         but yields more accurate results.
     *         BM3D_STEP2 is not allowed as it requires basic estimate to be present.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dst, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta, int normType) {
        bm3dDenoising_2(src.nativeObj, dst.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2, groupSize, slidingStep, beta, normType);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dst Output image with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param groupSize Maximum size of the 3D group for collaborative filtering.
     *         @param slidingStep Sliding step to process every next reference block.
     *         @param beta Kaiser window parameter that affects the sidelobe attenuation of the transform of the
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         BM3D_STEP2 is not allowed as it requires basic estimate to be present.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dst, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta) {
        bm3dDenoising_3(src.nativeObj, dst.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2, groupSize, slidingStep, beta);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dst Output image with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param groupSize Maximum size of the 3D group for collaborative filtering.
     *         @param slidingStep Sliding step to process every next reference block.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         BM3D_STEP2 is not allowed as it requires basic estimate to be present.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dst, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep) {
        bm3dDenoising_4(src.nativeObj, dst.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2, groupSize, slidingStep);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dst Output image with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param groupSize Maximum size of the 3D group for collaborative filtering.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         BM3D_STEP2 is not allowed as it requires basic estimate to be present.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dst, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize) {
        bm3dDenoising_5(src.nativeObj, dst.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2, groupSize);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dst Output image with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         BM3D_STEP2 is not allowed as it requires basic estimate to be present.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dst, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2) {
        bm3dDenoising_6(src.nativeObj, dst.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dst Output image with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         BM3D_STEP2 is not allowed as it requires basic estimate to be present.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dst, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1) {
        bm3dDenoising_7(src.nativeObj, dst.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dst Output image with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         BM3D_STEP2 is not allowed as it requires basic estimate to be present.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dst, float h, int templateWindowSize, int searchWindowSize) {
        bm3dDenoising_8(src.nativeObj, dst.nativeObj, h, templateWindowSize, searchWindowSize);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dst Output image with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         BM3D_STEP2 is not allowed as it requires basic estimate to be present.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dst, float h, int templateWindowSize) {
        bm3dDenoising_9(src.nativeObj, dst.nativeObj, h, templateWindowSize);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dst Output image with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         Should be power of 2.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         BM3D_STEP2 is not allowed as it requires basic estimate to be present.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dst, float h) {
        bm3dDenoising_10(src.nativeObj, dst.nativeObj, h);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dst Output image with the same size and type as src.
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         Should be power of 2.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         BM3D_STEP2 is not allowed as it requires basic estimate to be present.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dst) {
        bm3dDenoising_11(src.nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::xphoto::bm3dDenoising(Mat src, Mat& dstStep1, Mat& dstStep2, float h = 1, int templateWindowSize = 4, int searchWindowSize = 16, int blockMatchingStep1 = 2500, int blockMatchingStep2 = 400, int groupSize = 8, int slidingStep = 1, float beta = 2.0f, int normType = cv::NORM_L2, int step = cv::xphoto::BM3D_STEPALL, int transformType = cv::xphoto::HAAR)
    //

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dstStep1 Output image of the first step of BM3D with the same size and type as src.
     *         @param dstStep2 Output image of the second step of BM3D with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param groupSize Maximum size of the 3D group for collaborative filtering.
     *         @param slidingStep Sliding step to process every next reference block.
     *         @param beta Kaiser window parameter that affects the sidelobe attenuation of the transform of the
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         @param normType Norm used to calculate distance between blocks. L2 is slower than L1
     *         but yields more accurate results.
     *         @param step Step of BM3D to be executed. Possible variants are: step 1, step 2, both steps.
     *         @param transformType Type of the orthogonal transform used in collaborative filtering step.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dstStep1, Mat dstStep2, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta, int normType, int step, int transformType) {
        bm3dDenoising_12(src.nativeObj, dstStep1.nativeObj, dstStep2.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2, groupSize, slidingStep, beta, normType, step, transformType);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dstStep1 Output image of the first step of BM3D with the same size and type as src.
     *         @param dstStep2 Output image of the second step of BM3D with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param groupSize Maximum size of the 3D group for collaborative filtering.
     *         @param slidingStep Sliding step to process every next reference block.
     *         @param beta Kaiser window parameter that affects the sidelobe attenuation of the transform of the
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         @param normType Norm used to calculate distance between blocks. L2 is slower than L1
     *         but yields more accurate results.
     *         @param step Step of BM3D to be executed. Possible variants are: step 1, step 2, both steps.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dstStep1, Mat dstStep2, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta, int normType, int step) {
        bm3dDenoising_13(src.nativeObj, dstStep1.nativeObj, dstStep2.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2, groupSize, slidingStep, beta, normType, step);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dstStep1 Output image of the first step of BM3D with the same size and type as src.
     *         @param dstStep2 Output image of the second step of BM3D with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param groupSize Maximum size of the 3D group for collaborative filtering.
     *         @param slidingStep Sliding step to process every next reference block.
     *         @param beta Kaiser window parameter that affects the sidelobe attenuation of the transform of the
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         @param normType Norm used to calculate distance between blocks. L2 is slower than L1
     *         but yields more accurate results.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dstStep1, Mat dstStep2, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta, int normType) {
        bm3dDenoising_14(src.nativeObj, dstStep1.nativeObj, dstStep2.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2, groupSize, slidingStep, beta, normType);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dstStep1 Output image of the first step of BM3D with the same size and type as src.
     *         @param dstStep2 Output image of the second step of BM3D with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param groupSize Maximum size of the 3D group for collaborative filtering.
     *         @param slidingStep Sliding step to process every next reference block.
     *         @param beta Kaiser window parameter that affects the sidelobe attenuation of the transform of the
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dstStep1, Mat dstStep2, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta) {
        bm3dDenoising_15(src.nativeObj, dstStep1.nativeObj, dstStep2.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2, groupSize, slidingStep, beta);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dstStep1 Output image of the first step of BM3D with the same size and type as src.
     *         @param dstStep2 Output image of the second step of BM3D with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param groupSize Maximum size of the 3D group for collaborative filtering.
     *         @param slidingStep Sliding step to process every next reference block.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dstStep1, Mat dstStep2, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep) {
        bm3dDenoising_16(src.nativeObj, dstStep1.nativeObj, dstStep2.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2, groupSize, slidingStep);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dstStep1 Output image of the first step of BM3D with the same size and type as src.
     *         @param dstStep2 Output image of the second step of BM3D with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param groupSize Maximum size of the 3D group for collaborative filtering.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dstStep1, Mat dstStep2, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize) {
        bm3dDenoising_17(src.nativeObj, dstStep1.nativeObj, dstStep2.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2, groupSize);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dstStep1 Output image of the first step of BM3D with the same size and type as src.
     *         @param dstStep2 Output image of the second step of BM3D with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         @param blockMatchingStep2 Block matching threshold for the second step of BM3D (Wiener filtering),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dstStep1, Mat dstStep2, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2) {
        bm3dDenoising_18(src.nativeObj, dstStep1.nativeObj, dstStep2.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1, blockMatchingStep2);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dstStep1 Output image of the first step of BM3D with the same size and type as src.
     *         @param dstStep2 Output image of the second step of BM3D with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         @param blockMatchingStep1 Block matching threshold for the first step of BM3D (hard thresholding),
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dstStep1, Mat dstStep2, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1) {
        bm3dDenoising_19(src.nativeObj, dstStep1.nativeObj, dstStep2.nativeObj, h, templateWindowSize, searchWindowSize, blockMatchingStep1);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dstStep1 Output image of the first step of BM3D with the same size and type as src.
     *         @param dstStep2 Output image of the second step of BM3D with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         @param searchWindowSize Size in pixels of the window that is used to perform block-matching.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dstStep1, Mat dstStep2, float h, int templateWindowSize, int searchWindowSize) {
        bm3dDenoising_20(src.nativeObj, dstStep1.nativeObj, dstStep2.nativeObj, h, templateWindowSize, searchWindowSize);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dstStep1 Output image of the first step of BM3D with the same size and type as src.
     *         @param dstStep2 Output image of the second step of BM3D with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         @param templateWindowSize Size in pixels of the template patch that is used for block-matching.
     *         Should be power of 2.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dstStep1, Mat dstStep2, float h, int templateWindowSize) {
        bm3dDenoising_21(src.nativeObj, dstStep1.nativeObj, dstStep2.nativeObj, h, templateWindowSize);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dstStep1 Output image of the first step of BM3D with the same size and type as src.
     *         @param dstStep2 Output image of the second step of BM3D with the same size and type as src.
     *         @param h Parameter regulating filter strength. Big h value perfectly removes noise but also
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         Should be power of 2.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dstStep1, Mat dstStep2, float h) {
        bm3dDenoising_22(src.nativeObj, dstStep1.nativeObj, dstStep2.nativeObj, h);
    }

    /**
     * Performs image denoising using the Block-Matching and 3D-filtering algorithm
     *         &lt;http://www.cs.tut.fi/~foi/GCF-BM3D/BM3D_TIP_2007.pdf&gt; with several computational
     *         optimizations. Noise expected to be a gaussian white noise.
     *
     *         @param src Input 8-bit or 16-bit 1-channel image.
     *         @param dstStep1 Output image of the first step of BM3D with the same size and type as src.
     *         @param dstStep2 Output image of the second step of BM3D with the same size and type as src.
     *         removes image details, smaller h value preserves details but also preserves some noise.
     *         Should be power of 2.
     *         Affect performance linearly: greater searchWindowsSize - greater denoising time.
     *         Must be larger than templateWindowSize.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         i.e. maximum distance for which two blocks are considered similar.
     *         Value expressed in euclidean distance.
     *         window. Kaiser window is used in order to reduce border effects. To prevent usage of the window,
     *         set beta to zero.
     *         but yields more accurate results.
     *         Currently only Haar transform is supported.
     *
     *         This function expected to be applied to grayscale images. Advanced usage of this function
     *         can be manual denoising of colored image in different colorspaces.
     *
     *         SEE:
     *         fastNlMeansDenoising
     */
    public static void bm3dDenoising(Mat src, Mat dstStep1, Mat dstStep2) {
        bm3dDenoising_23(src.nativeObj, dstStep1.nativeObj, dstStep2.nativeObj);
    }


    //
    // C++:  void cv::xphoto::dctDenoising(Mat src, Mat dst, double sigma, int psize = 16)
    //

    /**
     * The function implements simple dct-based denoising
     *
     *     &lt;http://www.ipol.im/pub/art/2011/ys-dct/&gt;.
     *     @param src source image
     *     @param dst destination image
     *     @param sigma expected noise standard deviation
     *     @param psize size of block side where dct is computed
     *
     *     SEE:
     *        fastNlMeansDenoising
     */
    public static void dctDenoising(Mat src, Mat dst, double sigma, int psize) {
        dctDenoising_0(src.nativeObj, dst.nativeObj, sigma, psize);
    }

    /**
     * The function implements simple dct-based denoising
     *
     *     &lt;http://www.ipol.im/pub/art/2011/ys-dct/&gt;.
     *     @param src source image
     *     @param dst destination image
     *     @param sigma expected noise standard deviation
     *
     *     SEE:
     *        fastNlMeansDenoising
     */
    public static void dctDenoising(Mat src, Mat dst, double sigma) {
        dctDenoising_1(src.nativeObj, dst.nativeObj, sigma);
    }


    //
    // C++:  void cv::xphoto::inpaint(Mat src, Mat mask, Mat dst, int algorithmType)
    //

    /**
     * The function implements different single-image inpainting algorithms.
     *
     *     See the original papers CITE: He2012 (Shiftmap) or CITE: GenserPCS2018 and CITE: SeilerTIP2015 (FSR) for details.
     *
     *     @param src source image
     * <ul>
     *   <li>
     *      #INPAINT_SHIFTMAP: it could be of any type and any number of channels from 1 to 4. In case of
     *     3- and 4-channels images the function expect them in CIELab colorspace or similar one, where first
     *     color component shows intensity, while second and third shows colors. Nonetheless you can try any
     *     colorspaces.
     *   </li>
     *   <li>
     *      #INPAINT_FSR_BEST or #INPAINT_FSR_FAST: 1-channel grayscale or 3-channel BGR image.
     *     @param mask mask (#CV_8UC1), where non-zero pixels indicate valid image area, while zero pixels
     *     indicate area to be inpainted
     *     @param dst destination image
     *     @param algorithmType see xphoto::InpaintTypes
     *   </li>
     * </ul>
     */
    public static void inpaint(Mat src, Mat mask, Mat dst, int algorithmType) {
        inpaint_0(src.nativeObj, mask.nativeObj, dst.nativeObj, algorithmType);
    }


    //
    // C++:  void cv::xphoto::oilPainting(Mat src, Mat& dst, int size, int dynRatio, int code)
    //

    /**
     * oilPainting
     * See the book CITE: Holzmann1988 for details.
     * @param src Input three-channel or one channel image (either CV_8UC3 or CV_8UC1)
     * @param dst Output image of the same size and type as src.
     * @param size neighbouring size is 2-size+1
     * @param dynRatio image is divided by dynRatio before histogram processing
     * @param code automatically generated
     */
    public static void oilPainting(Mat src, Mat dst, int size, int dynRatio, int code) {
        oilPainting_0(src.nativeObj, dst.nativeObj, size, dynRatio, code);
    }


    //
    // C++:  void cv::xphoto::oilPainting(Mat src, Mat& dst, int size, int dynRatio)
    //

    /**
     * oilPainting
     * See the book CITE: Holzmann1988 for details.
     * @param src Input three-channel or one channel image (either CV_8UC3 or CV_8UC1)
     * @param dst Output image of the same size and type as src.
     * @param size neighbouring size is 2-size+1
     * @param dynRatio image is divided by dynRatio before histogram processing
     */
    public static void oilPainting(Mat src, Mat dst, int size, int dynRatio) {
        oilPainting_1(src.nativeObj, dst.nativeObj, size, dynRatio);
    }




    // C++:  Ptr_GrayworldWB cv::xphoto::createGrayworldWB()
    private static native long createGrayworldWB_0();

    // C++:  Ptr_LearningBasedWB cv::xphoto::createLearningBasedWB(String path_to_model = String())
    private static native long createLearningBasedWB_0(String path_to_model);
    private static native long createLearningBasedWB_1();

    // C++:  Ptr_SimpleWB cv::xphoto::createSimpleWB()
    private static native long createSimpleWB_0();

    // C++:  Ptr_TonemapDurand cv::xphoto::createTonemapDurand(float gamma = 1.0f, float contrast = 4.0f, float saturation = 1.0f, float sigma_color = 2.0f, float sigma_space = 2.0f)
    private static native long createTonemapDurand_0(float gamma, float contrast, float saturation, float sigma_color, float sigma_space);
    private static native long createTonemapDurand_1(float gamma, float contrast, float saturation, float sigma_color);
    private static native long createTonemapDurand_2(float gamma, float contrast, float saturation);
    private static native long createTonemapDurand_3(float gamma, float contrast);
    private static native long createTonemapDurand_4(float gamma);
    private static native long createTonemapDurand_5();

    // C++:  void cv::xphoto::applyChannelGains(Mat src, Mat& dst, float gainB, float gainG, float gainR)
    private static native void applyChannelGains_0(long src_nativeObj, long dst_nativeObj, float gainB, float gainG, float gainR);

    // C++:  void cv::xphoto::bm3dDenoising(Mat src, Mat& dst, float h = 1, int templateWindowSize = 4, int searchWindowSize = 16, int blockMatchingStep1 = 2500, int blockMatchingStep2 = 400, int groupSize = 8, int slidingStep = 1, float beta = 2.0f, int normType = cv::NORM_L2, int step = cv::xphoto::BM3D_STEPALL, int transformType = cv::xphoto::HAAR)
    private static native void bm3dDenoising_0(long src_nativeObj, long dst_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta, int normType, int step, int transformType);
    private static native void bm3dDenoising_1(long src_nativeObj, long dst_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta, int normType, int step);
    private static native void bm3dDenoising_2(long src_nativeObj, long dst_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta, int normType);
    private static native void bm3dDenoising_3(long src_nativeObj, long dst_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta);
    private static native void bm3dDenoising_4(long src_nativeObj, long dst_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep);
    private static native void bm3dDenoising_5(long src_nativeObj, long dst_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize);
    private static native void bm3dDenoising_6(long src_nativeObj, long dst_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2);
    private static native void bm3dDenoising_7(long src_nativeObj, long dst_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1);
    private static native void bm3dDenoising_8(long src_nativeObj, long dst_nativeObj, float h, int templateWindowSize, int searchWindowSize);
    private static native void bm3dDenoising_9(long src_nativeObj, long dst_nativeObj, float h, int templateWindowSize);
    private static native void bm3dDenoising_10(long src_nativeObj, long dst_nativeObj, float h);
    private static native void bm3dDenoising_11(long src_nativeObj, long dst_nativeObj);

    // C++:  void cv::xphoto::bm3dDenoising(Mat src, Mat& dstStep1, Mat& dstStep2, float h = 1, int templateWindowSize = 4, int searchWindowSize = 16, int blockMatchingStep1 = 2500, int blockMatchingStep2 = 400, int groupSize = 8, int slidingStep = 1, float beta = 2.0f, int normType = cv::NORM_L2, int step = cv::xphoto::BM3D_STEPALL, int transformType = cv::xphoto::HAAR)
    private static native void bm3dDenoising_12(long src_nativeObj, long dstStep1_nativeObj, long dstStep2_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta, int normType, int step, int transformType);
    private static native void bm3dDenoising_13(long src_nativeObj, long dstStep1_nativeObj, long dstStep2_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta, int normType, int step);
    private static native void bm3dDenoising_14(long src_nativeObj, long dstStep1_nativeObj, long dstStep2_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta, int normType);
    private static native void bm3dDenoising_15(long src_nativeObj, long dstStep1_nativeObj, long dstStep2_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep, float beta);
    private static native void bm3dDenoising_16(long src_nativeObj, long dstStep1_nativeObj, long dstStep2_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize, int slidingStep);
    private static native void bm3dDenoising_17(long src_nativeObj, long dstStep1_nativeObj, long dstStep2_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2, int groupSize);
    private static native void bm3dDenoising_18(long src_nativeObj, long dstStep1_nativeObj, long dstStep2_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1, int blockMatchingStep2);
    private static native void bm3dDenoising_19(long src_nativeObj, long dstStep1_nativeObj, long dstStep2_nativeObj, float h, int templateWindowSize, int searchWindowSize, int blockMatchingStep1);
    private static native void bm3dDenoising_20(long src_nativeObj, long dstStep1_nativeObj, long dstStep2_nativeObj, float h, int templateWindowSize, int searchWindowSize);
    private static native void bm3dDenoising_21(long src_nativeObj, long dstStep1_nativeObj, long dstStep2_nativeObj, float h, int templateWindowSize);
    private static native void bm3dDenoising_22(long src_nativeObj, long dstStep1_nativeObj, long dstStep2_nativeObj, float h);
    private static native void bm3dDenoising_23(long src_nativeObj, long dstStep1_nativeObj, long dstStep2_nativeObj);

    // C++:  void cv::xphoto::dctDenoising(Mat src, Mat dst, double sigma, int psize = 16)
    private static native void dctDenoising_0(long src_nativeObj, long dst_nativeObj, double sigma, int psize);
    private static native void dctDenoising_1(long src_nativeObj, long dst_nativeObj, double sigma);

    // C++:  void cv::xphoto::inpaint(Mat src, Mat mask, Mat dst, int algorithmType)
    private static native void inpaint_0(long src_nativeObj, long mask_nativeObj, long dst_nativeObj, int algorithmType);

    // C++:  void cv::xphoto::oilPainting(Mat src, Mat& dst, int size, int dynRatio, int code)
    private static native void oilPainting_0(long src_nativeObj, long dst_nativeObj, int size, int dynRatio, int code);

    // C++:  void cv::xphoto::oilPainting(Mat src, Mat& dst, int size, int dynRatio)
    private static native void oilPainting_1(long src_nativeObj, long dst_nativeObj, int size, int dynRatio);

}
