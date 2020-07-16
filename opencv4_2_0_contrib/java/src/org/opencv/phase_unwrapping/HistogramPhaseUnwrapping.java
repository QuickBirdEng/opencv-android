//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.phase_unwrapping;

import org.opencv.core.Mat;

// C++: class HistogramPhaseUnwrapping
/**
 * Class implementing two-dimensional phase unwrapping based on CITE: histogramUnwrapping
 * This algorithm belongs to the quality-guided phase unwrapping methods.
 * First, it computes a reliability map from second differences between a pixel and its eight neighbours.
 * Reliability values lie between 0 and 16*pi*pi. Then, this reliability map is used to compute
 * the reliabilities of "edges". An edge is an entity defined by two pixels that are connected
 * horizontally or vertically. Its reliability is found by adding the the reliabilities of the
 * two pixels connected through it. Edges are sorted in a histogram based on their reliability values.
 * This histogram is then used to unwrap pixels, starting from the highest quality pixel.
 *
 * The wrapped phase map and the unwrapped result are stored in CV_32FC1 Mat.
 */
public class HistogramPhaseUnwrapping extends PhaseUnwrapping {

    protected HistogramPhaseUnwrapping(long addr) { super(addr); }

    // internal usage only
    public static HistogramPhaseUnwrapping __fromPtr__(long addr) { return new HistogramPhaseUnwrapping(addr); }

    //
    // C++:  void cv::phase_unwrapping::HistogramPhaseUnwrapping::getInverseReliabilityMap(Mat& reliabilityMap)
    //

    /**
     * Get the reliability map computed from the wrapped phase map.
     *
     * @param reliabilityMap Image where the reliability map is stored.
     */
    public void getInverseReliabilityMap(Mat reliabilityMap) {
        getInverseReliabilityMap_0(nativeObj, reliabilityMap.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::phase_unwrapping::HistogramPhaseUnwrapping::getInverseReliabilityMap(Mat& reliabilityMap)
    private static native void getInverseReliabilityMap_0(long nativeObj, long reliabilityMap_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
