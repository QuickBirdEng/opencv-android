//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.ximgproc.SelectiveSearchSegmentationStrategy;

// C++: class SelectiveSearchSegmentationStrategySize
//javadoc: SelectiveSearchSegmentationStrategySize

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
