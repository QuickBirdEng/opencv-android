//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.xfeatures2d.SURF_CUDA;

// C++: class SURF_CUDA
/**
 * Class used for extracting Speeded Up Robust Features (SURF) from an image. :
 *
 * The class SURF_CUDA implements Speeded Up Robust Features descriptor. There is a fast multi-scale
 * Hessian keypoint detector that can be used to find the keypoints (which is the default option). But
 * the descriptors can also be computed for the user-specified keypoints. Only 8-bit grayscale images
 * are supported.
 *
 * The class SURF_CUDA can store results in the GPU and CPU memory. It provides functions to convert
 * results between CPU and GPU version ( uploadKeypoints, downloadKeypoints, downloadDescriptors ). The
 * format of CPU results is the same as SURF results. GPU results are stored in GpuMat. The keypoints
 * matrix is \(\texttt{nFeatures} \times 7\) matrix with the CV_32FC1 type.
 *
 * <ul>
 *   <li>
 *    keypoints.ptr&lt;float&gt;(X_ROW)[i] contains x coordinate of the i-th feature.
 *   </li>
 *   <li>
 *    keypoints.ptr&lt;float&gt;(Y_ROW)[i] contains y coordinate of the i-th feature.
 *   </li>
 *   <li>
 *    keypoints.ptr&lt;float&gt;(LAPLACIAN_ROW)[i] contains the laplacian sign of the i-th feature.
 *   </li>
 *   <li>
 *    keypoints.ptr&lt;float&gt;(OCTAVE_ROW)[i] contains the octave of the i-th feature.
 *   </li>
 *   <li>
 *    keypoints.ptr&lt;float&gt;(SIZE_ROW)[i] contains the size of the i-th feature.
 *   </li>
 *   <li>
 *    keypoints.ptr&lt;float&gt;(ANGLE_ROW)[i] contain orientation of the i-th feature.
 *   </li>
 *   <li>
 *    keypoints.ptr&lt;float&gt;(HESSIAN_ROW)[i] contains the response of the i-th feature.
 *   </li>
 * </ul>
 *
 * The descriptors matrix is \(\texttt{nFeatures} \times \texttt{descriptorSize}\) matrix with the
 * CV_32FC1 type.
 *
 * The class SURF_CUDA uses some buffers and provides access to it. All buffers can be safely released
 * between function calls.
 *
 * SEE: SURF
 *
 * <b>Note:</b>
 * <ul>
 *   <li>
 *       An example for using the SURF keypoint matcher on GPU can be found at
 *         opencv_source_code/samples/gpu/surf_keypoint_matcher.cpp
 *   </li>
 * </ul>
 */
public class SURF_CUDA {

    protected final long nativeObj;
    protected SURF_CUDA(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static SURF_CUDA __fromPtr__(long addr) { return new SURF_CUDA(addr); }

    // C++: enum KeypointLayout
    public static final int
            X_ROW = 0,
            Y_ROW = 0+1,
            LAPLACIAN_ROW = 0+2,
            OCTAVE_ROW = 0+3,
            SIZE_ROW = 0+4,
            ANGLE_ROW = 0+5,
            HESSIAN_ROW = 0+6,
            ROWS_COUNT = 0+7;


    //
    // C++: static Ptr_SURF_CUDA cv::cuda::SURF_CUDA::create(double _hessianThreshold, int _nOctaves = 4, int _nOctaveLayers = 2, bool _extended = false, float _keypointsRatio = 0.01f, bool _upright = false)
    //

    /**
     * @param _hessianThreshold Threshold for hessian keypoint detector used in SURF.
     *     @param _nOctaves Number of pyramid octaves the keypoint detector will use.
     *     @param _nOctaveLayers Number of octave layers within each octave.
     *     @param _extended Extended descriptor flag (true - use extended 128-element descriptors; false - use
     *     64-element descriptors).
     *     @param _keypointsRatio
     *     @param _upright Up-right or rotated features flag (true - do not compute orientation of features;
     *     false - compute orientation).
     * @return automatically generated
     */
    public static SURF_CUDA create(double _hessianThreshold, int _nOctaves, int _nOctaveLayers, boolean _extended, float _keypointsRatio, boolean _upright) {
        return SURF_CUDA.__fromPtr__(create_0(_hessianThreshold, _nOctaves, _nOctaveLayers, _extended, _keypointsRatio, _upright));
    }

    /**
     * @param _hessianThreshold Threshold for hessian keypoint detector used in SURF.
     *     @param _nOctaves Number of pyramid octaves the keypoint detector will use.
     *     @param _nOctaveLayers Number of octave layers within each octave.
     *     @param _extended Extended descriptor flag (true - use extended 128-element descriptors; false - use
     *     64-element descriptors).
     *     @param _keypointsRatio
     *     false - compute orientation).
     * @return automatically generated
     */
    public static SURF_CUDA create(double _hessianThreshold, int _nOctaves, int _nOctaveLayers, boolean _extended, float _keypointsRatio) {
        return SURF_CUDA.__fromPtr__(create_1(_hessianThreshold, _nOctaves, _nOctaveLayers, _extended, _keypointsRatio));
    }

    /**
     * @param _hessianThreshold Threshold for hessian keypoint detector used in SURF.
     *     @param _nOctaves Number of pyramid octaves the keypoint detector will use.
     *     @param _nOctaveLayers Number of octave layers within each octave.
     *     @param _extended Extended descriptor flag (true - use extended 128-element descriptors; false - use
     *     64-element descriptors).
     *     false - compute orientation).
     * @return automatically generated
     */
    public static SURF_CUDA create(double _hessianThreshold, int _nOctaves, int _nOctaveLayers, boolean _extended) {
        return SURF_CUDA.__fromPtr__(create_2(_hessianThreshold, _nOctaves, _nOctaveLayers, _extended));
    }

    /**
     * @param _hessianThreshold Threshold for hessian keypoint detector used in SURF.
     *     @param _nOctaves Number of pyramid octaves the keypoint detector will use.
     *     @param _nOctaveLayers Number of octave layers within each octave.
     *     64-element descriptors).
     *     false - compute orientation).
     * @return automatically generated
     */
    public static SURF_CUDA create(double _hessianThreshold, int _nOctaves, int _nOctaveLayers) {
        return SURF_CUDA.__fromPtr__(create_3(_hessianThreshold, _nOctaves, _nOctaveLayers));
    }

    /**
     * @param _hessianThreshold Threshold for hessian keypoint detector used in SURF.
     *     @param _nOctaves Number of pyramid octaves the keypoint detector will use.
     *     64-element descriptors).
     *     false - compute orientation).
     * @return automatically generated
     */
    public static SURF_CUDA create(double _hessianThreshold, int _nOctaves) {
        return SURF_CUDA.__fromPtr__(create_4(_hessianThreshold, _nOctaves));
    }

    /**
     * @param _hessianThreshold Threshold for hessian keypoint detector used in SURF.
     *     64-element descriptors).
     *     false - compute orientation).
     * @return automatically generated
     */
    public static SURF_CUDA create(double _hessianThreshold) {
        return SURF_CUDA.__fromPtr__(create_5(_hessianThreshold));
    }


    //
    // C++:  int cv::cuda::SURF_CUDA::defaultNorm()
    //

    public int defaultNorm() {
        return defaultNorm_0(nativeObj);
    }


    //
    // C++:  int cv::cuda::SURF_CUDA::descriptorSize()
    //

    public int descriptorSize() {
        return descriptorSize_0(nativeObj);
    }


    //
    // C++:  void cv::cuda::SURF_CUDA::detect(GpuMat img, GpuMat mask, GpuMat& keypoints)
    //

    // Unknown type 'GpuMat' (I), skipping the function


    //
    // C++:  void cv::cuda::SURF_CUDA::detectWithDescriptors(GpuMat img, GpuMat mask, GpuMat& keypoints, GpuMat& descriptors, bool useProvidedKeypoints = false)
    //

    // Unknown type 'GpuMat' (I), skipping the function


    //
    // C++:  void cv::cuda::SURF_CUDA::downloadKeypoints(GpuMat keypointsGPU, vector_KeyPoint& keypoints)
    //

    // Unknown type 'GpuMat' (I), skipping the function


    //
    // C++: double SURF_CUDA::hessianThreshold
    //

    public double get_hessianThreshold() {
        return get_hessianThreshold_0(nativeObj);
    }


    //
    // C++: int SURF_CUDA::nOctaves
    //

    public int get_nOctaves() {
        return get_nOctaves_0(nativeObj);
    }


    //
    // C++: int SURF_CUDA::nOctaveLayers
    //

    public int get_nOctaveLayers() {
        return get_nOctaveLayers_0(nativeObj);
    }


    //
    // C++: bool SURF_CUDA::extended
    //

    public boolean get_extended() {
        return get_extended_0(nativeObj);
    }


    //
    // C++: bool SURF_CUDA::upright
    //

    public boolean get_upright() {
        return get_upright_0(nativeObj);
    }


    //
    // C++: float SURF_CUDA::keypointsRatio
    //

    public float get_keypointsRatio() {
        return get_keypointsRatio_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_SURF_CUDA cv::cuda::SURF_CUDA::create(double _hessianThreshold, int _nOctaves = 4, int _nOctaveLayers = 2, bool _extended = false, float _keypointsRatio = 0.01f, bool _upright = false)
    private static native long create_0(double _hessianThreshold, int _nOctaves, int _nOctaveLayers, boolean _extended, float _keypointsRatio, boolean _upright);
    private static native long create_1(double _hessianThreshold, int _nOctaves, int _nOctaveLayers, boolean _extended, float _keypointsRatio);
    private static native long create_2(double _hessianThreshold, int _nOctaves, int _nOctaveLayers, boolean _extended);
    private static native long create_3(double _hessianThreshold, int _nOctaves, int _nOctaveLayers);
    private static native long create_4(double _hessianThreshold, int _nOctaves);
    private static native long create_5(double _hessianThreshold);

    // C++:  int cv::cuda::SURF_CUDA::defaultNorm()
    private static native int defaultNorm_0(long nativeObj);

    // C++:  int cv::cuda::SURF_CUDA::descriptorSize()
    private static native int descriptorSize_0(long nativeObj);

    // C++: double SURF_CUDA::hessianThreshold
    private static native double get_hessianThreshold_0(long nativeObj);

    // C++: int SURF_CUDA::nOctaves
    private static native int get_nOctaves_0(long nativeObj);

    // C++: int SURF_CUDA::nOctaveLayers
    private static native int get_nOctaveLayers_0(long nativeObj);

    // C++: bool SURF_CUDA::extended
    private static native boolean get_extended_0(long nativeObj);

    // C++: bool SURF_CUDA::upright
    private static native boolean get_upright_0(long nativeObj);

    // C++: float SURF_CUDA::keypointsRatio
    private static native float get_keypointsRatio_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
