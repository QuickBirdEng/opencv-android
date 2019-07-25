//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.BriefDescriptorExtractor;

// C++: class BriefDescriptorExtractor
//javadoc: BriefDescriptorExtractor

public class BriefDescriptorExtractor extends Feature2D {

    protected BriefDescriptorExtractor(long addr) { super(addr); }

    // internal usage only
    public static BriefDescriptorExtractor __fromPtr__(long addr) { return new BriefDescriptorExtractor(addr); }

    //
    // C++: static Ptr_BriefDescriptorExtractor cv::xfeatures2d::BriefDescriptorExtractor::create(int bytes = 32, bool use_orientation = false)
    //

    //javadoc: BriefDescriptorExtractor::create(bytes, use_orientation)
    public static BriefDescriptorExtractor create(int bytes, boolean use_orientation)
    {
        
        BriefDescriptorExtractor retVal = BriefDescriptorExtractor.__fromPtr__(create_0(bytes, use_orientation));
        
        return retVal;
    }

    //javadoc: BriefDescriptorExtractor::create(bytes)
    public static BriefDescriptorExtractor create(int bytes)
    {
        
        BriefDescriptorExtractor retVal = BriefDescriptorExtractor.__fromPtr__(create_1(bytes));
        
        return retVal;
    }

    //javadoc: BriefDescriptorExtractor::create()
    public static BriefDescriptorExtractor create()
    {
        
        BriefDescriptorExtractor retVal = BriefDescriptorExtractor.__fromPtr__(create_2());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_BriefDescriptorExtractor cv::xfeatures2d::BriefDescriptorExtractor::create(int bytes = 32, bool use_orientation = false)
    private static native long create_0(int bytes, boolean use_orientation);
    private static native long create_1(int bytes);
    private static native long create_2();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
