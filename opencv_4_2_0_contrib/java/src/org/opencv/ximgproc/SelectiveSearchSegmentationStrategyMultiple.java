//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.ximgproc.SelectiveSearchSegmentationStrategy;

// C++: class SelectiveSearchSegmentationStrategyMultiple
/**
 * Regroup multiple strategies for the selective search segmentation algorithm
 */
public class SelectiveSearchSegmentationStrategyMultiple extends SelectiveSearchSegmentationStrategy {

    protected SelectiveSearchSegmentationStrategyMultiple(long addr) { super(addr); }

    // internal usage only
    public static SelectiveSearchSegmentationStrategyMultiple __fromPtr__(long addr) { return new SelectiveSearchSegmentationStrategyMultiple(addr); }

    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentationStrategyMultiple::addStrategy(Ptr_SelectiveSearchSegmentationStrategy g, float weight)
    //

    /**
     * Add a new sub-strategy
     *                                 @param g The strategy
     *                                 @param weight The weight of the strategy
     */
    public void addStrategy(SelectiveSearchSegmentationStrategy g, float weight) {
        addStrategy_0(nativeObj, g.getNativeObjAddr(), weight);
    }


    //
    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentationStrategyMultiple::clearStrategies()
    //

    /**
     * Remove all sub-strategies
     */
    public void clearStrategies() {
        clearStrategies_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentationStrategyMultiple::addStrategy(Ptr_SelectiveSearchSegmentationStrategy g, float weight)
    private static native void addStrategy_0(long nativeObj, long g_nativeObj, float weight);

    // C++:  void cv::ximgproc::segmentation::SelectiveSearchSegmentationStrategyMultiple::clearStrategies()
    private static native void clearStrategies_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
