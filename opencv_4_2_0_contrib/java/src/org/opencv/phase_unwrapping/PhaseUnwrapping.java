//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.phase_unwrapping;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class PhaseUnwrapping
/**
 * Abstract base class for phase unwrapping.
 */
public class PhaseUnwrapping extends Algorithm {

    protected PhaseUnwrapping(long addr) { super(addr); }

    // internal usage only
    public static PhaseUnwrapping __fromPtr__(long addr) { return new PhaseUnwrapping(addr); }

    //
    // C++:  void cv::phase_unwrapping::PhaseUnwrapping::unwrapPhaseMap(Mat wrappedPhaseMap, Mat& unwrappedPhaseMap, Mat shadowMask = Mat())
    //

    /**
     * Unwraps a 2D phase map.
     *
     * @param wrappedPhaseMap The wrapped phase map that needs to be unwrapped.
     * @param unwrappedPhaseMap The unwrapped phase map.
     * @param shadowMask Optional parameter used when some pixels do not hold any phase information in the wrapped phase map.
     */
    public void unwrapPhaseMap(Mat wrappedPhaseMap, Mat unwrappedPhaseMap, Mat shadowMask) {
        unwrapPhaseMap_0(nativeObj, wrappedPhaseMap.nativeObj, unwrappedPhaseMap.nativeObj, shadowMask.nativeObj);
    }

    /**
     * Unwraps a 2D phase map.
     *
     * @param wrappedPhaseMap The wrapped phase map that needs to be unwrapped.
     * @param unwrappedPhaseMap The unwrapped phase map.
     */
    public void unwrapPhaseMap(Mat wrappedPhaseMap, Mat unwrappedPhaseMap) {
        unwrapPhaseMap_1(nativeObj, wrappedPhaseMap.nativeObj, unwrappedPhaseMap.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::phase_unwrapping::PhaseUnwrapping::unwrapPhaseMap(Mat wrappedPhaseMap, Mat& unwrappedPhaseMap, Mat shadowMask = Mat())
    private static native void unwrapPhaseMap_0(long nativeObj, long wrappedPhaseMap_nativeObj, long unwrappedPhaseMap_nativeObj, long shadowMask_nativeObj);
    private static native void unwrapPhaseMap_1(long nativeObj, long wrappedPhaseMap_nativeObj, long unwrappedPhaseMap_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
