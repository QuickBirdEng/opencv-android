//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.img_hash;

import org.opencv.img_hash.ColorMomentHash;

// C++: class ColorMomentHash
//javadoc: ColorMomentHash

public class ColorMomentHash extends ImgHashBase {

    protected ColorMomentHash(long addr) { super(addr); }

    // internal usage only
    public static ColorMomentHash __fromPtr__(long addr) { return new ColorMomentHash(addr); }

    //
    // C++: static Ptr_ColorMomentHash cv::img_hash::ColorMomentHash::create()
    //

    //javadoc: ColorMomentHash::create()
    public static ColorMomentHash create()
    {
        
        ColorMomentHash retVal = ColorMomentHash.__fromPtr__(create_0());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_ColorMomentHash cv::img_hash::ColorMomentHash::create()
    private static native long create_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
