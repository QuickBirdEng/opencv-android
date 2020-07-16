//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.structured_light;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.structured_light.GrayCodePattern;
import org.opencv.utils.Converters;

// C++: class GrayCodePattern
/**
 * Class implementing the Gray-code pattern, based on CITE: UNDERWORLD.
 *
 * The generation of the pattern images is performed with Gray encoding using the traditional white and black colors.
 *
 * The information about the two image axes x, y is encoded separately into two different pattern sequences.
 * A projector P with resolution (P_res_x, P_res_y) will result in Ncols = log 2 (P_res_x) encoded pattern images representing the columns, and
 * in Nrows = log 2 (P_res_y) encoded pattern images representing the rows.
 * For example a projector with resolution 1024x768 will result in Ncols = 10 and Nrows = 10.
 *
 * However, the generated pattern sequence consists of both regular color and color-inverted images: inverted pattern images are images
 * with the same structure as the original but with inverted colors.
 * This provides an effective method for easily determining the intensity value of each pixel when it is lit (highest value) and
 * when it is not lit (lowest value). So for a a projector with resolution 1024x768, the number of pattern images will be Ncols * 2 + Nrows * 2 = 40.
 *
 */
public class GrayCodePattern extends StructuredLightPattern {

    protected GrayCodePattern(long addr) { super(addr); }

    // internal usage only
    public static GrayCodePattern __fromPtr__(long addr) { return new GrayCodePattern(addr); }

    //
    // C++: static Ptr_GrayCodePattern cv::structured_light::GrayCodePattern::create(int width, int height)
    //

    /**
     * Constructor
     * @param width automatically generated
     * @param height automatically generated
     * @return automatically generated
     */
    public static GrayCodePattern create(int width, int height) {
        return GrayCodePattern.__fromPtr__(create_0(width, height));
    }


    //
    // C++:  bool cv::structured_light::GrayCodePattern::getProjPixel(vector_Mat patternImages, int x, int y, Point& projPix)
    //

    /**
     * For a (x,y) pixel of a camera returns the corresponding projector pixel.
     *
     * The function decodes each pixel in the pattern images acquired by a camera into their corresponding decimal numbers representing the projector's column and row,
     * providing a mapping between camera's and projector's pixel.
     *
     * @param patternImages The pattern images acquired by the camera, stored in a grayscale vector &lt; Mat &gt;.
     * @param x x coordinate of the image pixel.
     * @param y y coordinate of the image pixel.
     * @param projPix Projector's pixel corresponding to the camera's pixel: projPix.x and projPix.y are the image coordinates of the projector's pixel corresponding to the pixel being decoded in a camera.
     * @return automatically generated
     */
    public boolean getProjPixel(List<Mat> patternImages, int x, int y, Point projPix) {
        Mat patternImages_mat = Converters.vector_Mat_to_Mat(patternImages);
        double[] projPix_out = new double[2];
        boolean retVal = getProjPixel_0(nativeObj, patternImages_mat.nativeObj, x, y, projPix_out);
        if(projPix!=null){ projPix.x = projPix_out[0]; projPix.y = projPix_out[1]; } 
        return retVal;
    }


    //
    // C++:  size_t cv::structured_light::GrayCodePattern::getNumberOfPatternImages()
    //

    /**
     * Get the number of pattern images needed for the graycode pattern.
     *
     * @return The number of pattern images needed for the graycode pattern.
     *
     */
    public long getNumberOfPatternImages() {
        return getNumberOfPatternImages_0(nativeObj);
    }


    //
    // C++:  void cv::structured_light::GrayCodePattern::getImagesForShadowMasks(Mat& blackImage, Mat& whiteImage)
    //

    /**
     * Generates the all-black and all-white images needed for shadowMasks computation.
     *
     * To identify shadow regions, the regions of two images where the pixels are not lit by projector's light and thus where there is not coded information,
     * the 3DUNDERWORLD algorithm computes a shadow mask for the two cameras views, starting from a white and a black images captured by each camera.
     * This method generates these two additional images to project.
     *
     * @param blackImage The generated all-black CV_8U image, at projector's resolution.
     * @param whiteImage The generated all-white CV_8U image, at projector's resolution.
     */
    public void getImagesForShadowMasks(Mat blackImage, Mat whiteImage) {
        getImagesForShadowMasks_0(nativeObj, blackImage.nativeObj, whiteImage.nativeObj);
    }


    //
    // C++:  void cv::structured_light::GrayCodePattern::setBlackThreshold(size_t value)
    //

    /**
     * Sets the value for black threshold, needed for decoding (shadowsmasks computation).
     *
     * Black threshold is a number between 0-255 that represents the minimum brightness difference required for valid pixels, between the fully illuminated (white) and the not illuminated images (black); used in computeShadowMasks method.
     *
     * @param value The desired black threshold value.
     *
     */
    public void setBlackThreshold(long value) {
        setBlackThreshold_0(nativeObj, value);
    }


    //
    // C++:  void cv::structured_light::GrayCodePattern::setWhiteThreshold(size_t value)
    //

    /**
     * Sets the value for white threshold, needed for decoding.
     *
     * White threshold is a number between 0-255 that represents the minimum brightness difference required for valid pixels, between the graycode pattern and its inverse images; used in getProjPixel method.
     *
     * @param value The desired white threshold value.
     *
     */
    public void setWhiteThreshold(long value) {
        setWhiteThreshold_0(nativeObj, value);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_GrayCodePattern cv::structured_light::GrayCodePattern::create(int width, int height)
    private static native long create_0(int width, int height);

    // C++:  bool cv::structured_light::GrayCodePattern::getProjPixel(vector_Mat patternImages, int x, int y, Point& projPix)
    private static native boolean getProjPixel_0(long nativeObj, long patternImages_mat_nativeObj, int x, int y, double[] projPix_out);

    // C++:  size_t cv::structured_light::GrayCodePattern::getNumberOfPatternImages()
    private static native long getNumberOfPatternImages_0(long nativeObj);

    // C++:  void cv::structured_light::GrayCodePattern::getImagesForShadowMasks(Mat& blackImage, Mat& whiteImage)
    private static native void getImagesForShadowMasks_0(long nativeObj, long blackImage_nativeObj, long whiteImage_nativeObj);

    // C++:  void cv::structured_light::GrayCodePattern::setBlackThreshold(size_t value)
    private static native void setBlackThreshold_0(long nativeObj, long value);

    // C++:  void cv::structured_light::GrayCodePattern::setWhiteThreshold(size_t value)
    private static native void setWhiteThreshold_0(long nativeObj, long value);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
