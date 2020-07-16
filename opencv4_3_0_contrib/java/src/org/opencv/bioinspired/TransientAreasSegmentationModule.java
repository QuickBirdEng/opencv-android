//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bioinspired;

import org.opencv.bioinspired.TransientAreasSegmentationModule;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Size;

// C++: class TransientAreasSegmentationModule
/**
 * class which provides a transient/moving areas segmentation module
 *
 * perform a locally adapted segmentation by using the retina magno input data Based on Alexandre
 * BENOIT thesis: "Le système visuel humain au secours de la vision par ordinateur"
 *
 * 3 spatio temporal filters are used:
 * <ul>
 *   <li>
 *  a first one which filters the noise and local variations of the input motion energy
 *   </li>
 *   <li>
 *  a second (more powerfull low pass spatial filter) which gives the neighborhood motion energy the
 * segmentation consists in the comparison of these both outputs, if the local motion energy is higher
 * to the neighborhood otion energy, then the area is considered as moving and is segmented
 *   </li>
 *   <li>
 *  a stronger third low pass filter helps decision by providing a smooth information about the
 * "motion context" in a wider area
 *   </li>
 * </ul>
 */
public class TransientAreasSegmentationModule extends Algorithm {

    protected TransientAreasSegmentationModule(long addr) { super(addr); }

    // internal usage only
    public static TransientAreasSegmentationModule __fromPtr__(long addr) { return new TransientAreasSegmentationModule(addr); }

    //
    // C++: static Ptr_TransientAreasSegmentationModule cv::bioinspired::TransientAreasSegmentationModule::create(Size inputSize)
    //

    /**
     * allocator
     *     @param inputSize : size of the images input to segment (output will be the same size)
     * @return automatically generated
     */
    public static TransientAreasSegmentationModule create(Size inputSize) {
        return TransientAreasSegmentationModule.__fromPtr__(create_0(inputSize.width, inputSize.height));
    }


    //
    // C++:  Size cv::bioinspired::TransientAreasSegmentationModule::getSize()
    //

    /**
     * return the sze of the manage input and output images
     * @return automatically generated
     */
    public Size getSize() {
        return new Size(getSize_0(nativeObj));
    }


    //
    // C++:  String cv::bioinspired::TransientAreasSegmentationModule::printSetup()
    //

    /**
     * parameters setup display method
     *     @return a string which contains formatted parameters information
     */
    public String printSetup() {
        return printSetup_0(nativeObj);
    }


    //
    // C++:  void cv::bioinspired::TransientAreasSegmentationModule::clearAllBuffers()
    //

    /**
     * cleans all the buffers of the instance
     */
    public void clearAllBuffers() {
        clearAllBuffers_0(nativeObj);
    }


    //
    // C++:  void cv::bioinspired::TransientAreasSegmentationModule::getSegmentationPicture(Mat& transientAreas)
    //

    /**
     * access function
     *     return the last segmentation result: a boolean picture which is resampled between 0 and 255 for a display purpose
     * @param transientAreas automatically generated
     */
    public void getSegmentationPicture(Mat transientAreas) {
        getSegmentationPicture_0(nativeObj, transientAreas.nativeObj);
    }


    //
    // C++:  void cv::bioinspired::TransientAreasSegmentationModule::run(Mat inputToSegment, int channelIndex = 0)
    //

    /**
     * main processing method, get result using methods getSegmentationPicture()
     *     @param inputToSegment : the image to process, it must match the instance buffer size !
     *     @param channelIndex : the channel to process in case of multichannel images
     */
    public void run(Mat inputToSegment, int channelIndex) {
        run_0(nativeObj, inputToSegment.nativeObj, channelIndex);
    }

    /**
     * main processing method, get result using methods getSegmentationPicture()
     *     @param inputToSegment : the image to process, it must match the instance buffer size !
     */
    public void run(Mat inputToSegment) {
        run_1(nativeObj, inputToSegment.nativeObj);
    }


    //
    // C++:  void cv::bioinspired::TransientAreasSegmentationModule::setup(String segmentationParameterFile = "", bool applyDefaultSetupOnFailure = true)
    //

    /**
     * try to open an XML segmentation parameters file to adjust current segmentation instance setup
     *
     * <ul>
     *   <li>
     *      if the xml file does not exist, then default setup is applied
     *   </li>
     *   <li>
     *      warning, Exceptions are thrown if read XML file is not valid
     *     @param segmentationParameterFile : the parameters filename
     *     @param applyDefaultSetupOnFailure : set to true if an error must be thrown on error
     *   </li>
     * </ul>
     */
    public void setup(String segmentationParameterFile, boolean applyDefaultSetupOnFailure) {
        setup_0(nativeObj, segmentationParameterFile, applyDefaultSetupOnFailure);
    }

    /**
     * try to open an XML segmentation parameters file to adjust current segmentation instance setup
     *
     * <ul>
     *   <li>
     *      if the xml file does not exist, then default setup is applied
     *   </li>
     *   <li>
     *      warning, Exceptions are thrown if read XML file is not valid
     *     @param segmentationParameterFile : the parameters filename
     *   </li>
     * </ul>
     */
    public void setup(String segmentationParameterFile) {
        setup_1(nativeObj, segmentationParameterFile);
    }

    /**
     * try to open an XML segmentation parameters file to adjust current segmentation instance setup
     *
     * <ul>
     *   <li>
     *      if the xml file does not exist, then default setup is applied
     *   </li>
     *   <li>
     *      warning, Exceptions are thrown if read XML file is not valid
     *   </li>
     * </ul>
     */
    public void setup() {
        setup_2(nativeObj);
    }


    //
    // C++:  void cv::bioinspired::TransientAreasSegmentationModule::write(String fs)
    //

    /**
     * write xml/yml formated parameters information
     *     @param fs : the filename of the xml file that will be open and writen with formatted parameters information
     */
    public void write(String fs) {
        write_0(nativeObj, fs);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_TransientAreasSegmentationModule cv::bioinspired::TransientAreasSegmentationModule::create(Size inputSize)
    private static native long create_0(double inputSize_width, double inputSize_height);

    // C++:  Size cv::bioinspired::TransientAreasSegmentationModule::getSize()
    private static native double[] getSize_0(long nativeObj);

    // C++:  String cv::bioinspired::TransientAreasSegmentationModule::printSetup()
    private static native String printSetup_0(long nativeObj);

    // C++:  void cv::bioinspired::TransientAreasSegmentationModule::clearAllBuffers()
    private static native void clearAllBuffers_0(long nativeObj);

    // C++:  void cv::bioinspired::TransientAreasSegmentationModule::getSegmentationPicture(Mat& transientAreas)
    private static native void getSegmentationPicture_0(long nativeObj, long transientAreas_nativeObj);

    // C++:  void cv::bioinspired::TransientAreasSegmentationModule::run(Mat inputToSegment, int channelIndex = 0)
    private static native void run_0(long nativeObj, long inputToSegment_nativeObj, int channelIndex);
    private static native void run_1(long nativeObj, long inputToSegment_nativeObj);

    // C++:  void cv::bioinspired::TransientAreasSegmentationModule::setup(String segmentationParameterFile = "", bool applyDefaultSetupOnFailure = true)
    private static native void setup_0(long nativeObj, String segmentationParameterFile, boolean applyDefaultSetupOnFailure);
    private static native void setup_1(long nativeObj, String segmentationParameterFile);
    private static native void setup_2(long nativeObj);

    // C++:  void cv::bioinspired::TransientAreasSegmentationModule::write(String fs)
    private static native void write_0(long nativeObj, String fs);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
