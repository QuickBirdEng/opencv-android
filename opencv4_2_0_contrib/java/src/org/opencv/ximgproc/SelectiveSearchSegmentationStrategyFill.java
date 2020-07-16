//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.ximgproc.SelectiveSearchSegmentationStrategy;

// C++: class SelectiveSearchSegmentationStrategyFill
/**
 * Fill-based strategy for the selective search segmentation algorithm
 *                         The class is implemented from the algorithm described in CITE: uijlings2013selective.
 */
public class SelectiveSearchSegmentationStrategyFill extends SelectiveSearchSegmentationStrategy {

    protected SelectiveSearchSegmentationStrategyFill(long addr) { super(addr); }

    // internal usage only
    public static SelectiveSearchSegmentationStrategyFill __fromPtr__(long addr) { return new SelectiveSearchSegmentationStrategyFill(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
