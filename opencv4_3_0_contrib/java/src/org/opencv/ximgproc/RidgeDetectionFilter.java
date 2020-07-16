//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.ximgproc.RidgeDetectionFilter;

// C++: class RidgeDetectionFilter
/**
 *  Applies Ridge Detection Filter to an input image.
 * Implements Ridge detection similar to the one in [Mathematica](http://reference.wolfram.com/language/ref/RidgeFilter.html)
 * using the eigen values from the Hessian Matrix of the input image using Sobel Derivatives.
 * Additional refinement can be done using Skeletonization and Binarization. Adapted from CITE: segleafvein and CITE: M_RF
 */
public class RidgeDetectionFilter extends Algorithm {

    protected RidgeDetectionFilter(long addr) { super(addr); }

    // internal usage only
    public static RidgeDetectionFilter __fromPtr__(long addr) { return new RidgeDetectionFilter(addr); }

    //
    // C++: static Ptr_RidgeDetectionFilter cv::ximgproc::RidgeDetectionFilter::create(int ddepth = CV_32FC1, int dx = 1, int dy = 1, int ksize = 3, int out_dtype = CV_8UC1, double scale = 1, double delta = 0, int borderType = BORDER_DEFAULT)
    //

    /**
     * Create pointer to the Ridge detection filter.
     *     @param ddepth  Specifies output image depth. Defualt is CV_32FC1
     *     @param dx Order of derivative x, default is 1
     *     @param dy  Order of derivative y, default is 1
     *     @param ksize Sobel kernel size , default is 3
     *     @param out_dtype Converted format for output, default is CV_8UC1
     *     @param scale Optional scale value for derivative values, default is 1
     *     @param delta  Optional bias added to output, default is 0
     *     @param borderType Pixel extrapolation method, default is BORDER_DEFAULT
     *     SEE: Sobel, threshold, getStructuringElement, morphologyEx.( for additional refinement)
     * @return automatically generated
     */
    public static RidgeDetectionFilter create(int ddepth, int dx, int dy, int ksize, int out_dtype, double scale, double delta, int borderType) {
        return RidgeDetectionFilter.__fromPtr__(create_0(ddepth, dx, dy, ksize, out_dtype, scale, delta, borderType));
    }

    /**
     * Create pointer to the Ridge detection filter.
     *     @param ddepth  Specifies output image depth. Defualt is CV_32FC1
     *     @param dx Order of derivative x, default is 1
     *     @param dy  Order of derivative y, default is 1
     *     @param ksize Sobel kernel size , default is 3
     *     @param out_dtype Converted format for output, default is CV_8UC1
     *     @param scale Optional scale value for derivative values, default is 1
     *     @param delta  Optional bias added to output, default is 0
     *     SEE: Sobel, threshold, getStructuringElement, morphologyEx.( for additional refinement)
     * @return automatically generated
     */
    public static RidgeDetectionFilter create(int ddepth, int dx, int dy, int ksize, int out_dtype, double scale, double delta) {
        return RidgeDetectionFilter.__fromPtr__(create_1(ddepth, dx, dy, ksize, out_dtype, scale, delta));
    }

    /**
     * Create pointer to the Ridge detection filter.
     *     @param ddepth  Specifies output image depth. Defualt is CV_32FC1
     *     @param dx Order of derivative x, default is 1
     *     @param dy  Order of derivative y, default is 1
     *     @param ksize Sobel kernel size , default is 3
     *     @param out_dtype Converted format for output, default is CV_8UC1
     *     @param scale Optional scale value for derivative values, default is 1
     *     SEE: Sobel, threshold, getStructuringElement, morphologyEx.( for additional refinement)
     * @return automatically generated
     */
    public static RidgeDetectionFilter create(int ddepth, int dx, int dy, int ksize, int out_dtype, double scale) {
        return RidgeDetectionFilter.__fromPtr__(create_2(ddepth, dx, dy, ksize, out_dtype, scale));
    }

    /**
     * Create pointer to the Ridge detection filter.
     *     @param ddepth  Specifies output image depth. Defualt is CV_32FC1
     *     @param dx Order of derivative x, default is 1
     *     @param dy  Order of derivative y, default is 1
     *     @param ksize Sobel kernel size , default is 3
     *     @param out_dtype Converted format for output, default is CV_8UC1
     *     SEE: Sobel, threshold, getStructuringElement, morphologyEx.( for additional refinement)
     * @return automatically generated
     */
    public static RidgeDetectionFilter create(int ddepth, int dx, int dy, int ksize, int out_dtype) {
        return RidgeDetectionFilter.__fromPtr__(create_3(ddepth, dx, dy, ksize, out_dtype));
    }

    /**
     * Create pointer to the Ridge detection filter.
     *     @param ddepth  Specifies output image depth. Defualt is CV_32FC1
     *     @param dx Order of derivative x, default is 1
     *     @param dy  Order of derivative y, default is 1
     *     @param ksize Sobel kernel size , default is 3
     *     SEE: Sobel, threshold, getStructuringElement, morphologyEx.( for additional refinement)
     * @return automatically generated
     */
    public static RidgeDetectionFilter create(int ddepth, int dx, int dy, int ksize) {
        return RidgeDetectionFilter.__fromPtr__(create_4(ddepth, dx, dy, ksize));
    }

    /**
     * Create pointer to the Ridge detection filter.
     *     @param ddepth  Specifies output image depth. Defualt is CV_32FC1
     *     @param dx Order of derivative x, default is 1
     *     @param dy  Order of derivative y, default is 1
     *     SEE: Sobel, threshold, getStructuringElement, morphologyEx.( for additional refinement)
     * @return automatically generated
     */
    public static RidgeDetectionFilter create(int ddepth, int dx, int dy) {
        return RidgeDetectionFilter.__fromPtr__(create_5(ddepth, dx, dy));
    }

    /**
     * Create pointer to the Ridge detection filter.
     *     @param ddepth  Specifies output image depth. Defualt is CV_32FC1
     *     @param dx Order of derivative x, default is 1
     *     SEE: Sobel, threshold, getStructuringElement, morphologyEx.( for additional refinement)
     * @return automatically generated
     */
    public static RidgeDetectionFilter create(int ddepth, int dx) {
        return RidgeDetectionFilter.__fromPtr__(create_6(ddepth, dx));
    }

    /**
     * Create pointer to the Ridge detection filter.
     *     @param ddepth  Specifies output image depth. Defualt is CV_32FC1
     *     SEE: Sobel, threshold, getStructuringElement, morphologyEx.( for additional refinement)
     * @return automatically generated
     */
    public static RidgeDetectionFilter create(int ddepth) {
        return RidgeDetectionFilter.__fromPtr__(create_7(ddepth));
    }

    /**
     * Create pointer to the Ridge detection filter.
     *     SEE: Sobel, threshold, getStructuringElement, morphologyEx.( for additional refinement)
     * @return automatically generated
     */
    public static RidgeDetectionFilter create() {
        return RidgeDetectionFilter.__fromPtr__(create_8());
    }


    //
    // C++:  void cv::ximgproc::RidgeDetectionFilter::getRidgeFilteredImage(Mat _img, Mat& out)
    //

    /**
     * Apply Ridge detection filter on input image.
     *     @param _img InputArray as supported by Sobel. img can be 1-Channel or 3-Channels.
     *     @param out OutputAray of structure as RidgeDetectionFilter::ddepth. Output image with ridges.
     */
    public void getRidgeFilteredImage(Mat _img, Mat out) {
        getRidgeFilteredImage_0(nativeObj, _img.nativeObj, out.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_RidgeDetectionFilter cv::ximgproc::RidgeDetectionFilter::create(int ddepth = CV_32FC1, int dx = 1, int dy = 1, int ksize = 3, int out_dtype = CV_8UC1, double scale = 1, double delta = 0, int borderType = BORDER_DEFAULT)
    private static native long create_0(int ddepth, int dx, int dy, int ksize, int out_dtype, double scale, double delta, int borderType);
    private static native long create_1(int ddepth, int dx, int dy, int ksize, int out_dtype, double scale, double delta);
    private static native long create_2(int ddepth, int dx, int dy, int ksize, int out_dtype, double scale);
    private static native long create_3(int ddepth, int dx, int dy, int ksize, int out_dtype);
    private static native long create_4(int ddepth, int dx, int dy, int ksize);
    private static native long create_5(int ddepth, int dx, int dy);
    private static native long create_6(int ddepth, int dx);
    private static native long create_7(int ddepth);
    private static native long create_8();

    // C++:  void cv::ximgproc::RidgeDetectionFilter::getRidgeFilteredImage(Mat _img, Mat& out)
    private static native void getRidgeFilteredImage_0(long nativeObj, long _img_nativeObj, long out_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
