//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.ximgproc.SelectiveSearchSegmentationStrategy;

// C++: class SelectiveSearchSegmentationStrategySize
/**
 * Size-based strategy for the selective search segmentation algorithm
 *                         The class is implemented from the algorithm described in CITE: uijlings2013selective.
 */
public class SelectiveSearchSegmentationStrategySize extends SelectiveSearchSegmentationStrategy {

    protected SelectiveSearchSegmentationStrategySize(long addr) { super(addr); }

    // internal usage only
    public static SelectiveSearchSegmentationStrategySize __fromPtr__(long addr) { return new SelectiveSearchSegmentationStrategySize(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
