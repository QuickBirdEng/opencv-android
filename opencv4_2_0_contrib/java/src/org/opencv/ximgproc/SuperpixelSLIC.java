//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class SuperpixelSLIC
/**
 * Class implementing the SLIC (Simple Linear Iterative Clustering) superpixels
 * algorithm described in CITE: Achanta2012.
 *
 * SLIC (Simple Linear Iterative Clustering) clusters pixels using pixel channels and image plane space
 * to efficiently generate compact, nearly uniform superpixels. The simplicity of approach makes it
 * extremely easy to use a lone parameter specifies the number of superpixels and the efficiency of
 * the algorithm makes it very practical.
 * Several optimizations are available for SLIC class:
 * SLICO stands for "Zero parameter SLIC" and it is an optimization of baseline SLIC described in CITE: Achanta2012.
 * MSLIC stands for "Manifold SLIC" and it is an optimization of baseline SLIC described in CITE: Liu_2017_IEEE.
 */
public class SuperpixelSLIC extends Algorithm {

    protected SuperpixelSLIC(long addr) { super(addr); }

    // internal usage only
    public static SuperpixelSLIC __fromPtr__(long addr) { return new SuperpixelSLIC(addr); }

    //
    // C++:  int cv::ximgproc::SuperpixelSLIC::getNumberOfSuperpixels()
    //

    /**
     * Calculates the actual amount of superpixels on a given segmentation computed
     *     and stored in SuperpixelSLIC object.
     * @return automatically generated
     */
    public int getNumberOfSuperpixels() {
        return getNumberOfSuperpixels_0(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::SuperpixelSLIC::enforceLabelConnectivity(int min_element_size = 25)
    //

    /**
     * Enforce label connectivity.
     *
     *     @param min_element_size The minimum element size in percents that should be absorbed into a bigger
     *     superpixel. Given resulted average superpixel size valid value should be in 0-100 range, 25 means
     *     that less then a quarter sized superpixel should be absorbed, this is default.
     *
     *     The function merge component that is too small, assigning the previously found adjacent label
     *     to this component. Calling this function may change the final number of superpixels.
     */
    public void enforceLabelConnectivity(int min_element_size) {
        enforceLabelConnectivity_0(nativeObj, min_element_size);
    }

    /**
     * Enforce label connectivity.
     *
     *     superpixel. Given resulted average superpixel size valid value should be in 0-100 range, 25 means
     *     that less then a quarter sized superpixel should be absorbed, this is default.
     *
     *     The function merge component that is too small, assigning the previously found adjacent label
     *     to this component. Calling this function may change the final number of superpixels.
     */
    public void enforceLabelConnectivity() {
        enforceLabelConnectivity_1(nativeObj);
    }


    //
    // C++:  void cv::ximgproc::SuperpixelSLIC::getLabelContourMask(Mat& image, bool thick_line = true)
    //

    /**
     * Returns the mask of the superpixel segmentation stored in SuperpixelSLIC object.
     *
     *     @param image Return: CV_8U1 image mask where -1 indicates that the pixel is a superpixel border,
     *     and 0 otherwise.
     *
     *     @param thick_line If false, the border is only one pixel wide, otherwise all pixels at the border
     *     are masked.
     *
     *     The function return the boundaries of the superpixel segmentation.
     */
    public void getLabelContourMask(Mat image, boolean thick_line) {
        getLabelContourMask_0(nativeObj, image.nativeObj, thick_line);
    }

    /**
     * Returns the mask of the superpixel segmentation stored in SuperpixelSLIC object.
     *
     *     @param image Return: CV_8U1 image mask where -1 indicates that the pixel is a superpixel border,
     *     and 0 otherwise.
     *
     *     are masked.
     *
     *     The function return the boundaries of the superpixel segmentation.
     */
    public void getLabelContourMask(Mat image) {
        getLabelContourMask_1(nativeObj, image.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::SuperpixelSLIC::getLabels(Mat& labels_out)
    //

    /**
     * Returns the segmentation labeling of the image.
     *
     *     Each label represents a superpixel, and each pixel is assigned to one superpixel label.
     *
     *     @param labels_out Return: A CV_32SC1 integer array containing the labels of the superpixel
     *     segmentation. The labels are in the range [0, getNumberOfSuperpixels()].
     *
     *     The function returns an image with the labels of the superpixel segmentation. The labels are in
     *     the range [0, getNumberOfSuperpixels()].
     */
    public void getLabels(Mat labels_out) {
        getLabels_0(nativeObj, labels_out.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::SuperpixelSLIC::iterate(int num_iterations = 10)
    //

    /**
     * Calculates the superpixel segmentation on a given image with the initialized
     *     parameters in the SuperpixelSLIC object.
     *
     *     This function can be called again without the need of initializing the algorithm with
     *     createSuperpixelSLIC(). This save the computational cost of allocating memory for all the
     *     structures of the algorithm.
     *
     *     @param num_iterations Number of iterations. Higher number improves the result.
     *
     *     The function computes the superpixels segmentation of an image with the parameters initialized
     *     with the function createSuperpixelSLIC(). The algorithms starts from a grid of superpixels and
     *     then refines the boundaries by proposing updates of edges boundaries.
     */
    public void iterate(int num_iterations) {
        iterate_0(nativeObj, num_iterations);
    }

    /**
     * Calculates the superpixel segmentation on a given image with the initialized
     *     parameters in the SuperpixelSLIC object.
     *
     *     This function can be called again without the need of initializing the algorithm with
     *     createSuperpixelSLIC(). This save the computational cost of allocating memory for all the
     *     structures of the algorithm.
     *
     *
     *     The function computes the superpixels segmentation of an image with the parameters initialized
     *     with the function createSuperpixelSLIC(). The algorithms starts from a grid of superpixels and
     *     then refines the boundaries by proposing updates of edges boundaries.
     */
    public void iterate() {
        iterate_1(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  int cv::ximgproc::SuperpixelSLIC::getNumberOfSuperpixels()
    private static native int getNumberOfSuperpixels_0(long nativeObj);

    // C++:  void cv::ximgproc::SuperpixelSLIC::enforceLabelConnectivity(int min_element_size = 25)
    private static native void enforceLabelConnectivity_0(long nativeObj, int min_element_size);
    private static native void enforceLabelConnectivity_1(long nativeObj);

    // C++:  void cv::ximgproc::SuperpixelSLIC::getLabelContourMask(Mat& image, bool thick_line = true)
    private static native void getLabelContourMask_0(long nativeObj, long image_nativeObj, boolean thick_line);
    private static native void getLabelContourMask_1(long nativeObj, long image_nativeObj);

    // C++:  void cv::ximgproc::SuperpixelSLIC::getLabels(Mat& labels_out)
    private static native void getLabels_0(long nativeObj, long labels_out_nativeObj);

    // C++:  void cv::ximgproc::SuperpixelSLIC::iterate(int num_iterations = 10)
    private static native void iterate_0(long nativeObj, int num_iterations);
    private static native void iterate_1(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
