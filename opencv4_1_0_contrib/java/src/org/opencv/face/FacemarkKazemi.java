//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import org.opencv.face.Facemark;

// C++: class FacemarkKazemi
//javadoc: FacemarkKazemi

public class FacemarkKazemi extends Facemark {

    protected FacemarkKazemi(long addr) { super(addr); }

    // internal usage only
    public static FacemarkKazemi __fromPtr__(long addr) { return new FacemarkKazemi(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
