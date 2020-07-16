//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xphoto;

import org.opencv.xphoto.WhiteBalancer;

// C++: class GrayworldWB
/**
 * Gray-world white balance algorithm
 *
 * This algorithm scales the values of pixels based on a
 * gray-world assumption which states that the average of all channels
 * should result in a gray image.
 *
 * It adds a modification which thresholds pixels based on their
 * saturation value and only uses pixels below the provided threshold in
 * finding average pixel values.
 *
 * Saturation is calculated using the following for a 3-channel RGB image per
 * pixel I and is in the range [0, 1]:
 *
 * \( \texttt{Saturation} [I] = \frac{\textrm{max}(R,G,B) - \textrm{min}(R,G,B)
 * }{\textrm{max}(R,G,B)} \)
 *
 * A threshold of 1 means that all pixels are used to white-balance, while a
 * threshold of 0 means no pixels are used. Lower thresholds are useful in
 * white-balancing saturated images.
 *
 * Currently supports images of type REF: CV_8UC3 and REF: CV_16UC3.
 */
public class GrayworldWB extends WhiteBalancer {

    protected GrayworldWB(long addr) { super(addr); }

    // internal usage only
    public static GrayworldWB __fromPtr__(long addr) { return new GrayworldWB(addr); }

    //
    // C++:  float cv::xphoto::GrayworldWB::getSaturationThreshold()
    //

    /**
     * Maximum saturation for a pixel to be included in the
     *         gray-world assumption
     * SEE: setSaturationThreshold
     * @return automatically generated
     */
    public float getSaturationThreshold() {
        return getSaturationThreshold_0(nativeObj);
    }


    //
    // C++:  void cv::xphoto::GrayworldWB::setSaturationThreshold(float val)
    //

    /**
     *  getSaturationThreshold SEE: getSaturationThreshold
     * @param val automatically generated
     */
    public void setSaturationThreshold(float val) {
        setSaturationThreshold_0(nativeObj, val);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  float cv::xphoto::GrayworldWB::getSaturationThreshold()
    private static native float getSaturationThreshold_0(long nativeObj);

    // C++:  void cv::xphoto::GrayworldWB::setSaturationThreshold(float val)
    private static native void setSaturationThreshold_0(long nativeObj, float val);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
