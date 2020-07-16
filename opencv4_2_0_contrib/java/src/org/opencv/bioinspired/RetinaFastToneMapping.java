//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bioinspired;

import org.opencv.bioinspired.RetinaFastToneMapping;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Size;

// C++: class RetinaFastToneMapping
/**
 *  a wrapper class which allows the tone mapping algorithm of Meylan&amp;al(2007) to be used with OpenCV.
 *
 * This algorithm is already implemented in thre Retina class (retina::applyFastToneMapping) but used it does not require all the retina model to be allocated. This allows a light memory use for low memory devices (smartphones, etc.
 * As a summary, these are the model properties:
 * <ul>
 *   <li>
 *  2 stages of local luminance adaptation with a different local neighborhood for each.
 *   </li>
 *   <li>
 *  first stage models the retina photorecetors local luminance adaptation
 *   </li>
 *   <li>
 *  second stage models th ganglion cells local information adaptation
 *   </li>
 *   <li>
 *  compared to the initial publication, this class uses spatio-temporal low pass filters instead of spatial only filters.
 *   this can help noise robustness and temporal stability for video sequence use cases.
 *   </li>
 * </ul>
 *
 * for more information, read to the following papers :
 * Meylan L., Alleysson D., and Susstrunk S., A Model of Retinal Local Adaptation for the Tone Mapping of Color Filter Array Images, Journal of Optical Society of America, A, Vol. 24, N 9, September, 1st, 2007, pp. 2807-2816Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
 * regarding spatio-temporal filter and the bigger retina model :
 * Vision: Images, Signals and Neural Networks: Models of Neural Processing in Visual Perception (Progress in Neural Processing),By: Jeanny Herault, ISBN: 9814273686. WAPI (Tower ID): 113266891.
 */
public class RetinaFastToneMapping extends Algorithm {

    protected RetinaFastToneMapping(long addr) { super(addr); }

    // internal usage only
    public static RetinaFastToneMapping __fromPtr__(long addr) { return new RetinaFastToneMapping(addr); }

    //
    // C++: static Ptr_RetinaFastToneMapping cv::bioinspired::RetinaFastToneMapping::create(Size inputSize)
    //

    public static RetinaFastToneMapping create(Size inputSize) {
        return RetinaFastToneMapping.__fromPtr__(create_0(inputSize.width, inputSize.height));
    }


    //
    // C++:  void cv::bioinspired::RetinaFastToneMapping::applyFastToneMapping(Mat inputImage, Mat& outputToneMappedImage)
    //

    /**
     * applies a luminance correction (initially High Dynamic Range (HDR) tone mapping)
     *
     *     using only the 2 local adaptation stages of the retina parvocellular channel : photoreceptors
     *     level and ganlion cells level. Spatio temporal filtering is applied but limited to temporal
     *     smoothing and eventually high frequencies attenuation. This is a lighter method than the one
     *     available using the regular retina::run method. It is then faster but it does not include
     *     complete temporal filtering nor retina spectral whitening. Then, it can have a more limited
     *     effect on images with a very high dynamic range. This is an adptation of the original still
     *     image HDR tone mapping algorithm of David Alleyson, Sabine Susstruck and Laurence Meylan's
     *     work, please cite: -&gt; Meylan L., Alleysson D., and Susstrunk S., A Model of Retinal Local
     *     Adaptation for the Tone Mapping of Color Filter Array Images, Journal of Optical Society of
     *     America, A, Vol. 24, N 9, September, 1st, 2007, pp. 2807-2816
     *
     *     @param inputImage the input image to process RGB or gray levels
     *     @param outputToneMappedImage the output tone mapped image
     */
    public void applyFastToneMapping(Mat inputImage, Mat outputToneMappedImage) {
        applyFastToneMapping_0(nativeObj, inputImage.nativeObj, outputToneMappedImage.nativeObj);
    }


    //
    // C++:  void cv::bioinspired::RetinaFastToneMapping::setup(float photoreceptorsNeighborhoodRadius = 3.f, float ganglioncellsNeighborhoodRadius = 1.f, float meanLuminanceModulatorK = 1.f)
    //

    /**
     * updates tone mapping behaviors by adjusing the local luminance computation area
     *
     *     @param photoreceptorsNeighborhoodRadius the first stage local adaptation area
     *     @param ganglioncellsNeighborhoodRadius the second stage local adaptation area
     *     @param meanLuminanceModulatorK the factor applied to modulate the meanLuminance information
     *     (default is 1, see reference paper)
     */
    public void setup(float photoreceptorsNeighborhoodRadius, float ganglioncellsNeighborhoodRadius, float meanLuminanceModulatorK) {
        setup_0(nativeObj, photoreceptorsNeighborhoodRadius, ganglioncellsNeighborhoodRadius, meanLuminanceModulatorK);
    }

    /**
     * updates tone mapping behaviors by adjusing the local luminance computation area
     *
     *     @param photoreceptorsNeighborhoodRadius the first stage local adaptation area
     *     @param ganglioncellsNeighborhoodRadius the second stage local adaptation area
     *     (default is 1, see reference paper)
     */
    public void setup(float photoreceptorsNeighborhoodRadius, float ganglioncellsNeighborhoodRadius) {
        setup_1(nativeObj, photoreceptorsNeighborhoodRadius, ganglioncellsNeighborhoodRadius);
    }

    /**
     * updates tone mapping behaviors by adjusing the local luminance computation area
     *
     *     @param photoreceptorsNeighborhoodRadius the first stage local adaptation area
     *     (default is 1, see reference paper)
     */
    public void setup(float photoreceptorsNeighborhoodRadius) {
        setup_2(nativeObj, photoreceptorsNeighborhoodRadius);
    }

    /**
     * updates tone mapping behaviors by adjusing the local luminance computation area
     *
     *     (default is 1, see reference paper)
     */
    public void setup() {
        setup_3(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_RetinaFastToneMapping cv::bioinspired::RetinaFastToneMapping::create(Size inputSize)
    private static native long create_0(double inputSize_width, double inputSize_height);

    // C++:  void cv::bioinspired::RetinaFastToneMapping::applyFastToneMapping(Mat inputImage, Mat& outputToneMappedImage)
    private static native void applyFastToneMapping_0(long nativeObj, long inputImage_nativeObj, long outputToneMappedImage_nativeObj);

    // C++:  void cv::bioinspired::RetinaFastToneMapping::setup(float photoreceptorsNeighborhoodRadius = 3.f, float ganglioncellsNeighborhoodRadius = 1.f, float meanLuminanceModulatorK = 1.f)
    private static native void setup_0(long nativeObj, float photoreceptorsNeighborhoodRadius, float ganglioncellsNeighborhoodRadius, float meanLuminanceModulatorK);
    private static native void setup_1(long nativeObj, float photoreceptorsNeighborhoodRadius, float ganglioncellsNeighborhoodRadius);
    private static native void setup_2(long nativeObj, float photoreceptorsNeighborhoodRadius);
    private static native void setup_3(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
