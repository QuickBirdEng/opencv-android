//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class StructuredEdgeDetection
/**
 * Class implementing edge detection algorithm from CITE: Dollar2013 :
 */
public class StructuredEdgeDetection extends Algorithm {

    protected StructuredEdgeDetection(long addr) { super(addr); }

    // internal usage only
    public static StructuredEdgeDetection __fromPtr__(long addr) { return new StructuredEdgeDetection(addr); }

    //
    // C++:  void cv::ximgproc::StructuredEdgeDetection::computeOrientation(Mat _src, Mat& _dst)
    //

    /**
     * The function computes orientation from edge image.
     *
     *     @param _src edge image.
     *     @param _dst orientation image.
     */
    public void computeOrientation(Mat _src, Mat _dst) {
        computeOrientation_0(nativeObj, _src.nativeObj, _dst.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::StructuredEdgeDetection::detectEdges(Mat _src, Mat& _dst)
    //

    /**
     * The function detects edges in src and draw them to dst.
     *
     *     The algorithm underlies this function is much more robust to texture presence, than common
     *     approaches, e.g. Sobel
     *     @param _src source image (RGB, float, in [0;1]) to detect edges
     *     @param _dst destination image (grayscale, float, in [0;1]) where edges are drawn
     *     SEE: Sobel, Canny
     */
    public void detectEdges(Mat _src, Mat _dst) {
        detectEdges_0(nativeObj, _src.nativeObj, _dst.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::StructuredEdgeDetection::edgesNms(Mat edge_image, Mat orientation_image, Mat& _dst, int r = 2, int s = 0, float m = 1, bool isParallel = true)
    //

    /**
     * The function edgenms in edge image and suppress edges where edge is stronger in orthogonal direction.
     *
     *     @param edge_image edge image from detectEdges function.
     *     @param orientation_image orientation image from computeOrientation function.
     *     @param _dst suppressed image (grayscale, float, in [0;1])
     *     @param r radius for NMS suppression.
     *     @param s radius for boundary suppression.
     *     @param m multiplier for conservative suppression.
     *     @param isParallel enables/disables parallel computing.
     */
    public void edgesNms(Mat edge_image, Mat orientation_image, Mat _dst, int r, int s, float m, boolean isParallel) {
        edgesNms_0(nativeObj, edge_image.nativeObj, orientation_image.nativeObj, _dst.nativeObj, r, s, m, isParallel);
    }

    /**
     * The function edgenms in edge image and suppress edges where edge is stronger in orthogonal direction.
     *
     *     @param edge_image edge image from detectEdges function.
     *     @param orientation_image orientation image from computeOrientation function.
     *     @param _dst suppressed image (grayscale, float, in [0;1])
     *     @param r radius for NMS suppression.
     *     @param s radius for boundary suppression.
     *     @param m multiplier for conservative suppression.
     */
    public void edgesNms(Mat edge_image, Mat orientation_image, Mat _dst, int r, int s, float m) {
        edgesNms_1(nativeObj, edge_image.nativeObj, orientation_image.nativeObj, _dst.nativeObj, r, s, m);
    }

    /**
     * The function edgenms in edge image and suppress edges where edge is stronger in orthogonal direction.
     *
     *     @param edge_image edge image from detectEdges function.
     *     @param orientation_image orientation image from computeOrientation function.
     *     @param _dst suppressed image (grayscale, float, in [0;1])
     *     @param r radius for NMS suppression.
     *     @param s radius for boundary suppression.
     */
    public void edgesNms(Mat edge_image, Mat orientation_image, Mat _dst, int r, int s) {
        edgesNms_2(nativeObj, edge_image.nativeObj, orientation_image.nativeObj, _dst.nativeObj, r, s);
    }

    /**
     * The function edgenms in edge image and suppress edges where edge is stronger in orthogonal direction.
     *
     *     @param edge_image edge image from detectEdges function.
     *     @param orientation_image orientation image from computeOrientation function.
     *     @param _dst suppressed image (grayscale, float, in [0;1])
     *     @param r radius for NMS suppression.
     */
    public void edgesNms(Mat edge_image, Mat orientation_image, Mat _dst, int r) {
        edgesNms_3(nativeObj, edge_image.nativeObj, orientation_image.nativeObj, _dst.nativeObj, r);
    }

    /**
     * The function edgenms in edge image and suppress edges where edge is stronger in orthogonal direction.
     *
     *     @param edge_image edge image from detectEdges function.
     *     @param orientation_image orientation image from computeOrientation function.
     *     @param _dst suppressed image (grayscale, float, in [0;1])
     */
    public void edgesNms(Mat edge_image, Mat orientation_image, Mat _dst) {
        edgesNms_4(nativeObj, edge_image.nativeObj, orientation_image.nativeObj, _dst.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::StructuredEdgeDetection::computeOrientation(Mat _src, Mat& _dst)
    private static native void computeOrientation_0(long nativeObj, long _src_nativeObj, long _dst_nativeObj);

    // C++:  void cv::ximgproc::StructuredEdgeDetection::detectEdges(Mat _src, Mat& _dst)
    private static native void detectEdges_0(long nativeObj, long _src_nativeObj, long _dst_nativeObj);

    // C++:  void cv::ximgproc::StructuredEdgeDetection::edgesNms(Mat edge_image, Mat orientation_image, Mat& _dst, int r = 2, int s = 0, float m = 1, bool isParallel = true)
    private static native void edgesNms_0(long nativeObj, long edge_image_nativeObj, long orientation_image_nativeObj, long _dst_nativeObj, int r, int s, float m, boolean isParallel);
    private static native void edgesNms_1(long nativeObj, long edge_image_nativeObj, long orientation_image_nativeObj, long _dst_nativeObj, int r, int s, float m);
    private static native void edgesNms_2(long nativeObj, long edge_image_nativeObj, long orientation_image_nativeObj, long _dst_nativeObj, int r, int s);
    private static native void edgesNms_3(long nativeObj, long edge_image_nativeObj, long orientation_image_nativeObj, long _dst_nativeObj, int r);
    private static native void edgesNms_4(long nativeObj, long edge_image_nativeObj, long orientation_image_nativeObj, long _dst_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
