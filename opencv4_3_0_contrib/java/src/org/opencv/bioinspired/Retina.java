//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bioinspired;

import org.opencv.bioinspired.Retina;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Size;

// C++: class Retina
/**
 * class which allows the Gipsa/Listic Labs model to be used with OpenCV.
 *
 * This retina model allows spatio-temporal image processing (applied on still images, video sequences).
 * As a summary, these are the retina model properties:
 * <ul>
 *   <li>
 *  It applies a spectral whithening (mid-frequency details enhancement)
 *   </li>
 *   <li>
 *  high frequency spatio-temporal noise reduction
 *   </li>
 *   <li>
 *  low frequency luminance to be reduced (luminance range compression)
 *   </li>
 *   <li>
 *  local logarithmic luminance compression allows details to be enhanced in low light conditions
 *   </li>
 * </ul>
 *
 * USE : this model can be used basically for spatio-temporal video effects but also for :
 *      _using the getParvo method output matrix : texture analysiswith enhanced signal to noise ratio and enhanced details robust against input images luminance ranges
 *      _using the getMagno method output matrix : motion analysis also with the previously cited properties
 *
 * for more information, reer to the following papers :
 * Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
 * Vision: Images, Signals and Neural Networks: Models of Neural Processing in Visual Perception (Progress in Neural Processing),By: Jeanny Herault, ISBN: 9814273686. WAPI (Tower ID): 113266891.
 *
 * The retina filter includes the research contributions of phd/research collegues from which code has been redrawn by the author :
 * take a look at the retinacolor.hpp module to discover Brice Chaix de Lavarene color mosaicing/demosaicing and the reference paper:
 * B. Chaix de Lavarene, D. Alleysson, B. Durette, J. Herault (2007). "Efficient demosaicing through recursive filtering", IEEE International Conference on Image Processing ICIP 2007
 * take a look at imagelogpolprojection.hpp to discover retina spatial log sampling which originates from Barthelemy Durette phd with Jeanny Herault. A Retina / V1 cortex projection is also proposed and originates from Jeanny's discussions.
 * more informations in the above cited Jeanny Heraults's book.
 */
public class Retina extends Algorithm {

    protected Retina(long addr) { super(addr); }

    // internal usage only
    public static Retina __fromPtr__(long addr) { return new Retina(addr); }

    //
    // C++:  Mat cv::bioinspired::Retina::getMagnoRAW()
    //

    public Mat getMagnoRAW() {
        return new Mat(getMagnoRAW_0(nativeObj));
    }


    //
    // C++:  Mat cv::bioinspired::Retina::getParvoRAW()
    //

    public Mat getParvoRAW() {
        return new Mat(getParvoRAW_0(nativeObj));
    }


    //
    // C++: static Ptr_Retina cv::bioinspired::Retina::create(Size inputSize, bool colorMode, int colorSamplingMethod = RETINA_COLOR_BAYER, bool useRetinaLogSampling = false, float reductionFactor = 1.0f, float samplingStrength = 10.0f)
    //

    /**
     * Constructors from standardized interfaces : retreive a smart pointer to a Retina instance
     *
     *     @param inputSize the input frame size
     *     @param colorMode the chosen processing mode : with or without color processing
     *     @param colorSamplingMethod specifies which kind of color sampling will be used :
     * <ul>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_RANDOM: each pixel position is either R, G or B in a random choice
     *   </li>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_DIAGONAL: color sampling is RGBRGBRGB..., line 2 BRGBRGBRG..., line 3, GBRGBRGBR...
     *   </li>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_BAYER: standard bayer sampling
     *     @param useRetinaLogSampling activate retina log sampling, if true, the 2 following parameters can
     *     be used
     *     @param reductionFactor only usefull if param useRetinaLogSampling=true, specifies the reduction
     *     factor of the output frame (as the center (fovea) is high resolution and corners can be
     *     underscaled, then a reduction of the output is allowed without precision leak
     *     @param samplingStrength only usefull if param useRetinaLogSampling=true, specifies the strength of
     *     the log scale that is applied
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static Retina create(Size inputSize, boolean colorMode, int colorSamplingMethod, boolean useRetinaLogSampling, float reductionFactor, float samplingStrength) {
        return Retina.__fromPtr__(create_0(inputSize.width, inputSize.height, colorMode, colorSamplingMethod, useRetinaLogSampling, reductionFactor, samplingStrength));
    }

    /**
     * Constructors from standardized interfaces : retreive a smart pointer to a Retina instance
     *
     *     @param inputSize the input frame size
     *     @param colorMode the chosen processing mode : with or without color processing
     *     @param colorSamplingMethod specifies which kind of color sampling will be used :
     * <ul>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_RANDOM: each pixel position is either R, G or B in a random choice
     *   </li>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_DIAGONAL: color sampling is RGBRGBRGB..., line 2 BRGBRGBRG..., line 3, GBRGBRGBR...
     *   </li>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_BAYER: standard bayer sampling
     *     @param useRetinaLogSampling activate retina log sampling, if true, the 2 following parameters can
     *     be used
     *     @param reductionFactor only usefull if param useRetinaLogSampling=true, specifies the reduction
     *     factor of the output frame (as the center (fovea) is high resolution and corners can be
     *     underscaled, then a reduction of the output is allowed without precision leak
     *     the log scale that is applied
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static Retina create(Size inputSize, boolean colorMode, int colorSamplingMethod, boolean useRetinaLogSampling, float reductionFactor) {
        return Retina.__fromPtr__(create_1(inputSize.width, inputSize.height, colorMode, colorSamplingMethod, useRetinaLogSampling, reductionFactor));
    }

    /**
     * Constructors from standardized interfaces : retreive a smart pointer to a Retina instance
     *
     *     @param inputSize the input frame size
     *     @param colorMode the chosen processing mode : with or without color processing
     *     @param colorSamplingMethod specifies which kind of color sampling will be used :
     * <ul>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_RANDOM: each pixel position is either R, G or B in a random choice
     *   </li>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_DIAGONAL: color sampling is RGBRGBRGB..., line 2 BRGBRGBRG..., line 3, GBRGBRGBR...
     *   </li>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_BAYER: standard bayer sampling
     *     @param useRetinaLogSampling activate retina log sampling, if true, the 2 following parameters can
     *     be used
     *     factor of the output frame (as the center (fovea) is high resolution and corners can be
     *     underscaled, then a reduction of the output is allowed without precision leak
     *     the log scale that is applied
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static Retina create(Size inputSize, boolean colorMode, int colorSamplingMethod, boolean useRetinaLogSampling) {
        return Retina.__fromPtr__(create_2(inputSize.width, inputSize.height, colorMode, colorSamplingMethod, useRetinaLogSampling));
    }

    /**
     * Constructors from standardized interfaces : retreive a smart pointer to a Retina instance
     *
     *     @param inputSize the input frame size
     *     @param colorMode the chosen processing mode : with or without color processing
     *     @param colorSamplingMethod specifies which kind of color sampling will be used :
     * <ul>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_RANDOM: each pixel position is either R, G or B in a random choice
     *   </li>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_DIAGONAL: color sampling is RGBRGBRGB..., line 2 BRGBRGBRG..., line 3, GBRGBRGBR...
     *   </li>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_BAYER: standard bayer sampling
     *     be used
     *     factor of the output frame (as the center (fovea) is high resolution and corners can be
     *     underscaled, then a reduction of the output is allowed without precision leak
     *     the log scale that is applied
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static Retina create(Size inputSize, boolean colorMode, int colorSamplingMethod) {
        return Retina.__fromPtr__(create_3(inputSize.width, inputSize.height, colorMode, colorSamplingMethod));
    }

    /**
     * Constructors from standardized interfaces : retreive a smart pointer to a Retina instance
     *
     *     @param inputSize the input frame size
     *     @param colorMode the chosen processing mode : with or without color processing
     * <ul>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_RANDOM: each pixel position is either R, G or B in a random choice
     *   </li>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_DIAGONAL: color sampling is RGBRGBRGB..., line 2 BRGBRGBRG..., line 3, GBRGBRGBR...
     *   </li>
     *   <li>
     *        cv::bioinspired::RETINA_COLOR_BAYER: standard bayer sampling
     *     be used
     *     factor of the output frame (as the center (fovea) is high resolution and corners can be
     *     underscaled, then a reduction of the output is allowed without precision leak
     *     the log scale that is applied
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static Retina create(Size inputSize, boolean colorMode) {
        return Retina.__fromPtr__(create_4(inputSize.width, inputSize.height, colorMode));
    }


    //
    // C++: static Ptr_Retina cv::bioinspired::Retina::create(Size inputSize)
    //

    public static Retina create(Size inputSize) {
        return Retina.__fromPtr__(create_5(inputSize.width, inputSize.height));
    }


    //
    // C++:  Size cv::bioinspired::Retina::getInputSize()
    //

    /**
     * Retreive retina input buffer size
     *     @return the retina input buffer size
     */
    public Size getInputSize() {
        return new Size(getInputSize_0(nativeObj));
    }


    //
    // C++:  Size cv::bioinspired::Retina::getOutputSize()
    //

    /**
     * Retreive retina output buffer size that can be different from the input if a spatial log
     *     transformation is applied
     *     @return the retina output buffer size
     */
    public Size getOutputSize() {
        return new Size(getOutputSize_0(nativeObj));
    }


    //
    // C++:  String cv::bioinspired::Retina::printSetup()
    //

    /**
     * Outputs a string showing the used parameters setup
     *     @return a string which contains formated parameters information
     */
    public String printSetup() {
        return printSetup_0(nativeObj);
    }


    //
    // C++:  void cv::bioinspired::Retina::activateContoursProcessing(bool activate)
    //

    /**
     * Activate/desactivate the Parvocellular pathway processing (contours information extraction), by
     *     default, it is activated
     *     @param activate true if Parvocellular (contours information extraction) output should be
     *     activated, false if not... if activated, the Parvocellular output can be retrieved using the
     *     Retina::getParvo methods
     */
    public void activateContoursProcessing(boolean activate) {
        activateContoursProcessing_0(nativeObj, activate);
    }


    //
    // C++:  void cv::bioinspired::Retina::activateMovingContoursProcessing(bool activate)
    //

    /**
     * Activate/desactivate the Magnocellular pathway processing (motion information extraction), by
     *     default, it is activated
     *     @param activate true if Magnocellular output should be activated, false if not... if activated,
     *     the Magnocellular output can be retrieved using the <b>getMagno</b> methods
     */
    public void activateMovingContoursProcessing(boolean activate) {
        activateMovingContoursProcessing_0(nativeObj, activate);
    }


    //
    // C++:  void cv::bioinspired::Retina::applyFastToneMapping(Mat inputImage, Mat& outputToneMappedImage)
    //

    /**
     * Method which processes an image in the aim to correct its luminance correct
     *     backlight problems, enhance details in shadows.
     *
     *     This method is designed to perform High Dynamic Range image tone mapping (compress &gt;8bit/pixel
     *     images to 8bit/pixel). This is a simplified version of the Retina Parvocellular model
     *     (simplified version of the run/getParvo methods call) since it does not include the
     *     spatio-temporal filter modelling the Outer Plexiform Layer of the retina that performs spectral
     *     whitening and many other stuff. However, it works great for tone mapping and in a faster way.
     *
     *     Check the demos and experiments section to see examples and the way to perform tone mapping
     *     using the original retina model and the method.
     *
     *     @param inputImage the input image to process (should be coded in float format : CV_32F,
     *     CV_32FC1, CV_32F_C3, CV_32F_C4, the 4th channel won't be considered).
     *     @param outputToneMappedImage the output 8bit/channel tone mapped image (CV_8U or CV_8UC3 format).
     */
    public void applyFastToneMapping(Mat inputImage, Mat outputToneMappedImage) {
        applyFastToneMapping_0(nativeObj, inputImage.nativeObj, outputToneMappedImage.nativeObj);
    }


    //
    // C++:  void cv::bioinspired::Retina::clearBuffers()
    //

    /**
     * Clears all retina buffers
     *
     *     (equivalent to opening the eyes after a long period of eye close ;o) whatchout the temporal
     *     transition occuring just after this method call.
     */
    public void clearBuffers() {
        clearBuffers_0(nativeObj);
    }


    //
    // C++:  void cv::bioinspired::Retina::getMagno(Mat& retinaOutput_magno)
    //

    /**
     * Accessor of the motion channel of the retina (models peripheral vision).
     *
     *     Warning, getMagnoRAW methods return buffers that are not rescaled within range [0;255] while
     *     the non RAW method allows a normalized matrix to be retrieved.
     *     @param retinaOutput_magno the output buffer (reallocated if necessary), format can be :
     * <ul>
     *   <li>
     *        a Mat, this output is rescaled for standard 8bits image processing use in OpenCV
     *   </li>
     *   <li>
     *        RAW methods actually return a 1D matrix (encoding is M1, M2,... Mn), this output is the
     *     original retina filter model output, without any quantification or rescaling.
     *     SEE: getMagnoRAW
     *   </li>
     * </ul>
     */
    public void getMagno(Mat retinaOutput_magno) {
        getMagno_0(nativeObj, retinaOutput_magno.nativeObj);
    }


    //
    // C++:  void cv::bioinspired::Retina::getMagnoRAW(Mat& retinaOutput_magno)
    //

    /**
     * Accessor of the motion channel of the retina (models peripheral vision).
     *     SEE: getMagno
     * @param retinaOutput_magno automatically generated
     */
    public void getMagnoRAW(Mat retinaOutput_magno) {
        getMagnoRAW_1(nativeObj, retinaOutput_magno.nativeObj);
    }


    //
    // C++:  void cv::bioinspired::Retina::getParvo(Mat& retinaOutput_parvo)
    //

    /**
     * Accessor of the details channel of the retina (models foveal vision).
     *
     *     Warning, getParvoRAW methods return buffers that are not rescaled within range [0;255] while
     *     the non RAW method allows a normalized matrix to be retrieved.
     *
     *     @param retinaOutput_parvo the output buffer (reallocated if necessary), format can be :
     * <ul>
     *   <li>
     *        a Mat, this output is rescaled for standard 8bits image processing use in OpenCV
     *   </li>
     *   <li>
     *        RAW methods actually return a 1D matrix (encoding is R1, R2, ... Rn, G1, G2, ..., Gn, B1,
     *     B2, ...Bn), this output is the original retina filter model output, without any
     *     quantification or rescaling.
     *     SEE: getParvoRAW
     *   </li>
     * </ul>
     */
    public void getParvo(Mat retinaOutput_parvo) {
        getParvo_0(nativeObj, retinaOutput_parvo.nativeObj);
    }


    //
    // C++:  void cv::bioinspired::Retina::getParvoRAW(Mat& retinaOutput_parvo)
    //

    /**
     * Accessor of the details channel of the retina (models foveal vision).
     *     SEE: getParvo
     * @param retinaOutput_parvo automatically generated
     */
    public void getParvoRAW(Mat retinaOutput_parvo) {
        getParvoRAW_1(nativeObj, retinaOutput_parvo.nativeObj);
    }


    //
    // C++:  void cv::bioinspired::Retina::run(Mat inputImage)
    //

    /**
     * Method which allows retina to be applied on an input image,
     *
     *     after run, encapsulated retina module is ready to deliver its outputs using dedicated
     *     acccessors, see getParvo and getMagno methods
     *     @param inputImage the input Mat image to be processed, can be gray level or BGR coded in any
     *     format (from 8bit to 16bits)
     */
    public void run(Mat inputImage) {
        run_0(nativeObj, inputImage.nativeObj);
    }


    //
    // C++:  void cv::bioinspired::Retina::setColorSaturation(bool saturateColors = true, float colorSaturationValue = 4.0f)
    //

    /**
     * Activate color saturation as the final step of the color demultiplexing process -&gt; this
     *     saturation is a sigmoide function applied to each channel of the demultiplexed image.
     *     @param saturateColors boolean that activates color saturation (if true) or desactivate (if false)
     *     @param colorSaturationValue the saturation factor : a simple factor applied on the chrominance
     *     buffers
     */
    public void setColorSaturation(boolean saturateColors, float colorSaturationValue) {
        setColorSaturation_0(nativeObj, saturateColors, colorSaturationValue);
    }

    /**
     * Activate color saturation as the final step of the color demultiplexing process -&gt; this
     *     saturation is a sigmoide function applied to each channel of the demultiplexed image.
     *     @param saturateColors boolean that activates color saturation (if true) or desactivate (if false)
     *     buffers
     */
    public void setColorSaturation(boolean saturateColors) {
        setColorSaturation_1(nativeObj, saturateColors);
    }

    /**
     * Activate color saturation as the final step of the color demultiplexing process -&gt; this
     *     saturation is a sigmoide function applied to each channel of the demultiplexed image.
     *     buffers
     */
    public void setColorSaturation() {
        setColorSaturation_2(nativeObj);
    }


    //
    // C++:  void cv::bioinspired::Retina::setup(String retinaParameterFile = "", bool applyDefaultSetupOnFailure = true)
    //

    /**
     * Try to open an XML retina parameters file to adjust current retina instance setup
     *
     * <ul>
     *   <li>
     *      if the xml file does not exist, then default setup is applied
     *   </li>
     *   <li>
     *      warning, Exceptions are thrown if read XML file is not valid
     *     @param retinaParameterFile the parameters filename
     *     @param applyDefaultSetupOnFailure set to true if an error must be thrown on error
     *   </li>
     * </ul>
     *
     *     You can retrieve the current parameters structure using the method Retina::getParameters and update
     *     it before running method Retina::setup.
     */
    public void setup(String retinaParameterFile, boolean applyDefaultSetupOnFailure) {
        setup_0(nativeObj, retinaParameterFile, applyDefaultSetupOnFailure);
    }

    /**
     * Try to open an XML retina parameters file to adjust current retina instance setup
     *
     * <ul>
     *   <li>
     *      if the xml file does not exist, then default setup is applied
     *   </li>
     *   <li>
     *      warning, Exceptions are thrown if read XML file is not valid
     *     @param retinaParameterFile the parameters filename
     *   </li>
     * </ul>
     *
     *     You can retrieve the current parameters structure using the method Retina::getParameters and update
     *     it before running method Retina::setup.
     */
    public void setup(String retinaParameterFile) {
        setup_1(nativeObj, retinaParameterFile);
    }

    /**
     * Try to open an XML retina parameters file to adjust current retina instance setup
     *
     * <ul>
     *   <li>
     *      if the xml file does not exist, then default setup is applied
     *   </li>
     *   <li>
     *      warning, Exceptions are thrown if read XML file is not valid
     *   </li>
     * </ul>
     *
     *     You can retrieve the current parameters structure using the method Retina::getParameters and update
     *     it before running method Retina::setup.
     */
    public void setup() {
        setup_2(nativeObj);
    }


    //
    // C++:  void cv::bioinspired::Retina::setupIPLMagnoChannel(bool normaliseOutput = true, float parasolCells_beta = 0.f, float parasolCells_tau = 0.f, float parasolCells_k = 7.f, float amacrinCellsTemporalCutFrequency = 1.2f, float V0CompressionParameter = 0.95f, float localAdaptintegration_tau = 0.f, float localAdaptintegration_k = 7.f)
    //

    /**
     * Set parameters values for the Inner Plexiform Layer (IPL) magnocellular channel
     *
     *     this channel processes signals output from OPL processing stage in peripheral vision, it allows
     *     motion information enhancement. It is decorrelated from the details channel. See reference
     *     papers for more details.
     *
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param parasolCells_beta the low pass filter gain used for local contrast adaptation at the
     *     IPL level of the retina (for ganglion cells local adaptation), typical value is 0
     *     @param parasolCells_tau the low pass filter time constant used for local contrast adaptation
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is frame, typical
     *     value is 0 (immediate response)
     *     @param parasolCells_k the low pass filter spatial constant used for local contrast adaptation
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is pixels, typical
     *     value is 5
     *     @param amacrinCellsTemporalCutFrequency the time constant of the first order high pass fiter of
     *     the magnocellular way (motion information channel), unit is frames, typical value is 1.2
     *     @param V0CompressionParameter the compression strengh of the ganglion cells local adaptation
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.95
     *     @param localAdaptintegration_tau specifies the temporal constant of the low pas filter
     *     involved in the computation of the local "motion mean" for the local adaptation computation
     *     @param localAdaptintegration_k specifies the spatial constant of the low pas filter involved
     *     in the computation of the local "motion mean" for the local adaptation computation
     */
    public void setupIPLMagnoChannel(boolean normaliseOutput, float parasolCells_beta, float parasolCells_tau, float parasolCells_k, float amacrinCellsTemporalCutFrequency, float V0CompressionParameter, float localAdaptintegration_tau, float localAdaptintegration_k) {
        setupIPLMagnoChannel_0(nativeObj, normaliseOutput, parasolCells_beta, parasolCells_tau, parasolCells_k, amacrinCellsTemporalCutFrequency, V0CompressionParameter, localAdaptintegration_tau, localAdaptintegration_k);
    }

    /**
     * Set parameters values for the Inner Plexiform Layer (IPL) magnocellular channel
     *
     *     this channel processes signals output from OPL processing stage in peripheral vision, it allows
     *     motion information enhancement. It is decorrelated from the details channel. See reference
     *     papers for more details.
     *
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param parasolCells_beta the low pass filter gain used for local contrast adaptation at the
     *     IPL level of the retina (for ganglion cells local adaptation), typical value is 0
     *     @param parasolCells_tau the low pass filter time constant used for local contrast adaptation
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is frame, typical
     *     value is 0 (immediate response)
     *     @param parasolCells_k the low pass filter spatial constant used for local contrast adaptation
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is pixels, typical
     *     value is 5
     *     @param amacrinCellsTemporalCutFrequency the time constant of the first order high pass fiter of
     *     the magnocellular way (motion information channel), unit is frames, typical value is 1.2
     *     @param V0CompressionParameter the compression strengh of the ganglion cells local adaptation
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.95
     *     @param localAdaptintegration_tau specifies the temporal constant of the low pas filter
     *     involved in the computation of the local "motion mean" for the local adaptation computation
     *     in the computation of the local "motion mean" for the local adaptation computation
     */
    public void setupIPLMagnoChannel(boolean normaliseOutput, float parasolCells_beta, float parasolCells_tau, float parasolCells_k, float amacrinCellsTemporalCutFrequency, float V0CompressionParameter, float localAdaptintegration_tau) {
        setupIPLMagnoChannel_1(nativeObj, normaliseOutput, parasolCells_beta, parasolCells_tau, parasolCells_k, amacrinCellsTemporalCutFrequency, V0CompressionParameter, localAdaptintegration_tau);
    }

    /**
     * Set parameters values for the Inner Plexiform Layer (IPL) magnocellular channel
     *
     *     this channel processes signals output from OPL processing stage in peripheral vision, it allows
     *     motion information enhancement. It is decorrelated from the details channel. See reference
     *     papers for more details.
     *
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param parasolCells_beta the low pass filter gain used for local contrast adaptation at the
     *     IPL level of the retina (for ganglion cells local adaptation), typical value is 0
     *     @param parasolCells_tau the low pass filter time constant used for local contrast adaptation
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is frame, typical
     *     value is 0 (immediate response)
     *     @param parasolCells_k the low pass filter spatial constant used for local contrast adaptation
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is pixels, typical
     *     value is 5
     *     @param amacrinCellsTemporalCutFrequency the time constant of the first order high pass fiter of
     *     the magnocellular way (motion information channel), unit is frames, typical value is 1.2
     *     @param V0CompressionParameter the compression strengh of the ganglion cells local adaptation
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.95
     *     involved in the computation of the local "motion mean" for the local adaptation computation
     *     in the computation of the local "motion mean" for the local adaptation computation
     */
    public void setupIPLMagnoChannel(boolean normaliseOutput, float parasolCells_beta, float parasolCells_tau, float parasolCells_k, float amacrinCellsTemporalCutFrequency, float V0CompressionParameter) {
        setupIPLMagnoChannel_2(nativeObj, normaliseOutput, parasolCells_beta, parasolCells_tau, parasolCells_k, amacrinCellsTemporalCutFrequency, V0CompressionParameter);
    }

    /**
     * Set parameters values for the Inner Plexiform Layer (IPL) magnocellular channel
     *
     *     this channel processes signals output from OPL processing stage in peripheral vision, it allows
     *     motion information enhancement. It is decorrelated from the details channel. See reference
     *     papers for more details.
     *
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param parasolCells_beta the low pass filter gain used for local contrast adaptation at the
     *     IPL level of the retina (for ganglion cells local adaptation), typical value is 0
     *     @param parasolCells_tau the low pass filter time constant used for local contrast adaptation
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is frame, typical
     *     value is 0 (immediate response)
     *     @param parasolCells_k the low pass filter spatial constant used for local contrast adaptation
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is pixels, typical
     *     value is 5
     *     @param amacrinCellsTemporalCutFrequency the time constant of the first order high pass fiter of
     *     the magnocellular way (motion information channel), unit is frames, typical value is 1.2
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.95
     *     involved in the computation of the local "motion mean" for the local adaptation computation
     *     in the computation of the local "motion mean" for the local adaptation computation
     */
    public void setupIPLMagnoChannel(boolean normaliseOutput, float parasolCells_beta, float parasolCells_tau, float parasolCells_k, float amacrinCellsTemporalCutFrequency) {
        setupIPLMagnoChannel_3(nativeObj, normaliseOutput, parasolCells_beta, parasolCells_tau, parasolCells_k, amacrinCellsTemporalCutFrequency);
    }

    /**
     * Set parameters values for the Inner Plexiform Layer (IPL) magnocellular channel
     *
     *     this channel processes signals output from OPL processing stage in peripheral vision, it allows
     *     motion information enhancement. It is decorrelated from the details channel. See reference
     *     papers for more details.
     *
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param parasolCells_beta the low pass filter gain used for local contrast adaptation at the
     *     IPL level of the retina (for ganglion cells local adaptation), typical value is 0
     *     @param parasolCells_tau the low pass filter time constant used for local contrast adaptation
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is frame, typical
     *     value is 0 (immediate response)
     *     @param parasolCells_k the low pass filter spatial constant used for local contrast adaptation
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is pixels, typical
     *     value is 5
     *     the magnocellular way (motion information channel), unit is frames, typical value is 1.2
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.95
     *     involved in the computation of the local "motion mean" for the local adaptation computation
     *     in the computation of the local "motion mean" for the local adaptation computation
     */
    public void setupIPLMagnoChannel(boolean normaliseOutput, float parasolCells_beta, float parasolCells_tau, float parasolCells_k) {
        setupIPLMagnoChannel_4(nativeObj, normaliseOutput, parasolCells_beta, parasolCells_tau, parasolCells_k);
    }

    /**
     * Set parameters values for the Inner Plexiform Layer (IPL) magnocellular channel
     *
     *     this channel processes signals output from OPL processing stage in peripheral vision, it allows
     *     motion information enhancement. It is decorrelated from the details channel. See reference
     *     papers for more details.
     *
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param parasolCells_beta the low pass filter gain used for local contrast adaptation at the
     *     IPL level of the retina (for ganglion cells local adaptation), typical value is 0
     *     @param parasolCells_tau the low pass filter time constant used for local contrast adaptation
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is frame, typical
     *     value is 0 (immediate response)
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is pixels, typical
     *     value is 5
     *     the magnocellular way (motion information channel), unit is frames, typical value is 1.2
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.95
     *     involved in the computation of the local "motion mean" for the local adaptation computation
     *     in the computation of the local "motion mean" for the local adaptation computation
     */
    public void setupIPLMagnoChannel(boolean normaliseOutput, float parasolCells_beta, float parasolCells_tau) {
        setupIPLMagnoChannel_5(nativeObj, normaliseOutput, parasolCells_beta, parasolCells_tau);
    }

    /**
     * Set parameters values for the Inner Plexiform Layer (IPL) magnocellular channel
     *
     *     this channel processes signals output from OPL processing stage in peripheral vision, it allows
     *     motion information enhancement. It is decorrelated from the details channel. See reference
     *     papers for more details.
     *
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param parasolCells_beta the low pass filter gain used for local contrast adaptation at the
     *     IPL level of the retina (for ganglion cells local adaptation), typical value is 0
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is frame, typical
     *     value is 0 (immediate response)
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is pixels, typical
     *     value is 5
     *     the magnocellular way (motion information channel), unit is frames, typical value is 1.2
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.95
     *     involved in the computation of the local "motion mean" for the local adaptation computation
     *     in the computation of the local "motion mean" for the local adaptation computation
     */
    public void setupIPLMagnoChannel(boolean normaliseOutput, float parasolCells_beta) {
        setupIPLMagnoChannel_6(nativeObj, normaliseOutput, parasolCells_beta);
    }

    /**
     * Set parameters values for the Inner Plexiform Layer (IPL) magnocellular channel
     *
     *     this channel processes signals output from OPL processing stage in peripheral vision, it allows
     *     motion information enhancement. It is decorrelated from the details channel. See reference
     *     papers for more details.
     *
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     IPL level of the retina (for ganglion cells local adaptation), typical value is 0
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is frame, typical
     *     value is 0 (immediate response)
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is pixels, typical
     *     value is 5
     *     the magnocellular way (motion information channel), unit is frames, typical value is 1.2
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.95
     *     involved in the computation of the local "motion mean" for the local adaptation computation
     *     in the computation of the local "motion mean" for the local adaptation computation
     */
    public void setupIPLMagnoChannel(boolean normaliseOutput) {
        setupIPLMagnoChannel_7(nativeObj, normaliseOutput);
    }

    /**
     * Set parameters values for the Inner Plexiform Layer (IPL) magnocellular channel
     *
     *     this channel processes signals output from OPL processing stage in peripheral vision, it allows
     *     motion information enhancement. It is decorrelated from the details channel. See reference
     *     papers for more details.
     *
     *     IPL level of the retina (for ganglion cells local adaptation), typical value is 0
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is frame, typical
     *     value is 0 (immediate response)
     *     at the IPL level of the retina (for ganglion cells local adaptation), unit is pixels, typical
     *     value is 5
     *     the magnocellular way (motion information channel), unit is frames, typical value is 1.2
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.95
     *     involved in the computation of the local "motion mean" for the local adaptation computation
     *     in the computation of the local "motion mean" for the local adaptation computation
     */
    public void setupIPLMagnoChannel() {
        setupIPLMagnoChannel_8(nativeObj);
    }


    //
    // C++:  void cv::bioinspired::Retina::setupOPLandIPLParvoChannel(bool colorMode = true, bool normaliseOutput = true, float photoreceptorsLocalAdaptationSensitivity = 0.7f, float photoreceptorsTemporalConstant = 0.5f, float photoreceptorsSpatialConstant = 0.53f, float horizontalCellsGain = 0.f, float HcellsTemporalConstant = 1.f, float HcellsSpatialConstant = 7.f, float ganglionCellsSensitivity = 0.7f)
    //

    /**
     * Setup the OPL and IPL parvo channels (see biologocal model)
     *
     *     OPL is referred as Outer Plexiform Layer of the retina, it allows the spatio-temporal filtering
     *     which withens the spectrum and reduces spatio-temporal noise while attenuating global luminance
     *     (low frequency energy) IPL parvo is the OPL next processing stage, it refers to a part of the
     *     Inner Plexiform layer of the retina, it allows high contours sensitivity in foveal vision. See
     *     reference papers for more informations.
     *     for more informations, please have a look at the paper Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
     *     @param colorMode specifies if (true) color is processed of not (false) to then processing gray
     *     level image
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param photoreceptorsLocalAdaptationSensitivity the photoreceptors sensitivity renage is 0-1
     *     (more log compression effect when value increases)
     *     @param photoreceptorsTemporalConstant the time constant of the first order low pass filter of
     *     the photoreceptors, use it to cut high temporal frequencies (noise or fast motion), unit is
     *     frames, typical value is 1 frame
     *     @param photoreceptorsSpatialConstant the spatial constant of the first order low pass filter of
     *     the photoreceptors, use it to cut high spatial frequencies (noise or thick contours), unit is
     *     pixels, typical value is 1 pixel
     *     @param horizontalCellsGain gain of the horizontal cells network, if 0, then the mean value of
     *     the output is zero, if the parameter is near 1, then, the luminance is not filtered and is
     *     still reachable at the output, typicall value is 0
     *     @param HcellsTemporalConstant the time constant of the first order low pass filter of the
     *     horizontal cells, use it to cut low temporal frequencies (local luminance variations), unit is
     *     frames, typical value is 1 frame, as the photoreceptors
     *     @param HcellsSpatialConstant the spatial constant of the first order low pass filter of the
     *     horizontal cells, use it to cut low spatial frequencies (local luminance), unit is pixels,
     *     typical value is 5 pixel, this value is also used for local contrast computing when computing
     *     the local contrast adaptation at the ganglion cells level (Inner Plexiform Layer parvocellular
     *     channel model)
     *     @param ganglionCellsSensitivity the compression strengh of the ganglion cells local adaptation
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.7
     */
    public void setupOPLandIPLParvoChannel(boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity, float photoreceptorsTemporalConstant, float photoreceptorsSpatialConstant, float horizontalCellsGain, float HcellsTemporalConstant, float HcellsSpatialConstant, float ganglionCellsSensitivity) {
        setupOPLandIPLParvoChannel_0(nativeObj, colorMode, normaliseOutput, photoreceptorsLocalAdaptationSensitivity, photoreceptorsTemporalConstant, photoreceptorsSpatialConstant, horizontalCellsGain, HcellsTemporalConstant, HcellsSpatialConstant, ganglionCellsSensitivity);
    }

    /**
     * Setup the OPL and IPL parvo channels (see biologocal model)
     *
     *     OPL is referred as Outer Plexiform Layer of the retina, it allows the spatio-temporal filtering
     *     which withens the spectrum and reduces spatio-temporal noise while attenuating global luminance
     *     (low frequency energy) IPL parvo is the OPL next processing stage, it refers to a part of the
     *     Inner Plexiform layer of the retina, it allows high contours sensitivity in foveal vision. See
     *     reference papers for more informations.
     *     for more informations, please have a look at the paper Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
     *     @param colorMode specifies if (true) color is processed of not (false) to then processing gray
     *     level image
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param photoreceptorsLocalAdaptationSensitivity the photoreceptors sensitivity renage is 0-1
     *     (more log compression effect when value increases)
     *     @param photoreceptorsTemporalConstant the time constant of the first order low pass filter of
     *     the photoreceptors, use it to cut high temporal frequencies (noise or fast motion), unit is
     *     frames, typical value is 1 frame
     *     @param photoreceptorsSpatialConstant the spatial constant of the first order low pass filter of
     *     the photoreceptors, use it to cut high spatial frequencies (noise or thick contours), unit is
     *     pixels, typical value is 1 pixel
     *     @param horizontalCellsGain gain of the horizontal cells network, if 0, then the mean value of
     *     the output is zero, if the parameter is near 1, then, the luminance is not filtered and is
     *     still reachable at the output, typicall value is 0
     *     @param HcellsTemporalConstant the time constant of the first order low pass filter of the
     *     horizontal cells, use it to cut low temporal frequencies (local luminance variations), unit is
     *     frames, typical value is 1 frame, as the photoreceptors
     *     @param HcellsSpatialConstant the spatial constant of the first order low pass filter of the
     *     horizontal cells, use it to cut low spatial frequencies (local luminance), unit is pixels,
     *     typical value is 5 pixel, this value is also used for local contrast computing when computing
     *     the local contrast adaptation at the ganglion cells level (Inner Plexiform Layer parvocellular
     *     channel model)
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.7
     */
    public void setupOPLandIPLParvoChannel(boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity, float photoreceptorsTemporalConstant, float photoreceptorsSpatialConstant, float horizontalCellsGain, float HcellsTemporalConstant, float HcellsSpatialConstant) {
        setupOPLandIPLParvoChannel_1(nativeObj, colorMode, normaliseOutput, photoreceptorsLocalAdaptationSensitivity, photoreceptorsTemporalConstant, photoreceptorsSpatialConstant, horizontalCellsGain, HcellsTemporalConstant, HcellsSpatialConstant);
    }

    /**
     * Setup the OPL and IPL parvo channels (see biologocal model)
     *
     *     OPL is referred as Outer Plexiform Layer of the retina, it allows the spatio-temporal filtering
     *     which withens the spectrum and reduces spatio-temporal noise while attenuating global luminance
     *     (low frequency energy) IPL parvo is the OPL next processing stage, it refers to a part of the
     *     Inner Plexiform layer of the retina, it allows high contours sensitivity in foveal vision. See
     *     reference papers for more informations.
     *     for more informations, please have a look at the paper Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
     *     @param colorMode specifies if (true) color is processed of not (false) to then processing gray
     *     level image
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param photoreceptorsLocalAdaptationSensitivity the photoreceptors sensitivity renage is 0-1
     *     (more log compression effect when value increases)
     *     @param photoreceptorsTemporalConstant the time constant of the first order low pass filter of
     *     the photoreceptors, use it to cut high temporal frequencies (noise or fast motion), unit is
     *     frames, typical value is 1 frame
     *     @param photoreceptorsSpatialConstant the spatial constant of the first order low pass filter of
     *     the photoreceptors, use it to cut high spatial frequencies (noise or thick contours), unit is
     *     pixels, typical value is 1 pixel
     *     @param horizontalCellsGain gain of the horizontal cells network, if 0, then the mean value of
     *     the output is zero, if the parameter is near 1, then, the luminance is not filtered and is
     *     still reachable at the output, typicall value is 0
     *     @param HcellsTemporalConstant the time constant of the first order low pass filter of the
     *     horizontal cells, use it to cut low temporal frequencies (local luminance variations), unit is
     *     frames, typical value is 1 frame, as the photoreceptors
     *     horizontal cells, use it to cut low spatial frequencies (local luminance), unit is pixels,
     *     typical value is 5 pixel, this value is also used for local contrast computing when computing
     *     the local contrast adaptation at the ganglion cells level (Inner Plexiform Layer parvocellular
     *     channel model)
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.7
     */
    public void setupOPLandIPLParvoChannel(boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity, float photoreceptorsTemporalConstant, float photoreceptorsSpatialConstant, float horizontalCellsGain, float HcellsTemporalConstant) {
        setupOPLandIPLParvoChannel_2(nativeObj, colorMode, normaliseOutput, photoreceptorsLocalAdaptationSensitivity, photoreceptorsTemporalConstant, photoreceptorsSpatialConstant, horizontalCellsGain, HcellsTemporalConstant);
    }

    /**
     * Setup the OPL and IPL parvo channels (see biologocal model)
     *
     *     OPL is referred as Outer Plexiform Layer of the retina, it allows the spatio-temporal filtering
     *     which withens the spectrum and reduces spatio-temporal noise while attenuating global luminance
     *     (low frequency energy) IPL parvo is the OPL next processing stage, it refers to a part of the
     *     Inner Plexiform layer of the retina, it allows high contours sensitivity in foveal vision. See
     *     reference papers for more informations.
     *     for more informations, please have a look at the paper Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
     *     @param colorMode specifies if (true) color is processed of not (false) to then processing gray
     *     level image
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param photoreceptorsLocalAdaptationSensitivity the photoreceptors sensitivity renage is 0-1
     *     (more log compression effect when value increases)
     *     @param photoreceptorsTemporalConstant the time constant of the first order low pass filter of
     *     the photoreceptors, use it to cut high temporal frequencies (noise or fast motion), unit is
     *     frames, typical value is 1 frame
     *     @param photoreceptorsSpatialConstant the spatial constant of the first order low pass filter of
     *     the photoreceptors, use it to cut high spatial frequencies (noise or thick contours), unit is
     *     pixels, typical value is 1 pixel
     *     @param horizontalCellsGain gain of the horizontal cells network, if 0, then the mean value of
     *     the output is zero, if the parameter is near 1, then, the luminance is not filtered and is
     *     still reachable at the output, typicall value is 0
     *     horizontal cells, use it to cut low temporal frequencies (local luminance variations), unit is
     *     frames, typical value is 1 frame, as the photoreceptors
     *     horizontal cells, use it to cut low spatial frequencies (local luminance), unit is pixels,
     *     typical value is 5 pixel, this value is also used for local contrast computing when computing
     *     the local contrast adaptation at the ganglion cells level (Inner Plexiform Layer parvocellular
     *     channel model)
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.7
     */
    public void setupOPLandIPLParvoChannel(boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity, float photoreceptorsTemporalConstant, float photoreceptorsSpatialConstant, float horizontalCellsGain) {
        setupOPLandIPLParvoChannel_3(nativeObj, colorMode, normaliseOutput, photoreceptorsLocalAdaptationSensitivity, photoreceptorsTemporalConstant, photoreceptorsSpatialConstant, horizontalCellsGain);
    }

    /**
     * Setup the OPL and IPL parvo channels (see biologocal model)
     *
     *     OPL is referred as Outer Plexiform Layer of the retina, it allows the spatio-temporal filtering
     *     which withens the spectrum and reduces spatio-temporal noise while attenuating global luminance
     *     (low frequency energy) IPL parvo is the OPL next processing stage, it refers to a part of the
     *     Inner Plexiform layer of the retina, it allows high contours sensitivity in foveal vision. See
     *     reference papers for more informations.
     *     for more informations, please have a look at the paper Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
     *     @param colorMode specifies if (true) color is processed of not (false) to then processing gray
     *     level image
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param photoreceptorsLocalAdaptationSensitivity the photoreceptors sensitivity renage is 0-1
     *     (more log compression effect when value increases)
     *     @param photoreceptorsTemporalConstant the time constant of the first order low pass filter of
     *     the photoreceptors, use it to cut high temporal frequencies (noise or fast motion), unit is
     *     frames, typical value is 1 frame
     *     @param photoreceptorsSpatialConstant the spatial constant of the first order low pass filter of
     *     the photoreceptors, use it to cut high spatial frequencies (noise or thick contours), unit is
     *     pixels, typical value is 1 pixel
     *     the output is zero, if the parameter is near 1, then, the luminance is not filtered and is
     *     still reachable at the output, typicall value is 0
     *     horizontal cells, use it to cut low temporal frequencies (local luminance variations), unit is
     *     frames, typical value is 1 frame, as the photoreceptors
     *     horizontal cells, use it to cut low spatial frequencies (local luminance), unit is pixels,
     *     typical value is 5 pixel, this value is also used for local contrast computing when computing
     *     the local contrast adaptation at the ganglion cells level (Inner Plexiform Layer parvocellular
     *     channel model)
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.7
     */
    public void setupOPLandIPLParvoChannel(boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity, float photoreceptorsTemporalConstant, float photoreceptorsSpatialConstant) {
        setupOPLandIPLParvoChannel_4(nativeObj, colorMode, normaliseOutput, photoreceptorsLocalAdaptationSensitivity, photoreceptorsTemporalConstant, photoreceptorsSpatialConstant);
    }

    /**
     * Setup the OPL and IPL parvo channels (see biologocal model)
     *
     *     OPL is referred as Outer Plexiform Layer of the retina, it allows the spatio-temporal filtering
     *     which withens the spectrum and reduces spatio-temporal noise while attenuating global luminance
     *     (low frequency energy) IPL parvo is the OPL next processing stage, it refers to a part of the
     *     Inner Plexiform layer of the retina, it allows high contours sensitivity in foveal vision. See
     *     reference papers for more informations.
     *     for more informations, please have a look at the paper Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
     *     @param colorMode specifies if (true) color is processed of not (false) to then processing gray
     *     level image
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param photoreceptorsLocalAdaptationSensitivity the photoreceptors sensitivity renage is 0-1
     *     (more log compression effect when value increases)
     *     @param photoreceptorsTemporalConstant the time constant of the first order low pass filter of
     *     the photoreceptors, use it to cut high temporal frequencies (noise or fast motion), unit is
     *     frames, typical value is 1 frame
     *     the photoreceptors, use it to cut high spatial frequencies (noise or thick contours), unit is
     *     pixels, typical value is 1 pixel
     *     the output is zero, if the parameter is near 1, then, the luminance is not filtered and is
     *     still reachable at the output, typicall value is 0
     *     horizontal cells, use it to cut low temporal frequencies (local luminance variations), unit is
     *     frames, typical value is 1 frame, as the photoreceptors
     *     horizontal cells, use it to cut low spatial frequencies (local luminance), unit is pixels,
     *     typical value is 5 pixel, this value is also used for local contrast computing when computing
     *     the local contrast adaptation at the ganglion cells level (Inner Plexiform Layer parvocellular
     *     channel model)
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.7
     */
    public void setupOPLandIPLParvoChannel(boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity, float photoreceptorsTemporalConstant) {
        setupOPLandIPLParvoChannel_5(nativeObj, colorMode, normaliseOutput, photoreceptorsLocalAdaptationSensitivity, photoreceptorsTemporalConstant);
    }

    /**
     * Setup the OPL and IPL parvo channels (see biologocal model)
     *
     *     OPL is referred as Outer Plexiform Layer of the retina, it allows the spatio-temporal filtering
     *     which withens the spectrum and reduces spatio-temporal noise while attenuating global luminance
     *     (low frequency energy) IPL parvo is the OPL next processing stage, it refers to a part of the
     *     Inner Plexiform layer of the retina, it allows high contours sensitivity in foveal vision. See
     *     reference papers for more informations.
     *     for more informations, please have a look at the paper Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
     *     @param colorMode specifies if (true) color is processed of not (false) to then processing gray
     *     level image
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     @param photoreceptorsLocalAdaptationSensitivity the photoreceptors sensitivity renage is 0-1
     *     (more log compression effect when value increases)
     *     the photoreceptors, use it to cut high temporal frequencies (noise or fast motion), unit is
     *     frames, typical value is 1 frame
     *     the photoreceptors, use it to cut high spatial frequencies (noise or thick contours), unit is
     *     pixels, typical value is 1 pixel
     *     the output is zero, if the parameter is near 1, then, the luminance is not filtered and is
     *     still reachable at the output, typicall value is 0
     *     horizontal cells, use it to cut low temporal frequencies (local luminance variations), unit is
     *     frames, typical value is 1 frame, as the photoreceptors
     *     horizontal cells, use it to cut low spatial frequencies (local luminance), unit is pixels,
     *     typical value is 5 pixel, this value is also used for local contrast computing when computing
     *     the local contrast adaptation at the ganglion cells level (Inner Plexiform Layer parvocellular
     *     channel model)
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.7
     */
    public void setupOPLandIPLParvoChannel(boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity) {
        setupOPLandIPLParvoChannel_6(nativeObj, colorMode, normaliseOutput, photoreceptorsLocalAdaptationSensitivity);
    }

    /**
     * Setup the OPL and IPL parvo channels (see biologocal model)
     *
     *     OPL is referred as Outer Plexiform Layer of the retina, it allows the spatio-temporal filtering
     *     which withens the spectrum and reduces spatio-temporal noise while attenuating global luminance
     *     (low frequency energy) IPL parvo is the OPL next processing stage, it refers to a part of the
     *     Inner Plexiform layer of the retina, it allows high contours sensitivity in foveal vision. See
     *     reference papers for more informations.
     *     for more informations, please have a look at the paper Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
     *     @param colorMode specifies if (true) color is processed of not (false) to then processing gray
     *     level image
     *     @param normaliseOutput specifies if (true) output is rescaled between 0 and 255 of not (false)
     *     (more log compression effect when value increases)
     *     the photoreceptors, use it to cut high temporal frequencies (noise or fast motion), unit is
     *     frames, typical value is 1 frame
     *     the photoreceptors, use it to cut high spatial frequencies (noise or thick contours), unit is
     *     pixels, typical value is 1 pixel
     *     the output is zero, if the parameter is near 1, then, the luminance is not filtered and is
     *     still reachable at the output, typicall value is 0
     *     horizontal cells, use it to cut low temporal frequencies (local luminance variations), unit is
     *     frames, typical value is 1 frame, as the photoreceptors
     *     horizontal cells, use it to cut low spatial frequencies (local luminance), unit is pixels,
     *     typical value is 5 pixel, this value is also used for local contrast computing when computing
     *     the local contrast adaptation at the ganglion cells level (Inner Plexiform Layer parvocellular
     *     channel model)
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.7
     */
    public void setupOPLandIPLParvoChannel(boolean colorMode, boolean normaliseOutput) {
        setupOPLandIPLParvoChannel_7(nativeObj, colorMode, normaliseOutput);
    }

    /**
     * Setup the OPL and IPL parvo channels (see biologocal model)
     *
     *     OPL is referred as Outer Plexiform Layer of the retina, it allows the spatio-temporal filtering
     *     which withens the spectrum and reduces spatio-temporal noise while attenuating global luminance
     *     (low frequency energy) IPL parvo is the OPL next processing stage, it refers to a part of the
     *     Inner Plexiform layer of the retina, it allows high contours sensitivity in foveal vision. See
     *     reference papers for more informations.
     *     for more informations, please have a look at the paper Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
     *     @param colorMode specifies if (true) color is processed of not (false) to then processing gray
     *     level image
     *     (more log compression effect when value increases)
     *     the photoreceptors, use it to cut high temporal frequencies (noise or fast motion), unit is
     *     frames, typical value is 1 frame
     *     the photoreceptors, use it to cut high spatial frequencies (noise or thick contours), unit is
     *     pixels, typical value is 1 pixel
     *     the output is zero, if the parameter is near 1, then, the luminance is not filtered and is
     *     still reachable at the output, typicall value is 0
     *     horizontal cells, use it to cut low temporal frequencies (local luminance variations), unit is
     *     frames, typical value is 1 frame, as the photoreceptors
     *     horizontal cells, use it to cut low spatial frequencies (local luminance), unit is pixels,
     *     typical value is 5 pixel, this value is also used for local contrast computing when computing
     *     the local contrast adaptation at the ganglion cells level (Inner Plexiform Layer parvocellular
     *     channel model)
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.7
     */
    public void setupOPLandIPLParvoChannel(boolean colorMode) {
        setupOPLandIPLParvoChannel_8(nativeObj, colorMode);
    }

    /**
     * Setup the OPL and IPL parvo channels (see biologocal model)
     *
     *     OPL is referred as Outer Plexiform Layer of the retina, it allows the spatio-temporal filtering
     *     which withens the spectrum and reduces spatio-temporal noise while attenuating global luminance
     *     (low frequency energy) IPL parvo is the OPL next processing stage, it refers to a part of the
     *     Inner Plexiform layer of the retina, it allows high contours sensitivity in foveal vision. See
     *     reference papers for more informations.
     *     for more informations, please have a look at the paper Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
     *     level image
     *     (more log compression effect when value increases)
     *     the photoreceptors, use it to cut high temporal frequencies (noise or fast motion), unit is
     *     frames, typical value is 1 frame
     *     the photoreceptors, use it to cut high spatial frequencies (noise or thick contours), unit is
     *     pixels, typical value is 1 pixel
     *     the output is zero, if the parameter is near 1, then, the luminance is not filtered and is
     *     still reachable at the output, typicall value is 0
     *     horizontal cells, use it to cut low temporal frequencies (local luminance variations), unit is
     *     frames, typical value is 1 frame, as the photoreceptors
     *     horizontal cells, use it to cut low spatial frequencies (local luminance), unit is pixels,
     *     typical value is 5 pixel, this value is also used for local contrast computing when computing
     *     the local contrast adaptation at the ganglion cells level (Inner Plexiform Layer parvocellular
     *     channel model)
     *     output, set a value between 0.6 and 1 for best results, a high value increases more the low
     *     value sensitivity... and the output saturates faster, recommended value: 0.7
     */
    public void setupOPLandIPLParvoChannel() {
        setupOPLandIPLParvoChannel_9(nativeObj);
    }


    //
    // C++:  void cv::bioinspired::Retina::write(String fs)
    //

    /**
     * Write xml/yml formated parameters information
     *     @param fs the filename of the xml file that will be open and writen with formatted parameters
     *     information
     */
    public void write(String fs) {
        write_0(nativeObj, fs);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  Mat cv::bioinspired::Retina::getMagnoRAW()
    private static native long getMagnoRAW_0(long nativeObj);

    // C++:  Mat cv::bioinspired::Retina::getParvoRAW()
    private static native long getParvoRAW_0(long nativeObj);

    // C++: static Ptr_Retina cv::bioinspired::Retina::create(Size inputSize, bool colorMode, int colorSamplingMethod = RETINA_COLOR_BAYER, bool useRetinaLogSampling = false, float reductionFactor = 1.0f, float samplingStrength = 10.0f)
    private static native long create_0(double inputSize_width, double inputSize_height, boolean colorMode, int colorSamplingMethod, boolean useRetinaLogSampling, float reductionFactor, float samplingStrength);
    private static native long create_1(double inputSize_width, double inputSize_height, boolean colorMode, int colorSamplingMethod, boolean useRetinaLogSampling, float reductionFactor);
    private static native long create_2(double inputSize_width, double inputSize_height, boolean colorMode, int colorSamplingMethod, boolean useRetinaLogSampling);
    private static native long create_3(double inputSize_width, double inputSize_height, boolean colorMode, int colorSamplingMethod);
    private static native long create_4(double inputSize_width, double inputSize_height, boolean colorMode);

    // C++: static Ptr_Retina cv::bioinspired::Retina::create(Size inputSize)
    private static native long create_5(double inputSize_width, double inputSize_height);

    // C++:  Size cv::bioinspired::Retina::getInputSize()
    private static native double[] getInputSize_0(long nativeObj);

    // C++:  Size cv::bioinspired::Retina::getOutputSize()
    private static native double[] getOutputSize_0(long nativeObj);

    // C++:  String cv::bioinspired::Retina::printSetup()
    private static native String printSetup_0(long nativeObj);

    // C++:  void cv::bioinspired::Retina::activateContoursProcessing(bool activate)
    private static native void activateContoursProcessing_0(long nativeObj, boolean activate);

    // C++:  void cv::bioinspired::Retina::activateMovingContoursProcessing(bool activate)
    private static native void activateMovingContoursProcessing_0(long nativeObj, boolean activate);

    // C++:  void cv::bioinspired::Retina::applyFastToneMapping(Mat inputImage, Mat& outputToneMappedImage)
    private static native void applyFastToneMapping_0(long nativeObj, long inputImage_nativeObj, long outputToneMappedImage_nativeObj);

    // C++:  void cv::bioinspired::Retina::clearBuffers()
    private static native void clearBuffers_0(long nativeObj);

    // C++:  void cv::bioinspired::Retina::getMagno(Mat& retinaOutput_magno)
    private static native void getMagno_0(long nativeObj, long retinaOutput_magno_nativeObj);

    // C++:  void cv::bioinspired::Retina::getMagnoRAW(Mat& retinaOutput_magno)
    private static native void getMagnoRAW_1(long nativeObj, long retinaOutput_magno_nativeObj);

    // C++:  void cv::bioinspired::Retina::getParvo(Mat& retinaOutput_parvo)
    private static native void getParvo_0(long nativeObj, long retinaOutput_parvo_nativeObj);

    // C++:  void cv::bioinspired::Retina::getParvoRAW(Mat& retinaOutput_parvo)
    private static native void getParvoRAW_1(long nativeObj, long retinaOutput_parvo_nativeObj);

    // C++:  void cv::bioinspired::Retina::run(Mat inputImage)
    private static native void run_0(long nativeObj, long inputImage_nativeObj);

    // C++:  void cv::bioinspired::Retina::setColorSaturation(bool saturateColors = true, float colorSaturationValue = 4.0f)
    private static native void setColorSaturation_0(long nativeObj, boolean saturateColors, float colorSaturationValue);
    private static native void setColorSaturation_1(long nativeObj, boolean saturateColors);
    private static native void setColorSaturation_2(long nativeObj);

    // C++:  void cv::bioinspired::Retina::setup(String retinaParameterFile = "", bool applyDefaultSetupOnFailure = true)
    private static native void setup_0(long nativeObj, String retinaParameterFile, boolean applyDefaultSetupOnFailure);
    private static native void setup_1(long nativeObj, String retinaParameterFile);
    private static native void setup_2(long nativeObj);

    // C++:  void cv::bioinspired::Retina::setupIPLMagnoChannel(bool normaliseOutput = true, float parasolCells_beta = 0.f, float parasolCells_tau = 0.f, float parasolCells_k = 7.f, float amacrinCellsTemporalCutFrequency = 1.2f, float V0CompressionParameter = 0.95f, float localAdaptintegration_tau = 0.f, float localAdaptintegration_k = 7.f)
    private static native void setupIPLMagnoChannel_0(long nativeObj, boolean normaliseOutput, float parasolCells_beta, float parasolCells_tau, float parasolCells_k, float amacrinCellsTemporalCutFrequency, float V0CompressionParameter, float localAdaptintegration_tau, float localAdaptintegration_k);
    private static native void setupIPLMagnoChannel_1(long nativeObj, boolean normaliseOutput, float parasolCells_beta, float parasolCells_tau, float parasolCells_k, float amacrinCellsTemporalCutFrequency, float V0CompressionParameter, float localAdaptintegration_tau);
    private static native void setupIPLMagnoChannel_2(long nativeObj, boolean normaliseOutput, float parasolCells_beta, float parasolCells_tau, float parasolCells_k, float amacrinCellsTemporalCutFrequency, float V0CompressionParameter);
    private static native void setupIPLMagnoChannel_3(long nativeObj, boolean normaliseOutput, float parasolCells_beta, float parasolCells_tau, float parasolCells_k, float amacrinCellsTemporalCutFrequency);
    private static native void setupIPLMagnoChannel_4(long nativeObj, boolean normaliseOutput, float parasolCells_beta, float parasolCells_tau, float parasolCells_k);
    private static native void setupIPLMagnoChannel_5(long nativeObj, boolean normaliseOutput, float parasolCells_beta, float parasolCells_tau);
    private static native void setupIPLMagnoChannel_6(long nativeObj, boolean normaliseOutput, float parasolCells_beta);
    private static native void setupIPLMagnoChannel_7(long nativeObj, boolean normaliseOutput);
    private static native void setupIPLMagnoChannel_8(long nativeObj);

    // C++:  void cv::bioinspired::Retina::setupOPLandIPLParvoChannel(bool colorMode = true, bool normaliseOutput = true, float photoreceptorsLocalAdaptationSensitivity = 0.7f, float photoreceptorsTemporalConstant = 0.5f, float photoreceptorsSpatialConstant = 0.53f, float horizontalCellsGain = 0.f, float HcellsTemporalConstant = 1.f, float HcellsSpatialConstant = 7.f, float ganglionCellsSensitivity = 0.7f)
    private static native void setupOPLandIPLParvoChannel_0(long nativeObj, boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity, float photoreceptorsTemporalConstant, float photoreceptorsSpatialConstant, float horizontalCellsGain, float HcellsTemporalConstant, float HcellsSpatialConstant, float ganglionCellsSensitivity);
    private static native void setupOPLandIPLParvoChannel_1(long nativeObj, boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity, float photoreceptorsTemporalConstant, float photoreceptorsSpatialConstant, float horizontalCellsGain, float HcellsTemporalConstant, float HcellsSpatialConstant);
    private static native void setupOPLandIPLParvoChannel_2(long nativeObj, boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity, float photoreceptorsTemporalConstant, float photoreceptorsSpatialConstant, float horizontalCellsGain, float HcellsTemporalConstant);
    private static native void setupOPLandIPLParvoChannel_3(long nativeObj, boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity, float photoreceptorsTemporalConstant, float photoreceptorsSpatialConstant, float horizontalCellsGain);
    private static native void setupOPLandIPLParvoChannel_4(long nativeObj, boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity, float photoreceptorsTemporalConstant, float photoreceptorsSpatialConstant);
    private static native void setupOPLandIPLParvoChannel_5(long nativeObj, boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity, float photoreceptorsTemporalConstant);
    private static native void setupOPLandIPLParvoChannel_6(long nativeObj, boolean colorMode, boolean normaliseOutput, float photoreceptorsLocalAdaptationSensitivity);
    private static native void setupOPLandIPLParvoChannel_7(long nativeObj, boolean colorMode, boolean normaliseOutput);
    private static native void setupOPLandIPLParvoChannel_8(long nativeObj, boolean colorMode);
    private static native void setupOPLandIPLParvoChannel_9(long nativeObj);

    // C++:  void cv::bioinspired::Retina::write(String fs)
    private static native void write_0(long nativeObj, String fs);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
