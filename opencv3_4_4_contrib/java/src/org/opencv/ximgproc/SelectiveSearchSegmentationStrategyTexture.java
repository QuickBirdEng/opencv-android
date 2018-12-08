//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.ximgproc.SelectiveSearchSegmentationStrategy;

// C++: class SelectiveSearchSegmentationStrategyTexture
//javadoc: SelectiveSearchSegmentationStrategyTexture

public class SelectiveSearchSegmentationStrategyTexture extends SelectiveSearchSegmentationStrategy {

    protected SelectiveSearchSegmentationStrategyTexture(long addr) { super(addr); }

    // internal usage only
    public static SelectiveSearchSegmentationStrategyTexture __fromPtr__(long addr) { return new SelectiveSearchSegmentationStrategyTexture(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
