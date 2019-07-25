//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import org.opencv.face.Facemark;

// C++: class FacemarkTrain
//javadoc: FacemarkTrain

public class FacemarkTrain extends Facemark {

    protected FacemarkTrain(long addr) { super(addr); }

    // internal usage only
    public static FacemarkTrain __fromPtr__(long addr) { return new FacemarkTrain(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
