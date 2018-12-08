//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.img_hash;

import org.opencv.img_hash.PHash;

// C++: class PHash
//javadoc: PHash

public class PHash extends ImgHashBase {

    protected PHash(long addr) { super(addr); }

    // internal usage only
    public static PHash __fromPtr__(long addr) { return new PHash(addr); }

    //
    // C++: static Ptr_PHash cv::img_hash::PHash::create()
    //

    //javadoc: PHash::create()
    public static PHash create()
    {
        
        PHash retVal = PHash.__fromPtr__(create_0());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_PHash cv::img_hash::PHash::create()
    private static native long create_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
