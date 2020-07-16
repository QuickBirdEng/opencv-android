//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.structured_light;



// C++: class Params
/**
 * Parameters of SinusoidalPattern constructor
 * width Projector's width.
 * height Projector's height.
 * nbrOfPeriods Number of period along the patterns direction.
 * shiftValue Phase shift between two consecutive patterns.
 * methodId Allow to choose between FTP, PSP and FAPS.
 * nbrOfPixelsBetweenMarkers Number of pixels between two consecutive markers on the same row.
 * setMarkers Allow to set markers on the patterns.
 * markersLocation vector used to store markers location on the patterns.
 */
public class Params {

    protected final long nativeObj;
    protected Params(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static Params __fromPtr__(long addr) { return new Params(addr); }

    //
    // C++:   cv::structured_light::SinusoidalPattern::Params::Params()
    //

    public Params() {
        nativeObj = Params_0();
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::structured_light::SinusoidalPattern::Params::Params()
    private static native long Params_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
