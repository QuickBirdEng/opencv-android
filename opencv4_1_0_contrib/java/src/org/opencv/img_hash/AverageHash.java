//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.img_hash;

import org.opencv.img_hash.AverageHash;

// C++: class AverageHash
//javadoc: AverageHash

public class AverageHash extends ImgHashBase {

    protected AverageHash(long addr) { super(addr); }

    // internal usage only
    public static AverageHash __fromPtr__(long addr) { return new AverageHash(addr); }

    //
    // C++: static Ptr_AverageHash cv::img_hash::AverageHash::create()
    //

    //javadoc: AverageHash::create()
    public static AverageHash create()
    {
        
        AverageHash retVal = AverageHash.__fromPtr__(create_0());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_AverageHash cv::img_hash::AverageHash::create()
    private static native long create_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
