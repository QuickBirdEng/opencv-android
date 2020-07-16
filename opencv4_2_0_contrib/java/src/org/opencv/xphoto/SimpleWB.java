//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xphoto;

import org.opencv.xphoto.WhiteBalancer;

// C++: class SimpleWB
/**
 * A simple white balance algorithm that works by independently stretching
 *     each of the input image channels to the specified range. For increased robustness
 *     it ignores the top and bottom \(p\%\) of pixel values.
 */
public class SimpleWB extends WhiteBalancer {

    protected SimpleWB(long addr) { super(addr); }

    // internal usage only
    public static SimpleWB __fromPtr__(long addr) { return new SimpleWB(addr); }

    //
    // C++:  float cv::xphoto::SimpleWB::getInputMax()
    //

    /**
     * Input image range maximum value
     * SEE: setInputMax
     * @return automatically generated
     */
    public float getInputMax() {
        return getInputMax_0(nativeObj);
    }


    //
    // C++:  float cv::xphoto::SimpleWB::getInputMin()
    //

    /**
     * Input image range minimum value
     * SEE: setInputMin
     * @return automatically generated
     */
    public float getInputMin() {
        return getInputMin_0(nativeObj);
    }


    //
    // C++:  float cv::xphoto::SimpleWB::getOutputMax()
    //

    /**
     * Output image range maximum value
     * SEE: setOutputMax
     * @return automatically generated
     */
    public float getOutputMax() {
        return getOutputMax_0(nativeObj);
    }


    //
    // C++:  float cv::xphoto::SimpleWB::getOutputMin()
    //

    /**
     * Output image range minimum value
     * SEE: setOutputMin
     * @return automatically generated
     */
    public float getOutputMin() {
        return getOutputMin_0(nativeObj);
    }


    //
    // C++:  float cv::xphoto::SimpleWB::getP()
    //

    /**
     * Percent of top/bottom values to ignore
     * SEE: setP
     * @return automatically generated
     */
    public float getP() {
        return getP_0(nativeObj);
    }


    //
    // C++:  void cv::xphoto::SimpleWB::setInputMax(float val)
    //

    /**
     *  getInputMax SEE: getInputMax
     * @param val automatically generated
     */
    public void setInputMax(float val) {
        setInputMax_0(nativeObj, val);
    }


    //
    // C++:  void cv::xphoto::SimpleWB::setInputMin(float val)
    //

    /**
     *  getInputMin SEE: getInputMin
     * @param val automatically generated
     */
    public void setInputMin(float val) {
        setInputMin_0(nativeObj, val);
    }


    //
    // C++:  void cv::xphoto::SimpleWB::setOutputMax(float val)
    //

    /**
     *  getOutputMax SEE: getOutputMax
     * @param val automatically generated
     */
    public void setOutputMax(float val) {
        setOutputMax_0(nativeObj, val);
    }


    //
    // C++:  void cv::xphoto::SimpleWB::setOutputMin(float val)
    //

    /**
     *  getOutputMin SEE: getOutputMin
     * @param val automatically generated
     */
    public void setOutputMin(float val) {
        setOutputMin_0(nativeObj, val);
    }


    //
    // C++:  void cv::xphoto::SimpleWB::setP(float val)
    //

    /**
     *  getP SEE: getP
     * @param val automatically generated
     */
    public void setP(float val) {
        setP_0(nativeObj, val);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  float cv::xphoto::SimpleWB::getInputMax()
    private static native float getInputMax_0(long nativeObj);

    // C++:  float cv::xphoto::SimpleWB::getInputMin()
    private static native float getInputMin_0(long nativeObj);

    // C++:  float cv::xphoto::SimpleWB::getOutputMax()
    private static native float getOutputMax_0(long nativeObj);

    // C++:  float cv::xphoto::SimpleWB::getOutputMin()
    private static native float getOutputMin_0(long nativeObj);

    // C++:  float cv::xphoto::SimpleWB::getP()
    private static native float getP_0(long nativeObj);

    // C++:  void cv::xphoto::SimpleWB::setInputMax(float val)
    private static native void setInputMax_0(long nativeObj, float val);

    // C++:  void cv::xphoto::SimpleWB::setInputMin(float val)
    private static native void setInputMin_0(long nativeObj, float val);

    // C++:  void cv::xphoto::SimpleWB::setOutputMax(float val)
    private static native void setOutputMax_0(long nativeObj, float val);

    // C++:  void cv::xphoto::SimpleWB::setOutputMin(float val)
    private static native void setOutputMin_0(long nativeObj, float val);

    // C++:  void cv::xphoto::SimpleWB::setP(float val)
    private static native void setP_0(long nativeObj, float val);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
